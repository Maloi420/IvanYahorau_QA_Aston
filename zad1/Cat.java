class Cat extends Animal {
    private static int catCount = 0;
    private static final int RUN_LIMIT = 200;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    public void run(int distance) {
        if (distance <= RUN_LIMIT) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не может пробежать более " + RUN_LIMIT + " м.");
        }
    }

    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public boolean isFull() {
        return isFull;
    }

    public void eatFromBowl(FoodBowl bowl) {
        if (!isFull) {
            int foodNeeded = 15;
            int foodTaken = bowl.takeFood(foodNeeded);
            if (foodTaken >= foodNeeded) {
                isFull = true;
                System.out.println(name + " поел и теперь сыт.");
            } else {
                System.out.println(name + " не ел, в миске оказалось недостаточно еды.");
            }
        } else {
            System.out.println(name + " уже сыт и не хочет есть.");
        }
    }
}