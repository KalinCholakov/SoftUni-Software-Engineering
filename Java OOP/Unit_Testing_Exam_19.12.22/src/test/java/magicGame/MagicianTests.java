package magicGame;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class MagicianTests {

    private Magician magician;
    private List<Magic> magics;

    @Before
    public void Setup() {
        magician = new Magician("BestWizard", 50);
        magics = new ArrayList<>();
    }

    @Test(expected = NullPointerException.class)
    public void test_setUsernameWithNull() {
        magician = new Magician(null, 50);
    }

    @Test(expected = NullPointerException.class)
    public void test_setUsernameWithEmptyName() {
        magician = new Magician("  ", 50);
    }

    @Test
    public void test_setUsernameSuccess() {
        Assert.assertEquals("BestWizard", magician.getUsername());
    }

    @Test
    public void test_getHealthSuccess() {
        Assert.assertEquals(50, magician.getHealth());
    }

    @Test(expected = IllegalArgumentException.class)
    public void test_setHealthThrows() {
        magician = new Magician("Wizard", -5);
    }

    @Test
    public void test_setHealthSuccess() {
        magician = new Magician("Wizard", 10);
    }

    @Test
    public void test_getMagicsSuccess() {
        Magic magic1 = new Magic("magic1", 25);
        Magic magic2 = new Magic("magic2", 50);

        magician.addMagic(magic1);
        magician.addMagic(magic2);
        magics.add(magic1);
        magics.add(magic2);

        List<Magic> actual = magician.getMagics();
        List<Magic> expected = magics;

        Assert.assertEquals(expected, actual);
    }

    @Test(expected = IllegalStateException.class)
    public void test_takeDamageThrows() {
        magician = new Magician("Wizard", 0);
        magician.takeDamage(10);
    }

    @Test
    public void test_takeDamageWhenHealthMinusDamageIsNegative() {
        magician = new Magician("Wizard", 5);
        magician.takeDamage(10);
        Assert.assertEquals(0, magician.getHealth());
    }

    @Test
    public void test_takeDamageSuccess() {
        magician = new Magician("Wizard", 15);
        magician.takeDamage(10);
        Assert.assertEquals(5, magician.getHealth());
    }

    @Test(expected = NullPointerException.class)
    public void test_addMagicThrows() {
        Magic magic = null;
        magician.addMagic(magic);
    }

    @Test
    public void test_removeMagicSuccess() {
        Magic magic1 = new Magic("magic1", 10);
        Magic magic2 = new Magic("magic2", 20);
        magician.addMagic(magic1);
        magician.addMagic(magic2);
        Assert.assertEquals(2, magician.getMagics().size());
        magician.removeMagic(magic1);
        Assert.assertEquals(1, magician.getMagics().size());
    }

    @Test
    public void test_getMagicSuccess() {
        Magic magic1 = new Magic("magic1", 10);
        Magic magic2 = new Magic("magic2", 20);
        magician.addMagic(magic1);
        magician.addMagic(magic2);
        Assert.assertEquals(magic1, magician.getMagic("magic1"));
    }
}
