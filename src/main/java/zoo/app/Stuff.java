package zoo.app;

public class Stuff //podaje ilosc zw i cene biletu
{
    public void zooinfo(int n, int m)
    {
        zwierzeta z= new zwierzeta();
        switch(n)
        {
            case 1:
                z.wypiszzwierzeta();
                break;
            case 2:
                System.out.println("85");
                break;
            case 3:
                System.out.print("Dzisiaj odwiedziło nas:" );
                System.out.print(m);
                System.out.println(" osób");
                break;
            default:
                System.out.println("Blad 12");
                System.exit(0);
        }
        return;
    }

}
