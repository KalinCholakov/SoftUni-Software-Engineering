package workingWithAbstraction.exercises.ex04TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] colors = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(scanner.nextLine());

        List<TrafficLight> trafficLightList = new ArrayList<>();

        for (String color : colors) {
            TrafficLight trafficLight = new TrafficLight(Color.valueOf(color));
            trafficLightList.add(trafficLight);
        }

//        List<TrafficLight> trafficLightList = Arrays.stream(colors)
//                .map(Color::valueOf)
//                .map(TrafficLight::new)
//                .collect(Collectors.toList());

        while (n-- > 0) {
            for (TrafficLight trafficLight : trafficLightList) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }

            System.out.println();
        }
    }
}
