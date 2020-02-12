package be.dchtRnd.Informatique.Quoridor.Logic;

import java.io.Serializable;

public class HumanPlayer implements Player, Serializable
{
    private String name;
    private PositionStart start;
    private ColorPlayer myColor;

    public HumanPlayer(String name,PositionStart start,ColorPlayer color)
    {
        this.name = name;
        this.start = start;
        myColor = color;
    }

    @Override
    public Type getType()
    {
        return Type.Human;
    }

    public String getName()
    {
        return name;
    }

    public PositionStart getStart()
    {
        return start;
    }

    public ColorPlayer getMyColor()
    {
        return myColor;
    }
}
