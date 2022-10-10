package definingClasses.exercises.ex03SpeedRacing;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Car> cars = new LinkedHashMap<>();

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            String[] data = scanner.nextLine().split("\\s+");
            String model = data[0];
            double fuelAmount = Double.parseDouble(data[1]);
            double fuelCons = Double.parseDouble(data[2]);

            Car car = new Car(model, fuelAmount, fuelCons);
            cars.put(model, car);
        }

        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] data = command.split("\\s+");
            String model = data[1];
            int distance = Integer.parseInt(data[2]);

            Car carToDrive = cars.get(model);

            carToDrive.drive(distance);

            command = scanner.nextLine();
        }

        cars.values().forEach(System.out::println);
    }
}
