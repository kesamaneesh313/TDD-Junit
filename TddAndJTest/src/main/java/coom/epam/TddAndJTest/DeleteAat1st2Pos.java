package coom.epam.TddAndJTest;

public class DeleteAat1st2Pos {

	public String delete(String string) {
		// TODO Auto-generated method stub
		if(string.isEmpty())
			return string;
		StringBuilder string1 = new StringBuilder(string);
		if(string.length()==1)
		{
			char firstChar = string1.charAt(0);
			if(firstChar=='A')
			{
				string1.deleteCharAt(0); 
			}
			return string1.toString();
		}
		else
		{
			char firstChar = string1.charAt(0);
			char secondChar = string1.charAt(1);
			if(secondChar=='A')
			{
				string1.deleteCharAt(1);
			}
			if(firstChar=='A')
			{
				string1.deleteCharAt(0); 
			}
			return string1.toString();
		}
	}
}
