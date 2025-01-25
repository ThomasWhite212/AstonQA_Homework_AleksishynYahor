package Task_2;

import java.util.*;

public class Phonebook {
    private Map<String, List<String>> phonebook = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        phonebook.putIfAbsent(lastName, new ArrayList<>());
        phonebook.get(lastName).add(phoneNumber);
    }

    public List<String> get(String lastName) {
        return phonebook.getOrDefault(lastName, new ArrayList<>());
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();


        phonebook.add("Иванов", "+375-29-1234567");
        phonebook.add("Петров", "+375-29-2345678");
        phonebook.add("Сидоров", "+375-29-3456789");
        phonebook.add("Михайлов", "+375-29-4567890");
        phonebook.add("Козлов", "+375-29-5678901");
        phonebook.add("Иванов", "+375-29-9876543");
        phonebook.add("Петров", "+375-29-8765432");
        phonebook.add("Александров", "+375-29-7654321");
        phonebook.add("Смирнов", "+375-29-6543210");
        phonebook.add("Лебедев", "+375-29-5432109");

        System.out.println("Телефоны Иванова: " + phonebook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phonebook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phonebook.get("Сидоров"));
    }
}