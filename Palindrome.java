import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num=sc.nextInt();
		int rem=0;
		int reverse=0;
		int num1=num;
		
		while(num!=0) {
			rem=num%10;
			reverse=reverse*10+rem;
			num=num/10;
		}
		
if(num1==reverse) {
	System.out.println(num1+" is a palindrome");
}
else {
	System.out.println(num1+" is not a palindrome");
}
	}

}
