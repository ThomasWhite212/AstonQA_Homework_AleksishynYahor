package Task_2;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Белый", "Черный");
        Shape rectangle = new Rectangle(4, 6, "Синий", "Зеленый");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Красный");

        Shape[] shapes = {circle, rectangle, triangle};

        for (Shape shape : shapes) {
            System.out.println("Фигура: " + shape.getClass().getSimpleName());
            System.out.println("Периметр: " + shape.calculatePerimeter());
            System.out.println("Площадь: " + shape.calculateArea());
            System.out.println("Цвет заливки: " + shape.getFillColor());
            System.out.println("Цвет границы: " + shape.getBorderColor());
            System.out.println();
        }
    }
}