import java.util.*;
public class ComputeQuotientandRemainder 
{
  
    public static void main(String[] args)
    {
        //Take dividend as divisor as variables dvnd and dvsr respectively
        int dvnd = 458, dvsr = 8;
        // Take quotient as variable quot and compute quotient
        // Store the result in quot
        int quot = dvnd / dvsr;
        // Take remainder as variable rem and compute remainder
        // Store the result in rem
        int rem = dvnd % dvsr;
        // Print the quotient value
        System.out.println("Quotient = " + quot);
        // Print the remainder value
        System.out.println("Remainder = " + rem);
    }