package zoo.app;

public class zwierzeta
{
    public void wypiszzwierzeta()
    {
        ssaki s= new ssaki();
        ptaki p= new ptaki();
        s.wypiszssaki();
        p.wypiszptaki();
    }

    public class ssaki
    {

        public void wypiszssaki()
        {
            System.out.println("Ssaki: jelenie,dziki,rysie,wilki,kuny,kangury,niedzwiedzie,żyrafy,lwy");
        }
    }
    public class ptaki
    {
        public void wypiszptaki()
        {
            System.out.println("Ptaki: papugi, pingwiny");
        }
    }
}
