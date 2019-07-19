import java.util.*;
public class Practice_2 {
	static String[] return_string(String str) {
		String temp[] = new String[3];
		if(str.length()%3==0) {
					int split_length  = str.length()/3;
					temp[0] = str.substring(0,split_length);
					temp[1] = str.substring(split_length,2*split_length);
					temp[2] = str.substring(2*split_length);					
		}
		else
			if(str.length()%3==1) {
				int split_length  = str.length()/3;
				temp[0] = str.substring(0,split_length);
				temp[1] = str.substring(split_length,str.length()-split_length);
				temp[2] = str.substring(str.length()-split_length);					
			}
			else {
				int split_length  = str.length()/3;
				temp[0] = str.substring(0,split_length+1);
				temp[1] = str.substring(split_length+1,str.length()-split_length-1);
				temp[2] = str.substring(str.length()-split_length-1);
			}
		return temp;
		
	}
	public static void main(String[] args) {
		String s1[] = return_string("John");
		String s2[] = return_string("Johny");
		String s3[] = return_string("janardhan");
		
		System.out.println("Output 1 "+s1[0] + s2[1] + s3[2]);
		System.out.println("Output 2 " +s1[1] + s2[2] + s3[0]);
		
		char temp []= new String(s1[2] + s2[0] + s3[1]).toCharArray();


		for(int i =0 ;i<temp.length;i++)
		{
			if(Character.isUpperCase(temp[i])) {
				temp[i] = (Character.toLowerCase(temp[i]));
			}else

				temp[i] = Character.toUpperCase(temp[i]);
		}
		
		System.out.println("Output 3 " + new String(temp));

	}
}
