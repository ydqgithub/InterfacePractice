package com.yang;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	static final float regulation=5000; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor doctor1=new Doctor();
		Doctor doctor2=new Doctor();
  		Test T=new Test();
		
		try{
			T.sp(doctor1);
			System.out.println("已查询");
			T.sp(doctor2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("格式错误！try again");
		}
		
	}
	float yPay(float pay){
		return pay*12;
	}
	float yFee(float fee){
		return fee*2;
	}
	float liyi(float yp,float yf){
		float z;
		z=yp-yf;
		return z;
	}
	float shui(float sum){
		double m;
		if(sum<=regulation){
			m=0;
		}else if(sum>regulation&&sum<=8000){
			m=regulation*0.03;
		}else if(sum>8000&&sum<=17000){
			m=regulation*0.1;
		}else if(sum>17000&&sum<=30000){
			m=regulation*0.2;
		}else{
			m=regulation*0.3;
		}
		return (float) m;
		
	}
	void sp(Doctor doctor){

		float n;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入姓名：");
		doctor.name=sc.next();
		System.out.println("请输入年龄：");
		doctor.age=sc.nextInt();
		System.out.println("请输入性别：");
		doctor.sex=sc.next();
		System.out.println("请输入每月薪水：");
		doctor.pay=sc.nextFloat();
		System.out.println("请输入每学期学费：");
		doctor.fee=sc.nextFloat();
		n=liyi(doctor.pay, doctor.fee);
		System.out.println(n);
		System.out.println(shui(n));
		System.out.println(doctor.name+"的年龄："+doctor.age+",性别："+doctor.sex+",年薪水："+yPay(doctor.pay)
				+",每年学费："+yFee(doctor.fee)+",每年纳税额："+shui(n));
			}

}
