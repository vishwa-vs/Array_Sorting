package sorting;

public class sorting {

	public static void main(String[] args) {
		int arr[]= {10,9,8,7,6,5,4,3,2,1};
		int div = arr.length/2;
		for(int i=0;i<div;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
		for(int i=div;i<arr.length;i++) {
			for(int k=i;k<arr.length;k++){
				if(arr[k]>arr[i]) {
					int temp;
					temp=arr[i];
					arr[i]=arr[k];
					arr[k]=temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}