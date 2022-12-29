package application;

import entities.Rectangle;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height: ");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println("Area: " + rectangle.calcularArea());
        System.out.println("Perimeter: " + rectangle.calcularPerimeter());
        System.out.println("Diagonal: " + rectangle.calcularDiagonal());

        sc.close();
    }
}
