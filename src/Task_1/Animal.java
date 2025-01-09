package Task_1;

class Animal {
    protected String name;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    private static int animalCount = 0;

    public Animal(String name) {
        this.name = name;
        animalCount++;
    }

    public void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    public void swim(int distance) {
        if (distance <= maxSwimDistance) {
            System.out.println(name + " проплыл " + distance + " м.");
        } else {
            System.out.println(name + " не смог проплыть " + distance + " м.");
        }
    }

    public static int getAnimalCount() {
        return animalCount;
    }
}

class Dog extends Animal {
    private static int dogCount = 0;

    public Dog(String name) {
        super(name);
        this.maxRunDistance = 500;
        this.maxSwimDistance = 10;
        dogCount++;
    }

    public static int getDogCount() {
        return dogCount;
    }
}

class Cat extends Animal {
    private static int catCount = 0;
    private boolean satiety = false; // Поле для сытости

    public Cat(String name) {
        super(name);
        this.maxRunDistance = 200;
        this.maxSwimDistance = 0; // Коты не умеют плавать
        catCount++;
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void eat(Bowl bowl, int foodAmount) {
        if (bowl.decreaseFood(foodAmount)) {
            satiety = true;
            System.out.println(name + " поел корм.");
        } else {
            System.out.println(name + " не смог поесть, так как еды недостаточно.");
        }
    }

    public static int getCatCount() {
        return catCount;
    }
}

class Bowl {
    private int foodAmount;

    public Bowl(int foodAmount) {
        this.foodAmount = foodAmount;
    }

    public boolean decreaseFood(int amount) {
        if (foodAmount >= amount) {
            foodAmount -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды.");
        } else {
            System.out.println("Нельзя добавить отрицательное количество еды.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    @Override
    public String toString() {
        return "В миске осталось " + foodAmount + " единиц еды.";
    }
}