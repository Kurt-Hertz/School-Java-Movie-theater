import java.util.*;
import java.util.ArrayList;

/**
 * 
 * The code will tell you about a movie theater
 *
 * @author (Kurt Hertz)
 * @version (10/19/2021)
 */
public class kurtMovieTheater
{
    //declaring variables
    public String name="TBD";
    public float moneyMade=0;
    public int availablePasses=100;
    public ArrayList<kurtMovie> movieList = new ArrayList<kurtMovie>();
    public int capacity=200;
    
    //declaring constance
    public float TICKET_PRICE =(float) 9.50;
    public static int PASS_PRICE = 100;
    public static int NUMBER_OF_ROOMS = 4;
    public static int MAX_PASSES = 100;

    //defalut constructor
    public kurtMovieTheater(){
        this.name = "TBD";
        this.moneyMade = 0;
        this.availablePasses = 100;
        this.capacity = 0;
    }

    //3 parameter constructor
    public kurtMovieTheater(String n, int c, int ap){
        this.name = n;
        
        this.availablePasses = ap;
        this.capacity = c;
    }

    //all constructor
    public kurtMovieTheater(String n, int c,int ap, kurtMovie movie){
        this.name = n;
        
        this.availablePasses = ap;
        this.movieList.add(movie);
        this.capacity = c;
    }

    //tostring
    public String toString(){
        //declaring some thing to hold output
        String str = "", movie="";
        

        //
        for(int i=0;i<movieList.size();i++){
            moneyMade = ((movieList.get(i).numberOfPatrons)*TICKET_PRICE)+((MAX_PASSES-this.availablePasses)*PASS_PRICE);
        }
        
        //for(int i=0; i < this.movieList.length; i++){
        for(int i=0;i<movieList.size();i++){
            movie += this.movieList.get(i).name+", ";
        }
        //output text formated
        str = (this.name+"\nThe movies playing now are, "+movie+"Passes availble "+this.availablePasses+"\n Total income: "+moneyMade);
        //return the string
        return str;
    }

    //if someone buys one pass
    public void sellPass(){
        if (this.availablePasses == 0 )
            System.out.println("there is no room");
        else{
            //adds one the the number of pass we have
            this.availablePasses = this.availablePasses-1;
            //updats the teater
            new kurtMovieTheater(this.name,this.capacity,this.availablePasses);
        }
    }

    public void sellPass(int n){
        if (this.availablePasses < n )
            System.out.print("there is no more passes available");
        else{
            //same thing but loop for multipal passes bought^
            for(int i =0;i<=n;i++){
                this.availablePasses = availablePasses-1;
            }
        }
    }

    //if someone buys a tickets
    public void sellTicket(kurtMovie aMovie){
        //checks if there is room then updats the theater
        if (aMovie.numberOfTickets == 0 )
            System.out.println("there is no room");
        else{
        
            moneyMade += (1)*TICKET_PRICE;
            aMovie.numberOfTickets -= 1;
        }
    }

    public void sellTicket(int n,kurtMovie aMovie){
        //same thing but multipal tickets^
        if (n>aMovie.numberOfTickets)
            System.out.println("there is no room");
        else{
        
            moneyMade += TICKET_PRICE*(n);
            aMovie.numberOfTickets -= n;
        }
    }
}