import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;


public class HauntedTest {

    static HauntedHouse house;

    @BeforeEach
    public void setup()
    {
        house = new HauntedHouse();
    }

    @Test
    public void ghostPresenceTest()
    {
        Assertions.assertEquals(true, house.isGhostPresent() );

    }

    @Test
    public void scareGhostTest()
    {
        house.scareAwayGhost();
        Assertions.assertEquals(false, house.isGhostPresent() );

    }

    @Test
    public void scarySoundsTest()
    {
        Assertions.assertEquals("Boo!", house.spookySound());

    }



    @Test
    public void CandyRefillLargeTest()
    {
        house.refillCandyBowl(100);
        Assertions.assertEquals(110, house.getCandyCount());

    }

    @Test
    public void CandyRefillInfiniteTest()
    {
        house.refillCandyBowl(Integer.MAX_VALUE);
        Assertions.assertEquals(Integer.MAX_VALUE , house.getCandyCount());

    }

    @Test
    public void CandyRefillNoCandyHouseTest()
    {
        house.refillCandyBowl(0);
        Assertions.assertEquals(10 , house.getCandyCount());

    }

    @Test
    public void CandyRefillNegativeHouseTest()
    {
        house.refillCandyBowl(-50);
        Assertions.assertEquals(10 , house.getCandyCount());
        house.refillCandyBowl(-1);
        Assertions.assertEquals(10 , house.getCandyCount());
        house.refillCandyBowl(-24);
        Assertions.assertEquals(10 , house.getCandyCount());
        house.refillCandyBowl(Integer.MIN_VALUE);
        Assertions.assertEquals(10 , house.getCandyCount());

    }

    @Test
    public void trickOrTreatDecreaseTest() {
        house.trickOrTreat(3);
        Assertions.assertEquals(7, house.getCandyCount());
    }

    @Test
    public void trickOrTreatTooManyPeopleTest()
    {
        house.trickOrTreat(15);
        Assertions.assertTrue(house.getCandyCount() >= 0);
    }

    @Test
    public void runningLowTest()
    {
        house.trickOrTreat(10);
        Assertions.assertEquals(0, house.getCandyCount());
        house.refillCandyBowl(0);
        Assertions.assertEquals(10, house.getCandyCount());
    }

    @Test
    public void bringBackGhostTest() {
        house.scareAwayGhost();
        Assertions.assertFalse(house.isGhostPresent());
        house.bringBackGhost();
        Assertions.assertTrue(house.isGhostPresent());
    }


}
