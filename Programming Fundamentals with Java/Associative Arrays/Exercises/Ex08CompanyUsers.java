package associativeArrays;

import java.util.*;

public class Ex08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> companyUsers = new HashMap<>();

        String input = scanner.nextLine();

        while (!input.equals("End")) {
            String companyName = input.split(" -> ")[0];
            String employeeId = input.split(" -> ")[1];

            if (companyUsers.containsKey(companyName)) {
                List<String> employees = companyUsers.get(companyName);
                if (!employees.contains(employeeId)) {
                    employees.add(employeeId);
                }
            } else {
                List<String> employees = new ArrayList<>();
                employees.add(employeeId);
                companyUsers.put(companyName, employees);
            }

            input = scanner.nextLine();
        }

        companyUsers.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(company -> {
                    System.out.println(company.getKey());
                    company.getValue().forEach(employee -> System.out.println("--" + employee));
                });
    }
}
