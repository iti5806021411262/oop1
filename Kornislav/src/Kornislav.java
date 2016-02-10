import java.util.Scanner;
public class Kornislav {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number1,number2,number3,number4,temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number : ");
		number1=scan.nextInt();
		System.out.print("Enter Number : ");
		number2=scan.nextInt();
		System.out.print("Enter Number : ");
		number3=scan.nextInt();
		System.out.print("Enter Number : ");
		number4=scan.nextInt();
		if(number1>number2){
		temp=number1;
		number1=number2;
		number2=temp;
		}
		if(number1>number3){
		temp=number1;
		number1=number3;
		number3=temp;
		}
		if(number1>number4){
		temp=number1;
		number1=number4;
		number4=temp;
		}
		if(number2>number3){
		temp=number2;
		number2=number3;
		number3=temp;
		}
		if(number2>number4){
		temp=number2;
		number2=number4;
		number4=temp;
		}
		if(number3>number4){
		temp=number3;
		number3=number4;
		number4=temp;
		}
		System.out.print("\nResult Area = : "+""+number3+""+" * "+number1+" = "+number3*number1);
	}

}
