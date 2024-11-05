public class HauntedHouse {
    private boolean ghostPresent;
    private int candyCount;

    public HauntedHouse() {
        ghostPresent = true;
        candyCount = 10;
    }

    public boolean isGhostPresent() {
        return ghostPresent;
    }

    public void scareAwayGhost() {
        ghostPresent = false;
    }

    public void refillCandyBowl(int amount) {
            candyCount += amount;
    }

    public void trickOrTreat(int people){
        candyCount = candyCount - people;
    }

    public int getCandyCount() {
        return candyCount;
    }

    public String spookySound() {
        return "Boo!";
    }

    @Override
    public String toString() {
        String result = "The house ";

        if(isGhostPresent()) {
            result += "is haunted by a Ghost and ";
        }
        result += "has " + candyCount + " candy.";
        return result;
    }

    public int candyZero()
    {
        candyCount = 0;
    }
}

