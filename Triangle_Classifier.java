// Nicholas Cecala

import java.util.Scanner;

public class Triangle_Classifier
{
    public static void main (String args []){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Welcome to the Triangle Classifier program");
        System.out.print("Please enter the lengths of the three (3) triangle sides in ascending order. ");
        //Initialize triangle sides
        int side1 = 0;
        int side2 = 0;
        int side3 = 0;
        //Initialize boolean variables
        boolean isInt;
        boolean isValid;
        //Initialize a and s variable to use in area calculation
        double s;
        double a;
        // Validate that input is an int
        if (scanner.hasNextInt()){
            side1 = scanner.nextInt();
            isInt = true;
        }
        else {
            isInt = false;
        }
        if (scanner.hasNextInt()){
            side2 = scanner.nextInt();
            isInt = true;
        }
        else {
            isInt = false;
        }
        if (scanner.hasNextInt()){
            side3 = scanner.nextInt();
            isInt = true;
        }
        else {
            isInt = false;

        }
        if (isInt == false) {
            System.out.print("Error -- One of thses sides is not an integer");
            System.exit(0);
        }
        //Verify that the entered number is a valid number for a side of a triangle
        if ((side1 <=0) && (side2 <=0) && (side3 <=0)) {
            isValid = false;
        }
        else {
            isValid = true;
        }
        if (isValid == false){
            System.out.print("Error - At least one of your sides is an invalid value");
            System.exit(0);
        }
        //Check if numbers are in ascending order
        if (side1 > side2 || side1 > side3 || side2 > side3){
            System.out.print("Sides not in ascending order");
            System.exit(0);
        }
        //Check that the sides can form a triangle (Triangle equality theory)
        if ((side1 + side2 <= side3) || (side2 + side3 <= side1) || (side1 + side3 <= side2)){
            System.out.print("The sides can not form a valid triangle.");
            System.exit(0);
        }
        //Check if Triangle is Equalateral, if so calculate the area
        if (side1 == side2 && side2 == side3){
            System.out.println("This is an Equalateral Triangle");
            s = (side1 + side2 + side3) / 2.0d;
            a = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            System.out.printf("The area of this triangle is %4.2f", a);
        }
        //Check if Isosceles is Equalateral, if so calculate the area
        else if (side1 == side2 || side1 == side3 || side2 == side3){
            System.out.println("This is an Isosceles Triangle");
            s = (side1 + side2 + side3) / 2.0d;
            a = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            System.out.printf("The area of this triangle is %4.2f", a);

        }
        //Check if Triangle is a Right Triangle, if so calculate the area
        else if ((side1 * side1) + (side2 * side2) == (side3 * side3)){
            System.out.println("This is a Right triangle");
            s = (side1 + side2 + side3) / 2.0d;
            a = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            System.out.printf("The area of this triangle is %4.2f", a);

        }
        //Check if Triangle is Non-Distinctive, if so calculate the area
        else {
            System.out.println("This is a Non-distinctive Triangle");
            s = (side1 + side2 + side3) / 2.0d;
            a = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            System.out.printf("The area of this triangle is %4.2f", a);
        }
    }

}

