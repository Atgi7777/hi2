package buteelt;
import java.util.Scanner;
import java.util.ArrayList;
public class Circle1 {
 private static final double PI = 3.14;
 private  double radius;
 public Circle1(double radius) {
 this.radius = radius;
 }
 public void menu() {
	 System.out.println("1) Талбайг ол");
	 System.out.println("2) Тойргийн уртыг ол");
	 System.out.println("3) Эрэмблэ");
	 System.out.println("4)        ");
	 System.out.println("5)        ");
     System.out.println("6)        ");

     
 }
 public double Talbai() {
	 double talbai ;
	 talbai = PI * radius * radius;
	 System.out.println("Талбай = " +talbai);
	 return talbai;
	
 }
 public double ToirgiinUrt() {
	 double ToirgiinUrt;
	 ToirgiinUrt = 2 * PI * radius;
	 System.out.println("Тойргийн урт = " + ToirgiinUrt);
	 return ToirgiinUrt;
	 
	 
 }
 public static void main(String[] args) {
	 int com;
	 Scanner sc = new Scanner (System.in);
	 System.out.print("Enter the circle's radius: ");
		double radius = sc.nextDouble();
	
	 Circle c = new Circle(sc.nextFloat());
	 
	 for(;;) {
		 c.menu();
		 System.out.println("Команд оруулан уу ");
		 com = sc.nextInt();
	 switch(com) {
	 case 1:
		 c.Talbai();
	break;	
	 case 2:
		 c.ToirgiinUrt();
	break;	
	 case 3:
		 c.Talbai();
	break;	
	 case 4:
		 c.Talbai();
	break;	
	 case 5:
		 c.Talbai();
	break;	
	 case 6:
		 c.Talbai();
	break;	
	 
	 
	 }
	 
	 
	 
	 }
	 
	 

 

// TODO: compute and print the circumference and area of the circle
 }
 
 
 
}