package interfacesAndAbstraction.exercises.ex06MilitaryElite.models;

import interfacesAndAbstraction.exercises.ex06MilitaryElite.enums.MissionState;
import interfacesAndAbstraction.exercises.ex06MilitaryElite.interfaces.Mission;

public class MissionImpl implements Mission {
    private String codeName;
    private MissionState missionState;

    public MissionImpl(String codeName, MissionState missionState) {
        this.codeName = codeName;
        this.missionState = missionState;
    }

    @Override
    public String getCodeName() {
        return codeName;
    }

    @Override
    public MissionState getState() {
        return missionState;
    }

    @Override
    public void completeMission() {
        missionState = MissionState.finished;
    }

    @Override
    public String toString() {
        return String.format( "Code Name: %s State: %s",
                this.getCodeName(),
                this.getState() );
    }
}
