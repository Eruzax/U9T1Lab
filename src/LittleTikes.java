public class LittleTikes extends Vehicle
{
    private int eyes;
    private int doors;
    public LittleTikes(String name, int wheels, int eyes, int doors)
    {
        super(name, wheels);
        this.eyes = eyes;
        this.doors = doors;
    }

    public int getDoors()
    {
        return doors;
    }

    public int getEyes()
    {
        return eyes;
    }
    public void closeDoors()
    {
        System.out.println("Doors are closed.");
    }

    public void openDoors()
    {
        System.out.println("Doors are open.");
    }

    public void squeak()
    {
        System.out.println("Squeak Squeak!");
    }

    public void spin()
    {
        System.out.println("Whur!");
    }
}
