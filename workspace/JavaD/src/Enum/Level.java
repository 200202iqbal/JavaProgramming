enum LevelEnum
{
    LOW,
    MEDIUM,
    HIGH
}

public class Level
{
    public static void main (String[] args)
    {
        LevelEnum myLevel = LevelEnum.HIGH;

        switch(myLevel)
        {
            case LOW :
            System.out.println("Low Level");
            break;
            case MEDIUM :
            System.out.println("Medium Level");
            break;
            case HIGH :
            System.out.println("High level");
            break;
        }
    }
}