import java.util.Scanner;

public class Test {

    public static final double degree1 = 0.03;
    public static final int rate1 = 0;
    public static final double degree2 = 0.1;
    public static final int rate2 = 210;
    public static final double degree3 = 0.2;
    public static final int rate3 = 1410;
    public static final double degree4 = 0.25;
    public static final int rate4 = 2660;
    public static final double degree5 = 0.30;
    public static final int rate5 = 4410;
    public static final double degree6 = 0.35;
    public static final int rate6 = 7610;
    public static final double degree7 = 0.45;
    public static final int rate7 = 15160;

    public static void main(String[] args) {
        //ʵ��������
        BoshiStudent student1 = new BoshiStudent();
        BoshiStudent student2 = new BoshiStudent();
        //����ȡ2����
        Scanner scanner = new Scanner(System.in);
        System.out.println("��ѡ��ʵ������ʽ");
        System.out.println("1.ʹ��args��ʼ��");
        System.out.println("2.ʹ��scanner��ʼ��");
        int mode = scanner.nextInt();
        while (true){
            try {
                if(mode==1){
                    student1.setName(args[0]);
                    student1.setAge(Integer.valueOf(args[1]));
                    student1.setSex(args[2]);
                    student1.setSalary(Double.valueOf(args[3]));
                    student1.setFee(Double.valueOf(args[4]));
                    student2.setName(args[5]);
                    student2.setAge(Integer.valueOf(args[6]));
                    student2.setSex(args[7]);
                    student2.setSalary(Double.valueOf(args[8]));
                    student2.setFee(Double.valueOf(args[9]));
                    break;
                }else if(mode==2){
                    System.out.println("�����벩ʿ��1����Ϣ(���� ���� �Ա� нˮ ѧ��)���Կո�ָ���");
                    Scanner scanner1 = new Scanner(System.in);
                    String msg1 = scanner1.nextLine();
                    String[] msgs1 =  msg1.split(" ");
                    student1.setName(msgs1[0]);
                    student1.setAge(Integer.valueOf(msgs1[1]));
                    student1.setSex(msgs1[2]);
                    student1.setSalary(Double.valueOf(msgs1[3]));
                    student1.setFee(Double.valueOf(msgs1[4]));
                    System.out.println("�����벩ʿ��2����Ϣ(���� ���� �Ա� нˮ ѧ��)���Կո�ָ���");
                    Scanner scanner2 = new Scanner(System.in);
                    String msg2 = scanner2.nextLine();
                    String[] msgs2 =  msg2.split(" ");
                    student2.setName(msgs2[0]);
                    student2.setAge(Integer.valueOf(msgs2[1]));
                    student2.setSex(msgs2[2]);
                    student2.setSalary(Double.valueOf(msgs2[3]));
                    student2.setFee(Double.valueOf(msgs2[4]));
                    break;
                }else{
                    System.out.println("������������������");
                }
            }catch (Exception e){
                System.out.println("������������������");
            }

        }
        System.out.println("��ʿ��1ÿ���нˮ���룺");
        System.out.println(student1.getSalary() * 12);
        System.out.println("��ʿ��1ÿ��Ľ���ѧ�ѣ�");
        System.out.println(student1.getFee() * 2);
        System.out.println("��ʿ��1����֮�");
        System.out.println(((student1.getSalary() * 12) - (student1.getFee() * 2)));
        System.out.println("��ʿ��1ÿ��Ӧ��˰��");
        System.out.println(calauRate((student1.querySalary()) - (student1.queryFee())));
        System.out.println("��ʿ��2ÿ���нˮ���룺");
        System.out.println(student2.getSalary() * 12);
        System.out.println("��ʿ��2ÿ��Ľ���ѧ�ѣ�");
        System.out.println(student2.getFee() * 2);
        System.out.println("��ʿ��2����֮�");
        System.out.println(((student2.getSalary() * 12) - (student2.getFee() * 2)));
        System.out.println("��ʿ��2ÿ��Ӧ��˰��");
        System.out.println(calauRate((student2.querySalary()) - (student2.queryFee())));

    }
    //����˰��
    //Ӧ��˰��=Ӧ��˰���ö������˰��-����۳���
    public static double calauRate(double money){
        if(money < 5000){
            return 0;
        }else if(money <= 8000){
            return (money-5000)*degree1+rate1;
        }else if(money <= 17000){
            return (money-5000)*degree2+rate2;
        }else if(money <= 30000){
            return (money-5000)*degree3+rate3;
        }else if(money <= 40000){
            return (money-5000)*degree4+rate4;
        }else if(money <= 60000){
            return (money-5000)*degree5+rate5;
        }else if(money <= 85000){
            return (money-5000)*degree6+rate6;
        }else{
            return (money-5000)*degree7+rate7;
        }
    }

}
