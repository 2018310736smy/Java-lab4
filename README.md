# Java-lab4
第四次实验 接口程序实验

# 实验目的：
1.掌握Java中抽象类和抽象方法的定义
2.掌握Java中接口的定义，熟练掌握接口的定义形式以及接口的实现方法
3.了解异常的使用方法，并在程序中根据输入情况做异常处理

# 实验内容：
某学校为了给学生提供勤工俭学机会，也减轻授课教师的部分压力，准许博士研究生参与课程的助教工作。此时，该博士研究生有双重身份：学生和助教教师。
1.设计两个管理接口：学生管理接口和教师管理接口。学生接口必须包括缴纳学费、查学费的方法；教师接口包括发放薪水和查询薪水的方法。
2.设计博士研究生类，实现上述的两个接口，该博士研究生应具有姓名、性别、年龄、每学期学费、每月薪水等属性。（其他属性及方法，可自行发挥）
3.编写测试类，并实例化至少两名博士研究生，统计他们的年收入和学费。根据两者之差，算出每名博士研究生的年应纳税金额（国家最新工资纳税标准，请自行检索）。

# 实验要求：
1.在博士研究生类中实现各个接口定义的抽象方法;
2.对年学费和年收入进行统计，用收入减去学费，求得纳税额；
3.国家最新纳税标准（系数），属于某一时期的特定固定值，与实例化对象没有关系，考虑如何用static  final修饰定义。
4.实例化研究生类时，可采用运行时通过main方法的参数args一次性赋值，也可采用Scanner类实现运行时交互式输入。
5.根据输入情况，要在程序中做异常处理。

# 实验过程：
实验的项目工程名为3。工程里面包含一个包为manage，里面存放StudentManager和TeacherManager。同时包含一个BoshiStudent.java和Test.java类。
BoshiStudent.java类定义博士生的相关信息，包含name，age，sex，fee，salary这五个属性和他们的get()和set()方法。同时该类实现了StudentManager和TeacherManager这个两个接口里面的querySalary(),paySalary(),payFee(),queryFee()这四个方法。来实现对薪水和学费的操作。
程序的主要测试在Test类中，有两种实例化BoshiStudent的方式。第一种通过main方法传入参数的方式来实现。第二种通过scanner方式来实现。将输入的对象信息保存在一个String数组中。然后通过BoshiStudent属性的get()和set()方法将值赋给对象。在Scanner输入的方式中，使用try catch来捕获输入的异常，让用户在输入格式错误的数据时重新输入。
通过调用博士生对象的querySalary()和queryFee()这两个方法来计算收入和计算的税收的金额。将算出来的金额传入calculateFate()方法中。
calculateFate()方法使用if else来对不同的金额使用不同的计算方式，计算所需要的因数使用static final定义成全局静态常量。然后将计算出来的值返回。

# 核心代码（部分）：
        System.out.println("博士生1每年的薪水收入：");
        System.out.println(student1.getSalary() * 12);
        System.out.println("博士生1每年的缴纳学费：");
        System.out.println(student1.getFee() * 2);
        System.out.println("博士生1两者之差：");
        System.out.println(((student1.getSalary() * 12) - (student1.getFee() * 2)));
        System.out.println("博士生1每年应纳税金额：");
        System.out.println(calauRate((student1.querySalary()) - (student1.queryFee())));
        System.out.println("博士生2每年的薪水收入：");
        System.out.println(student2.getSalary() * 12);
        System.out.println("博士生2每年的缴纳学费：");
        System.out.println(student2.getFee() * 2);
        System.out.println("博士生2两者之差：");
        System.out.println(((student2.getSalary() * 12) - (student2.getFee() * 2)));
        System.out.println("博士生2每年应纳税金额：");
        System.out.println(calauRate((student2.querySalary()) - (student2.queryFee())));
        
    //计算税率
    //应纳税额=应纳税所得额×适用税率-速算扣除数
    
# 运行结果截图：

![image](https://github.com/2018310736smy/Java-lab4/blob/main/yunxingjieguo.jpg)


# 实验感想：
