public class StringExample
{
    public static void main(String[] args)
    {
        /* 1. Concatenate the following two String variables and print out
         * "Hello there.I feel good." Use concatenation operator for String.
         */

        String firstMessage = "Hello there.";
        String secondMessage = "I feel good.";

        String StrConcat = firstMessage + secondMessage;
        System.out.println(StrConcat);

        /* 2. Convert the following message into uppercase and print out the
         * result.
         */ 

        String messageForConversion = "The quick brown fox jumps over the lazy dog.";
        
        String StrUpper = messageForConversion.toUpperCase();
        System.out.println(StrUpper);

        /* 3. Use split() method in String and split the sentence into words.
         * Then print out each word as follows. Need to use array and any loop
         * statements.
         */

        String sentence = "Conditions worsen in Ukraine as war enters one year.";

        String[] StrSplit = sentence.split((" "));
        for(int i=0;i<=StrSplit.length;i++){
            System.out.println(StrSplit[i]);
        }

        /* Output:
           Conditions
           worsen
           in
           Ukraine
           as
           war
           enters
           one
           year.
        */         
    }
}