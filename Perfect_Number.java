public class Perfect_Number {
	public static void main(String[] args) {
	int n=6;
	int sum=0;
	for(int i=1;i<n;i++) {
		if(n%i==0) {
		sum=sum+i;
	}
	}
	if(sum==n) {
System.out.println(n+" is a Perfect number");
}
	else {
		System.out.println(n+" is a Not perfect number");
	}
}
}
//A perfect number means positive integer that is equal to the sum of its propers divisors