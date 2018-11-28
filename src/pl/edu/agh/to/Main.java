package pl.edu.agh.to;

public class Main
{
    public static void main(String[] args)
    {
        Display display = new Display();

        Factory polishFactory = new PolishFactory();
        polishFactory.subscribe(display);

        while (true) {
            polishFactory.createBreakfast();
            polishFactory.createLunch();
            polishFactory.createSupper();
        }
    }
}
