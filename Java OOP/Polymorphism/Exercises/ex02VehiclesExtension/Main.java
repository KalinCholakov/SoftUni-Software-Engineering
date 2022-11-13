package polymorphism.exercises.ex02VehiclesExtension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();

        vehicleMap.put("Car", getVehicle(scanner));
        vehicleMap.put("Truck", getVehicle(scanner));
        vehicleMap.put("Bus", getVehicle(scanner));

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (numberOfCommands-- > 0) {
            String[] command = scanner.nextLine().split("\\s+");

            String commandName = command[0];
            String vehicleType = command[1];
            double argument = Double.parseDouble(command[2]);

            switch (commandName) {
                case "DriveEmpty":
                    System.out.println(vehicleMap.get(vehicleType).drive(argument));
                    break;
                case "Drive":
                    System.out.println(vehicleMap.get(vehicleType).driveWithAC(argument));
                    break;
                case "Refuel":
                    try{
                        vehicleMap.get(vehicleType).refuel(argument);
                    }catch (Exception exception){
                        System.out.println(exception.getMessage());
                    }
                    break;
            }
        }

        vehicleMap.values().forEach(System.out::println);
    }

    private static Vehicle getVehicle(Scanner scanner) {
        String[] vehicleInfo = scanner.nextLine().split("\\s+");

        String vehicleType = vehicleInfo[0];
        double fuelAmount = Double.parseDouble(vehicleInfo[1]);
        double fuelConsumption = Double.parseDouble(vehicleInfo[2]);
        double tankCapacity = Double.parseDouble(vehicleInfo[3]);

        switch (vehicleType) {
            case "Car":
                return new Car(fuelAmount, fuelConsumption, tankCapacity);
            case "Truck":
                return new Truck(fuelAmount, fuelConsumption, tankCapacity);
            case "Bus":
                return new Bus(fuelAmount, fuelConsumption, tankCapacity);
            default:
                throw new IllegalArgumentException("Missing car");
        }
    }
}
