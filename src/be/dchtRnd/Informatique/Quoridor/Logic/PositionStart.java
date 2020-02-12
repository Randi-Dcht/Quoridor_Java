package be.dchtRnd.Informatique.Quoridor.Logic;

public enum PositionStart
{
    North("North",'y',0),
    South("South",'y',9),
    East("East",'x',9),
    West("West",'x',0);

    final String name;
    final char coord;
    final int win;

    private PositionStart(String name, char coord, int win)
    {
        this.name  = name;
        this.coord = coord;
        this.win   = win;
    }

    public char getAxe()
    {
        return coord;
    }

    public int getWin()
    {
        return win;
    }

}
