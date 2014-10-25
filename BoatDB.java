import java.util.*;  // Imports all types of scanners to allow input. 24.05.2012
import java.io.*;  //imports the library.
import java.text.*; // imports the text library. 

public class BoatDB // this is my data base called: Boat DB.
{
    public int age;  //this is the age of the customer of X or Y.
    public ArrayList<boat> boatArr = new ArrayList<boat>(); //boat array
    public ArrayList<Booking> bookingArr = new ArrayList<Booking>(); //booking array
    public int clear = 0; //my (For loop) for my clear lines.
    public Date date; //date.
    public int day; //day entered and stored here. 
    private boolean exit; // true or false exit.
    public int month; //month entered and stored here.
    public Scanner input; // Scanner called scanner.
    public boolean serviceability; // (Boolean: True or False).
    public int thisYear = 2012;  // computer minuses year of birth from this year 2012 to get the age.
    public int year; //year entered & stored here.
    public int yearOfBirth1;    // (X) The company's first attempt at the Boat Age of the driver.
    public int yearOfBirth2;    // (Y) The company's second attempt at the Boat Age of the driver.
    public String YesNoTF; // this is used to swap X & Y as a String rather than a (Boolean: True or False).
    
    public BoatDB() //This menu loads up the data from my Boats & Bookings Text Files at the start of the programme. 
    {
        uploadBoats();  //this method uploads my Boats data at the start of the programme from the text files
        // and puts it back into the data base Array list. 
        uploadBookings();//this method uploads my Bookings data at the start of the programme from the text files
        // and puts it back into the data base Array list.
        this.menu();  // runs the main menu.
    }
    
    public void Spaces2() 
    {
        for (clear = 0; clear <=2; clear++) {System.out.println();}//This code makes a clear screen with 2 blank lines.
    }
    
    public void Spaces50()
    {
        for (clear = 0; clear <=50; clear++) {System.out.println();} //This code makes a clear screen with 50 blank lines.
    }
    
    public void Dimensionalx2TemperatureCode() //this is my 2 dimensional temp code for the nice layouts.
    {
       System.out.println(" | * Welcome CCN Boats operator! *");
       System.out.println ();
       System.out.println (" | The average temperature for your customers cruises today is according to our 5 company locations listed below:");
       float [][] temperature = new float [5][365]; //Temperature array.
       //Generate temperatures:
       for (int i = 0; i < temperature.length; i++)
            for (int j = 0; j < temperature[i].length; j++)
                temperature[i][j] = (float) (45.0*Math.random() - 10.0);
       //Calculate the average per location.
       for(int i = 0; i < temperature.length; i++)
       {
            float average = 0.0f;  //place to store the average.
            for(int j = 0; j < temperature[0].length; j++)
                average += temperature[i][j];
            //Output the average temperature for the current location
            System.out.println(" | The average temperature for location "+ (i+1) + " = " + average/(float)temperature[i].length);
       }
       System.out.println(); //1 blank line.
    }
    
    public void menuBoatPic() // This is my menu boat pic that is run from my method: menuBoatPic() 
    {
       System.out.println(" |************************************************************************************************|");
       System.out.println(" |                                                                        |  O  |    CCN BOATS    |");
       System.out.println(" |                               /---------------------|                  --| |--    2012         |");
       System.out.println(" |                             /  ******************** |                    |-|      FUN!         |");
       System.out.println(" |  *------------------------/   ********************* |                    _^_                   |");
       System.out.println(" |    * WWW.CCN BOATS 2012.COM                         --------------------------------------|    |");
       System.out.println(" |      *----------------                                                                    |    |");
       System.out.println(" |        *                        |***  |***  |*  |    We pride ourselves buy offering our  |    |");
       System.out.println(" |          *                      |     |     | * |    customers top quality standard and   |    |");
       System.out.println(" |            *                    |***  |***  |  *|    luxury boats at affordable prices!   |    |");
       System.out.println(" |              *____________________________________________________________________________|    |");
       System.out.println(" |                                                                                                |");
       System.out.println(" |************************************************************************************************|");
       System.out.println();
    }
    
    public void menu() // This is the menu that runs the whole programme from the start.
    {                                                                                         
       boolean swapAgeYear1 = false; // These are set to false to begin with. 
       boolean swapAgeYear2 = false; // These are set to false to begin with.
       //_____________________________________________________________
       //Warning message here saying that both dates will be checked here!!!
       Spaces2(); //this runs the spaces programme to save computer memory and time which makes the programme
       // run smoother and is also usable on smaller computer systems, ie: Android App Technology in the future.
       Dimensionalx2TemperatureCode(); //This is my two dimensional menu code for the cruise tempurature locations. 
       menuBoatPic(); //this is my nice boat pic for the menu's.
       System.out.println(" |************************* Swapping (X) & (Y) menu! *************************|");
       System.out.println(" | Hello here you will have the chance to swap (X) your first year entered,   |");
       System.out.println(" | with (Y) your second year entered, just in case you made an input error.   |");
       System.out.println(" |****************************************************************************|");
       //_____________________________________________________________
       //First attempt: This asks for the customers year of birth to make sure thay are 18 to 80 years old to hire a boat.
       System.out.println();
       System.out.println(" |*********************** (X) ***************************|");
       System.out.print(" | (X) Hello what is the customers year of birth please? ");
       try
       {
            input = new Scanner(System.in);
            yearOfBirth1 = input.nextInt();
            input.close();
       }
        catch (Exception e)
       {
            System.err.println (" Error, please try year like this: YYYY. ");
       }
       //_____________________________________________________________
       //Second attempt: This asks for the customers year of birth to make sure thay are 18 to 80 years old to hire a boat.
       try
       {
            Spaces50(); // 50 blank spaces.
            menuBoatPic(); //nice boat pic.
            System.out.println(); //' 1 blank line.
            System.out.println(" |******************************** (Y) ***********************************|");
            System.out.print  (" | (Y) For confirmation re-enter the (same) customer's year of birth now: ");
            input = new Scanner(System.in); //open the scanner here.
            yearOfBirth2 = input.nextInt(); //tells computer the next int entered is going into yearOfBirth2.
            input.close(); //closes the scanner here. 
       }
        catch (Exception e) //this catches any errors & prints out the below message. 
       {
            System.err.println (" Error, please try year like this: YYYY. "); //error message. 
       }
       
       try // this means that anything in the try brackets is tried by the computer for any errors.
       {
            Spaces50(); // 50 blank spaces.
            menuBoatPic(); //nice boat pic.
            System.out.println(); // 1 blank line. 
            System.out.println(" |*************************************************|");
            System.out.println(" | Hello would you like to swap (X) for (Y) today? |");
            System.out.print(" | Type in: y, yes, true or n, no, false: ");
            input = new Scanner(System.in); //open scanner.
            String YesNoTF = input.next(); 
            input.close();
            if (YesNoTF.equalsIgnoreCase("y") || YesNoTF.equalsIgnoreCase("yes") || YesNoTF.equalsIgnoreCase("true")){
                swapAgeYear1 = true;  // My (if) swapAgeYear1 boolean here I have set to (true)
                Spaces50();
                int x = yearOfBirth1;  // operators first entered customer's year of birth.
                int y = yearOfBirth2;  // operators second entered same customer's year of birth.
                int temp;              // this is the empty (temp) part to swap them into.
                temp = x;              // x now goes into the temp part.
                x = y;                 // y now goes into x.
                y = temp;              // temp goes into y, so they all just rotate one place, X goes down & Y & temp go up.
                age = (thisYear - (yearOfBirth2));
                if (age <= 17)
                {
                    Spaces50();
                    System.out.println(" (Y) Sorry please come back when you are over 18 years old to rent a boat from us, and have a nice day! ");
                }
                else if (age >= 81)
                {   
                    Spaces50();
                    System.out.println(" (Y) Sorry but you are over our maximum age of 80 years old and legally can not rent a boat from us. ");
                }
                else
                { 
                    mainMenuY(); // This method brings up my menu Y.
                }    
            }
            else if (YesNoTF.equalsIgnoreCase("n") || YesNoTF.equalsIgnoreCase("no") || YesNoTF.equalsIgnoreCase("false")){
                swapAgeYear1 = false;  // My (if) swapAgeYear1 boolean here I have set to (false)
                Spaces50();
                age = (thisYear - (yearOfBirth1));
                System.out.println(" | Age (X) ok & age = " + age );  // prints out yearOfBirth2.
                if (age <= 17)
                {
                    Spaces50();
                    System.out.println(" (X) Sorry please come back when you are over 18 years old to rent a boat from us, and have a nice day! ");
                }
                else if (age >= 81)
                {   
                    Spaces50();
                    System.out.println(" (X) Sorry but you are over our maximum age of 80 years old and legally can not rent a boat from us. ");
                }
                else
                { 
                    mainMenuX(); // This method brings up my main menu X.
                }    
            } 
            else {
                System.out.println("Error wrong input.");
            }   // This error message will be printed if the operator enters in any thing else in error.
       }
       catch (Exception e)
       {
            System.err.println(" Computer error swapping X & Y today. ");
       }
    }
    
    public void mainMenuY()// my main menu for Y.
    {           
         exit = false;
         while(exit == false){
            try
            {  //This person is over 18 years old and is classed as an adult so can have a boat & proceed to the main menu.
               Spaces50(); // 50 spaces here.
               age = (thisYear - (yearOfBirth2)); //2012- the customers year they were born to equal their age & then my programme can use it. 
               System.out.println(" | Thank you for swapping (X & Y) today!  :-) "); //nice message to operator.
               System.out.println();  //blank line
               System.out.println(" | Age (Y) ok & age = " + age);  // prints out yearOfBirth2.
               System.out.println ();
               Dimensionalx2TemperatureCode(); //This is my two dimensional code for the cruise tempurature locations. 
               menuBoatPic();
               System.out.println(" | Greetings happy booking today for Age (Y)!");
               System.out.println();//This puts an empty line in, & is used for spacing my menu's.
               System.out.println(" |*------- MAIN  MENU (Y) -------*|");
               System.out.println(" |*                              *|");
               System.out.println(" |*   Choose a number option:    *|");
               System.out.println(" |*                              *|");
               System.out.println(" |1.  Boat reservations          *|");
               System.out.println(" |2.  Booking reservations       *|");
               System.out.println(" |3.  Exit                       *|");
               input = new Scanner(System.in); //open scanner here.
               int option = input.nextInt();  //allow next input for menu here.
               input.close();  //close scanner here.
               switch (option)
               {
                       case 1: subBoatMenuY(); break;  //boat menu
                       case 2: subBookingMenuY(); break;  //booking menu
                       case 3: exit = true; break;  //Exit programme. #3 exit is needed here.
                       default: System.out.println("Error, choose an option 1-3"); break;  //default message.
               }
            }
            catch (Exception e)
            {
                System.err.println (" Main Menu Y error, please try 1-3. ");
            }
         }
    }
    
    public void subBoatMenuY()// this is my sub boat menu for customer (Y)
    {           
         exit = false;
         while(exit == false){
            try
            {       //This person is over 18 years old and is classed as an adult so can have a boat & proceed to the main menu.
                    Spaces2();
                    System.out.println();//This puts an empty line in, & is used for spacing my menu's.
                    System.out.println(" |*---------- BOAT MENU (Y) ---------*|");
                    System.out.println(" |*                                  *|");
                    System.out.println(" |*   Choose a number option:        *|");
                    System.out.println(" |*                                  *|");
                    System.out.println(" |1.  Add a Boat                     *|");
                    System.out.println(" |2.  Amend a Boat                   *|");
                    System.out.println(" |3.  Delete a Boat                  *|");
                    System.out.println(" |4.  Print list of Boats            *|");
                    System.out.println(" |5.  Save Boats                     *|");
                    System.out.println(" |6.  Return to main (Y) menu        *|");
                    input = new Scanner(System.in); //open scanner here.
                    int option = input.nextInt();  //allow next input for menu here.
                    input.close();  //close scanner here.
                    switch (option){
                        case 1: addBoat(); break;
                        case 2: AmendBoat(); break;
                        case 3: deleteBoat(); break;
                        case 4: printListOfBoats(); break;
                        case 5: saveBoats(); break;
                        case 6: mainMenuY(); break; // No #7 exit is required here.
                        default: System.out.println("Error, choose an option 1-6"); break;
                    }
            }
            catch (Exception e)
            {
                System.err.println (" Sub Boat Menu Y error, please try 1-6. ");
            }
         }
    }
    
    public void subBookingMenuY()// sub booking menu foor (Y) 
    {           
         exit = false;
         while(exit == false){
            try
            {       //This person is over 18 years old and is classed as an adult so can have a boat & proceed to the main menu.
                    Spaces2();
                    System.out.println();//This puts an empty line in, & is used for spacing my menu's.
                    System.out.println(" |*---------- BOOKING MENU (Y) ---------*|");
                    System.out.println(" |*                                     *|");
                    System.out.println(" |*   Choose a number option:           *|");
                    System.out.println(" |*                                     *|");
                    System.out.println(" |1.  Add a Booking                     *|");
                    System.out.println(" |2.  Amend a Booking                   *|");
                    System.out.println(" |3.  Delete a Booking                  *|");
                    System.out.println(" |4.  Print list of Bookings            *|");
                    System.out.println(" |5.  Save Booking                      *|");
                    System.out.println(" |6.  Return to main (Y) menu           *|");
                    input = new Scanner(System.in); //open scanner here.
                    int option = input.nextInt();  //allow next input for menu here.
                    input.close();  //close scanner here.
                    switch (option){
                        case 1: addBooking(); break;
                        case 2: AmendBooking(); break;
                        case 3: deleteBooking(); break;
                        case 4: printListOfBookings(); break;
                        case 5: saveBookings(); break;
                        case 6: mainMenuY(); break; // No #7 exit is required here.
                        default: System.out.println("Error, choose an option 1-6"); break;
                    }
            }
            catch (Exception e)
            {
                System.err.println (" Sub Booking Menu Y error, please try 1-6. ");
            }
         }
    }  

    public void mainMenuX()// my main menu for X.
    {           
         exit = false;
         while(exit == false){
            try
            {
                    //This person is over 18 years old and is classed as an adult so can have a boat & proceed to the main menu.
                    Spaces50();
                    age = (thisYear - (yearOfBirth1));
                    System.out.println(" | Age (X) ok & age = " + age );  // prints out yearOfBirth2.
                    System.out.println ();
                    Dimensionalx2TemperatureCode(); //This is my two dimensional code for the cruise tempurature locations. 
                    menuBoatPic();
                    System.out.println(" | Greetings happy booking today for Age (X)!");
                    System.out.println();//This puts an empty line in, & is used for spacing my menu's.
                    System.out.println(" |*-------- MAIN  MENU (X) --------*|");
                    System.out.println(" |*                                *|");
                    System.out.println(" |*   Choose a number option:      *|");
                    System.out.println(" |*                                *|");
                    System.out.println(" |1.  Boat reservations            *|");
                    System.out.println(" |2.  Booking reservations         *|");
                    System.out.println(" |3.  Exit                         *|");
                    input = new Scanner(System.in); //open scanner here.
                    int option = input.nextInt();  //allow next input for menu here.
                    input.close();  //close scanner here.
                    switch (option){
                        case 1: subBoatMenuX(); break;
                        case 2: subBookingMenuX(); break;
                        case 3: exit = true; break;  //Exit programme. #3 exit is needed here.
                        default: System.out.println(" Error, choose an option 1-3"); break;
                    }
            }
            catch (Exception e)
            {
                System.err.println (" Main Menu X error, please try 1-7. ");
            }
         }
    }
    
    public void subBoatMenuX()// my main menu for X.
    {           
         exit = false;
         while(exit == false){
            try
            {
                    //This person is over 18 years old and is classed as an adult so can have a boat & proceed to the main menu.
                    Spaces2();
                    System.out.println();//This puts an empty line in, & is used for spacing my menu's.
                    System.out.println(" |*-------- BOAT MENU (X) --------*|");
                    System.out.println(" |*                               *|");
                    System.out.println(" |*   Choose a number option:     *|");
                    System.out.println(" |*                               *|");
                    System.out.println(" |1.  Add a Boat                  *|");
                    System.out.println(" |2.  Amend a Boat                *|");
                    System.out.println(" |3.  Delete a Boat               *|");
                    System.out.println(" |4.  Print list of Boats         *|");
                    System.out.println(" |5.  Save Boats                  *|");
                    System.out.println(" |6.  Return to main (X) menu     *|");
                    input = new Scanner(System.in); //open scanner here.
                    int option = input.nextInt();  //allow next input for menu here.
                    input.close();  //close scanner here.
                    switch (option){  //this is my case number menu.
                        case 1: addBoat(); break;
                        case 2: AmendBoat(); break;
                        case 3: deleteBoat(); break;
                        case 4: printListOfBoats(); break;
                        case 5: saveBoats(); break;
                        case 6: mainMenuX(); break; // No #7 exit is required here.
                        default: System.out.println("Error, choose an option 1-6"); break;  //default is the error message.
                    }
            }
            catch (Exception e)
            {
                System.err.println (" Sub Boat Menu X error, please try 1-6. ");
            }
         }
    }
    
    public void subBookingMenuX()// sub Booking Menu for (X) 
    {           
         exit = false;
         while(exit == false){
            try
            {
                    //This person is over 18 years old and is classed as an adult so can have a boat & proceed to the main menu.
                    Spaces2();
                    System.out.println();//This puts an empty line in, & is used for spacing my menu's.
                    System.out.println(" |*-------- BOOKING MENU (X) --------*|");
                    System.out.println(" |*                                  *|");
                    System.out.println(" |*   Choose a number option:        *|");
                    System.out.println(" |*                                  *|");
                    System.out.println(" |1.  Add a Booking                  *|");
                    System.out.println(" |2.  Amend a Booking                *|");
                    System.out.println(" |3.  Delete a Booking               *|");
                    System.out.println(" |4.  Print list of Bookings         *|");
                    System.out.println(" |5.  Save Booking                   *|");
                    System.out.println(" |6.  Return to main (X) menu        *|");
                    input = new Scanner(System.in); //open scanner here.
                    int option = input.nextInt();  //allow next input for menu here.
                    input.close();  //close scanner here.
                    switch (option){
                        case 1: addBooking(); break;
                        case 2: AmendBooking(); break;
                        case 3: deleteBooking(); break;
                        case 4: printListOfBookings(); break;
                        case 5: saveBookings(); break;
                        case 6: mainMenuX(); break;
                        default: System.out.println("Error, choose an option 1-6"); break;
                    }
            }
            catch (Exception e)
            {
                System.err.println (" Sub Booking Menu X error, please try 1-6. ");
            }
         }
    }  
    
    public void printListOfBoats() // this prints on the screen my list of boats in the array list.
    {
        try  //same standard error handling as before.
        {
            Spaces50();  //50 blank lines here.
            for(int i=0; i<boatArr.size(); i++){  // computer starts counting from zero until the length of the array size.
                    boat tempBoat = boatArr.get(i);  //computer gets the info from the (tempBoat) file.
                    System.out.println();  //blank line
                    System.out.println(" |-------- The current list of boats: ----------------|"); //english.
                    System.out.println(" | Index("+i+")");  //computer uses the (Index number) of the boats to print the list.
                    tempBoat.print();  //runs the method.
                    System.out.println(" |----------------------------------------------------|"); //english.
                    System.out.println();  //blank line
            }
        }
        catch (Exception e)
        {
            System.err.println(" Computer error in Print List Of Boats. ");
        }
    }
    //----------------- Amend a boat -----------------------------------------------------
    public void AmendBoat() // this prints a list, deletes the boat & adds a new boat.
    {
       try
       {
         //Delete the required boat here:
         input = new Scanner(System.in);  //open the scanner for input. 
         this.printListOfBoats(); // this runs the method: printListOfBoats!!!!     
         System.out.println(" |--- To amend a boat please delete the original one & re-enter a new one. ---|"); 
         System.out.print(" |--- What is the index number of the boat you would like to delete? ");
         boatArr.remove(input.nextInt()); //whatever the user inputs next, the computer will remove that number from the Array List. 
         this.printListOfBoats(); //this will print the list of boats out on the screen.
         input.close(); //closes the scanner here. 
         //Enter new boat details here:
         addBoat(); //this method is run to add a boat in the add boat menu, this is done for efficiency
         // and saves computer memory & time as it's loads quicker because it has less data to process.
       }
       catch (Exception e)
       {
         System.err.println(" Computer error in Amend Boat. ");
       }
    }
    
    public void deleteBoat() //this deletes a boat
    {
       try
       {
         input = new Scanner(System.in); //open the scanner 
         this.printListOfBoats(); //prints a list of boats in the array.
         System.out.println(" |-------- Please delete using the boat's Index number. --------|"); //my english.
         System.out.print(" What is the index number of the boat you would like to delete? ");
         boatArr.remove(input.nextInt()); //this removes the boat from the array.
         this.printListOfBoats(); //this prints the list again to show it removed for confirmation.
         input.close(); //this closes the scanner.
       }
       catch (Exception e)
       {
         System.err.println(" Computer error in Delete Boat. ");
       }
    }
    
    public void addBoat() //this adds a boat.
    {
       try
       {
         //Enter new details here:
         input = new Scanner(System.in);
         Spaces2();
         System.out.print(" Enter a boat reference number: ");
         int ref = input.nextInt();
         input.close();
         input = new Scanner(System.in);
         Spaces2();
         System.out.print(" Enter a Boat Name: ");
         String BoatName = input.nextLine();
         input.close();
         input = new Scanner(System.in);
         Spaces2();
         System.out.print(" Enter the customers full name: ");
         String fullName = input.nextLine();
         input.close();
        
         boolean toilet = false;
         boolean shower = false;
         boolean pets = false;
         boolean standardBoat = false;
         boolean serviceability = false;
         int capacity;
         double costperday = 0;
         double costperperson = 0;
        
         Spaces2();
         input = new Scanner(System.in);
         System.out.println(" Would you like to book a Standard boat?  True = Standard & False = Luxury. ");
         System.out.print(" Type in: y, yes, true or n, no, false: ");
         String YesNoTF = input.next();
         input.close();
         if (((YesNoTF.equalsIgnoreCase("y")) || YesNoTF.equalsIgnoreCase("yes") || YesNoTF.equalsIgnoreCase("true")))
         {
           standardBoat = true; //true means standard boat with prices.
           Spaces2();  //2 blank spaces
           System.out.println(" Standard boat selected at £50 per day and £10 per person per day.");
           Spaces2();  //2 blank spaces
           costperday = 50; //standard boat £50 per boat and (per day)
           costperperson = 10; //standard boat £10 per person and (per day)
         }
         else if (YesNoTF.equalsIgnoreCase("n") || YesNoTF.equalsIgnoreCase("no") || YesNoTF.equalsIgnoreCase("false"))
         {
            standardBoat = false;  // false means luxury boat with prices.
            costperday = 100;//luxury boat £100 per boat and (per day) 
            costperperson = 20;//luxury boat £20 per person and (per day) 
            Spaces2();  //2 blank spaces
            System.out.println(" Luxury boat selected at £100 per day and £20 per person per day.");
            Spaces2();  //2 blank spaces
            input = new Scanner(System.in);
            System.out.println(" Would you like a shower? True = add & False = don't add. ");
            System.out.print(" Type in: y, yes, true or n, no, false: ");
            YesNoTF = input.next();
            input.close();
            if ((YesNoTF.equalsIgnoreCase("y")) || YesNoTF.equalsIgnoreCase("yes") || YesNoTF.equalsIgnoreCase("true"))
            {
                 shower = true;
                 Spaces2();
                 System.out.println(" **********************************************");
                 System.out.println(" ** Shower is now added to this Luxury boat. **");
                 System.out.println(" **********************************************");
                 Spaces2();
            }
            else if (YesNoTF.equalsIgnoreCase("n") || YesNoTF.equalsIgnoreCase("no") || YesNoTF.equalsIgnoreCase("false"))
            {
                 shower = false;
                 Spaces2();
                 System.out.println(" *******************************************");
                 System.out.println(" ** This Luxury boat has NO shower on it. **");
                 System.out.println(" *******************************************");
                 Spaces2();
            }
         }
        
         input = new Scanner(System.in);
         Spaces2();
         System.out.println(" Would you like a toilet? True = add & False = don't add. ");
         System.out.print(" Type in: y, yes, true or n, no, false: ");
         YesNoTF = input.next();
         input.close();
         Spaces2();
         if ((YesNoTF.equalsIgnoreCase("y")) || YesNoTF.equalsIgnoreCase("yes") || YesNoTF.equalsIgnoreCase("true"))
         {
            toilet = true;
            Spaces2();
            System.out.println(" Toilet onboard.");
            Spaces2();
         }
         else if (YesNoTF.equalsIgnoreCase("n") || YesNoTF.equalsIgnoreCase("no") || YesNoTF.equalsIgnoreCase("false"))
         {
            toilet = false;  // My (else if) set to (false)
            Spaces2();
            System.out.println(" No toilet onboard.");
            Spaces2();
         }
         
         input = new Scanner(System.in);
         Spaces2();
         System.out.println(" Would you like pets allowed? True = allow & False = don't allow. ");
         System.out.print(" Type in: y, yes, true or n, no, false: ");
         YesNoTF = input.next();
         input.close();
         Spaces2();
         if ((YesNoTF.equalsIgnoreCase("y")) || YesNoTF.equalsIgnoreCase("yes") || YesNoTF.equalsIgnoreCase("true"))
         {
            pets = true;
            Spaces2();
            System.out.println(" Pets are allowed.");
            Spaces2();
         }
         else if (YesNoTF.equalsIgnoreCase("n") || YesNoTF.equalsIgnoreCase("no") || YesNoTF.equalsIgnoreCase("false"))
         {
            pets = false;
            Spaces2();
            System.out.println(" Pets aren't allowed.");
            Spaces2();
         }
        
         Spaces2();
         input = new Scanner(System.in);
         System.out.println(" Boat serviceability ok? True = serviceable & False = not serviceable. ");
         System.out.print(" Type in: y, yes, true or n, no, false: ");
         YesNoTF = input.next();
         input.close();
         if ((YesNoTF.equalsIgnoreCase("y")) || YesNoTF.equalsIgnoreCase("yes") || YesNoTF.equalsIgnoreCase("true"))
         {
            serviceability = true;
            Spaces2();
            System.out.println(" Boat is serviceable.");
            Spaces2();
         }
         else if (YesNoTF.equalsIgnoreCase("n") || YesNoTF.equalsIgnoreCase("no") || YesNoTF.equalsIgnoreCase("false"))
         {
            serviceability = false;
            Spaces2();
            System.out.println(" Boat is NOT serviceable.");
            Spaces2();
         }
        
         Spaces2();
         input = new Scanner(System.in);
         System.out.println(" |--- How many people can this boat hold? ---|");
         System.out.print(" |--- Enter the boat's capacity number: ");
         capacity = input.nextInt();
         input.close();
        
         boatArr.add(new boat(ref, BoatName, fullName, toilet, shower, pets, standardBoat, serviceability, 
         capacity, costperday, costperperson));
       }
       catch (Exception e)
       {
         System.err.println(" Computer error in Add Boat. ");
       }
    }
    
    public void saveBoats() //this writes the data to a text file to save the boats from the array.
    {
        try
        {
            boat tempBoat; //this creates a boat file in the text file of boat with the info entered here.
            BufferedWriter p = new BufferedWriter(new FileWriter("boat.txt")); //this is the text file writer.
            for(int i=0; i<boatArr.size(); i++) { //i=0 means that the computer starts counting from zero until the length of the Aray List.
                tempBoat = boatArr.get(i); //this gets the data from the Array List in the programme of Boat.
                p.write (tempBoat.getRef()+","+tempBoat.getBoatName()+","+tempBoat.getFullName()
                +","+tempBoat.getToilet()+","+tempBoat.getShower()+","+tempBoat.getPets()
                +","+tempBoat.getStandardBoat()+","+tempBoat.getServiceability()
                +","+tempBoat.getCapacity()+","+tempBoat.getCostperday()+","+tempBoat.getCostperperson());
                //the above code writes the data to a text file.
                p.newLine();//this part writes a new line for the next boat to be saved so it's not confusing.
                
                menuBoatPic(); //my nice boat pic.
                Spaces2(); //x2 blank spaces.
                System.out.println(" |**********Boat**********|"); //my alert confirmation saying saved.
                System.out.println(" |------------------------|");
                System.out.println(" |   Boat details saved!  |");
                System.out.println(" |------------------------|");
                System.out.println(" |************************|");
                System.out.println();
            }
            p.close(); //this closes the text file writer. 
        }
        catch (Exception e)
        {
            System.err.println (" Error in Save Boats, ie: writing to a text file. ");
        }
    }
    
    public void uploadBoats() // My reader to upload to the Array List.
    {
         int tempRef;
         String tempBoatName;
         String tempfullName;
         boolean tempToilet; // boolean
         boolean tempShower;
         boolean tempPets;
         boolean tempStandardBoat;
         boolean tempServiceability;
         int tempCapacity;
         double tempCostperday;  
         double tempCostperperson;  
         try
         {
            BufferedReader fromFile = new BufferedReader(new FileReader("boat.txt")); //this is a Text File reader.
            String line = fromFile.readLine(); //this reads the line needed.
            while (line != null) { //this while loop will keep reading the data until there isn't any left to read, ie: (value = empty) means (line != null)
                String[] tokens = line.split(","); //this means that I've split the code with (",") to make it look nice.
                tempRef = Integer.parseInt(tokens[0]);  //(parseInt) means it will pass a number value and put it into a string, then store it in the string variable. 
                tempBoatName = tokens[1]; //this is a string.
                tempfullName = tokens[2];
                tempToilet = Boolean.parseBoolean(tokens[3]); //this passes a true or false boolean and stores it into the string variable. (This has a number of 3 in the array list.) 
                tempShower = Boolean.parseBoolean(tokens[4]);
                tempPets = Boolean.parseBoolean(tokens[5]);
                tempStandardBoat = Boolean.parseBoolean(tokens[6]);
                tempServiceability = Boolean.parseBoolean(tokens[7]);
                tempCapacity = Integer.parseInt(tokens[8]);
                tempCostperday = Double.parseDouble(tokens[9]);
                tempCostperperson = Double.parseDouble(tokens[10]);
                
                boatArr.add(new boat(tempRef, tempBoatName, tempfullName, tempToilet, tempShower, tempPets, 
                tempStandardBoat, tempServiceability, tempCapacity, tempCostperday, tempCostperperson)); //this code adds the variables into the boat array list back uploading into the programme.
                line = fromFile.readLine(); //this method reads the line of code from the Text File for the array list.
            }
            fromFile.close(); //this closes it. 
         } 
         catch (Exception e)
         {
            System.err.println(" Error in Upload Boats: File input error. ");
         }
    }
    //-----
    //------------------------------------------Booking part below!! -----------------------------------------
    //-----
        
    public void printListOfBookings() //this prints a list of bookings on the screen.
    {
        try  //error trying starts here.
        {
            Spaces2(); //x2 clear spaces method.
            for(int i=0; i<bookingArr.size(); i++){  //counts from zero 
                Booking tempBooking = bookingArr.get(i); //gets the data from the array.
                System.out.println();
                System.out.println(" |-------- The current list of bookings: -------------|");
                System.out.println("Index("+i+")");
                tempBooking.print();
                System.out.println(" |----------------------------------------------------|");
                System.out.println();
            }
        }  //error trying ends here.
        catch (Exception e) //any errors are caught here.
        {
            System.err.println(" Error in Print List Of Bookings. "); //error message.
        }
    }
    //----------------- Amend a booking --------------------------------------------------
    public void AmendBooking()
    {
      try 
      {  //error trying starts here.
        //Delete the required Booking here:
        input = new Scanner(System.in); //opens the scanner to allow input.
        this.printListOfBookings(); //prints a list of booking on the screen.
        Spaces2(); // 2 clear spaces method called here.
        System.out.println(" |-------------------------Bookings Amend Menu ------------------------------|");
        System.out.println(" |                                                                           |");
        System.out.println(" | To amend a Booking please delete it & then re-create a new one thank you. |");
        System.out.println(" |                                                                           |");        
        System.out.print(" | What is the index number of the Booking you would like to delete? ");
        bookingArr.remove(input.nextInt()); //removes the booking number from the array.
        this.printListOfBookings(); //prints out the list of bookings to confirm it's been deleted.
        input.close(); //scanner closed here.        
        //-------------------------------------------------------------------------
        //Enter new details here:
        addBooking(); // I run this menu method to add a booking for efficiency. 
      } //error trying ends here.
      catch (Exception e) //this catches any errors.
      {
            System.err.println(" Error in Print List Of Bookings. "); //my error message.
      }
    }

    public void deleteBooking() //this deletes a booking.
    {
      try
      {  //error trying starts here.
        input = new Scanner(System.in); //my scanner is opened here so you can input info. 
        this.printListOfBookings(); //this prints the current list of bookings.
        Spaces2(); // x2 blank spaces for a nice layout.
        System.out.println(" |------------------- Bookings Delete Menu --------------------------|");
        System.out.println(" |                                                                   |");
        System.out.print(" | What is the index number of the Booking you would like to delete? " );
        bookingArr.remove(input.nextInt());
        this.printListOfBookings();
        input.close();
      }  //error trying ends here.
      catch (Exception e)
      { 
            System.out.println(" Error in: Delete Booking. ");  //my error message.
      }
    }
    
    public Date storeDate() //this stores the booking dates.
    {
      try
      {   //error trying starts here.
        System.out.print(" Enter new year YY: "); //enter 2 numbers for the year.
        this.year = input.nextInt(); //here the computer knows that what input is next will be stored in the year. 
        do  //my do while loop which won't stop until a correct number is entered.
        {
            if (year <12) //less than 12 won't work. 
            {
                System.out.print(" Please don't book a boat in the past & try a year YY of 12 or above: "); //error message.
                year = input.nextInt(); //asks for the age again here.
                // Here I have for my efficiency rule to run the method input.nextInt(); inside my if loop.
            }
            else //this means that the programme will exit the (do while) loop when the number is 12 or above.
            {}
        }while (year <12);
        
        if(year<20){ //this adds 100 onto the year if just 12 is entered if the year should be 2012 and it's less than 20.
            year+=100;
        }
        
        Spaces2();
        System.out.println();//This puts an empty line in, & is used for spacing my menu's.
        menuBoatPic();
        System.out.println();
        System.out.println(" |*------- Months of the year -------*|");
        System.out.println(" |*                                  *|");
        System.out.println(" |*   Choose a number option:        *|");
        System.out.println(" |*                                  *|");
        System.out.println(" |1.  January                        *|");
        System.out.println(" |2.  February                       *|");
        System.out.println(" |3.  March                          *|");
        System.out.println(" |4.  April                          *|");
        System.out.println(" |5.  May                            *|");
        System.out.println(" |6.  June                           *|");
        System.out.println(" |7.  July                           *|");
        System.out.println(" |8.  August                         *|");
        System.out.println(" |9.  September                      *|");
        System.out.println(" |10. October                        *|");
        System.out.println(" |11. November                       *|");
        System.out.println(" |12. December                       *|");
        System.out.print(" Enter new month 1-12: ");
        input = new Scanner(System.in); //open scanner here.
        month=input.nextInt()-1;  //allow next input for menu here & computer counts from zero!
        input.close();  //close scanner here.
        switch (month){
                        case 0:  System.out.println(" Jan "); break; // computer counts from zero!
                        case 1:  System.out.println(" Feb "); break;
                        case 2:  System.out.println(" Mar "); break;
                        case 3:  System.out.println(" Apr "); break;
                        case 4:  System.out.println(" May "); break;
                        case 5:  System.out.println(" June "); break;
                        case 6:  System.out.println(" July "); break;
                        case 7:  System.out.println(" Aug "); break;
                        case 8:  System.out.println(" Sept "); break;
                        case 9:  System.out.println(" Oct "); break;
                        case 10:  System.out.println(" Nov "); break;
                        case 11:  System.out.println(" Dec "); break;
                        default: System.out.println("Error, choose an option 1-12 "); break;
        }
        System.out.print(" Enter a new day: ");
        input = new Scanner(System.in); //open scanner here.
        this.day=input.nextInt();
        input.close();  //close scanner here.
      }   //error trying ends here.
      catch (Exception e)
      { 
            System.out.println(" Error in: Store Date. ");    //my error message.
      }
      Date newDate = new Date(year,month,day);
      return newDate;
    }
    
    public void addBooking() //this adds a booking.
    {
      try
      {
        input = new Scanner(System.in);
        Spaces2();
        System.out.print(" |- Enter the booking reference number: ");
        int refBooking = input.nextInt();
        input.close();
        
        this.printListOfBoats(); //prints out the list of boats with the index numbers.
        input = new Scanner(System.in); //open the scanner here.
        Spaces2(); //2 blank spaces menu is called here.
        System.out.println(" |---------------------------------------------------------|");
        System.out.println(" | If the Boat is NOT (servicable) then DO NOT book it.    |");
        System.out.print(" | What is the index number of the boat you wish to hire? ");
        int index = input.nextInt(); //you imput the index number of the boat you wish to hire here.
        boat boatOb = boatArr.get(index); //here the computer checks the index number in the Array List.
        if (boatOb.getServiceability() == true){ //gets the serviceability from the boat object & if true do:
            Spaces2();
            System.out.println(" ***********************************************************");
            System.out.println(" ** This boat IS serviceable & you are ok to book it now. **");
            System.out.println(" ***********************************************************");
            Spaces2();
        }
        else  //else serviceability is false do:
        {
            Spaces2();
            System.out.println(" ***************************************************************");
            System.out.println(" ** This boat is NOT serviceable & you are NOT ok to book it. **");
            System.out.println(" ***************************************************************");
            Spaces2();
            boatOb = null;  // Null means that it empties the Boat Object that u have just put data into.
            this.printListOfBookings();  // This prints the  list of bookings out so you can see you have NOT booked
            // a non serviceable boat.  
        }
            
        input.close(); //close the scanner here.
        String BoatName = boatOb.getBoatName(); //here the boat object is saved in the BoatName string.
        //this is done so that the computer can check to see if you have a boat called the same name before
        //and this is done for verification so that the boat isn't called the same name.
        
        input = new Scanner(System.in);
        Spaces2();
        System.out.print(" Enter customers full name: ");
        String fullName = input.nextLine();
        input.close();
        
        //--------- THIS IS MY EXTRA (PICNIC) CODE FOR EXTRA MARKS!! ---------------------
        boolean Picnic = false;  // My (else if) Picnic boolean here I have set to (false)
        input = new Scanner(System.in);
        Spaces2();
        System.out.println(" Would they like a picnic?  True = Yes & False = No. ");
        System.out.print(" Type in: y, yes, true or n, no, false: ");
        String YesNoTF = input.next();
        input.close();
        if (((YesNoTF.equalsIgnoreCase("y")) || YesNoTF.equalsIgnoreCase("yes") || YesNoTF.equalsIgnoreCase("true")))
        {
           Picnic = true;  // My (else if) Picnic boolean here I have set to (true)
        }
        else if (YesNoTF.equalsIgnoreCase("n") || YesNoTF.equalsIgnoreCase("no") || YesNoTF.equalsIgnoreCase("false"))
        {
            Picnic = false;  // My (else if) Picnic boolean here I have set to (false)
        }
        
        // Number of people!
        input = new Scanner(System.in); //open scanner called scanner to input the amount of people.
        Spaces2();
        System.out.print(" Enter the number of people for this boat: ");
        int numOfPeople = input.nextInt(); // store the long data type in the name numOfPeople here.
        input.close();  // close the scanner here. 
        
        // Here I have used the Efficiency rule: The more complex condition needn't be evaluated if the first
        // condition is true. 
        try
        {
            if (boatOb.getCapacity() >= numOfPeople)
            {
                // If the number of people are <= boat's capacity, then this is ok & 
                // it will skip to after the else.
            }
            else //number of people is higher than the boat capacity. 
            {
                do{
                    Spaces2(); // x2 blank spaces.
                    // number of people:
                    input = new Scanner(System.in); //opens scanner here.
                    System.out.print(" Please enter a lower number within the boat capacity: ");
                    numOfPeople = input.nextInt(); //whatever is imputted next will be stored in the variable numOfPeople.
                    input.close(); //closes scanner here.
                }while (boatOb.getCapacity() < numOfPeople); //keeps doing this while the boats capacity is less than the number of people. 
            }
        }
        catch (Exception e)
        { 
            System.out.print(" Please enter a lower number within the boat capacity: ");
        }
               
        input = new Scanner(System.in); //open the scanner here.
        System.out.print(" What collection date would you like? ");
        Date cd = this.storeDate();  // store the date here.
        input.close();  // close the scanner here. 
        
        input = new Scanner(System.in); //open the scanner here.
        System.out.print(" What return date would you like? ");
        Date rd = this.storeDate();
        input.close();
        
        long numOfDays = this.getDaysBetween(cd, rd);
        //-------------------------------------------------
        double totalCost = ((boatOb.costperday*numOfDays)+((boatOb.costperperson*numOfPeople)*(numOfDays)));
        System.out.println(" Collection date: "+cd);
        System.out.println(" Return date: "+rd);
        System.out.println(" True = Yes & False = No. Picnic: "+Picnic);
        System.out.println(" The total cost is: £"+totalCost);
        
        // below is the info saved in my booking array:
        bookingArr.add(new Booking(refBooking, BoatName, fullName, cd, rd, numOfPeople, totalCost, Picnic, boatOb)); 
      }
      catch (Exception e)
      { 
            System.out.println(" Error in: Add Booking. "); //this stops the programme crashing.
      }
    }
    
    public long getDaysBetween(Date cd, Date rd) //this works out how many days the booking is for.
    {
         long numOfDays= ((rd.getTime() - cd.getTime()) / (1000*60*60*24));
         System.out.println(" |--------------------------------|");
         System.out.println(" | The booking is for " + numOfDays+" days.");
         System.out.println(" |--------------------------------|");
         return numOfDays;
    }
    
    public void saveBookings() //this saves the bookings. 
    {
        try
        {
            Booking tempBooking;
            BufferedWriter p = new BufferedWriter(new FileWriter("booking.txt"));
            for(int i=0; i<bookingArr.size(); i++) {
                tempBooking = bookingArr.get(i);
                p.write (tempBooking.getRefBooking()+","+tempBooking.getBoatName()+","+  
                tempBooking.getfullNameBooking()+","+tempBooking.getcd()+","+tempBooking.getrd()+","+
                tempBooking.getNumOfPeople()+","+tempBooking.getTotalCost()+","+tempBooking.getPicnic());
                p.newLine();
                menuBoatPic(); //My nice boat pic menu is run here.
                Spaces2(); //My x2 blank spaces menu is run here.
                System.out.println();
                System.out.println(" |********Booking*********|"); //my booking details confirmation alert. 
                System.out.println(" |------------------------|");
                System.out.println(" | Booking details saved! |");
                System.out.println(" |------------------------|");
                System.out.println(" |************************|");
                System.out.println();
                
            }
            p.close();
        }
        catch (Exception e)
        {
            System.err.println (" Error in Save Bookings, ie: writing to file. ");
        }
    }
    
    public void uploadBookings() // My reader to upload to the Array List.
    {
        int tempRefBooking;
        String tempBoatName;
        String tempfullNameBooking;
        Date tempcd;
        Date temprd;
        int tempNumOfPeople;
        double tempTotalCost;
        boolean tempPicnic;
        boat boatOb = null;
        try {
            BufferedReader fromFile = new BufferedReader(new FileReader("booking.txt"));
            String line = fromFile.readLine();
            while (line != null) {
                String[] tokens = line.split(",");
                tempRefBooking = Integer.parseInt(tokens[0]);
                tempBoatName = tokens[1]; 
                boatOb = checkBoat(tempBoatName);
                tempfullNameBooking = tokens[2];
                SimpleDateFormat parserSDF = new SimpleDateFormat("EEE MMM dd HH:mm:ss ZZZ yyyy");
                tempcd = parserSDF.parse(tokens[3]);
                temprd = parserSDF.parse(tokens[4]);
                tempNumOfPeople = Integer.parseInt(tokens[5]);
                tempTotalCost = Double.parseDouble(tokens[6]);
                tempPicnic = Boolean.parseBoolean(tokens[7]);
                
                bookingArr.add(new Booking(tempRefBooking, tempBoatName, tempfullNameBooking, tempcd, temprd,
                tempNumOfPeople, tempTotalCost, tempPicnic, boatOb));
                line = fromFile.readLine();
            }
            fromFile.close();
        }
        catch (Exception e){
            System.err.println("Error in Upload Bookings, ie: file input error. ");
        }
    }
    
    public boat checkBoat(String tempBoatName) //this checks the name of the boat for confirmation that your not
    //trying to book another boat with the same name.
    { 
        boat boatOb = null; // in the boat object called boat and while the boat object does not have the same name as the entered one, it will keep counting throught it until it find a match. 
        for(int i=0; i<boatArr.size(); i++) //for loop does the i=0 where the computer counts from zero while i= less than the length of the boat array.
        {
            boat tempBoat = boatArr.get(i); //this gets the tempboat file from the boat array.
            if(tempBoatName.equals(tempBoat.getBoatName())) //if the name equals the same as the temp boat file name in the get boat name method then the 
            {
                boatOb = tempBoat;  // temp boat name is in the boat object.
            }
        }  // This code checks the name of the boats in the array to  
           // stop you booking the same boat.
        return boatOb; //this returns the boat object. 
    }
}
