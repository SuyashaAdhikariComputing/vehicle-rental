/**
 * This is the child class Electric_scooter. The attributes of the class are range, battery_capacity, price, charging_time, brand, mileage,
 * has_purchased and has_sold. A constructor which accepts vehicle_name, vehicle_id, vehicle_weight,vehicle_color, vehicle_speed and 
 * battery_capacity as parameter is made. Each attributes has an accessor method. The attribute brand also has a mutator method which change
 * the brand name if the vehicle is not purchased yet. A purchase method which accepts brand, price, charging_time, range and mileage as 
 * parameter is made. It checks if the vehicle is already purchased and if not purchased it assign the value of parameter to instance 
 * variable, calls the set method of brand and change the status of has_purchased to true. A method sell is made which accepts price as 
 * parameter. It checks if the vehicle is already sold and if not sold it initialize the value of charging_time and mileage to null and
 * battery_capacity and range to zero,assign the value of parameter to the instance variable price and also change the status of 
 * has_purchased to false and has_sold to true. A display method is created to display the output,it display engine_displacement,torque, fuel_tank_capacity, ground_clearance,
 * booked_date of the vehicle and charged_amount and number_of_seat is displayed if only it has some value in case there is no 
 * value it print that it is empty.
 * 
 * @authur Suyasha Adhikari
 * @date 2022-5-14
 */
public class Electric_scooter extends Vehicle //child class
{
    //attributes of Electric_scooter
    private int range;
    private int battery_capacity;
    private int price;
    private String charging_time;
    private String brand;
    private String mileage;
    private boolean has_purchased;
    private boolean has_sold;
    
    /*constructor for the ElectricScooter is made
      the constructor accepts vehicle id,vehicle name,vehicle weight,vehicle speed,vehicle color,battery capacity as parameter
      constructor od super class is also called
      the setSpeed method of super class is also called
     */
    public Electric_scooter(int vehicle_id,String vehicle_name,String vehicle_weight,String vehicle_speed,String vehicle_color,
    int battery_capacity)
    {
        super(vehicle_name,vehicle_weight,vehicle_color,vehicle_id);
        setSpeed(vehicle_speed);
        setColor(vehicle_color);
        this.battery_capacity=battery_capacity;
        this.range=0;
        this.price=0;
        this.brand="";
        this.mileage="";
        this.charging_time="";
        this.has_purchased=false;
        this.has_sold=false;
    }
    
    /*the getter method or accessor method for every attributes is created
      getter method is created when the variables are made private so that other class can access the data
     */
    public int getRange()//accessor method of range
    {
        return this.range;
    }
    
    public int getBattery_capacity()//accessor method of battery capacity
    {
        return this.battery_capacity;
    }
    
    public int getPrice()//accessor method of price
    {
        return this.price;
    }
    
    public String getCharging_time()//accessor method of charging time 
    {
        return this.charging_time;
    }
    
    public String getBrand()//accessor method of brand
    {
        return this.brand;
    }
    
    public String getMileage()//accessor method of mileage
    {
        return this.mileage;
    }
    
    public boolean getHas_purchased()//accessor method of has purchased
    {
        return this.has_purchased;
    }
    
    public boolean getHas_sold()//accessor method of has sold
    {
        return this.has_sold;
    }
    
    /*This is the setter method of brand
      it checks if vehicle is purchased 
      if vehicle is not purchased brand name is changed 
     */
    public void setBrand(String brand){
        if(this.has_purchased==false)
        {
            this.brand=brand;
        }
        else
        {
           System.out.println("the scooter is already purchased so brand name cant be changed"); 
        }
    }
    
    /* The purchase accepts brand,price charging time,mielage and range as parameter
       It checkes weather the vehicle is purchased
       inside the method setBrand method is also called
     */
    public void purchase(String brand,int price,String charging_time,String mileage,int range)
    {
        if(this.has_purchased==false)
        {
            setBrand(brand);
            this.price=price;
            this.charging_time=charging_time;
            this.range=range;
            this.mileage=mileage;
            this.has_purchased=true;
        }
    }
    
    /* the sell method take price as the parameter
       It checks weather the vehicle is sold or not using if else condition and give suitable feedback 
    */
    public void sell(int price)
    {
        if(has_sold==false)
        {
            this.price=price;
            this.charging_time="";
            this.mileage="";
            this.battery_capacity=0;
            this.range=0;
            this.has_sold=true;
            this.has_purchased=false;
        }
        
        else
        {
            System.out.println("the scooter is already sold");// print only when Has_sold is true
        }
    }
    
    /*This is the method to display the output
      super class display method is also called in the method
      it display brand,battery capacity,mileage,range,charging time,vehicle name,
      vehicle color,vehicle speed,vechicle id and vehicle weight
     */
    public void display()
    {
        super.display();//calling display method of super class
        if(this.has_purchased==true)
        {
           System.out.println("the scooter brand is: " +this.brand);
           System.out.println("the battery capacity of scooter is: "+this.battery_capacity);
           System.out.println("the mileage of scooter is: "+this.mileage);
           System.out.println("the range of scooter is: "+this.range);
           System.out.println("the charge time of scooter is: "+this.charging_time);
        }
    }
}
