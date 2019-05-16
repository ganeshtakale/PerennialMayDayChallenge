//To Run this program use the following commands in terminal
//To compile
//1. javac Dev1.java
//To Run
//2. java Dev1

import java.util.Scanner;

public class Dev1{
      public static void main(String[] args){
		int num1, num2,num3;
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();

		for(int i =0; i<num1;i++){
			num2 = in.nextInt();
			num3 = in.nextInt();
			int a[] = new int[num2];
			for (int j = 0; j < num2; j++){
         		    if (in.hasNextInt()) {
                	        a[j] = in.nextInt();
           		    } else {
                		System.out.println("You didn't provide enough numbers");
                		break;
            		    }
        		}
			subArraySum(a,num2,num3);
		}
	}

	static void subArraySum(int arr[], int n, int sum){
        int curr_sum, i, j;
        // Pick a starting point
       	 for (i = 0; i < n; i++)
         {
                curr_sum = arr[i];
                // try all subarrays starting with 'i'
                for (j = i + 1; j <= n; j++){
                     if (curr_sum == sum){
                         System.out.println((i+1)+" "+j);
			 break;
                     }
                     if (curr_sum > sum || j == n)
                         break;
                     curr_sum = curr_sum + arr[j];
                }
		if(curr_sum==sum)
			break;
         }
     }
}
