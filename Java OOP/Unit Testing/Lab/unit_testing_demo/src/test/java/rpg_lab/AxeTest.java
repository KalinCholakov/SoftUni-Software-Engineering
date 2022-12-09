package rpg_lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AxeTest {
    private final static int ATTACK = 10;
    private final static int DURABILITY = 10;
    private final static int HEALTH = 100;
    private final static int EXPERIENCE = 10;
    private Axe axe;
    private Axe brokenAxe;
    private Dummy dummy;

    @Before
    public void setUp() {
        this.axe = new Axe(ATTACK, DURABILITY);
        this.brokenAxe = new Axe(ATTACK, 0);
        this.dummy = new Dummy(HEALTH, EXPERIENCE);
    }

    @Test
    public void testAttackAxeReduceDurability() {
        axe.attack(dummy);
        int expected = DURABILITY - 1;
        Assert.assertEquals(expected, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void testAttackThrowsWhenAxeIsBroken() {
        brokenAxe.attack(dummy);

    }
}
