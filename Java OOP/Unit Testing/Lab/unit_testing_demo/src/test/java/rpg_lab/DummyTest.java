package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DummyTest {
    private final static int HEALTH = 100;
    private final static int EXPERIENCE = 10;
    private final static int ATTACK_POINTS = 10;

    private Dummy dummy;
    private Dummy deadDummy;


    @Before
    public void setUp() {
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
        this.deadDummy = new Dummy(0, EXPERIENCE);
    }

    @Test
    public void testTakeAttackShouldReduceHealth() {
        dummy.takeAttack(ATTACK_POINTS);
        Assert.assertEquals(HEALTH - ATTACK_POINTS, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void testDummyTakeAttackedThrowsWhenDummyIsDead() {
        deadDummy.takeAttack(ATTACK_POINTS);
    }

    @Test
    public void testGiveExpWhenDummyIsDeadShouldReturnCorrectExp() {
        int actual = deadDummy.giveExperience();
        Assert.assertEquals(EXPERIENCE, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void testGiveExpThrowWhenDummyIsAlive() {
        dummy.giveExperience();
    }

}