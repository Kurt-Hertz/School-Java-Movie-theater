import java.util.ArrayList;

/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static void main(String args[]) {
        kurtMovieTheater theater1, theater2;
        //Create two arrayLists or arrays
        /* Fill lists with 4 movies. Each movie should be
        instantiated with tiketsAvailable = capacity of the
        theater where they are playing*/
        
        
        kurtMovie a = new kurtMovie("bee",8,50,(float)2.50);
        kurtMovie b = new kurtMovie();
        kurtMovie c = new kurtMovie("happy",3,20);
        kurtMovie d = new kurtMovie("up",25,1);
        
        //Create one theater using your 3 parameter constructor
        theater1 = new kurtMovieTheater("Hello",50,10,a);
        //Create one theater using your 4 parameter constructor
        theater2 = new kurtMovieTheater();
        
        System.out.println(theater1);
        System.out.println(theater2);
        //Add the second arrayList to your theater1
        // Simulate selling passes from different theaters
        theater1.sellPass();
        theater1.sellPass(4);
        theater2.sellPass();
        theater2.sellPass(3);
        /*Simulate selling tickets for various movies from
        theater1*/
        theater1.sellTicket(5,a);
        theater1.sellTicket(12,b);
        theater1.sellTicket(3,c);
        theater1.sellTicket(10,d);
        /*Simulate selling tickets for various movies from
        theater2*/
        theater2.sellTicket(6, a);
        theater2.sellTicket(18,b);
        theater2.sellTicket(60,c);
        theater2.sellTicket(2,d);
        // Make sure that it all worked
        System.out.println("\nTheater 1 has made $"+theater1.moneyMade);
        System.out.println("Theater 2 has made " +
        theater2.moneyMade);
        System.out.println("\nHere are the theaters at the end:");
        System.out.println(theater1);
        System.out.println(theater2);
        

        //Write efficient code to output your movies
    }
}
