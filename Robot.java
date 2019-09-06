
public class Robot {

	public static void main(String[] args) {
	
		System.out.println(Output(2,2,"1-1-N","M R M"));
			System.out.println(Output(3,4,"2-2-E","R M L M L M R M"));

	}
	public static String Output(int input1,int input2,String input3,String input4)
		{
			int grid_x = input1,grid_y = input2;
			String temp[] = input3.split("-");
			
			int x = Integer.valueOf(temp[0]),y = Integer.valueOf(temp[1]);
			String current_direction = temp[2];
			String err = "";
	
			for(String directions : input4.split(" "))
			{
				if(directions.equals("M"))
				{
					if(current_direction.equals("E"))
						{
								if((x+1)>grid_x)
									{
										err="-ER";
										break;
									}
							x++;
						}
					if(current_direction.equals("W")){
						if((x-1)>grid_x || x-1 < 0)
									{
										err="-ER";
										break;
									}
							x--;
						}
					if(current_direction.equals("N")){
						if((y+1)>grid_y)
							{
										err="-ER";
										break;
									}
							y++;
					}
					if(current_direction.equals("S")){
						if((y-1)>grid_y || y-1 <0)
									{
										err="-ER";
										break;
									}
						y--;
					}
				}
				else {
					current_direction = rotate(current_direction,directions);
				}
		}
		return x+"-"+y+"-"+current_direction+err;
		
	}
	public static String rotate(String initital,String direction){
		if(initital.equals("E"))
			return direction.equals("R")?"S":"N";
		
		if(initital.equals("W"))
			return direction.equals("R")?"N":"S";
		
		if(initital.equals("N"))
			return direction.equals("R")?"E":"W";
		
		if(initital.equals("S"))
			return direction.equals("L")?"E":"W";
		
		return "";
	}
}


