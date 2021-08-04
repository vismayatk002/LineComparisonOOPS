import java.util.*;
public class LineComparisonMain{

    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);
        LineComparison line = new LineComparison();
        //Read first co-ordinates
        System.out.println("Enter first co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        int x1= sc.nextInt();  
        System.out.print("Enter y : "); 
        int y1= sc.nextInt(); 

        //Read second co-ordinates
        System.out.println("Enter second co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        int x2= sc.nextInt();  
        System.out.print("Enter y : "); 
        int y2= sc.nextInt();
        System.out.printf("Length of line : %.2f " , line.calcLength(x1 , y1 , x2 , y2));
    }
}