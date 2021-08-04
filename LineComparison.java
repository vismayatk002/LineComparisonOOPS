import java.lang.Math;
import java.lang.*;
public class LineComparison{

    public double calcLength(int x1 ,int y1 ,int x2 ,int y2){

        // Calculate length of first Line 
        Double length =  Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        return length;
    }
    public void compare(Double length1 , Double length2){
    
        int result =  length1.compareTo(length2);
    
        if(result > 0) {
            System.out.println("\nFirst line is greater than second line");
        } else if(result < 0) {
            System.out.println("\nSecond line is greater than First line");
        } else {
            System.out.println("\nLines are equal");
        }
    }
}