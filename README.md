### 计 G201 杨东奇 2020322083
## 实验报告
### 一、实验目的
* 实现接口应用
* 掌握java中抽象类和抽象方法的定义。<br/>
* 掌握java中接口的定义，熟练掌握接口的定义形式以及接口的实验方法。<br/>
* 了解异常的使用方法，并在程序中根据输入情况做异常处理。<br/>    
### 二、实验内容
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。<br/>
* 设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
* 设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
* 编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。
### 三、实验要求
* 1.在博士研究生类中实现各个接口定义的抽象方法；
* 2.对年学费和年收入进行统计，用 入减去学费，求得纳税额；
* 3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static 、 final 修饰定义；
* 4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可以采用Scanner类实现运行时交互式输入；
* 5.根据输入情况，要在程序中做异常处理；
### 四、实验过程
1.建立学生和老师两个接口，定义每个接口基本属性，eg：Student<br/>

    public void Fee(Float f);
	  public void selectFee(Float f);

2.建立研究生类Doctor，定义以下属性，实现学生和老师接口，使用implement<br/>

    class DoctoralCandidate implements Student,Teacher
    String name;
    String sex;
    int age;
    float fee;
    float pay;
    
3.建立测试类，实例化Doctor类、Test类，定义求年薪年学费以及年纳税额方法。<br/>

    Doctor doctor1=new Doctor();
    Doctor doctor2=new Doctor();
  	Test T=new Test();
      
4.测试类中使用try...catch捕获异常。

		try{
			T.sp(doctor1);
			System.out.println("已查询");
			T.sp(doctor2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("格式错误！try again");
		}
		
      
 ### 五、核心代码     
1.使用Scanner实现键盘输入。<br/>

		Scanner sc=new Scanner(System.in);
   
2.将标准工资定义为最终不可更改的。<br/>
		
		static final float regulation=5000; 
   
3.根据国家最新工资纳税标准编写算法。<br/>

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
		
    
### 六、系统运行截图
![image](https://github.com/ydqgithub/InterfacePractice/blob/main/images/ydq.jpg)
### 七、实验感想
1.学习了接口的使用方法，用implement实现接口，若多个接口用逗号分隔。<br/>
2.学习了Scanner类的特点和用法。<br/>
3.学习了static 和 final的使用。<br/>
4.学习了try...catch捕获异常。<br/>
5.学习了用if...else...语句实现算法。<br/>
