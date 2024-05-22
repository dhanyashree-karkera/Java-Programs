
public class SumOfDigits {
	public static void main(String[] args) {
		int sum=0;
		int n=4356;
		int temp=n;
		int rem=0;
		while(n>0) {
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println("The sum of digits of "+temp+" is "+sum);
	}

}
