package DAY4;

public class StringOperations {
	public static String performOperations(String input,int choice)
	{
		switch(choice)
		{
		case 1:
			String r= input+input;
			return r;
		case 2:
			String s="";
			int i = 0;
			
			for( i=0;i<input.length();i++)
			{
				if(i%2==0)
				{
					s+=input.charAt(i);
				}
				else
				{
					s+="#";
				}
		
			}
			return s;
		
		case 3:
			String a="";
			for(int j=0;j<input.length();j++)
			{
				char ch=input.charAt(j);
				if(a.indexOf(ch)==-1)
				{
					a+=ch;
				}
			}
			return a;
		case 4:
			String b="";
			for(int j=0;j<input.length();j++)
			{
				char ch=input.charAt(j);
		
			if(j%2!=0)
			{
				b+=Character.toUpperCase(ch);
			}
			else
			{
				b+=ch;
			}
			
			}	
			return b;
		default:
			return "Invalid choice";
		
		}
	}
}
