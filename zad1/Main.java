public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Dog dog1 = new Dog("Бобик");

        System.out.println("Всего животных: " + Animal.getAnimalCount());
        System.out.println("Всего котов: " + Cat.getCatCount());
        System.out.println("Всего собак: " + Dog.getDogCount());

        cat1.run(150);
        cat1.swim(5);

        cat2.run(100);
        cat2.swim(5);

        dog1.run(400);
        dog1.swim(5);

        FoodBowl bowl = new FoodBowl(10);

        cat1.eatFromBowl(bowl);
        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());

        cat2.eatFromBowl(bowl);
        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());

        bowl.addFood(20);
        System.out.println("Остаток еды в миске после добавления: " + bowl.getFoodAmount());

        cat2.eatFromBowl(bowl);
        System.out.println("Остаток еды в миске: " + bowl.getFoodAmount());
    }
}