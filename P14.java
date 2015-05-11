package euler;


public class P14 {

	public static void main(String[] args){
		int maxLength =0;
		
		for( int i=1; i< 1000000;i++)
		{
			int length = getLength(i);
			if(length > maxLength){
				maxLength = length;
				System.out.println(i+"::"+maxLength);
			}
		}
	}

	private static int getLength(long i) {
		//TODO: Speed can be improved by doing memorization of code.
		int length = 0;
		while(i > 1)
		{
			if(i%2 == 0){
				i = i/2;
			}
			else
			{
				i = (3*i) +1;
			}
			length++;
		}
		
		return length+1;
	}
	
}
