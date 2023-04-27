package unit11;
public class DiceGame 
{
    public int pOne = 0;
    public int pTwo = 0;

    public int diceRoller() 
    {
        return (int)(Math.random() * 6 + 1);
    }

    public void highRoll()
    {
        int tempRollUno = (diceRoller() + diceRoller() + diceRoller());

        int tempRollDos = (diceRoller() + diceRoller() + diceRoller());

        if (tempRollUno > tempRollDos) 
        {
            pOne += tempRollUno;
        }
        else if (tempRollDos > tempRollUno)
        {
            pTwo += tempRollDos;
        }
        else if (tempRollUno == tempRollDos)
        {
            pOne += tempRollUno;
            pTwo += tempRollUno;
        }
        else 
        {
            pOne += 0;
        }


    }

    public static void main(String[] args)
    {
        DiceGame highRoller = new DiceGame();
        while(highRoller.pOne < 50 && highRoller.pTwo < 50)
        {
            highRoller.highRoll();
        }
        if (highRoller.pOne > highRoller.pTwo)
        {
            System.out.println("Player One has Won");
        }
        else
        {
            System.out.println("Player Two has Won");
        }
    }
  
}
