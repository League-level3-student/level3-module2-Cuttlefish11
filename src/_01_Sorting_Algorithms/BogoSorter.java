package _01_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}

	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most inefficient
	 * sorting algorithm while still maintaining the possibility of eventually
	 * sorting data.
	 * 
	 * It works by following these steps: STEP 1. Is the array in order? if yes,
	 * finished; if no, go to step 2. STEP 2. Take two random elements in the array
	 * and swap them. STEP 3. Go back to step 1.
	 */
	@Override
	void sort(int[] array, SortingVisualizer display) {
		boolean q = false;
		while (true) {

			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					q = true;
					break;
				}
			}
			if (q) {
				Random ran = new Random();
				int ran2 = ran.nextInt(array.length);
				int ran4 = ran.nextInt(array.length);
				int temp = array[ran2];
				array[ran2] = array[ran4];
				array[ran4] = temp;
q=false;
			}
			else {
				break;
			}
			display.updateDisplay();
		}
	}
}
