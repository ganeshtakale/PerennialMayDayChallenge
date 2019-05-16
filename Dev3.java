import java.util.Scanner;
public class Dev3{
	static void spiralPrint(int m, int n, int a[][]) 
        { 
        int i, k = 0, l = 0; 
        /*  k - starting row index 
        m - ending row index 
        l - starting column index 
        n - ending column index 
        i - iterator 
        */
           
        while (k < m && l < n) 
        { 
            // Print the first row from the remaining rows 
            for (i = l; i < n; ++i) 
            { 
                System.out.print(a[k][i]+" "); 
            } 
            k++; 
   
            // Print the last column from the remaining columns  
            for (i = k; i < m; ++i) 
            { 
                System.out.print(a[i][n-1]+" "); 
            } 
            n--; 
   
            // Print the last row from the remaining rows */ 
            if ( k < m) 
            { 
                for (i = n-1; i >= l; --i) 
                { 
                    System.out.print(a[m-1][i]+" "); 
                } 
                m--; 
            } 
   
            // Print the first column from the remaining columns */ 
            if (l < n) 
            { 
                for (i = m-1; i >= k; --i) 
                { 
                    System.out.print(a[i][l]+" "); 
                } 
                l++;     
            }         
        } 
    }
    public static void main(String[] args){
	int num1, num2, num3;
	Scanner in = new Scanner(System.in);
	num1 = in.nextInt();
	for(long i =0; i<num1;i++){
		num2 = in.nextInt();
		num3 = in.nextInt();
		int a[][] = new int[num2][num3];
		for (int j = 0; j < num2; j++){
			for(int k=0; k<num3;k++){
			if(in.hasNextInt())
				a[j][k]=in.nextInt();
			}
      		}
		spiralPrint(num2,num3,a);
	}
    }
}
