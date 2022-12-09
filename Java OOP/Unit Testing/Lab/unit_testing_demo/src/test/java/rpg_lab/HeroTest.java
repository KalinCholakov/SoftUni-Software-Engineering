package rpg_lab;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class HeroTest {

    @Test
    public void testAttackWhenTargetDiesHeroGetExp() {

        int exp = 10;

        Target facade = Mockito.mock(Target.class);
        Mockito.when(facade.isDead()).thenReturn(true);
        Mockito.when(facade.giveExperience()).thenReturn(exp);

        Weapon weapon = Mockito.mock(Weapon.class);

        Hero hero = new Hero("Pesho", weapon);

        hero.attack(facade);

        Assert.assertEquals(exp, hero.getExperience());
    }

}