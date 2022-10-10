package definingClasses.exercises.ex04RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Car> cars = new ArrayList<>();
        List<Tyre> tyres;

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {

            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];
            int engineSpeed = Integer.parseInt(data[1]);
            int enginePower = Integer.parseInt(data[2]);
            int cargoWeight = Integer.parseInt(data[3]);
            String cargoType = data[4];
            double tyre1Pressure = Double.parseDouble(data[5]);
            int tyre1Age = Integer.parseInt(data[6]);
            double tyre2Pressure = Double.parseDouble(data[7]);
            int tyre2Age = Integer.parseInt(data[8]);
            double tyre3Pressure = Double.parseDouble(data[9]);
            int tyre3Age = Integer.parseInt(data[10]);
            double tyre4Pressure = Double.parseDouble(data[11]);
            int tyre4Age = Integer.parseInt(data[12]);

            Engine engine = new Engine(engineSpeed, enginePower);
            Cargo cargo = new Cargo(cargoWeight, cargoType);
            Tyre tyre1 = new Tyre(tyre1Pressure, tyre1Age);
            Tyre tyre2 = new Tyre(tyre2Pressure, tyre2Age);
            Tyre tyre3 = new Tyre(tyre3Pressure, tyre3Age);
            Tyre tyre4 = new Tyre(tyre4Pressure, tyre4Age);

            tyres = List.of(tyre1, tyre2, tyre3, tyre4);

            Car car = new Car(model, engine, cargo, tyres);
            cars.add(car);
        }

        String command = scanner.nextLine();

        if (command.equals("fragile")) {
            cars.stream().filter(car -> car.getCargo().getCargoType().equals("fragile"))
                    .filter(car -> car.getTyres().stream().anyMatch(tire -> tire.getTyrePressure() < 1))
                    .forEach(car -> System.out.println(car.getModel()));

        } else if (command.equals("flamable")) {
            cars.stream().filter(car -> car.getCargo().getCargoType().equals("flamable"))
                    .filter(car -> car.getEngine().getEnginePower() > 250)
                    .forEach(car -> System.out.println(car.getModel()));
        }
    }
}
