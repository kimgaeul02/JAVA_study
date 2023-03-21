public class PrintTriangle
{
    public static void main(String[] args)
    {
        /* Print out the following triangular shape
         * using any loop statements.
         */

         int MAX=12;

         for(int i=1;i<=MAX;i++){
            for(int j=0;j<=MAX-i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print("#");
            }
            System.out.println("");
         }

        /* Output: 
                      #
                     ## 
                    ###
                   ####
                  #####
                 ######
                #######
               ########
              #########
             ##########
            ###########
           ############
         */
    }
}

/* MEMO */
/*
 * A triple "for loop" was used to change lines, insert the '#', and insert spaces.
 */