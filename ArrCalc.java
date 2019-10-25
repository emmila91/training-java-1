package task;
import java.lang.IllegalArgumentException;
import java.util.Scanner;

public class ArrCalc {
	private int[] arr;
	
	public ArrCalc(char[] arr) {
		this.arr = charToIntArray(arr);
	}
	
	public ArrCalc() {
		System.out.print("Enter string of int: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] charArr = str.toCharArray();
		this.arr = charToIntArray(charArr);
	}

	private boolean isDigit(char c) {
		if (!Character.isDigit(c)) throw new IllegalArgumentException(c+" is not a Digit.");
		return true;
	}
	
	private int[] charToIntArray(char[] arr) {
		int[] tmp = new int[arr.length];
		for (int i=0; i<arr.length; i++) {
			if (isDigit(arr[i])) tmp[i] = Character.getNumericValue(arr[i]);
		}
		return tmp;
	}
	public void sum() {
		long sum = 0;
		int size = arr.length;
		for(int i=0; i<size; i++) {
			sum += arr[i];
		}
		System.out.print("Sum is "+sum);
	}
	
	public char[] createArrCalc() {
		System.out.print("Enter string of int: ");
		Scanner in = new Scanner(System.in);
		String str = in.next();
		return str.toCharArray();
	}
	
}
