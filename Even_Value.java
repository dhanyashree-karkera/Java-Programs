package array.com;

public class Even_Value {
	public static void main(String[] args) {
		int arr[]= {2,10,31,7,44};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
	}

}
