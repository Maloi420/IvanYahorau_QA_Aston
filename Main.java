import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Апельсин");
        arrayList.add("Апельсин");
        arrayList.add("Свекла");
        arrayList.add("Дыня");
        arrayList.add("Дыня");
        arrayList.add("Помидор");
        arrayList.add("Яблоко");
        arrayList.add("Яблоко");
        arrayList.add("Огурец");
        arrayList.add("Арбуз");
        arrayList.add("Арбуз");
        arrayList.add("Банан");
        arrayList.add("Банан");
        arrayList.add("Банан");

        HashMap<String, Integer> wordCountMap = new HashMap<>();

        for (String word : arrayList) {
            String normalizedWord = word.toLowerCase();
            wordCountMap.put(normalizedWord, wordCountMap.getOrDefault(normalizedWord, 0) + 1);
        }

        System.out.println("Уникальные слова:");
        for (String word : wordCountMap.keySet()) {
            if (wordCountMap.get(word) == 1) {
                System.out.println(word);
            }
        }

        System.out.println("\nКоличество каждого слова:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
    }
}