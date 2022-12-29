package entities;

public class Rectangle {
    public double width;
    public double height;

    public double calcularArea(){
        return width * height;
    }

    public double calcularPerimeter(){
        return 2 * (width + height);
    }

    public double calcularDiagonal(){
        return Math.sqrt(Math.pow(width,2) + Math.pow(height,2));

    }

}
