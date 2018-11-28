package pl.edu.agh.to;

import java.util.ArrayList;
import java.util.List;

abstract public class Factory implements Observable, Runnable
{
    private List<Observer> observers;

    public Factory()
    {
        this.observers = new ArrayList<>();
    }

    abstract public String getName();

    abstract public String getBreakfastDescription();

    abstract public String getLunchDescription();

    abstract public String getSupperDescription();

    abstract public void addBreakfastBeverage();

    abstract public void addBreakfastDish();

    abstract public void addLunchSoup();

    abstract public void addLunchMainDish();

    abstract public void addLunchDessert();

    abstract public void addSupperStarter();

    abstract public void addSupperBeverage();

    abstract public void addSupperMainDish();

    public void createBreakfast()
    {
        this.addBreakfastBeverage();
        this.addBreakfastDish();

        this.notifyObservers(this.getBreakfastDescription());
    }

    public void createLunch()
    {
        this.addLunchSoup();
        this.addLunchMainDish();
        this.addLunchDessert();

        this.notifyObservers(this.getLunchDescription());
    }

    public void createSupper()
    {
        this.addSupperStarter();
        this.addSupperBeverage();
        this.addSupperMainDish();

        this.notifyObservers(this.getSupperDescription());
    }

    public void subscribe(Observer observer)
    {
        this.observers.add(observer);
    }

    public void notifyObservers(String description)
    {
        for (Observer observer : this.observers) {
            observer.update(this, description);
        }
    }

    public void run()
    {
        while (true) {
            this.createBreakfast();
            this.createLunch();
            this.createSupper();
        }
    }
}
