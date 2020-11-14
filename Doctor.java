package com.yang;

public  class Doctor implements Student,Teacher{
	String name;
    String sex;
    int age;
    float fee;
    float pay;
	public void Pay(Float p) {
		// TODO Auto-generated method stub
		this.pay=p;
	}
	public void selectPay(Float p) {
		// TODO Auto-generated method stub
		this.pay=p;
	}
	public void Fee(Float f) {
		// TODO Auto-generated method stub
		this.fee=f;
	}
	public void selectFee(Float f) {
		// TODO Auto-generated method stub
	   this.fee=f;
	}
	

}
