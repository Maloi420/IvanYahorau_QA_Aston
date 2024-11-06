import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> phoneBook = new HashMap<>();

    public void add(String surname, String phoneNumber) {
        phoneBook.putIfAbsent(surname, new ArrayList<>());
        phoneBook.get(surname).add(phoneNumber);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Иванов", "123-456");
        phoneBook.add("Петров", "234-567");
        phoneBook.add("Сидоров", "345-678");
        phoneBook.add("Иванов", "456-789");
        phoneBook.add("Иванов", "789-012");

        // Поиск номеров по фамилиям
        System.out.println("Телефоны Ивановых: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
        System.out.println("Телефоны Сидорова: " + phoneBook.get("Сидоров"));
        System.out.println("Телефоны Смирнова (не существует): " + phoneBook.get("Смирнов"));
    }
}