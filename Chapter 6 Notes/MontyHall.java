public class MontyHall
{
    /*
     * Using Math.random
     *      if the value is 0 it is the door with a car
     *      if the values are 1 or 2, they are the doors with goats
     */
    private int door;
    public void noSwitch()
    {
        int car = 0;
        int goat = 0;
        for(int i=1; i<=1000; i++)
        {
            door = (int) (3*Math.random());
            if(door == 0)
            {
                car++;
            }
            else
            {
                goat++;
            }
        }
        System.out.println("You got " + car + "cars and " + goat + "goats by not switching!");

    }

    public void Switch()
    {
        int car = 0;
        int goat = 0;
        for(int i=1; i<=1000; i++)
        {
            door = (int) (3*Math.random());
            if(door == 0)
            {
                goat++;
            }
            else
            {
                car++;
            }
        }
        System.out.println("You got " + car + "cars and " + goat + "goats by switching!");

    }
}