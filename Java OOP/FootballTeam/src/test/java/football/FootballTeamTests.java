package football;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FootballTeamTests {
    private final static int VACANT_POSITIONS =12;
    public static final String PLAYER_NAME = "Pesho";
    public static final String TEAM_NAME = "Pesho's Team";

    private Footballer footballer;
    private FootballTeam footballTeam;

    @Before
    public void setup() {
        this.footballer = new Footballer(PLAYER_NAME);
        this.footballTeam = new FootballTeam(TEAM_NAME, VACANT_POSITIONS);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreateTeamWithNoPosition() {
        new FootballTeam(TEAM_NAME, -1);
    }

    @Test
    public void testCreateTeamWithActualPosition() {
        Assert.assertEquals(VACANT_POSITIONS, footballTeam.getVacantPositions());
    }

    @Test(expected = NullPointerException.class)
    public void testCreateTeamWithNullNameShouldFail() {
        new FootballTeam(null, 1);
    }

    @Test(expected = NullPointerException.class)
    public void testCreateTeamWithEmptyNameShouldFail() {
        new FootballTeam("   ", 1);
    }

    @Test
    public void testCreateTeamWithNameShouldWorkAsExpected() {
        Assert.assertEquals(TEAM_NAME, footballTeam.getName());
    }

    @Test
    public void testAddPlayerShouldIncreaseTeamMemberCount() {
        footballTeam.addFootballer(footballer);
        Assert.assertEquals(1, footballTeam.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddPlayerShouldFailWhenTeamIsFull() {
        FootballTeam team = new FootballTeam(TEAM_NAME, 0);
        team.addFootballer(footballer);
    }

    @Test
    public void testRemoveFootballerShouldReduceTeamCount() {
        footballTeam.addFootballer(footballer);

        Assert.assertEquals(1, footballTeam.getCount());

        footballTeam.removeFootballer(footballer.getName());

        Assert.assertEquals(0, footballTeam.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testRemoveFootballerShouldFailWhenNoSuchPlayer() {
        footballTeam.addFootballer(footballer);
        footballTeam.removeFootballer("not_added");
    }

    @Test
    public void testFootballerForSaleShouldDeactivatePlayer() {
        footballTeam.addFootballer(footballer);

        footballTeam.footballerForSale(footballer.getName());

        Assert.assertFalse(footballer.isActive());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFootballerForSaleShouldFailIfPlayerMissing() {
        footballTeam.addFootballer(footballer);
        footballTeam.footballerForSale("not_added");
    }
}
