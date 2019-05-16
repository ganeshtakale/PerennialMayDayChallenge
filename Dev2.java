import java.util.Scanner;
public class Dev2{
      public static void main(String[] args){
		long num1, num2;
		Scanner in = new Scanner(System.in);
		num1 = in.nextInt();

		for(long i =0; i<num1;i++){
			num2 = in.nextLong();
			long a[] = new long[(int)num2];
			for (long j = 0; j < num2; j++){
         		    if (in.hasNextLong()) {
                	        a[(int)j] = in.nextLong();
           		    } else {
                		System.out.println("You didn't provide enough numbers");
                		break;
            		    }
        		}
			System.out.println(equilibrium(a,num2)+1);
		}
	}

	static int equilibrium(long arr[],long n){
        	int i, j; 
        	int leftsum, rightsum;
		for (i = 0; i < n; ++i) {
			leftsum = 0;   
                	for (j = 0; j < i; j++) 
                		leftsum += arr[j];
			rightsum = 0; 
            		for (j = i + 1; j < n; j++) 
                		rightsum += arr[j];
			if (leftsum == rightsum)
				return i;
		}
		return -1;
	}
}
