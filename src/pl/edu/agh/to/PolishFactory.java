package pl.edu.agh.to;

public class PolishFactory extends Factory
{
    public String getName()
    {
        return "polska";
    }

    public String getBreakfastDescription()
    {
        return "śniadanie";
    }

    public String getLunchDescription()
    {
        return "obiad";
    }

    public String getSupperDescription()
    {
        return "kolacja";
    }

    public void addBreakfastBeverage()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public void addBreakfastDish()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public void addLunchSoup()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public void addLunchMainDish()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public void addLunchDessert()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public void addSupperStarter()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public void addSupperBeverage()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }

    public void addSupperMainDish()
    {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
    }
}
