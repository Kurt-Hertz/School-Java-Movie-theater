/**
 * The code will tell you about a movie
 *
 * @author (Kurt Hertz)
 * @version (10/19/2021)
 */
public class kurtMovie
{
    //delcaring varables
    public String name;
    public float premium;
    public int numberOfTickets, ageRequirement, numberOfPatrons;

    //3 parameter constructor
    public kurtMovie(String n, int a, int t){
        this.name = n;
        this.premium = 0;
        this.numberOfTickets = t;
        this.ageRequirement = a;
        numberOfPatrons += (200 - this.numberOfTickets);
    }

    //all constructor
    public kurtMovie(String n, int a, int t, float p){
        this.name = n;
        this.premium = p;
        this.numberOfTickets = t;
        this.ageRequirement = a;
        this.numberOfPatrons += (200 - this.numberOfTickets);
    }

    //default constructor
    public kurtMovie(){
        this.name = "TBD";
        this.premium = 0;
        this.numberOfTickets = 0;
        this.ageRequirement = 0;
        this.numberOfPatrons = 0;
    }

    //toStirng metode
    public String toString(){
        //declaring string to hold output
        String str= "";
        //if to see if there is a premium
        if(this.premium != 0) {
            str = ("The " + this.name + " has an age repuirement of " + this.ageRequirement + " and a premium of " + this.premium + "\n" +
                this.numberOfTickets + " left for the movie.");
        }
        else{
            str = ("The " + this.name + " has an age requirement of " + this.ageRequirement + "\n" + this.numberOfTickets+" left for the movie.");
        }
        //return string
        return str;
    }
    
    public static void main(String[] args){
        //make movies
        kurtMovie a = new kurtMovie("bee",8,50,(float)2.50);
        kurtMovie b = new kurtMovie();
        kurtMovie c = new kurtMovie("happy",3,20);
        kurtMovie d = new kurtMovie("up",25,1);
        
        //output movies
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        
        System.out.println(d.numberOfPatrons);
    }
}