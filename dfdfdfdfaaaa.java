import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class dfdfdfdfaaaa  extends JPanel{
	private int[] array;
    private int[] highlights;
    private static final int ARRAY_SIZE = 50;
    private static final int DELAY = 100;
    
    public dfdfdfdfaaaa() {
        array = new int[ARRAY_SIZE];
        highlights = new int[ARRAY_SIZE];
        generateRandomArray();
        new Timer(DELAY, e -> repaint()).start();
        new Thread(this::selectionSort).start();
    }

    private void generateRandomArray() {
        Random rand = new Random();
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = rand.nextInt(400);
        }
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (int i = 0; i < array.length; i++) {
            if (highlights[i] > 0) {
                g.setColor(Color.RED);
                highlights[i]--;
            } else {
                g.setColor(Color.BLUE);
            }
            g.fillRect(i * 10, getHeight() - array[i], 10, array[i]);
        }
    }
    
    private void selectionSort() {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
                highlights[j] = ARRAY_SIZE;
                repaint();
                sleep();
            }
            swap(i, minIndex);
            highlights[i] = highlights[minIndex] = ARRAY_SIZE;
            repaint();
            sleep();
        }
    }
    
    private void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private void sleep() {
        try {
            Thread.sleep(DELAY);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Selection Sort Visualizer");
		dfdfdfdfaaaa panel = new dfdfdfdfaaaa();
        frame.add(panel);
        frame.setSize(ARRAY_SIZE * 10, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

}
