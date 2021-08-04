import java.lang.Math;
import java.lang.*;
public class LineComparison{

    int x1 ,y1 , x2 , y2;
    Double length;
    //using constructor
    LineComparison(int x1 ,int y1 ,int x2 ,int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double calcLength(){

        // Calculate length of first Line 
        length =  Math.sqrt( Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2) );
        return length;
    }
    public void compare( Double length1  ,  Double length2){
    
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