package interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces;

import interfacesAndAbstraction.exercises.ex06MilitaryElite.enums.MissionState;

public interface Mission {

    String getCodeName();

    MissionState getState();

    void completeMission();
}
