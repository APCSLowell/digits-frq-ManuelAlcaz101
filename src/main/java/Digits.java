import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    digitList = new ArrayList<Integer>();
	    String line = "" + num;
	    for(int i = 0; i < line.length(); i++)
	       digitList.add(line.charAt(i) - '0');
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
	    for(int i = 0; i < digitList.size()-1; i++){
		if(digitList.get(i+1) <= digitList.get(i))
			return false;
	    }
	    return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
