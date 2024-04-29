/**
 * This is the parent class vehicle. The attributes of the class are vehicle_id, vehicle_name, vehicle_weight, vehicle_color and 
 * vehicle_speed. A constructor which accepts vehicle_name, vehicle_id, vehicle_weight,vehicle_color as parameter is made. Each attributes 
 * has an accessor method. The attributes vehicle_color and vehicle_speed has mutator method also. A display method is created to display 
 * the output. It displays name, color, speed, id of the vehicle and weight is displayed if only it has some value in case there is no 
 * value it prints that the weight is empty
 * 
 * @authur Suyasha Adhikari
 * @date 2022-5-14
 */
public class Vehicle //parent class
{
    //attributes of vehicle class
    private String vehicle_name;
    private String vehicle_weight;
    private String vehicle_color;
    private String vehicle_speed;
    private int vehicle_id;
    
    /* creating paramaterized constructor of vehicle class
       the parameter accepts Vehicle name,vehicle weight,vehicle color and vehicle id as parameter
     */
    
    public Vehicle(String vehicle_name,String vehicle_weight,String vehicle_color,int vehicle_id)
    {
        this.vehicle_name=vehicle_name;
        this.vehicle_weight=vehicle_weight;
        this.vehicle_color=vehicle_color;
        this.vehicle_id=vehicle_id;
    }
    
    /*the getter method or accessor method for every attributes is created
      getter method is created when the variables are made private so that other class can access the data
     */

    public String getName()//accessor method of vehicle name
    {
        return this.vehicle_name;
    }
    
    public String getWeight()//accessor method of vehicle weight
    {
        return this.vehicle_weight;
    }
    
    public String getColor()//accessor method of vehicle color
    {
        return this.vehicle_color;
    }
    
    public String getSpeed()//accessor method of vehicle speed
    {
        return this.vehicle_speed;
    }
    
    public int getId()//accessor method of vehicle id
    {
        return this.vehicle_id;
    }
    
    //a method to set speed is defined it has vehicle speed as a parameter
    public void setSpeed(String vehicle_speed)
    {
        this.vehicle_speed=vehicle_speed; //assigning value to instance variable
    }
    
    //a method to set color is defined it has vehicle speed ass a parameter
    public void setColor(String vehicle_color)
    {
        this.vehicle_color=vehicle_color;//assigning value to instance variable
    }
    
    public void display()//method to display the output
    {
        System.out.println("the name of vehicle is:" +this.vehicle_name);//prints the name of vehicle
        System.out.println("the color of vehicle is:" +this.vehicle_color);// prints the color of vehicle
        System.out.println("the id of vehicle is:" +this.vehicle_id);// prints the id of vehicle
        System.out.println("the speed of vehicle is:" +this.vehicle_speed);// prints the speed of vehicle
        
        /* using if else conditon 
          to check wheather the weight is empty or not
         */
        if(this.vehicle_weight=="")
        {
            System.out.println("the value of weight is unkown (empty)");//prints only if the weight is empty
        }
        else 
        {
            System.out.println("the weight of the vehicle is:"+this.vehicle_weight);//only prints when weight is not empty
        }
    }
}
