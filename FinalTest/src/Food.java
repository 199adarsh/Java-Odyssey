
class Food {
    private int foodId;
    private String foodName;
    private String foodCategory;
    private double foodPrice;
    private int foodAvailable;

    public Food(int foodId, String foodName, String foodCategory, double foodPrice, int foodAvailable) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodCategory = foodCategory;
        this.foodPrice = foodPrice;
        this.foodAvailable = foodAvailable;
    }

    @Override
    public String toString() {
        return "Food [Food ID: " + foodId + ", Name: '" + foodName + "', Category: '" + foodCategory + "', Price: " + foodPrice + ", Available: " + foodAvailable + "]";
    }
}