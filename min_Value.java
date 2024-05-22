package array.com;

public class min_Value {
	public static void main(String[] args) {
		int arr[]= {10,20,3,24,77};
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("The min Value is "+min);
	}

}
