import java.util.*;
public class LineComparisonMain{

    public static void main(String[] args){

        int x1 ,y1 , x2 , y2;
        Scanner sc= new Scanner(System.in);
        
        //Read first co-ordinates of First line
        System.out.println("Enter co-ordinates of First line"); 
        System.out.println("Enter first co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        x1= sc.nextInt();  
        System.out.print("Enter y : "); 
        y1= sc.nextInt(); 
        //Read second co-ordinates
        System.out.println("Enter second co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        x2= sc.nextInt();  
        System.out.print("Enter y : "); 
        y2= sc.nextInt(); 
        LineComparison line1 = new LineComparison(x1 ,y1 , x2 , y2);
        System.out.printf("Length of first line :%.2f " , line1.getLength());
        
        //Read first co-ordinates of Second line
        System.out.println("\nEnter co-ordinates of Second line"); 
        System.out.println("Enter first co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        x1= sc.nextInt();  
        System.out.print("Enter y : "); 
        y1= sc.nextInt(); 
        //Read second co-ordinates
        System.out.println("Enter second co-ordinates (x,y) ");  
        System.out.print("Enter x : ");  
        x2= sc.nextInt();  
        System.out.print("Enter y : "); 
        y2= sc.nextInt(); 

        LineComparison line2 = new LineComparison(x1 ,y1 , x2 , y2);
        System.out.printf("Length of second line : %.2f " , line2.getLength());

        line1.compare(line2);
    }
}