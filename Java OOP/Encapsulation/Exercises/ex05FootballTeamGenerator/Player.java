package encapsulation.exercises.ex05FootballTeamGenerator;

public class Player {
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player(String name, int endurance, int sprint, int dribble, int passing, int shooting) {
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("A name should not be empty.");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setEndurance(int endurance) {
        ensureParameter(endurance, "Endurance");
        this.endurance = endurance;
    }

    private void setSprint(int sprint) {
        ensureParameter(sprint, "Sprint");
        this.sprint = sprint;
    }

    private void setDribble(int dribble) {
        ensureParameter(dribble, "Dribble");
        this.dribble = dribble;
    }

    private void setPassing(int passing) {
        ensureParameter(passing, "Passing");
        this.passing = passing;
    }

    private void setShooting(int shooting) {
        ensureParameter(shooting, "Shooting");
        this.shooting = shooting;
    }

    public double overallSkillLevel() {
        return (endurance + sprint + dribble + passing + shooting) / 5.0;
    }

    private void ensureParameter(int parameter, String prefixMessage) {
        if (parameter < 0 || parameter > 100) {
            throw new IllegalArgumentException(String.format
                    ("%s should be between 0 and 100.", prefixMessage));
        }
    }
}
