package arrays;

public class find_missing_number {
    package arrays;

public class find_missing_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n= {1,3,4,5,6};
		int result=find_missing_num(n);
		//if range is not with zero then n=arr.length+1

	}
	public static int find_missing_num(int[] arr) {
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		for(int i=0;i<arr.length;i++) {
			sum=sum-arr[i];
		}
		return sum;
		
		
	}

}

}
