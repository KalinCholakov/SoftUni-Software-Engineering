package definingClasses.exercises.ex05CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Engine> engines = new ArrayList<>();

        int numberOfEngines = Integer.parseInt(scanner.nextLine());

        while (numberOfEngines-- > 0) {
            //{Model} {Power} {Displacement} {Efficiency}
            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];
            int power = Integer.parseInt(data[1]);

            Engine engine = null;

            switch (data.length) {
                case 4:
                    String displacement = data[2];
                    String efficiency = data[3];
                    engine = new Engine(model, power, displacement, efficiency);
                    engines.add(engine);
                    break;
                case 2:
                    engine = new Engine(model, power);
                    engines.add(engine);
                    break;
                case 3:
                    String info = data[2];
                    if(Character.isDigit(info.charAt(0))) {
                        displacement = info;
                        engine = new Engine(model, power, displacement, "n/a");
                        engines.add(engine);
                    } else {
                        efficiency = info;
                        engine = new Engine(model, power, "n/a", efficiency);
                        engines.add(engine);
                    }
                    break;
            }
        }

        List<Car> cars = new ArrayList<>();

        int numberOfCars = Integer.parseInt(scanner.nextLine());

        while (numberOfCars-- > 0) {
            //{Model} {Engine} {Weight} {Color}
            String[] data = scanner.nextLine().split("\\s+");

            String model = data[0];
            String engineName = data[1];

            Car car = null;
            Engine engine = engines.stream().filter(engine1 -> engine1.getModel().equals(engineName))
                    .findFirst().get();

            switch (data.length) {
                case 4:
                    String weight = data[2];
                    String color = data[3];
                    car = new Car(model, engine, weight, color);
                    cars.add(car);
                    break;
                case 2:
                    car = new Car(model, engine);
                    cars.add(car);
                    break;
                case 3:
                    String info = data[2];
                    if (Character.isDigit(info.charAt(0))) {
                        weight = info;
                        car = new Car(model, engine, weight, "n/a");
                        cars.add(car);
                    } else {
                        color = info;
                        car = new Car(model, engine, "n/a", color);
                        cars.add(car);
                    }
                    break;
            }
        }

        cars.forEach(System.out::println);
    }
}
