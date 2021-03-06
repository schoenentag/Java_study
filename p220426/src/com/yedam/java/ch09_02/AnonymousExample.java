package com.yedam.java.ch09_02;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		// 익명 객체 필드 사용
		anony.field.wake();
		
		System.out.println();
		// 익명 객체 로컬 변수 사용
		anony.method1();
		
		System.out.println();
		// 익명 객체 매개 변수 사용
		anony.method2(new Person() {
			void study() {
			System.out.println();
			}
			@Override
			public void wake() {
				System.out.println("8시에 일어납니다.");
			}
		});

	}

}
