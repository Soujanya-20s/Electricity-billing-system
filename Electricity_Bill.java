import java.util.*;
public class Electricity_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
double amount=0.0;
System.out.print("Enter Consumer Name : ");
String name=sc.nextLine();
System.out.print("Enter Consumer Number : ");
long cno=sc.nextLong();
System.out.print("Enter Number of units consumed : ");
int u=sc.nextInt();
if(u<=100) {
	amount=u*5.50;
}
else if(u>100 && u<=300) {
	amount=100*5.50+(u-100)*6.50;
}
else if(u>300 && u<=600) {
	amount=100*5.50+200*6.50+(u-300)*7.50;
}
else if(u>600) {
	amount=100*5.50+200*6.50+300*7.50+(u-600)*8.50;
}

System.out.println("\nConsumer Name : " + name);
System.out.println("Consumer Number : "+ cno);
System.out.println("Number of units Consumed: " +u);
System.out.println("Amount to be paid: "+ amount);



	}

}
