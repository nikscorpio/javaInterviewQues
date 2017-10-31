package com.interviewQueds;

public class ReverseString {

	static StringBuilder str = new StringBuilder("Alone am I when powerfull am I");
	// I am powerfull when I am Alone

	public static void main(String[] args) {
		int i = 0, j = 0, w = 0;

		while (i < str.length()) {
			if (i == 0)
				w = 0;
			if (str.charAt(i) == ' ' || i == str.length() - 1) {
				j = i;
				if (i == str.length() - 1)
					j = i;
				else
					j--;

				swap(w, j);

				w = i + 1;
			}
			i++;
		}
		// while(i<str.length())
		swap(0, str.length() - 1);
		System.out.println(str);

	}

	private static void swap(int i, int j) {
		while (i < j) {
			char ch = str.charAt(i);

			str.setCharAt(i, str.charAt(j));
			str.setCharAt(j, ch);
			i++;
			j--;

		}

	}

}
