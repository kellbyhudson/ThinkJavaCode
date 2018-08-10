import java.util.Random;

public class BallPlayer
{
    private int position;
    private String name;
    private int fouls;
    private int possessions;
    private int turnovers;


    public BallPlayer(String name)
    {
        this.position = 1;
        this.name = name;
        this.fouls = 0;
        this.possessions = 0;
    }

    public int getPosition()
    {
        return position;
    }

    public String getName()
    {
        return name;
    }

    public int getTurnovers()
    {
        return turnovers;
    }

    public boolean scoring(PairOfDice dice)
    {
        boolean foulOccur = false;
        int score = 0;
        switch (dice.getDieTotalValue())
        {
            case 2:
                score = 3;
                this.possessions++;
                break;
            case 3:
                this.turnovers++;
                this.possessions++;
                break;
            case 4:
                score = 2;
                this.possessions++;
                break;
            case 5:
                score = 1;
                foulOccur = true;
                break;
            case 6:
                score = 2;
                this.possessions++;
                break;
            case 7:
                this.turnovers++;
                this.possessions++;
                break;
            case 8:
                score = 2;
                foulOccur = true;
                break;
            case 9:
                break;
            case 10:
                score = 2;
                this.possessions++;
                foulOccur = true;
                break;
            case 11:
                this.turnovers++;
                this.fouls++;
                this.possessions++;
                foulOccur = true;
                break;
            case 12:
                score = 3;
                this.possessions++;
                break;
        }
        this.position += score;

        return foulOccur;
    }

    public int getPossessions()
    {
        return possessions;
    }

    public String getShot(PairOfDice dice)
    {
        String shot = "";

        switch (dice.getDieTotalValue())
        {
            case 2:
            case 12:
                shot = "#3Ball from Downtown";
                break;

            case 4:
            case 6:
                shot = "#BOOMSHAKALAKA! #SlamDunk";
                break;

            case 3:
                shot = "#TravelerTurnover";
                break;

            case 5:
                shot = "#FoulAtTheRim #1and1";
                break;

            case 7:
                shot = "#Turnover #CrabDribble";
                break;

            case 8:
                shot = "#TechnicalFoul4Coach #Easy2";
                break;

            case 9:
                shot = "#Clang #GetOnTheFloor";
                break;

            case 10:
                shot = "#AndOne #JellyFam";
                break;

            case 11:
                shot = "#Charge #Take1ForTheTeam";
                break;
        }

        return shot;

    }

    public int assignFoul()
    {
        return fouls++;
    }

    public int getFouls()
    {
        return fouls;
    }


}

