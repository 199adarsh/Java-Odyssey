package Assignment;

class Vehicle {
    int vehicleId;
    String model;
    String type;
    double price;

    public Vehicle(int vehicleId, String model, String type, double price) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.type = type;
        this.price = price;
    }


    @Override
    public String toString() {
        return "ID: " + vehicleId + " Model: " + model + " Type: " + type + "  Price: " + price;
    }
}