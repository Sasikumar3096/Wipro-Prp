import java.util.Scanner;
public class String_Problem_1.java {
	static String str="Wipro Technologies Bangalore";
	static String reversed_str="";
	static void reverse_words() {
		String temp[] = str.split(" ");
		String new_str="";
		for(String s:temp)
		{
			char string[] = s.toCharArray();
			char t;
			for(int i=0;i<string.length/2;i++)
			{
				t = string[i];
				string[i] = string[string.length-i-1];
				string[string.length-i-1]=t;
			}
		new_str = new_str+" "+new String(string);
		} 
		reversed_str=new_str.trim();
	}
	static void retain_postion_case() {
		reverse_words();
		char ch[] = str.toCharArray();
		char s[]=reversed_str.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isUpperCase(ch[i])) {
				s[i] = Character.toUpperCase(s[i]);
			}
			else
				if(Character.isLowerCase(ch[i]))
				{
					s[i] = 	Character.toLowerCase(s[i]);
				}
		}
		reversed_str = new String(s);
	}
	public static void swap_case() {
		retain_postion_case();

		char s[]=reversed_str.toCharArray();
		for(int i=0;i<s.length;i++) {
			if(Character.isUpperCase(s[i])) {
				s[i] = Character.toLowerCase(s[i]);
			}
			else
				if(Character.isLowerCase(s[i]))
				{
					s[i] = 	Character.toUpperCase(s[i]);
				}
		}
		reversed_str = new String(s);
	}
	public static void main(String[] args) {
		Scanner sr=new Scanner(System.in);
		System.out.println("Enter your Option");
		int option=sr.nextInt();
		switch(option) {
		case 0:
			reverse_words();
			break;
		case 1:
			retain_postion_case();break;
		case 2:
			swap_case();
			break;
		}
		
		System.out.println(reversed_str);
		sr.close();
	}
}
