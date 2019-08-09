import java.util.Arrays;

public class LeastFrequentDigit {

	public static void main(String[] args) {
		int arr[]= {123,234,345,453},i,min=Integer.MAX_VALUE;
		int count[]= {0,0,0,0,0,0,0,0,0,0};
		for(int n:arr)
		{
			while(n>0) {
				count[n%10]++;
				n/=10;
			}
		}
	
		for(int n:count) {
			min = min>n&&n!=0 ?n:min;
		}
		
		System.out.println(min);
	}
}
