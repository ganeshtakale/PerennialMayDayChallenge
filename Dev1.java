//To Run this program use the following commands in terminal
//To compile
//1. javac Dev1.java
//To Run
//2. java Dev1

import java.util.Scanner;

public class Dev1{
      public static void main(String[] args){
		long num1, num2,num3;
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();

		for(long i =0; i<num1;i++){
			num2 = in.nextLong();
			num3 = in.nextLong();
			long a[] = new long[(int)num2];
			for (long j = 0; j < num2; j++){
         		    if (in.hasNextLong()) {
                	        a[(int)j] = in.nextLong();
           		    } else {
                		System.out.println("You didn't provide enough numbers");
                		break;
            		    }
        		}
			subArraySum(a,num2,num3);
		}
	}

	static void subArraySum(long arr[],long n,long sum){
        long curr_sum, i, j;
        // Pick a starting point
       	 for (i = 0; i < n; i++)
         {
                curr_sum = arr[(int)i];
                // try all subarrays starting with 'i'
                for (j = i + 1; j <= n; j++){
                     if (curr_sum == sum){
                         System.out.println((i+1)+" "+j);
			 break;
                     }
                     if (curr_sum > sum || j == n)
                         break;
                     curr_sum = curr_sum + arr[(int)j];
                }
		if(curr_sum==sum)
			break;
         }
     }
}
