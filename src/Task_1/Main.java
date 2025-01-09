package Task_1;

public class Main {
    public static void main(String[] args) {
        // Животные
        Dog dogMuhtar = new Dog("Мухтар");
        Cat catPuss = new Cat("Пусс");
        Cat catTom = new Cat("Томас");

        // Бег и плавание
        System.out.println("\nДемонстрация действий:");
        dogMuhtar.run(150);
        dogMuhtar.swim(11);
        catPuss.run(200);
        catPuss.swim(0);
        catTom.swim(2);
        catTom.run(201);

        // Подсчет животных
        System.out.println("\nПодсчет животных:");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Собак: " + Dog.getDogCount());
        System.out.println("Котов: " + Cat.getCatCount());

        // Миска
        Bowl bowl = new Bowl(20);
        System.out.println("\nНачальное состояние миски: " + bowl);

        // Коты едят
        System.out.println("\nКоты едят:");
        Cat[] cats = {catPuss, catTom};
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        // Сытость котов
        System.out.println("\nИнформация о сытости котов:");
        for (Cat cat : cats) {
            System.out.println(cat.name + " сытый: " + cat.isSatiety());
        }

        // Еда в миске
        System.out.println("\nДобавляем еду в миску:");
        bowl.addFood(10);
        System.out.println(bowl);

        // Коты едят х2
        System.out.println("\nКоты едят еще раз:");
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println("\nОкончательное состояние миски: " + bowl);
    }
}