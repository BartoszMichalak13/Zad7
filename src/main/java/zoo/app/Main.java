package zoo.app;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Witamy w zoo, czego chcialbys sie dowiedzec?");

        //int len= args.length;
        Stuff s= new Stuff();
        Guests g= new Guests();
        int od=0;
        int i=0;
        try
        {
            while(true)
            {
                System.out.println("Jakie gatunki zwierzat mamy w zoo [1]");
                System.out.println("Ile mamy zwierzat w zoo[2]");
                System.out.println("Ilu gości nas dziś odwiedzilo[3]");
                System.out.println("Kup bilet[4]");
                System.out.println("exit[5]");
                int n = scanner.nextInt();
                if (n > 5) {
                    System.out.println("Podano nieprawidłowa liczba");
                    System.exit(0);
                }
                switch (n) {
                    case 1:
                        s.zooinfo(1, od);
                        break;
                    case 2:
                        s.zooinfo(2, od);
                        break;
                    case 3:
                        s.zooinfo(3, od);
                        break;
                    case 4:
                        od++;
                        g.zakup(od);
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Blad 11");
                        System.exit(0);
                }
            }

        }
        catch (NumberFormatException ex)
        {
            System.out.println("Musisz podac cyfre");
        }
    }
}