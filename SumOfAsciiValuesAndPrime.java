
public class SumOfAsciiValuesAndPrime {
	static int odd_sum_value=0,even_sum_value=0;
	public static void main(String[] args) {

			char s[] = "abc".toCharArray();
			for(int i=0;i<s.length;i++)
				if(i+1%2==0)
					odd_sum(s[i]);
				else
					even_sum(s[i]);
			if(is_prime(Math.abs(odd_sum_value - even_sum_value)))
				System.out.println("IS PRIME");
			else
				System.out.println("NOT PRIME");
	}

	private static boolean is_prime(int n) {
		if(n==1)
			return false;
		if(n==2)
			return true;
		for(int i=2;i<Math.sqrt(n)+1;i++)
			if(n%2==0)
				return false;
		return true;
		
	}

	private static void odd_sum(int c) {
		// TODO Auto-generated method stub
		odd_sum_value+=c;
	}
	private static void even_sum(int c) {
		// TODO Auto-generated method stub
		even_sum_value+=c;
	}

}
