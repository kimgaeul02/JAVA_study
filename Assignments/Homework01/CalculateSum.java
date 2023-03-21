public class CalculateSum
{
    public static int findSum(int n)
    {
        /* Create a "findSum" fuction */
        
        int total_sum=0;
        for(int i=1;i<=n;i++){
            total_sum=total_sum+i;
        }
        return total_sum;
    }

    public static void main(String[] args)
    {
        /* Find the sum from 1 to n using any loop statements
         * and print out the sum
         */
        
        System.out.println(findSum(100));       // 5050       
        System.out.println(findSum(1234));      // 761995  
        System.out.println(findSum(1000));      // 500500
    }
}

/* MEMO */
/*
 * The core of this problem lies in how to define and use functions.
 * I defined the function "findsum" to add all numbers from 0 to n
 * and did this with the main function.
 */