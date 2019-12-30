package sk7.test;

import java.util.Arrays;

public class StringConcatenationTest {
	public static void main(String[] args) {
		String[] strArr = { "one", "two", "three" };
		Arrays.sort(strArr);
		String resString = "";
		for (int i = 0; i < strArr.length; i++) {
			resString += strArr[i];
		}
		System.out.println(resString);
	}
}
