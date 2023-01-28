package core;

import models.Doodle;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import static org.junit.Assert.*;

public class DoodleSearchTests {
    private interface InternalTest {
        void execute();
    }

    private DoodleSearch doodleSearch;

    private Doodle getRandomDoodle() {
        return new Doodle(
                UUID.randomUUID().toString(),
                UUID.randomUUID().toString(),
                (int) Math.min(1, Math.random() * 2_000),
                ((int) Math.min(1, Math.random() * 2_000_000_000) % 2 == 1),
                Math.min(1, Math.random() * 1000));
    }

    @Before
    public void setup() {
        this.doodleSearch = new DoodleSearchImpl();
    }

    public void performCorrectnessTesting(InternalTest[] methods) {
        Arrays.stream(methods)
                .forEach(method -> {
                    this.doodleSearch = new DoodleSearchImpl();

                    try {
                        method.execute();
                    } catch (IllegalArgumentException ignored) {
                    }
                });

        this.doodleSearch = new DoodleSearchImpl();
    }

    // Correctness Tests

    @Test
    public void testAddDoodle_WithCorrectData_ShouldSuccessfullyAddDoodle() {
        this.doodleSearch.addDoodle(this.getRandomDoodle());
        this.doodleSearch.addDoodle(this.getRandomDoodle());

        assertEquals(2, this.doodleSearch.size());
    }

    @Test
    public void testContains_WithExistentDoodle_ShouldReturnTrue() {
        Doodle randomDoodle = this.getRandomDoodle();

        this.doodleSearch.addDoodle(randomDoodle);

        assertTrue(this.doodleSearch.contains(randomDoodle));
    }

    @Test
    public void testContains_WithNonexistentDoodle_ShouldReturnFalse() {
        Doodle randomDoodle = this.getRandomDoodle();

        this.doodleSearch.addDoodle(randomDoodle);

        assertFalse(this.doodleSearch.contains(this.getRandomDoodle()));
    }

    @Test
    public void testCount_With5Doodles_ShouldReturn5() {
        this.doodleSearch.addDoodle(this.getRandomDoodle());
        this.doodleSearch.addDoodle(this.getRandomDoodle());
        this.doodleSearch.addDoodle(this.getRandomDoodle());
        this.doodleSearch.addDoodle(this.getRandomDoodle());
        this.doodleSearch.addDoodle(this.getRandomDoodle());

        assertEquals(5, this.doodleSearch.size());
    }

    @Test
    public void testCount_WithEmpty_ShouldReturnZero() {
        assertEquals(0, this.doodleSearch.size());
    }

    @Test
    public void testSearchDoodles_WithCorrectDoodles_ShouldReturnCorrectlyOrderedData() {
        Doodle Doodle = new Doodle("asd", "bbbsd", 4000, true, 5.5);
        Doodle Doodle2 = new Doodle("nsd", "eesd", 4000, false, 5.6);
        Doodle Doodle3 = new Doodle("dsd", "ddsd", 5000, false, 5.7);
        Doodle Doodle4 = new Doodle("hsd", "zsd", 4000, true, 4.8);
        Doodle Doodle5 = new Doodle("qsd", "qsd", 4001, true, 4.8);
        Doodle Doodle6 = new Doodle("zsd", "ds", 5000, false, 5.7);

        this.doodleSearch.addDoodle(Doodle);
        this.doodleSearch.addDoodle(Doodle2);
        this.doodleSearch.addDoodle(Doodle3);
        this.doodleSearch.addDoodle(Doodle4);
        this.doodleSearch.addDoodle(Doodle5);
        this.doodleSearch.addDoodle(Doodle6);

        List<Doodle> Doodles = StreamSupport.stream(this.doodleSearch.searchDoodles("sd").spliterator(), false)
                .collect(Collectors.toList());

        assertEquals(5, Doodles.size());
        assertEquals(Doodle5, Doodles.get(0));
        assertEquals(Doodle4, Doodles.get(1));
        assertEquals(Doodle, Doodles.get(2));
        assertEquals(Doodle3, Doodles.get(3));
        assertEquals(Doodle2, Doodles.get(4));
    }
}
