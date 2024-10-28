public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5, "Синий", "Черный");
        Shape rectangle = new Rectangle(4, 7, "Зеленый", "Красный");
        Shape triangle = new Triangle(3, 4, 5, "Желтый", "Фиолетовый");

        System.out.println("Информация о круге:");
        circle.displayInfo();

        System.out.println("Информация о прямоугольнике:");
        rectangle.displayInfo();

        System.out.println("Информация о треугольнике:");
        triangle.displayInfo();
    }
}
