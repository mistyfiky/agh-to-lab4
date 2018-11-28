package pl.edu.agh.to;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Display display = new Display();
        List<Thread> threads = new ArrayList<>();

        Factory polishFactory = new PolishFactory();
        polishFactory.subscribe(display);
        threads.add(new Thread(polishFactory));

        Factory americanFactory = new AmericanFactory();
        americanFactory.subscribe(display);
        threads.add(new Thread(americanFactory));

        Factory asianFactory = new AsianFactory();
        asianFactory.subscribe(display);
        threads.add(new Thread(asianFactory));

        for (Thread thread : threads) {
            thread.start();
        }
    }
}
