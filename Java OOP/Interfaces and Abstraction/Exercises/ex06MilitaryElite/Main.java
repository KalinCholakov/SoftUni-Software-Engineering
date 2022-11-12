package interfacesAndAbstraction.exercises.ex06MilitaryElite;

import interfacesAndAbstraction.exercises.ex06MilitaryElite.enums.Corps;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.enums.MissionState;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.*;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.models.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in );

        LinkedHashMap<Integer, Private> privateSoldiers = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"End".equals( input )) {
            String[] tokens = input.split( "\\s+" );
            String type = tokens[0];
            int id = Integer.parseInt( tokens[1] );
            String firstName = tokens[2];
            String lastName = tokens[3];

            switch (type) {
                case "Private":
                    double salary = Double.parseDouble( tokens[4] );
                    Private privateSoldier = new PrivateImpl( id, firstName, lastName, salary );
                    privateSoldiers.put( id, privateSoldier );

                    System.out.println( privateSoldier );
                    break;
                case "LieutenantGeneral":
                    Set<Private> lieutenantPrivates = new HashSet<>();
                    salary = Double.parseDouble( tokens[4] );

                    for (int i = 5; i < tokens.length; i++) {
                        int privateId = Integer.parseInt( tokens[i] );
                        if (privateSoldiers.containsKey( privateId )) {
                            lieutenantPrivates.add( privateSoldiers.get( privateId ) );
                        }
                    }

                    LieutenantGeneral lieutenantGeneral = new LieutenantGeneralImpl(
                            id, firstName, lastName, salary, lieutenantPrivates );

                    System.out.println( lieutenantGeneral );
                    break;
                case "Engineer":
                    salary = Double.parseDouble( tokens[4] );
                    String corps = tokens[5];

                    if (Corps.isValidCorp( corps )) {
                        continue;
                    }

                    Set<Repair> repairSet = new LinkedHashSet<>();

                    for (int i = 6; i < tokens.length; i += 2) {
                        Repair repair = new RepairImpl( tokens[i], Integer.parseInt( tokens[i + 1] ) );
                        repairSet.add( repair );
                    }

                    Engineer engineer = new EngineerImpl(
                            id, firstName, lastName, salary, Corps.valueOf( corps ), repairSet );

                    System.out.println( engineer );
                    break;
                case "Commando":
                    salary = Double.parseDouble( tokens[4] );
                    corps = tokens[5];

                    if (Corps.isValidCorp( corps )) {
                        continue;
                    }

                    Set<Mission> missionSet = new LinkedHashSet<>();

                    for (int i = 6; i < tokens.length; i += 2) {
                        String missionCodeName = tokens[i];
                        String missionState = tokens[i + 1];

                        if (Arrays.stream( MissionState.values() ).filter( m -> m.name().equals( missionState ) ).findFirst().orElse( null ) != null) {
                            missionSet.add( new MissionImpl( missionCodeName, MissionState.valueOf( missionState ) ) );
                        }
                    }

                    Commando commando = new CommandoImpl(
                            id, firstName, lastName, salary, Corps.valueOf( corps ), missionSet );

                    System.out.println( commando );
                    break;
                case "Spy":
                    String codeNumber = tokens[4];

                    Spy spy = new SpyImpl( id, firstName, lastName, codeNumber );

                    System.out.println( spy );
                    break;
            }

            input = scanner.nextLine();
        }
    }
}
