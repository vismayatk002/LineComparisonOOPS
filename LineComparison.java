import java.lang.Math;
import java.lang.*;
public class LineComparison{

    public double calcLength(int x1 ,int y1 ,int x2 ,int y2){

        // Calculate length of first Line 
        Double length =  Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        return length;
    }
    public boolean checkEqual(Double length1 , Double length2){
        
        // Check equality of first and second line
        if(length1.equals(length2)){
            return true;
        }
        else{
            return false;
        }
    }
}