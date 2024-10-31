import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;


public class HauntedTest {

    static HauntedHouse house;

    @BeforeAll
    public static void setup()
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
}
