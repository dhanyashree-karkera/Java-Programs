package array.com;

public class Odd_value {
	public static void main(String[] args) {
		int arr[]= {2,10,31,7,44};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				System.out.println(arr[i]);
			}
		}
	}

}
