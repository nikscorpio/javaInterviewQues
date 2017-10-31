package com.interviewQueds;

public class FindRepeat {

	static StringBuffer str = new StringBuffer("NITINNITINNITINNITIN");
	static StringBuffer str2 = new StringBuffer();

	public static void main(String[] args) {

		int val =2;
		int i = 0, j = 0;
		if (str != null)
			while (i < str.length()) {
				char ch = str.charAt(i);
				boolean f1 = m1(ch);
				if (f1 == false)
					j++;

				if (j == val)
					System.out.println("the "+val+"th char is " + ch + " index is " + i);

				i++;

			}
		System.out.println(str2);

	}

	private static boolean m1(char ch) {
		int i = 0;
		boolean b = false;
		if (str2 != null)
			while (i < str2.length()) {
				char ch1 = str2.charAt(i);

				if (ch == ch1) {
					b = true;
					break;

				}
				i++;
			}
		if (b == false) {
			str2.append(ch);
			return true;
		} else
			return false;

		// TODO Auto-generated method stub

	}

}
