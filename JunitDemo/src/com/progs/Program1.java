package com.progs;
class BugException extends Exception{
	public BugException(String message) {
		super(message);
	}
}

public class Program1 
{
	
public int Solution(String input)throws BugException
{
	//wap to find dum of doigits passed as input
	//if any special character is fount am exception
	//called  BugFounf with message"ïnvalid character
	int sum=0;
	for(char c:input.toCharArray())
	{
		if(!(Character.isLetterOrDigit(c)))
		
			throw new BugException("Invalid Character");
		else if(Character.isDigit(c))
			sum=sum+Character.getNumericValue(c);
		
	}
	return sum;
	
}

}
