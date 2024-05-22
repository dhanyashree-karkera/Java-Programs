import java.util.Scanner;

public class Prime_Number {
		public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
        System.out.println("Enter a Number:");
		int n=ip.nextInt();
		int i=2;
		int count=0;
		while(i<=n/2) {
			if(n%i==0) {
				count++;
				break;
			}
			i++;
			
		}
		if(count==0) {
			System.out.println(n+" is a prime number");
		}
		else {
			System.out.println(n+ " is a not prime number");
		}

	}
}
