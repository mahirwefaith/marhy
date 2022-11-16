package coursework;

	import java.util.Scanner;

	public class JavaExample
	{
	    public static void main(String args[])
	    {
	    	/* This program assumes that the student has 7 course units,
	    	 * thats why I have created the array of size 7. You can
	    	 * change this as per the requirement.
	    	 */
	        int marks[] = new int[7];
	        int i;
	        float total=0, avg;
	        Scanner scanner = new Scanner(System.in);
			
	        
	        for(i=0; i<7; i++) { 
	           System.out.print("Enter Marks of course unit"+(i+1)+":");
	           marks[i] = scanner.nextInt();
	           total = total + marks[i];
	        }
	        scanner.close();
	        //Calculating average here
	        avg = total/7;
	        System.out.print("The  Grade is: ");
	        if(avg>=80)
	        {
	            System.out.print("A");
	        }
	        else if(avg>=60 && avg<80)
	        {
	           System.out.print("B");
	        } 
	        else if(avg>=40 && avg<60)
	        {
	            System.out.print("C");
	        }
	        else
	        {
	            System.out.print("D");
	        }
	    }
	}


