class FoodBowl {
    private int foodAmount;

    public FoodBowl(int initialFood) {
        this.foodAmount = Math.max(initialFood, 0);
    }

    // Проверяем, достаточно ли еды
    public boolean hasEnoughFood(int amount) {
        return foodAmount >= amount;
    }

    public int takeFood(int amount) {
        if (hasEnoughFood(amount)) {
            foodAmount -= amount;
            return amount;
        }
        return 0;
    }

    public void addFood(int amount) {
        if (amount > 0) {
            foodAmount += amount;
            System.out.println("В миску добавлено " + amount + " единиц еды. Теперь в миске " + foodAmount + " единиц еды.");
        }
    }

    public int getFoodAmount() {
        return foodAmount;
    }
}