package Task_2;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5, "Белый", "Черный"),
                new Rectangle(4, 6, "Синий", "Зеленый"),
                new Triangle(3, 4, 5, "Желтый", "Красный")
        };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}