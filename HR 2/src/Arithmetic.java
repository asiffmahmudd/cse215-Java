import java.util.*;
import java.math.*;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
      
        double d1 = (tipPercent * mealCost)/100.00;
        double d2 = (taxPercent * mealCost)/100.00;
        double d3 = d1+d2+mealCost;
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(d3);
      
        // Print your result
        System.out.println("The total meal cost is "+totalCost+ " dollars");
    }
}