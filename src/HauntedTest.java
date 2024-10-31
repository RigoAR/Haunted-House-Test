import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Assertions;


public class HauntedTest {

    HauntedHouse house;

    public void setup()
    {
        house = new HauntedHouse();
    }

    public void ghostPresenceTest()
    {
        Assertions.assertEquals(true, house.isGhostPresent() );

    }
}
