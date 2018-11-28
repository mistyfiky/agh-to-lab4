package pl.edu.agh.to;

public class AmericanFactory extends Factory
{
    public String getName()
    {
        return "american";
    }

    public String getBreakfastDescription()
    {
        return "breakfast";
    }

    public String getLunchDescription()
    {
        return "lunch";
    }

    public String getSupperDescription()
    {
        return "supper";
    }

    public void addBreakfastBeverage()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
    }

    public void addBreakfastDish()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
    }

    public void addLunchSoup()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
    }

    public void addLunchMainDish()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
    }

    public void addLunchDessert()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
    }

    public void addSupperStarter()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
    }

    public void addSupperBeverage()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
    }

    public void addSupperMainDish()
    {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {}
    }
}
