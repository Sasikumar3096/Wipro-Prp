import java.util.Arrays;

public class Summit_Sum {

	public static void main(String[] args) {
		char[] a="34521".toCharArray(),b="03490".toCharArray(),c="15649".toCharArray(),d="30987".toCharArray();
		process_output(a,b,c,d);
	}
	static int process_output(char a[],char b[],char c[],char d[])
	{
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		Arrays.sort(d);
		int sum;
		
		sum =  (a[0]-'0')*10 + a[1]-'0';
		sum+= (b[0]-'0')*10 + b[1]-'0';
		sum+= (c[0]-'0')*10 + c[1]-'0';
		sum+= (d[0]-'0')*10 + d[1]-'0';
						
		System.out.println(sum);
		return 0;	
	}
}
