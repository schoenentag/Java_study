package com.yedam.java.ch11_02;

public class StringCharAtExample {

	public static void main(String[] args) {

		String ssn = "010624-1230123";

		char gender = ssn.charAt(7);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다.");
			break;

		default:
			break;
		}

	}

}
