package astro;

public class Zad1
{
    public static void main (String [] args)
    {NumberService numberService = new NumberService();
        int countNumbers=numberService.getCountNumbers();
        System.out.println( "liczba liczb w tablicy to : "+countNumbers +"\n\n");
        int sumNumbers = numberService.sumNumbers();
        System.out.println("Suma wszytskichh liczb to : "+ sumNumbers+"\n\n");
        int numberSoft = numberService.sortNumbers();
        System.out.println(" po koleji "+ numberSoft);

    }
}
