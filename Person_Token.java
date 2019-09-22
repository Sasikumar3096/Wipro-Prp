import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Person_Token {
		public static void main(String[] args) {
	 
		int input1  = 7;
		String input2[] = {"aa","bb","cc","dd","ee","ff","gg"};
		int input3[] = {9,89,5,0,6,65,4};
	// 0 4 5 6 9 65 89
		System.out.println(process_output(input1,input2,input3));
	
		int  input4  = 4;
		String[] input5 = {"Priya","Sowmiya","Sam","Vidhya"};
		int[] input6 = {9,76,8,23};
			//8 9 23 76
			System.out.println(process_output(input4,input5,input6));
		}
	
		public static String process_output(int input1,String input2[],int input3[]) {
			String op="";
			int j,i,flag=0;;
			
			Map<Integer,String> map=new HashMap<Integer, String>();  
	
			for(i=0;i<input1;i++)
				map.put(input3[i],input2[i]);
			
			Arrays.sort(input3);
			
			for(i=0;i<input1-2;i++) {

				if(input3[i]+1 == input3[i+1] && input3[i]+2 == input3[i+2])
				{
					flag = 1;
					break;
				}
			}
			if(flag ==0)
				return "NONE";
			
			j= i+2;
	
			op = op + map.get(input3[j--])+":";
			op = op + map.get(input3[j--])+":";
			op = op + map.get(input3[j]);
		
			return op;
		}
}
