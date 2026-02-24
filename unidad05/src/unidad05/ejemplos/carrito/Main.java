package unidad05.ejemplos.carrito;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int[] array = {6,9,2,3,4};
		
		String[] array2 = {"D", "Z", "A", "C"};

		Arrays.sort(array);
		Arrays.sort(array2);

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));

	}

}
