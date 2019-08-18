import java.util.Arrays;

public class CountPrimeAndFibb {
	static int fib[];
	public static void main(String[] args) {
			int arr[]= {17,7,8,81,190},prime=0;
			int fib_c=0;
			int max = Arrays.stream(arr).max().getAsInt(); 
			generate_fib((int) Math.sqrt(max));
			for(int i:arr) {
				if(is_prime(i))
					prime++;
				if(is_fib(i))
					fib_c++;
			}
				System.out.println("Prime:"+prime);
				System.out.println("Fib:"+fib_c);

	}
	private static boolean is_fib(int i) {
		for(int x:fib)
			if(x==i)
				return true;
		return false;
	}
	private static void generate_fib(int d) {
		fib = new int[d+1]; 
		fib[0]=0;
		fib[1]=1;
		for(int i=2;i<d;i++)
			fib[i] = fib[i-1] + fib[i-2];
	}
	private static boolean is_prime(int n) {
		if(n==1)
			return false;
		if(n==2)
			return true;
		for(int i=2;i<=Math.sqrt(n)+1;i++)
			if(n%i==0)
				return false;
		return true;
	}
	
	
}
