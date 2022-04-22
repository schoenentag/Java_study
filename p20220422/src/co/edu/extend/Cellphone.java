package co.edu.extend;

public class Cellphone {
	
	//Field
	public String model;
	public String color;
	
	//Constructor
	public Cellphone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	//Method
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}

}
