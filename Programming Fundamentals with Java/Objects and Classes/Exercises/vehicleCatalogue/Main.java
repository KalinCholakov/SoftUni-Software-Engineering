package vehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Vehicle> vehicleList = new ArrayList<>();
        String vehiclesInput = scanner.nextLine();
        while (!vehiclesInput.equals("End")) {
            String type = vehiclesInput.split(" ")[0];
            String model = vehiclesInput.split(" ")[1];
            String color = vehiclesInput.split(" ")[2];
            int horsepower = Integer.parseInt(vehiclesInput.split(" ")[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsepower);
            vehicleList.add(vehicle);

            vehiclesInput = scanner.nextLine();
        }

        String vehicleModels = scanner.nextLine();
        while (!vehicleModels.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicleModels.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }

            vehicleModels = scanner.nextLine();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHP(vehicleList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHP(vehicleList, "trucks"));
    }

    private static double getAverageHP(List<Vehicle> vehicleList, String type) {
        double sum = 0;
        int count = 0;
        if (type.equals("cars")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHorsepower();
                    count++;
                }
            }
        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHorsepower();
                    count++;
                }
            }
        }

        if (sum == 0) {
            return 0;
        }
        return sum / count;
    }
}
