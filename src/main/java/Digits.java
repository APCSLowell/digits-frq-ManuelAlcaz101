import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

public Digits(int num) {
    digitList = new ArrayList<Integer>();
    
    if (num == 0) {
        digitList.add(0);
    } else {
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while (num > 0) {
            temp.add(0, num % 10);  // Insert at front to preserve order
            num /= 10;
        }
        digitList.addAll(temp);
    }
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
