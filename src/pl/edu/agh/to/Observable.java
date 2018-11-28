package pl.edu.agh.to;

public interface Observable
{
    public void subscribe(Observer observer);

    public void notifyObservers(String description);
}
