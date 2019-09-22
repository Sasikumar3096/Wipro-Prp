
public class Pattern_3_ip {

		public static void main(String args[]) 
			{ 
			System.out.println(process_output(5,10,1));
			} 
	public static  int process_output(int n,int start,int inr) {
		int sum=start,terms=3;
		for(int i=1;i<n;i++,terms+=2)
		{

			sum+= start*(terms/2)+ (start+inr)*(terms/2+1);
			start+=inr;
		}
		return sum;
	}
	} 


/*
 * 10 + (11 + 10 + 11) + (12 + 11 + 12 +11 + 12) + (13 + 12 +13 + 12 +13 +12 +13) + (14 + 13 +14 +13 +14 +13 +14 +13 +14)
 *  1          3                     5                            7                                   9
 * 	
 * O/P: 310
 * */
