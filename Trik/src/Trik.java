import java.util.Scanner;
public class Trik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l=1,c=0,r=0,temp,i;
		String swap;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Value : ");
		swap = scan.next();
		for(i=0;i<swap.length();i++){
		if(swap.charAt(i) == 'A' || swap.charAt(i) == 'a'){
		temp=l;
		l=c;
		c=temp;
		}else if(swap.charAt(i) == 'B' || swap.charAt(i) == 'b'){
		temp=c;
		c=r;
		r=temp;
		}else{
		temp=l;
		l=r;
		r=temp;
		}
		}
		if(l == 1) System.out.println("Coin is in left glass");
		else if(c == 1) System.out.println("Coin is in center glass");
		else System.out.println("Coin is in right glass");
	}

}
