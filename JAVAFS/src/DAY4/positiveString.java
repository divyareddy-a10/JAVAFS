package DAY4;

public class positiveString {
	public boolean isPositive(String str)
	{
		str=str.toLowerCase();
		for(int i=0;i<str.length()-1;i++)
		{
			if(str.charAt(i)>=str.charAt(i+1))
			{
				return false;
			}
		}
		return true;
	}

}


