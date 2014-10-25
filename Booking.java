import java.util.*; //this imports all libraries and is needed for the date variable and others.

public class Booking
{
    //instance variables
    public String BoatName;
    public boat boatOb;
    public Date cd;
    public String fullNameBooking;
    long numOfDays;
    public int numOfPeople;
    boolean Picnic;
    public Date rd;
    public int refBooking;
    double totalCost;
    
    //Constructor for objects of class Booking
    public Booking(int refBooking, String BoatName, String fullNameBooking, Date cd, Date rd, 
    int numOfPeople, double totalCost, boolean Picnic, boat boatOb)
    {
        //initialise variables
        this.refBooking=refBooking;
        this.BoatName=BoatName;
        this.fullNameBooking=fullNameBooking;
        this.cd=cd;
        this.rd=rd;
        this.numOfPeople=numOfPeople;
        numOfDays= ((rd.getTime() - cd.getTime()) / (1000*60*60*24));
        this.Picnic=Picnic;
        this.boatOb = boatOb;
        this.totalCost = totalCost;
    }
    
    //implement the get methods here.
    public void getDaysBetween(Date cd, Date rd)
    {
        long numOfDays= ((rd.getTime() - cd.getTime()) / (1000*60*60*24));
        System.out.println("|-----------------------------|");
        System.out.println("The booking is for " + numOfDays+" days.");
        System.out.println("|-----------------------------|");
    }
    
    //implement the Set methods here.
    public void setRefBooking(int newRefBooking)
    {
        this.refBooking = newRefBooking; 
    }
    
    public void setBoatName(String newBoatName)
    {
        this.BoatName=newBoatName;
    }
    
    public void setfullNameBooking(String newfullNameBooking)
    {
        this.fullNameBooking=newfullNameBooking;
    }
    
    public void setcd(Date cd) //collection date
    {
        this.cd=cd;
    }
    
    public void setrd(Date rd) //return date
    {
        this.rd=rd;
    }
    
    public void setNumOfPeople(int numOfPeople) // number of people
    {
        this.numOfPeople=numOfPeople;
    }
    
    public void setTotalCost(double totalCost) //total Cost
    {
        this.totalCost=totalCost;
    }
    
    public void setPicnic(boolean Picnic) //sets the picnic.
    {
        this.Picnic=Picnic;
    }
    
    public void setBoatOb(boat boatOb) //sets the boat object.
    {
        this.boatOb=boatOb;
    }
    
    //implement the Get methods here:
    public int getRefBooking() //gets the booking reference number.
    {
        return refBooking;
    }
    
    public String getBoatName() //gets the boats name.
    {
        return BoatName;
    }
    
    public String getfullNameBooking() //gets the customers full name for the booking.
    {
        return fullNameBooking;
    }
    
    public Date getcd() //gets the collection date for the booking.
    {
        return cd;
    }
    
    public Date getrd() //gets the return date for the booking.
    {
        return rd;
    }
    
    public int getNumOfPeople() //gets the number of people in the booking.
    {
        return numOfPeople;
    }
    
    public double getTotalCost() //gets the total cost.
    {
        return totalCost;
    }
    
    public boolean getPicnic() //gets the picnic boolean true or false.
    {
        return Picnic;
    }
    
    public boat getBoatOb() //gets the boat object.
    {
        return boatOb;
    }
    
    public void print()  //prints out english in green with the other get methods here.
    {
        System.out.println(" |--------- (True = Yes & False = No) ----------------|"); 
        System.out.println(" | Booking Ref: "+refBooking);
        System.out.println(" | Boat Name: "+BoatName);
        System.out.println(" | Booking full name: "+fullNameBooking);
        System.out.println(" | Collection date: "+cd);
        System.out.println(" | Return date: "+rd);
        System.out.println(" | Number of people: "+numOfPeople);
        System.out.println(" | Total cost: £"+totalCost);
        System.out.println(" | Picnic: "+Picnic); 
    }
}
