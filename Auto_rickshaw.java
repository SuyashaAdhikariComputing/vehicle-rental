/**
 * This is the child class Auto_rickshaw. The attributes of the class are engine_displacement,torque, number_of_seat,
 * fuel_tank_capacity, ground_clearance, charged_amount, booked_date and is_booked. A constructor which accepts vehicle_name, 
 * vehicle_id, vehicle_weight,vehicle_color, vehicle_speed, engine_displacement,torque,fuel_tank_capacity and ground_clearance
 * as parameter is made. Each attributes has an accessor method. the attributes charged_amount and number_of_seat also has a mutator method.
 * A book method which accepts booked_date, charged_amount and number_of_seat as parameter is made. It checks if the vehicle is already 
 * booked. A display method is created to display the output,it display engine_displacement,torque, fuel_tank_capacity, ground_clearance,
 * booked_date of the vehicle and charged_amount and number_of_seat is displayed if only it has some value in case there is no 
 * value it print that it is empty.
 * 
 * @authur Suyasha Adhikari
 * @date 2022-5-14
 */
public class Auto_rickshaw extends Vehicle//child class
{
    //attributes of Auto_rickshaw
    private int engine_displacement;
    private String torque;
    private int number_of_seat;
    private int fuel_tank_capacity;
    private String ground_clearance;
    private int charged_amount;
    private String booked_date;
    private boolean is_booked;
    
    /*creating the constructor of the AutoRickShaw class. 
      it accepts 9 parameters id, name, weight,color, speed, 
      EngineDisplacement,Torque,FuelTankCapacity and GroundClearance
      Inside the constructor super class conductor and setspeed method is also called
    */
    public Auto_rickshaw(int vehicle_id,String vehicle_name,String vehicle_weight,String vehicle_color,String vehicle_speed,
    int engine_displacement,String torque,int fuel_tank_capacity,String ground_clearance)
    {
        super(vehicle_name,vehicle_weight,vehicle_color,vehicle_id);//calling super class conductor
        setSpeed(vehicle_speed);//calling super class setSpeed method
        setColor(vehicle_color);//calling super class setColor method
        this.engine_displacement=engine_displacement;
        this.torque=torque;
        this.fuel_tank_capacity=fuel_tank_capacity;
        this.ground_clearance=ground_clearance;
        this.is_booked=false;
    }
    
    /*the getter method or accessor method for every attributes is created
      the getter method is created when the variables are made private this help
      other class to access the data of this class
    */
    public int getEngine_displacement()//accessor method of EngineDisplacement
    {
        return this.engine_displacement;
    }
    
    public String getTorque()//accessor method of Torque
    {
        return this.torque;
    }
    
    public int getNumber_of_seat()//accessor method of Numberofseat
    {
        return this.number_of_seat;
    }
    
    public int getFuel_capacity()//accessor method of FuelTankCapacity
    {
        return this.fuel_tank_capacity;
    }
    
    public String getGround_clearance()//accessor method of GroundClearance
    {
        return this.ground_clearance;
    }
    
    public int getAmount()//accessor method of Amount
    {
        return this.charged_amount;
    }
    
    public String getBooked_date()//accessor method of BookedDate
    {
        return this.booked_date;
    }
    
    public boolean getIs_booked()//accesor method of isBooked
    {
        return this.is_booked;
    }
    
    public void setAmount(int charged_amount)//a method to set Amount is defined it has Amount as parameter
    {
        this.charged_amount=charged_amount;
    }
    
    public void setNumberofseat(int number_of_seat)//a method to set Numberofseat is defined it has Numberofseat as parameter
    {
        this.number_of_seat=number_of_seat;
    }
    
     /*a booked method is defined that has BookedDate as parameter.
      * This method use if else condition to determine weather the vehicle is booked or not 
      * if not booked it books the vehicle and if already booked it displays the vehicle is already booked
     */
    public void book(String booked_date,int charged_amount,int number_of_seat)
    {
        //print only if isBooked is false
        if(this.is_booked==false) {
            this.booked_date=booked_date;
            setAmount(charged_amount);
            setNumberofseat(number_of_seat);
            this.is_booked=true;
            System.out.println("This vehicle with id "+getId()+" is booked in "+this.booked_date);
        }
        //print only if isBooked is true
        else{
            System.out.println("this vehicle is already booked"); 
        }
    }
    
    public void display()//a method to display the output 
    {
       super.display();//calling super class display method
       
       if(this.is_booked==true) {
           System.out.println("the engine displacement is " +this.engine_displacement);//print Enginedisplacement
           System.out.println("the torque of the vehicle is " +this.torque);//print Torque
           System.out.println("the fuel tank capacity of the vehicle is " +this.fuel_tank_capacity);//print Fuel tank capacity
           System.out.println("the ground clearance of the vehicle is " +this.ground_clearance);//print Ground clearance
           System.out.println("the booked date of the vehicle is " +this.booked_date);//print booked date
       }
       
       if(this.charged_amount==0) {
          System.out.println("The charged amount is unknown (Empty)"); //print only if amount is 0
       }
       
       else{
           System.out.println("the charged amount is: "+this.charged_amount);//print only when amount has some value
       }
       
       if(this.number_of_seat==0) {
           System.out.println("the number of seat is unknown (Empty) ");//print only when Numberofseat is 0
       }
       
       else {
           //print only when Numberofseat has some value
           System.out.println("the number of seat of vehicle is "+this.number_of_seat);
       }
    }
}
