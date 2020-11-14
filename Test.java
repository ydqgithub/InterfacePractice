package com.yang;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	static final float standard=5000; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor dc1=new Doctor();
		Doctor dc2=new Doctor();
  		Test T=new Test();
		
		try{
			T.exPeriment(dc1);
			System.out.println("已查询");
			T.exPeriment(dc2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("格式错误！try again");
		}
		
	}
	float yearPay(float pay){
		return pay*12;
	}
	float yearFee(float fee){
		return fee*2;
	}
	float earnings(float yp,float yf){
		float z;
		z=yp-yf;
		return z;
	}
	float tax(float sum){
		double m;
		if(sum<=standard){
			m=0;
		}else if(sum>standard&&sum<=8000){
			m=standard*0.03;
		}else if(sum>8000&&sum<=17000){
			m=standard*0.1;
		}else if(sum>17000&&sum<=30000){
			m=standard*0.2;
		}else{
			m=standard*0.3;
		}
		return (float) m;
		
	}
	void exPeriment(Doctor DC){

		float n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名：");
		DC.name=sc.next();
		System.out.println("请输入年龄：");
		DC.age=sc.nextInt();
		System.out.println("请输入性别：");
		DC.sex=sc.next();
		System.out.println("请输入每月薪水：");
		DC.pay=sc.nextFloat();
		System.out.println("请输入每学期学费：");
		DC.fee=sc.nextFloat();
		n=earnings(DC.pay, DC.fee);
		System.out.println(n);
		System.out.println(tax(n));
		System.out.println(DC.name+"的年龄："+DC.age+",性别："+DC.sex+",年薪水："+yearPay(DC.pay)
				+",每年学费："+yearFee(DC.fee)+",每年纳税额："+tax(n));
			}

}
