package pl.edu.agh.to;

public class AsianFactory extends Factory
{
    public String getName()
    {
        return "亚洲";
    }

    public String getBreakfastDescription()
    {
        return "早餐";
    }

    public String getLunchDescription()
    {
        return "午餐";
    }

    public String getSupperDescription()
    {
        return "晚餐";
    }

    public void addBreakfastBeverage()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }

    public void addBreakfastDish()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }

    public void addLunchSoup()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }

    public void addLunchMainDish()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }

    public void addLunchDessert()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }

    public void addSupperStarter()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }

    public void addSupperBeverage()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }

    public void addSupperMainDish()
    {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {}
    }
}
