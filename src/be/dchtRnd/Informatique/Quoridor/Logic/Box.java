package be.dchtRnd.Informatique.Quoridor.Logic;

import java.util.HashMap;

public class Box
{
    /*position of the box in the board*/
    final int x;
    final int y;
    /*the pawn on this box*/
    private Pawn pawn = null;
    /*pawn in this box ?*/
    private boolean present = false;
    /*list of side*/
    private HashMap<Side,Boolean> list = new HashMap<>();

    public Box(int x, int y)
    {
        this.x = x;
        this.y = y;
        /*create a list with boolean and Side*/
        list.put(Side.up,false);
        list.put(Side.down,false);
        list.put(Side.right,false);
        list.put(Side.left,false);
    }

    public void arrived(Pawn pawn)
    {
        this.present = true;
        this.pawn = pawn;
    }

    public void addWall(Side where)
    {
        list.replace(where,true);
    }

    public void removeWall(Side where)
    {
        list.replace(where,false);
    }

    public void quit()
    {
        this.pawn = null;
        this.present = false;
    }

    public boolean getPresent()
    {
        return present;
    }

    public Pawn getPawn()
    {
        return pawn;
    }
}
