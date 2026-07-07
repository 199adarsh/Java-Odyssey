package Assignment;

import java.io.*;
import java.util.*;


public class VehicleManager {

    public static void writeVehicles() {
        List<Vehicle> vehicles = Arrays.asList(
                new Vehicle(101, "Camry", "Sedan", 24000),
                new Vehicle(102, "Civic", "Sedan", -2000),
                new Vehicle(103, "Fortuner", "SUV", -5000),
                new Vehicle(104, "Sonnet", "EV", 40000),
                new Vehicle(105, "Defender", "SUV", 28000)
        );

        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("Vehicles.db"))) {
            for (Vehicle v : vehicles) {
                if (v.price > 0) {
                    dos.writeInt(v.vehicleId);
                    dos.writeUTF(v.model);
                    dos.writeUTF(v.type);
                    dos.writeDouble(v.price);

                }
            }
            System.out.println("Data successfully written to Vehicles.db.");

        } catch (IOException e) {e.printStackTrace();}
    }



    public static void readVehicles() {
        List<Vehicle> validVehicles = new ArrayList<>();

        try (DataInputStream dis = new DataInputStream(new FileInputStream("Vehicles.db"))) {
            while (true) {
                int id = dis.readInt();
                String model = dis.readUTF();
                String type = dis.readUTF();
                double price = dis.readDouble();
                validVehicles.add(new Vehicle(id, model, type, price));
            }

        } catch (EOFException e) {} catch (IOException e) { e.printStackTrace();}


        validVehicles.sort((v1, v2) -> Double.compare(v2.price, v1.price));

        System.out.println("\nVehicle Records (Sorted by Price Descending) ");
        for (Vehicle v : validVehicles) System.out.println(v);
    }



    public static void main(String[] args) {
        writeVehicles();
        readVehicles();
    }
}
