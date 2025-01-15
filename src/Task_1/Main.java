package Task_1;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog("Мухтар");
        Cat[] cats = {
                new Cat("Пусс"),
                new Cat("Том")
        };

        int[] runDistances = {150, 250};
        int[] swimDistances = {5, 0};

        dog.run(400);
        dog.swim(5);

        for (int i = 0; i < cats.length; i++) {
            cats[i].run(runDistances[i]);
            cats[i].swim(swimDistances[i]);
        }

        Bowl bowl = new Bowl(18);

        System.out.println("\nКоты едят:");
        for (Cat cat : cats) {
            cat.eat(bowl, 10);
        }

        System.out.println("\nСытость котов:");
        for (Cat cat : cats) {
            System.out.println(cat.getName() + " сытость: " + cat.isFull());
        }

        bowl.addFood(20);
        System.out.println("\nКоты едят еще раз:");
        for (Cat cat : cats) {
            if (!cat.isFull()) {
                cat.eat(bowl, 10);
            }
        }

        System.out.println("\nИтого:");
        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
    }
}