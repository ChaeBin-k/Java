import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class FinalTestPJ extends JPanel{
	    private int[] array;
	    private int[] highlights;
	    private static final int ARRAY_SIZE = 50;
	    private static final int DELAY = 100;

	    public FinalTestPJ() {
	        array = new int[ARRAY_SIZE];
	        highlights = new int[ARRAY_SIZE];
	        generateRandomArray();
	        new Timer(DELAY, e -> repaint()).start();
	        new Thread(this::quickSort).start();
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
	    
	    private void quickSort() {
	        quickSort(0, array.length - 1);
	    }

	    private void quickSort(int low, int high) {
	        if (low < high) {
	            int pivotIndex = partition(low, high);
	            quickSort(low, pivotIndex - 1);
	            quickSort(pivotIndex + 1, high);
	        }
	    }
	    
	    private int partition(int low, int high) {
	        int pivot = array[high];
	        int i = low - 1;
	        for (int j = low; j < high; j++) {
	            if (array[j] < pivot) {
	                i++;
	                swap(i, j);
	                highlights[i] = highlights[j] = ARRAY_SIZE;
	                repaint();
	                sleep();
	            }
	        }
	        swap(i + 1, high);
	        highlights[i + 1] = highlights[high] = ARRAY_SIZE;
	        repaint();
	        sleep();
	        return i + 1;
	    }
	    
	    private void swap(int i, int j) {
			// TODO Auto-generated method stub
			
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
		 JFrame frame = new JFrame("QuickSort Visualizer");
		 FinalTestPJ panel = new FinalTestPJ();
	        frame.add(panel);
	        frame.setSize(ARRAY_SIZE * 10, 450);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);

	}

}
	
