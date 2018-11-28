package pl.edu.agh.to;

public class Display implements Observer
{
    public void update(Observable observable, String description)
    {
        Factory factory = (Factory)observable;
        System.out.printf("%s created %s\n", factory.getName(), description);
    }
}
