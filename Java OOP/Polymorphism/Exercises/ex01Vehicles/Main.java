package polymorphism.exercises.ex01Vehicles;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle car = getVehicle(scanner);

        Vehicle truck = getVehicle(scanner);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        vehicleMap.put("Car", car);
        vehicleMap.put("Truck", truck);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (numberOfCommands-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");

            String commandName = command[0];
            String vehicleType = command[1];
            double argument = Double.parseDouble(command[2]);

            switch (commandName) {
                case "Drive":
                    System.out.println(vehicleMap.get(vehicleType).drive(argument));
                    break;
                case "Refuel":
                    vehicleMap.get(vehicleType).refuel(argument);
            }
        }

        vehicleMap.values().forEach(System.out::println);
    }

    private static Vehicle getVehicle(Scanner scanner) {
        String[] vehicleInfo = scanner.nextLine().split("\\s+");

        String vehicleType = vehicleInfo[0];
        double fuelAmount = Double.parseDouble(vehicleInfo[1]);
        double fuelConsumption = Double.parseDouble(vehicleInfo[2]);

        switch (vehicleType) {
            case "Car":
                return new Car(fuelAmount, fuelConsumption);
            case "Truck":
                return new Truck(fuelAmount, fuelConsumption);
            default:
                throw new IllegalArgumentException("Missing car");
        }
    }
}
