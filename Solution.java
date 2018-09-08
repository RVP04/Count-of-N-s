import java.util.*;
public class Hello {

    public static void main(String[] args) {
	
	    Scanner sc = new Scanner(System.in);
	    
	    int digit = sc.nextInt();
	    int x = sc.nextInt();
	    int y = sc.nextInt();
	    
	    int count = 0;
	    
	    for(int i=x+1;i<y;i++)
	    {
	        count+=countDigits(i,digit);
	    }
        
        System.out.println(count);
	}
	
	public static int countDigits(int number, int search)
	{
	    int sum=0;
	    while(number>0)
	    {
	        int temp = number%10;
	        number = number/10;
	        if(temp==search)
	            sum++;
	            
	    }
	    return sum;
	}
}
