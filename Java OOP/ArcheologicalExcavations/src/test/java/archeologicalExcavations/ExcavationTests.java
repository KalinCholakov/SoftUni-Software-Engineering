package archeologicalExcavations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ExcavationTests {
    private Archaeologist pesho;
    private Archaeologist toshko;
    private Excavation excavation;

    @Before
    public void setup() {
        pesho = new Archaeologist("Pesho", 10);
        toshko = new Archaeologist("Toshko", 10);
        excavation = new Excavation("Petrich", 10);
    }

    @Test
    public void testCreateExcavation() {
        Excavation excavation = new Excavation("Pernik", 10);
        Assert.assertEquals("Pernik", excavation.getName());
        Assert.assertEquals(10, excavation.getCapacity());
        Assert.assertEquals(0, excavation.getCount());
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorShouldThrowWithNullName() {
        new Excavation(null, 10);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorShouldThrowWithEmptyName() {
        new Excavation("    ", 10);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConstructorShouldThrowWithNegativeCapacity() {
        new Excavation("Pernik", -5);
    }

    @Test
    public void testAddArcheologistShouldAdd() {
        Excavation excavation = new Excavation("Pernik", 10);
        excavation.addArchaeologist(pesho);
        Assert.assertEquals(1, excavation.getCount());
        excavation.addArchaeologist(toshko);
        Assert.assertEquals(2, excavation.getCount());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddArcheologistShouldThrowIfNoCapacity() {
        Excavation excavation = new Excavation("Pernik", 0);
        excavation.addArchaeologist(pesho);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testAddArcheologistShouldThrowIfArcheologistExists() {
        excavation.addArchaeologist(pesho);
        excavation.addArchaeologist(pesho);
    }

    @Test
    public void testRemoveArcheologistShouldRemove() {
        excavation.addArchaeologist(pesho);
        excavation.addArchaeologist(toshko);
        Assert.assertEquals(true, excavation.removeArchaeologist(pesho.getName()));
        Assert.assertEquals(1, excavation.getCount());
    }

    @Test
    public void testRemoveArcheologistShouldNotRemove() {
        excavation.addArchaeologist(pesho);
        excavation.addArchaeologist(toshko);
        Assert.assertEquals(false, excavation.removeArchaeologist("MissingName"));
        Assert.assertEquals(2, excavation.getCount());
    }
}
