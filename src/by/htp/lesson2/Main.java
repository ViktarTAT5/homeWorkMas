package by.htp.lesson2;

import by.htp.lesson2.one.Class1;
import by.htp.lesson2.three.List;

public class Main {

	public static void main(String[] args) {
		
		int[] numbers = new int[] { 1, 4, 5, 3, 9, 8, 7};
		int result;
		
		result = findMinValue(numbers);
		print(result);
		
		result = findMaxValue(numbers);
		print(result);

		print(numbers);
		sort(numbers, "max");
		print(numbers);
		sort(numbers, "min");
		print(numbers);

	}

	public static int findMaxValue(int[] numbers) {
		int c = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (c < numbers[i]) {
				c = numbers[i];
			}
		}
		return c;
	}

	public static int findMinValue(int[] numbers) {
		int c = numbers[0];
		for (int i = 0; i < numbers.length; i++) {
			if (c > numbers[i]) {
				c = numbers[i];
			}
		}
		return c;
	}

	public static void sort(int[] mas, String order) {
		if (order.equals("min")) {
			sortMin(mas);
		}
		if (order.equals("max")) {
			sortMax(mas);
		}
	}

	public static void sortMin(int[] mas) {
		for (int j = 0; j < mas.length; j++) {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] > mas[i + 1]) {
					int temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
				}
			}
		}
	}

	public static void sortMax(int[] mas) {
		for (int j = 0; j < mas.length; j++) {
			for (int i = 0; i < mas.length - 1; i++) {
				if (mas[i] < mas[i + 1]) {
					int temp = mas[i];
					mas[i] = mas[i + 1];
					mas[i + 1] = temp;
				}
			}
		}
	}
	
	public static void print(int a) {
		System.out.println(a);
	}

	public static void print(String text) {
		System.out.print(text);
	}

	public static void print(int[] mas) {
		for (int i : mas) {
			System.out.print(i);
		}
		System.out.println();
	}

}
