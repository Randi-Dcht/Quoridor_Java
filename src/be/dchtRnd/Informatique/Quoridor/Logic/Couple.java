package be.dchtRnd.Informatique.Quoridor.Logic;

import java.util.Objects;

public class Couple
{
    public int x;
    public int y;

    public Couple(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString()
    {
        return "("+x+";"+y+")";
    }

    public boolean equals(Couple c)
    {
        return c.x == x && c.y == y;
    }
}
