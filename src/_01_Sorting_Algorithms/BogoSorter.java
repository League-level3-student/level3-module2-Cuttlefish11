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
		while (q == false) {

			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length - 1; j++) {
					if (array[j] > array[j + 1]) {
						q = false;
					} else {
						q = true;
					}
				}

			}

			if (q == false) {
				Random ran = new Random();
				int ran2 = ran.nextInt(array.length);
				Random ran3 = new Random();
				int ran4 = ran3.nextInt(array.length);
				int temp = array[ran2];
				array[ran2] = array[ran4];
				array[ran4] = temp;

			}
			display.updateDisplay();
		}
	}
}
