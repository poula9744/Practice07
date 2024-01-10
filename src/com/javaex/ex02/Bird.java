package com.javaex.ex02;

public abstract class Bird {
	
    private String name;

    //이름 기록하기
	public String getName() {
		return name;
	}
	
	//상속관계에서만 이름을 읽을 수 있는
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sing();
	public abstract void fly();
	public abstract void showName();
	

}
