public class boat
{
    //instance variables
    
    public String BoatName;  //string = letters.
    public int capacity;     //int = one decimal place numbers
    public double costperday; //double = 2 decimal place numbers.
    public double costperperson;
    public String fullName;
    public int ref;
    public boolean serviceability; //boolean = yes or no question answers by True or False values.
    public boolean shower;
    public boolean standardBoat;
    public boolean toilet;
    public boolean pets;
    
    
    
    
    //This is my Constructor for objects of my class Boat.
    public boat(int ref, String BoatName, String fullName, boolean toilet, boolean shower, boolean pets, 
    boolean standardBoat, boolean serviceability, int capacity, double costperday, double costperperson)
    {
        //initialise variables
        this.ref=ref;
        this.BoatName=BoatName;
        this.fullName=fullName;
        this.toilet=toilet;
        this.shower=shower;
        this.pets=pets;
        this.standardBoat=standardBoat;
        this.serviceability=serviceability;
        this.capacity=capacity;
        this.costperday=costperday;
        this.costperperson=costperperson;
    }
    
    public void setRef(int newRef) // Set method for boat reference number.
    {
        this.ref = newRef; //initialice variable
    }
    
    public void setBoatName(String newBoatName)
    {
        this.BoatName=newBoatName;
    }
    
    public void setFullName(String newFullName)
    {
        this.fullName=newFullName;
    }
    
    public void setToilet(boolean newToilet)
    {
        this.toilet=newToilet;
    }
    
    public void setShower(boolean newShower)
    {
        this.shower=newShower;
    }
    
    public void setPets(boolean newPets)
    {
        this.pets=newPets;
    }
    
    public void setStandardBoat(boolean newStandardBoat)
    {
        this.standardBoat=newStandardBoat;
    }
    
    public void setCapacity(int newCapacity)
    {
        this.capacity=newCapacity;
    }
    
    public void setCostperday(double newCostperday)
    {
        this.costperday=newCostperday;
    }
    
    public void setCostperperson(double newCostperperson)
    {
        this.costperperson=newCostperperson;
    }
    
    // Get methods:
    public int getRef() // Get method for returning the boat reference number.
    {
        return ref; //returns the: int ref. (The boat reference number)
    }
    
    public String getBoatName()
    {
        return BoatName;
    }
    
    public String getFullName()
    {
        return fullName;
    }
    
    public boolean getToilet()
    {
        return toilet;
    }
    
    public boolean getShower()
    {
        return shower;
    }
    
    public boolean getPets()
    {
        return pets;
    }
    
    public boolean getStandardBoat()
    {
        return standardBoat;
    }
    
    public boolean getServiceability()
    {
        return serviceability;
    }
    
    public int getCapacity()
    {
        return capacity;
    }
    
    public double getCostperday()
    {
        return costperday;
    }
    
    public double getCostperperson()
    {
        return costperperson;
    }
    
    public void print() // Print method. 
    {
        System.out.println(" |--------- (True = Yes & False = No) ----------------|"); 
        System.out.println(" | Ref: "+ref);
        System.out.println(" | Boat name: "+BoatName);
        System.out.println(" | Customers full name: "+fullName);
        System.out.println(" | Toilet: "+toilet);
        System.out.println(" | Shower: "+shower);
        System.out.println(" | Pets: "+pets);
        System.out.println(" | True = Standard Boat & False = Luxury Boat: "+standardBoat);
        System.out.println(" | Serviceability: "+serviceability);
        System.out.println(" | Capacity is how many the boat can hold: "+capacity);
        System.out.println(" | Cost per day: £"+costperday);
        System.out.println(" | Cost per person: £"+costperperson);
    }
}
