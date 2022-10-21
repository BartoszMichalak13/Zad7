package zoo.app;

import java.util.Scanner;

public class Guests
{
    public void zakup(int m)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cena biletu wynosi: ");
        int cena= 30+m;
        System.out.println(cena);
        System.out.println("Wybierz forme platnosci: Gotówka[1], Karta[2]");
        int n= scanner.nextInt();
        if(n==2)
        {
            System.out.println("Proszę włożyć kartę");
            //return;
        }
        else if(n==1)
        {
            System.out.println("Proszę podejść do okienka po prawej");
        }
        else
        {
            System.out.println("Podaj 1 lub 2");
        }
    }

}
