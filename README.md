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
### 三、实验过程
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

    DoctoralCandidate dc1=new DoctoralCandidate();
		DoctoralCandidate dc2=new DoctoralCandidate();
  		Test T=new Test();
      
      T.exPeriment(dc1);
      T.exPeriment(dc2);
      
 ### 四、核心代码     
1.在Test类中定义计算年薪的方法yearPay()、计算每年学费的方法yearFee()和计算研究生每年总收益的方法earnings()以及计算每年纳税额的方法tax()。<br/>

    float earnings(float yp,float yf){
		float z;
		z=yp-yf;
		return z;
	} 
   > * 年薪减去每年需支付的学费得到每年总收益
   
    static final float standard=5000; 
  
      if(sum<=standard){
			m=0;
		}else if(sum>standard&&sum<=8000){
			m=standard*0.03;
   > * 根据国家最新纳税标准通过使用if()else{}语句实现算法，并且将标准工资定义为static final类型   
   
2.在Test类中定义方法exPeriment(DoctoralCandidate DC)，参数为**博士研究生**类的一个对象。此方法实现获取用户的基本信息。使用Scanner类实现扫描控制台，通过XX.nextXX()读取控制台输入的内容。最后通过System.outXXX输出语句调用yearPay()、yearFee()、earnings()和tax()输出基本信息和纳税额。<br/>

    Scanner sc=new Scanner(System.in);
    
    DC.name=sc.next();
    DC.age=sc.nextInt();
    DC.sex=sc.next();
    DC.pay=sc.nextFloat();
    DC.fee=sc.nextFloat();
   > * 需要注意的是读取年薪pay和每年学费fee时需要nextFloat，否则键盘输入float型数字，Scanner读取控制台内容时会出错。因为接口中定义的年薪和学费为float类型。<br/>
   
3.由于键盘键入信息时，属性有数据类型的限制，所以main方法中使用try()catch(){}语句进行异常捕获。将实例化的两个对象通过参数传值给对象T调用的exPeriment()方法。<br/>

    try{
			T.exPeriment(dc1);
			System.out.println("~ ~ ~以上为您的纳税信息~ ~ ~");
			T.exPeriment(dc2);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("格式错误！请重新输入");
		}
    
### 五、系统运行截图
![images](https://github.com/ydqgithub/InterfacePractive-/blob/main/images/IE.jpg)
### 六、实验感想
1.对抽象类的应用不熟练，原本想将博士研究生类定义成抽象类，但是未能实现。<br/>
2.理解了接口的定义形式。<br/>
3.更进一步地学习了Scanner类的应用以及一些小知识点，例如：将一个类的对象传值给方法的参数......<br/>
4.学习了try()catch(){}异常捕获方法，Exception 覆盖所有异常类型，需要注意书写顺序。<br/>
