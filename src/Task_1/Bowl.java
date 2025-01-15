package Task_1;

public class Bowl {
    private int food;

    public Bowl(int initialFood) {
        this.food = Math.max(initialFood, 0);
    }

    public boolean decreaseFood(int amount) {
        if (amount > 0 && food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            food += amount;
            System.out.println("Добавлено " + amount + " еды в миску. Осталось еды: " + food);
        }
    }

    public int getFood() {
        return food;
    }
}