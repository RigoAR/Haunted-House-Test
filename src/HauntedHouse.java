public class HauntedHouse {
    private boolean ghostPresent;
    private int candyCount;
    private static final int defaultCandy = 10;

    public HauntedHouse()
    {
        ghostPresent = true;
        candyCount = 10;
    }

    public boolean isGhostPresent()
    {
        return ghostPresent;
    }

    public void scareAwayGhost()
    {
        ghostPresent = false;
    }

    /*public void refillCandyBowl(int amount) {
            candyCount += amount;
    } */

    /*public void trickOrTreat(int people){
        candyCount = candyCount - people;
    } */

    public void trickOrTreat(int people)
    {
        if (people <= 0) return;
        candyCount -= people;
        if (candyCount < 0) {
            candyCount = defaultCandy;
        }
    }

    public int getCandyCount()
    {
        return candyCount;
    }

    public String spookySound()
    {
        return "Boo!";
    }

    @Override
    public String toString()
    {
        String result = "The house ";

        if(isGhostPresent()) {
            result += "is haunted by a Ghost and ";
        }
        result += "has " + candyCount + " candy.";
        return result;
    }


    /*public void refillCandyBowl(int amount)
    {
        if (amount > 0) {
            candyCount += amount;
        }
        if(candyCount < 0)
        {
            candyCount = Integer.MAX_VALUE;
        }
    } */

    public void refillCandyBowl(int amount)
    {
        if (amount <= 0) {
            candyCount = defaultCandy;
            return;
        }
        if (amount == Integer.MAX_VALUE) {
            candyCount = Integer.MAX_VALUE;
            return;
        }
        if (candyCount > Integer.MAX_VALUE - amount) {
            candyCount = Integer.MAX_VALUE;
        } else {
            candyCount += amount;
        }
    }

    public void bringBackGhost()
    {
        ghostPresent = true;
    }


}

