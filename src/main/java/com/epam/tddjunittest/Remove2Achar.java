package com.epam.tddjunittest;

public class Remove2Achar {

	public static String removeCharAt(String str, int position) {
		return str.substring(0, position) + str.substring(position + 1);
	}
	public String remove2A(String string) {
		int i=0,a=0;
		while(i<=1) {
			if(string.charAt(a)=='A') {
				string = removeCharAt(string, a);
				a=0;
			}
			else
				a=1;
			i++;
		}
		return string;
	}
}
