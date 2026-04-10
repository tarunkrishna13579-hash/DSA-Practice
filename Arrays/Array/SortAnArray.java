package Array;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArray {

	public static void main(String[] args) {
		Integer[] arr = new Integer[] {1,2,6,4,5};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
