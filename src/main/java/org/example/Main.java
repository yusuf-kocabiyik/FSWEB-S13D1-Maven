package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(shouldWakeUp (true, 1));

        System.out.println(shouldWakeUp (false, 2));

        System.out.println(shouldWakeUp (true, 8));

        System.out.println(shouldWakeUp (true, -1));

        System.out.println("-----------------------------------");

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

        System.out.println("-----------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height of rectangle: ");
        double height = scanner.nextDouble();
        System.out.println("Area of the rectangle: "+area(width,height));
        System.out.println(area(8,9));

        System.out.println("Enter radius of the circle: ");
        double radius = scanner.nextDouble();
        System.out.println("area of circle is: "+area(radius));

    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23 || !isBarking) {
            return false;
        }

        return (clock<8 || clock>=20);
    }
    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge>13 && firstAge<=19) || (secondAge>13 && secondAge<=19) || (thirdAge>13 && thirdAge<=19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        return (isSummer && (temp > 25 && temp < 45)) || (!isSummer && (temp > 25 && temp <= 35));
    }

    public static double area(double width, double height) {
        if(width<0 || height<0){
            System.out.println(("width veya height sıfırdan küçük olamaz!! width: "+width+ "height: "+height));
            return -1;
        }
        return  width*height;
    }

    public static double area(double radius) {
        if(radius<0){
            System.out.println(("yarıçap değeri sıfırdan küçük olamaz. Yarıçap: " + radius));
            return -1;
        }
        return  Math.PI*Math.pow(radius,2);

    }
}
