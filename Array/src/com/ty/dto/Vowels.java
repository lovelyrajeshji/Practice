package com.ty.dto;

public class Vowels {

	public static void main(String[] args) {
		String s = "rajesh";
		char n;
		int vcount = 0; int ccount=0;
		for (int i = 0; i <= s.length() - 1; i++) {
			n = s.charAt(i);
			if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u') {
				vcount++;
			}
			else {
				ccount++;
			}
		}
		System.out.println("They are "+ vcount+"vowels in the name");
		System.out.println("They are "+ccount+"consonants in the name");
	}

}
