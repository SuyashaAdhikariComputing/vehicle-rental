/** This class transport gui has the gui for conducting the book, add, sell, buy, and display function for the vehicle. It consist of
  * total of seven method i.e. choose, Autorickshaw, Electricscooter,main method and instance method actionPerformed,mouseExited and 
  * mouseEntered. actionperformed is an instance method present inside ActionListener which takes ActionEvent ee as parameter while 
  * mouseExited and mouseEntered are the instance method present inside MouseAdaptor.They take MouseEvent e as parameter.Different 
  * functionality of button are added with the help of actionPerformed and the hover effect of the button is added with the help of
  * mouseExited and mouseEntered. Inside the main method the object of the class TransportGUI is made and choose method is called.
  * 
  *@authur Suyasha Adhikari
  *@date 2022-8-02
  */


//importing packages
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

//creting class
public class TransportGUI extends MouseAdapter implements ActionListener{
    //initializing 
    
    private JFrame first;
    private JFrame second;
    private JFrame third;
    
    private JLabel title;
    private JLabel title1;
    private JLabel title2;
    private JLabel title3;
    private JLabel title4;
    private JLabel title5;
    private JLabel title6;
    private JLabel title7;
    private JLabel title8;
    
    private JLabel v_id;
    private JLabel v_name;
    private JLabel v_speed;
    private JLabel v_color;
    private JLabel v_ed;
    private JLabel v_tor;
    private JLabel v_weight;
    private JLabel v_ground;
    private JLabel v_tank;
    private JLabel v_id2;
    private JLabel v_seat;
    private JLabel v_amount;
    private JLabel v_date;
    
    private JLabel v_id3;
    private JLabel v_name1;
    private JLabel v_weight1;
    private JLabel v_color1;
    private JLabel v_speed1;
    private JLabel v_battery;
    private JLabel v_price;
    private JLabel v_charge;
    private JLabel v_brand;
    private JLabel v_id4;
    private JLabel v_mile;
    private JLabel v_range;
    
    
    private JTextField id_text;
    private JTextField name_text;
    private JTextField weight_text;
    private JTextField color_text;
    private JTextField speed_text;
    private JTextField ed_text;
    private JTextField tor_text;
    private JTextField tank_text;
    private JTextField ground_text;
    private JTextField id1_text;
    private JTextField amount_text;
    private JTextField seat_text;
    
    private JTextField id3_text;
    private JTextField name1_text;
    private JTextField weight1_text;
    private JTextField color1_text;
    private JTextField speed1_text;
    private JTextField battery_text;
    private JTextField id4_text;
    private JTextField brand_text;
    private JTextField price_text;
    private JTextField charge_text;
    private JTextField mile_text;
    private JTextField range_text;
    
    private JComboBox year;
    private JComboBox month;
    private JComboBox day;
    
    private JPanel one;
    private JPanel two;
    private JPanel three;
    private JPanel four;
    private JPanel five;
    
    
    private JButton open_auto;
    private JButton open_scooter;
    private JButton add_auto;
    private JButton clear_auto;
    private JButton change_scooter;
    private JButton book_auto;
    private JButton book_clear;
    private JButton display_auto;
    private JButton exit_auto;
    private JButton add_scooter;
    private JButton change_auto;
    private JButton display_scooter;
    private JButton clear_scooter;
    private JButton sell_scooter;
    private JButton purchase_scooter;
    private JButton clear_sell;
    private JButton exit_scooter;
    
    private Font ff;
    private Font ff2;
    private Font ff3;
    private Font ff4;
    private Font ff5;
    private Font ff6;
    
    
    ArrayList <Vehicle> arr= new <Vehicle> ArrayList();
    
    /*this is the method for the main gui where we can choose between autorickshaw and electric scooter.This method consists of frame 
       named first.The panal lable and two buttons are added in the frame. The panel is named as one and button as button1 and button2 */
    public void choose() 
    {
        
        //creating the jframe named first for the user to choose the autorickshaw or electric scooter
        first=new JFrame();
        first.setBounds(300,200,700,350);
        
        //creating the oj of font which is later applied in the gui
        ff=new Font("Times New Roman",Font.BOLD,30);
        ff2=new Font("Aries", Font.PLAIN, 22);
        
        //creating a panel named one for the gui
        one =new JPanel();
        one.setLayout(null);
        one.setBackground(new Color(212,212,212));// setting the background color for the panel
        first.add(one);
        
        //creating the lable for the title of the gui and adding in the panal after seting bounds anf font
        title=new JLabel("Select the vehicle type");
        title.setBounds(200,60,400,55);
        title.setFont(ff);
        one.add(title);
        
        //creating the button for choosing between autorickshaw and electric scooter and adding in the panel after setting bounds
        open_auto=new JButton("Auto RickShaw");
        open_auto.setBounds(100,180,230,55);
        open_auto.setBackground(new Color(255,255,255));
        open_auto.setFont(ff2);
        open_auto.addMouseListener(this);
        open_auto.addActionListener(this);
        one.add(open_auto);
        
        open_scooter=new JButton("Electric Scooter");
        open_scooter.setBounds(400,180,230,55);
        open_scooter.setBackground(new Color(255,255,255));
        open_scooter.setFont(ff2);
        open_scooter.addMouseListener(this);
        open_scooter.addActionListener(this);
        one.add(open_scooter);
        first.setVisible(true);
        
    }
    
     /*this is the method for the autorickshaw gui which has many fields like .This method consists of frame 
       named second.The panal lable and buttons are added in the frame. The panel is named as two and button as  */
    public void AutoRickshaw(){
        
        
        //creating the jframe named second where various lables, text fields and buttons are added 
        second=new JFrame("Auto RickShaw");
        second.setBounds(40,20,1200,720);
        second.setLayout(null);
        
        //creating font
        ff3=new Font("Aries", Font.PLAIN, 22);
        ff4=new Font("sanseriff",Font.PLAIN,30);
        
        //creating panel
        two= new JPanel();
        two.setBounds(40,100,520,550);
        two.setBackground(new Color(251,255,208));
        two.setLayout(null);
        second.add(two);
        
        //creating title
        title3=new JLabel("AUTO RICKSHAW");
        title3.setFont(ff4);
        title3.setBounds(480,20,400,35);
        second.add(title3);
        
        //creating title
        title2 =new JLabel("Add Auto RickShaw");
        title2.setBounds(120,20,300,35);
        title2.setFont(ff4);
        two.add(title2);
        
        //creating JLabel
        v_id=new JLabel("Vehicle ID:");
        v_id.setBounds(30,100,200,35);
        v_id.setFont(ff3);
        two.add(v_id);
        
        //creating textfield
        id_text=new JTextField();
        id_text.setBounds(300,100,200,35);
        two.add(id_text);
        
        //creating JLabel
        v_name=new JLabel("Vehicle Name:");
        v_name.setBounds(30,140,200,35);
        v_name.setFont(ff3);
        two.add(v_name);
        
        //creating textfield
        name_text=new JTextField();
        name_text.setBounds(300,140,200,35);
        two.add(name_text);
        
        //creating JLabel
        v_weight=new JLabel("Vehicle Weight:");
        v_weight.setBounds(30,180,200,35);
        v_weight.setFont(ff3);
        two.add(v_weight);
        
        //creating textfield
        weight_text=new JTextField();
        weight_text.setBounds(300,180,200,35);
        two.add(weight_text);
        
        //creating JLabel
        v_color=new JLabel("Vehicle Color:");
        v_color.setBounds(30,220,200,35);
        v_color.setFont(ff3);
        two.add(v_color);
        
        //creating textfield
        color_text=new JTextField();
        color_text.setBounds(300,220,200,35);
        two.add(color_text);
        
        //creating JLabel
        v_speed=new JLabel("Vehicle Speed:");
        v_speed.setBounds(30,260,200,35);
        v_speed.setFont(ff3);
        two.add(v_speed);
        
        //creating textfield
        speed_text=new JTextField();
        speed_text.setBounds(300,260,200,35);
        two.add(speed_text);
        
        //creating JLabel
        v_ed=new JLabel("Engine Displacement:");
        v_ed.setBounds(30,300,220,35);
        v_ed.setFont(ff3);
        two.add(v_ed);
        
        //creating textfield
        ed_text=new JTextField();
        ed_text.setBounds(300,300,200,35);
        two.add(ed_text);
        
        //creating JLabel
        v_tor=new JLabel("Torque:");
        v_tor.setBounds(30,340,200,35);
        v_tor.setFont(ff3);
        two.add(v_tor);
        
        //creating textfield
        tor_text=new JTextField();
        tor_text.setBounds(300,340,200,35);
        two.add(tor_text);
        
        //creating JLabel
        v_tank=new JLabel("Fuel Tank Capacity:");
        v_tank.setBounds(30,380,200,35);
        v_tank.setFont(ff3);
        two.add(v_tank);
        
        //creating textfield
        tank_text=new JTextField();
        tank_text.setBounds(300,380,200,35);
        two.add(tank_text);
        
        //creating JLabel
        v_ground=new JLabel("Ground Clearance:");
        v_ground.setBounds(30,420,200,35);
        v_ground.setFont(ff3);
        two.add(v_ground);
        
        //creating textfield
        ground_text=new JTextField();
        ground_text.setBounds(300,420,200,35);
        two.add(ground_text);
        
        //creating button
        add_auto=new JButton("Add Auto RickShaw");
        add_auto.setBounds(5,500,250,35);
        add_auto.setFont(ff3);
        add_auto.setBackground(new Color(255,255,255));
        add_auto.addMouseListener(this);
        add_auto.addActionListener(this);
        two.add(add_auto);
        
        //creating button
        clear_auto=new JButton("Clear");
        clear_auto.setBounds(260,500,250,35);
        clear_auto.setFont(ff3);
        clear_auto.setBackground(new Color(255,255,255));
        clear_auto.addActionListener(this);
        clear_auto.addMouseListener(this);
        two.add(clear_auto);
        
        //creating button
        three= new JPanel();
        three.setBounds(620,100,520,550);
        three.setBackground(new Color(252,225,248));
        three.setLayout(null);
        second.add(three);
        
        //creating title
        title4=new JLabel("Book Auto RickShaw");
        title4.setFont(ff4);
        title4.setBounds(120,30,300,35);
        three.add(title4);
        
        //creating label
        v_id2=new JLabel("Vehicle ID:");
        v_id2.setBounds(30,140,200,35);
        v_id2.setFont(ff3);
        three.add(v_id2);
        
        //creating textfield
        id1_text=new JTextField();
        id1_text.setBounds(300,140,200,35);
        three.add(id1_text);
        
        //creating label
        v_date=new JLabel("Booked Date:");
        v_date.setBounds(30,200,200,35);
        v_date.setFont(ff3);
        three.add(v_date);
        
        //array for day
        String [] da={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24",
                     "25","26","27","28","29","30","31","32"};
         
        //combobox for day
        day= new JComboBox(da);
        day.setBounds(240,200,60,35);
        three.add(day);
        
        //array for month
         String[] months={"january","february","march","april","may","june","july","august","september","october","november","december"};
        
         //combo box for months
        month= new JComboBox(months);
        month.setBounds(320,200,90,35);
        three.add(month);
        
        //array for year
        String[]cool={"2014","2015","2016","2017","2018","2019","2020","2021","2022"};
        
        //combobox for year
        year= new JComboBox(cool);
        year.setBounds(440,200,70,35);
        three.add(year);
        
        //creating label
        v_amount=new JLabel("Charge Amount:");
        v_amount.setBounds(30,260,200,35);
        v_amount.setFont(ff3);
        three.add(v_amount);
        
        //creating textfield
        amount_text=new JTextField();
        amount_text.setBounds(300,260,200,35);
        three.add(amount_text);
        
        //creating label
        v_seat=new JLabel("No of Seats:");
        v_seat.setBounds(30,320,260,35);
        v_seat.setFont(ff3);
        three.add(v_seat);
        
        //creating textfield
        seat_text=new JTextField();
        seat_text.setBounds(300,320,200,35);
        three.add(seat_text);
        
        //creating button
        change_scooter=new JButton("Change to Electric Scooter");
        change_scooter.setBounds(10,420,500,35);
        change_scooter.setBackground(new Color(255,255,255));
        change_scooter.addMouseListener(this);
        change_scooter.addActionListener(this);
        change_scooter.setFont(ff3);
        three.add(change_scooter);
        
        //creating button
        book_auto=new JButton("Book");
        book_auto.setBounds(20,480,100,35);
        book_auto.setBackground(new Color(255,255,255));
        book_auto.addMouseListener(this);
        book_auto.addActionListener(this);
        book_auto.setFont(ff3);
        three.add(book_auto);
        
        //creating button
        book_clear=new JButton("Clear");
        book_clear.setBounds(140,480,100,35);
        book_clear.setBackground(new Color(255,255,255));
        book_clear.addActionListener(this);
        book_clear.addMouseListener(this);
        book_clear.setFont(ff3);
        three.add(book_clear);
        
        //creating button
        display_auto=new JButton("Display");
        display_auto.setBounds(260,480,130,35);
        display_auto.setBackground(new Color(255,255,255));
        display_auto.addActionListener(this);
        display_auto.addMouseListener(this);
        display_auto.setFont(ff3);
        three.add(display_auto);
        
        //creating button
        exit_auto=new JButton("Exit");
        exit_auto.setBounds(410,480,100,35);
        exit_auto.setBackground(new Color(255,255,255));
        exit_auto.addActionListener(this);
        exit_auto.addMouseListener(this);
        exit_auto.setFont(ff3);
        three.add(exit_auto);
        
        second.setVisible(true);//setting visible of frame to true
        
        
    }
    
    public void ElectricScooter(){
        
        //creating frame
        third=new JFrame("Electric Scooter");
        third.setBounds(40,0,1200,760);
        third.setLayout(null);
        
        //creating font
        ff5=new Font("Aries", Font.PLAIN, 25);
        ff6=new Font("sanseriff",Font.PLAIN,30);
        
        //creating panel
        four= new JPanel();
        four.setBounds(40,80,520,600);
        four.setBackground(new Color(251,255,208));
        four.setLayout(null);
        third.add(four);
        
        //creating title
        title5=new JLabel("Electric Scooter");
        title5.setFont(ff6);
        title5.setBounds(480,20,400,35);
        third.add(title5);
    
        //creating title
        title6 =new JLabel("Add Electric Scooter");
        title6.setBounds(120,40,300,35);
        title6.setFont(ff6);
        four.add(title6);
        
        //creating label
        v_id3=new JLabel("Vehicle ID:");
        v_id3.setBounds(30,140,200,35);
        v_id3.setFont(ff5);
        four.add(v_id3);
        
        //creating textfield
        id3_text=new JTextField();
        id3_text.setBounds(300,140,200,35);
        four.add(id3_text);
        
        //creating label
        v_name1=new JLabel("Vehicle Name:");
        v_name1.setBounds(30,190,200,35);
        v_name1.setFont(ff5);
        four.add(v_name1);
        
        //creating textfield
        name1_text=new JTextField();
        name1_text.setBounds(300,190,200,35);
        four.add(name1_text);
        
        //creating label
        v_weight1=new JLabel("Vehicle Weight:");
        v_weight1.setBounds(30,240,200,35);
        v_weight1.setFont(ff5);
        four.add(v_weight1);
        
        //creating textfield
        weight1_text=new JTextField();
        weight1_text.setBounds(300,240,200,35);
        four.add(weight1_text);
        
        //creating label
        v_color1=new JLabel("Vehicle Color:");
        v_color1.setBounds(30,290,200,35);
        v_color1.setFont(ff5);
        four.add(v_color1);
        
        //creating textfield
        color1_text=new JTextField();
        color1_text.setBounds(300,290,200,35);
        four.add(color1_text);
        
        //creating label
        v_speed1=new JLabel("Vehicle Speed:");
        v_speed1.setBounds(30,340,200,35);
        v_speed1.setFont(ff5);
        four.add(v_speed1);
        
        //creating textfield
        speed1_text=new JTextField();
        speed1_text.setBounds(300,340,200,35);
        four.add(speed1_text);
        
        //creating label
        v_battery=new JLabel("Battery Capacity:");
        v_battery.setBounds(30,390,220,35);
        v_battery.setFont(ff5);
        four.add(v_battery);
        
        //creating textfield
        battery_text=new JTextField();
        battery_text.setBounds(300,390,200,35);
        four.add(battery_text);
        
        //creating button
        change_auto=new JButton("change to Auto RickShaw");
        change_auto.setBounds(10,470,500,45);
        change_auto.setFont(ff5);
        change_auto.setBackground(new Color(255,255,255));
        change_auto.addMouseListener(this);
        change_auto.addActionListener(this);
        four.add(change_auto);
        
        //creating button
        add_scooter=new JButton("Add");
        add_scooter.setBounds(10,540,150,35);
        add_scooter.setBackground(new Color(255,255,255));
        add_scooter.addMouseListener(this);
        add_scooter.addActionListener(this);
        add_scooter.setFont(ff5);
        four.add(add_scooter);
        
        //creating button
        clear_scooter=new JButton("Clear");
        clear_scooter.setBounds(180,540,150,35);
        clear_scooter.setFont(ff5);
        clear_scooter.setBackground(new Color(255,255,255));
        clear_scooter.addActionListener(this);
        clear_scooter.addMouseListener(this);
        four.add(clear_scooter);
        
        //creating button
        exit_scooter=new JButton("Exit");
        exit_scooter.setBounds(350,540,150,35);
        exit_scooter.setFont(ff5);
        exit_scooter.setBackground(new Color(255,255,255));
        exit_scooter.addActionListener(this);
        exit_scooter.addMouseListener(this);
        four.add(exit_scooter);
        
        //creating panel
        five= new JPanel();
        five.setBounds(620,80,520,600);
        five.setBackground(new Color(252,225,248));
        five.setLayout(null);
        third.add(five);
        
        //creating title
        title7=new JLabel("Purchase or Sell Electric Scooter");
        title7.setFont(ff6);
        title7.setBounds(40,40,500,35);
        five.add(title7);
        
        //creating title
        title8=new JLabel("(To sell you must enter vehicle id and price)");
        title8.setBounds(120,80,500,30);
        five.add(title8);
        
        //creating button
        v_id4=new JLabel("Vehicle ID:");
        v_id4.setBounds(30,140,200,35);
        v_id4.setFont(ff5);
        five.add(v_id4);
        
        //creating textfield
        id4_text=new JTextField();
        id4_text.setBounds(280,140,200,35);
        five.add(id4_text);
        
        //creating button
        v_brand=new JLabel("Brand:");
        v_brand.setBounds(30,190,150,35);
        v_brand.setFont(ff5);
        five.add(v_brand);
        
        //creating textfield
        brand_text=new JTextField();
        brand_text.setBounds(280,190,200,35);
        five.add(brand_text);
        
        //creating button
        v_price=new JLabel("Price:");
        v_price.setBounds(30,240,200,35);
        v_price.setFont(ff5);
        five.add(v_price);
        
        //creating textfield
        price_text=new JTextField();
        price_text.setBounds(280,240,200,35);
        five.add(price_text);
        
        //creating button
        v_charge=new JLabel("Charging time:");
        v_charge.setBounds(30,290,260,35);
        v_charge.setFont(ff5);
        five.add(v_charge);
        
        //creating textfield
        charge_text=new JTextField();
        charge_text.setBounds(280,290,200,35);
        five.add(charge_text);
        
        //creating button
        v_mile=new JLabel("Mileage:");
        v_mile.setBounds(30,340,300,35);
        v_mile.setFont(ff5);
        five.add(v_mile);
        
        //creating textfield
        mile_text=new JTextField();
        mile_text.setBounds(280,340,200,35);
        five.add(mile_text);
        
        //creating button
        v_range=new JLabel("Range:");
        v_range.setBounds(30,390,260,35);
        v_range.setFont(ff5);
        five.add(v_range);
        
        //creating textfield
        range_text=new JTextField();
        range_text.setBounds(280,390,200,35);
        five.add(range_text);
        
        //creating purchase_scooter button
        purchase_scooter=new JButton("Purchase");
        purchase_scooter.setBounds(20,460,150,35);
        purchase_scooter.setFont(ff5);
        purchase_scooter.setBackground(new Color(255,255,255));
        purchase_scooter.addMouseListener(this);
        purchase_scooter.addActionListener(this);
        five.add(purchase_scooter);

        //creating sell_scooter button
        sell_scooter=new JButton("Sell");
        sell_scooter.setBounds(190,460,150,35);
        sell_scooter.setFont(ff5);
        sell_scooter.setBackground(new Color(255,255,255));
        sell_scooter.addMouseListener(this);
        sell_scooter.addActionListener(this);
        five.add(sell_scooter);
        
        //creating display_scooter button
        display_scooter=new JButton("Display");
        display_scooter.setBounds(350,460,150,35);
        display_scooter.setFont(ff5);
        display_scooter.setBackground(new Color(255,255,255));
        display_scooter.addActionListener(this);
        display_scooter.addMouseListener(this);
        five.add(display_scooter);
        
        //creating clear button
        clear_sell=new JButton("Clear");
        clear_sell.setBounds(140,520,250,35);
        clear_sell.setFont(ff5);
        clear_sell.setBackground(new Color(255,255,255));
        clear_sell.addActionListener(this);
        clear_sell.addMouseListener(this);
        five.add(clear_sell);
        
        
        third.setVisible(true);//setting visible of frame
        
    }
    
    /* This is the method with name mouseEntered it takes MouseEvent e as as a parameter. This method is used to add the hover effect. After 
       using this method and adding it to the button the button change its color to red when hovered. This effect is added to all the buttons
       in the gui*/
    public void mouseEntered(MouseEvent e){
        if(e.getSource()==open_auto)//this is for the autorickshaw button
        {
             open_auto.setBackground(new Color(185,30,40));
             open_auto.setForeground(Color.WHITE);
        }
        if(e.getSource()==open_scooter)//this is for the button electric scooter
        {
            open_scooter.setBackground(new Color(185,30,40));
            open_scooter.setForeground(Color.WHITE);
        }
        if(e.getSource()==add_auto)//this is for the add autorickshaw button
        {
            add_auto.setBackground(new Color(185,30,40));
            add_auto.setForeground(Color.WHITE);
        }
        if(e.getSource()==clear_auto)//this is for the clear button
        {
            clear_auto.setBackground(new Color(185,30,40));
            clear_auto.setForeground(Color.WHITE);
        }
        if(e.getSource()==change_scooter)//this is for the switch to electric scooter button button
        {
            change_scooter.setBackground(new Color(185,30,40));
            change_scooter.setForeground(Color.WHITE);
        }
        if(e.getSource()==book_auto)//this is for the book button
        {
            book_auto.setBackground(new Color(185,30,40));
            book_auto.setForeground(Color.WHITE);
        }
        if(e.getSource()==book_clear)//this is for the clear button
        {
            book_clear.setBackground(new Color(185,30,40));
            book_clear.setForeground(Color.WHITE);
        }
        if(e.getSource()==display_auto)//this is for the exit button
        {
            display_auto.setBackground(new Color(185,30,40));
            display_auto.setForeground(Color.WHITE);
        }
        if(e.getSource()==exit_auto)//this is for the exit button
        {
            exit_auto.setBackground(new Color(185,30,40));
            exit_auto.setForeground(Color.WHITE);
        }
        if(e.getSource()==add_scooter)//this is for the switch to Autorickshaw button
        {
            add_scooter.setBackground(new Color(185,30,40));
            add_scooter.setForeground(Color.WHITE);
        }
        if(e.getSource()==change_auto)//this is for the add button
        {
            change_auto.setBackground(new Color(185,30,40));
            change_auto.setForeground(Color.WHITE);
        }
        if(e.getSource()==display_scooter)//this is for the clear button
        {
            display_scooter.setBackground(new Color(185,30,40));
            display_scooter.setForeground(Color.WHITE);
        }
        if(e.getSource()==clear_scooter)//this is for the purchase button
        {
            clear_scooter.setBackground(new Color(185,30,40));
            clear_scooter.setForeground(Color.WHITE);
        }
        if(e.getSource()==sell_scooter)//this is for the purchase button
        {
            sell_scooter.setBackground(new Color(185,30,40));
            sell_scooter.setForeground(Color.WHITE);
        }
        if(e.getSource()==purchase_scooter)//this is for the purchase button
        {
            purchase_scooter.setBackground(new Color(185,30,40));
            purchase_scooter.setForeground(Color.WHITE);
        }
        if(e.getSource()==clear_sell)//this is for the purchase button
        {
            clear_sell.setBackground(new Color(185,30,40));
            clear_sell.setForeground(Color.WHITE);
        }
        if(e.getSource()==exit_scooter)//this is for the purchase button
        {
            exit_scooter.setBackground(new Color(185,30,40));
            exit_scooter.setForeground(Color.WHITE);
        }
    }
    
     /* This is the method with name mouseexited it takes MouseEvent e as as a parameter. This method is used to add the hover effect. After 
       using this method and adding it to the button the button change to original form after stopping to hover. This effect is added to all
       the buttons in the gui*/
    public void mouseExited(MouseEvent e) {  
        if(e.getSource()==open_auto)//this is for the autorickshaw button
        {
            open_auto.setBackground(new Color(255,255,255));
            open_auto.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==open_scooter)//this is for the electric scooter button
        {
            open_scooter.setBackground(new Color(255,255,255));
            open_scooter.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==add_auto)//this is for the add button
        {
            add_auto.setBackground(new Color(255,255,255));
            add_auto.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==clear_auto)//this is for the clear button
        {
            clear_auto.setBackground(new Color(255,255,255));
            clear_auto.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==change_scooter)//this is for the switch to electric scooter button
        {
            change_scooter.setBackground(new Color(255,255,255));
            change_scooter.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==book_auto)//this is for the book button
        {
            book_auto.setBackground(new Color(255,255,255));
            book_auto.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==book_clear)//this is for the clear button
        {
            book_clear.setBackground(new Color(255,255,255));
            book_clear.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==display_auto)//this is for the exit button
        {
            display_auto.setBackground(new Color(255,255,255));
            display_auto.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==exit_auto)//this is for the exit button
        {
            exit_auto.setBackground(new Color(255,255,255));
            exit_auto.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==add_scooter)//this is for the switch to autorickshaw button
        {
            add_scooter.setBackground(new Color(255,255,255));
            add_scooter.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==change_auto)//this is for the add button
        {
            change_auto.setBackground(new Color(255,255,255));
            change_auto.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==display_scooter)//this is for the clear button
        {
            display_scooter.setBackground(new Color(255,255,255));
            display_scooter.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==clear_scooter)//this is for the purchase button
        {
            clear_scooter.setBackground(new Color(255,255,255));
            clear_scooter.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==sell_scooter)//this is for the purchase button
        {
            sell_scooter.setBackground(new Color(255,255,255));
            sell_scooter.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==purchase_scooter)//this is for the purchase button
        {
            purchase_scooter.setBackground(new Color(255,255,255));
            purchase_scooter.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==clear_sell)//this is for the purchase button
        {
            clear_sell.setBackground(new Color(255,255,255));
            clear_sell.setForeground(Color.BLACK);
        }
        
        if(e.getSource()==exit_scooter)//this is for the purchase button
        {
            exit_scooter.setBackground(new Color(255,255,255));
            exit_scooter.setForeground(Color.BLACK);
        }
    }  
    
    /*this method name id action performed it is inside action listener and helps in event handelling. yhis method takes acton event ee as 
      parameter. this method is used here to exit from gui clear data from the textfield*/
    
    public void actionPerformed(ActionEvent ee){
        if(ee.getSource()==clear_auto)//this is used for the clear button to clear fields
        {
            id_text.setText("");
            name_text.setText("");
            weight_text.setText("");
            color_text.setText("");
            speed_text.setText("");
            ed_text.setText("");
            tor_text.setText("");
            tank_text.setText("");
            ground_text.setText("");
        }
        
        if(ee.getSource()==book_clear)//this is used for the clear button to clear fields
        {
            id1_text.setText("");
            year.setSelectedIndex(0);
            day.setSelectedIndex(0);
            month.setSelectedIndex(0);
            amount_text.setText("");
            seat_text.setText("");
        }
        
        if(ee.getSource()==exit_auto)//this is used for exit button to exit from the gui
        {
            System.exit(0);
        }
        
        if(ee.getSource()==exit_scooter)//this is used for exit button to exit from the gui
        {
            System.exit(0);
        }
        
        if(ee.getSource()==clear_scooter)//this is used for the clear button to clear fields
        {
            id3_text.setText("");
            name1_text.setText("");
            weight1_text.setText("");
            color1_text.setText("");
            speed1_text.setText("");
            battery_text.setText("");
        }
        
        if(ee.getSource()==clear_sell)//this is used for the clear button to clear fields
        {
            id4_text.setText("");
            brand_text.setText("");
            price_text.setText("");
            charge_text.setText("");
            mile_text.setText("");
            range_text.setText("");
        }
        
        if(ee.getSource()==open_auto)//this is for opening the gui of autorickshaw when clicking on autorickshaw
        {
            TransportGUI obj=new TransportGUI();
            obj.AutoRickshaw();
            first.dispose();
        }
        
        if(ee.getSource()==open_scooter)//this is for opening the gui of electric scooter when clicking on electric scooter
        {
            TransportGUI obj=new TransportGUI();
            obj.ElectricScooter();
            first.dispose();
        }
        
         if(ee.getSource()==change_scooter)//this is for opening the gui of electric scooter when clicking on change to electric scooter
        {
            TransportGUI obj=new TransportGUI();
            obj.ElectricScooter();
            second.dispose();         
        }
        
        if(ee.getSource()==change_auto)//this is for opening the gui of autorickshaw when clicking on change to autorickshaw
        {
            TransportGUI obj=new TransportGUI();
            obj.AutoRickshaw();
            third.dispose();
        }
        
        //this is for the add button in auto rickshaw
        if(ee.getSource()==add_auto)
         {
            if(id_text.getText().isEmpty()||ed_text.getText().isEmpty()||tank_text.getText().isEmpty()||name_text.getText().isEmpty()||
            speed_text.getText().isEmpty()||color_text.getText().isEmpty()||tor_text.getText().isEmpty()||
            weight_text.getText().isEmpty()||ground_text.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(null,"Empty field present","Error",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
            try{            
            
            /*the int variable aa store the data in the text field of id and Integer.parseInt is used to change the string data of the text
            field into int because the id field in vehicle class is in int*/    
            int aa=Integer.parseInt(id_text.getText()); 
            
            /*the int variable dd store the data in the text field of engine displacement and Integer.parseInt is used to change the string
              data of the text field into int because the engine displacement field in autorickshaw class is in int*/
              
            int dd=Integer.parseInt(ed_text.getText());
            
            /*the int variable tt store the data in the text field of fuel tank capacity and Integer.parseInt is used to change the string 
             data of the text field into int because the fuel tank capacity field in autorickshaw class is in int*/
             
            int tt=Integer.parseInt(tank_text.getText());
            
            
            String nn=name_text.getText();  //the variable nn store the data of the vehicle name textfield
            String ss=speed_text.getText(); //the variable ss store the data of the vehicle speed textfield
            String cc=color_text.getText(); //the variable cc store the data of the vehicle color textfield
            String oo=tor_text.getText();   //the variable oo store the data of the torque textfield
            String ww=weight_text.getText();//the variable ww store the data of the vehicle weight textfield
            String gg=ground_text.getText();//the variable gg store the data of the ground clearance textfield
            boolean unique=true;
            
            for(Vehicle veh:arr)
            {
                if(veh.getId()==aa)//exicutes only when getId()==aa
                {
                    unique=false;
                
                  if(unique==false)//exicutes only when unique==false
                  {
                    JOptionPane.showMessageDialog(null,"vehicle id: "+aa+"Already added","Error",JOptionPane.ERROR_MESSAGE);
                  }
                }
            }
            if(unique==true)//exicutes only when unique==true
            {
                Auto_rickshaw auto_obj=new Auto_rickshaw(aa,nn,ww,cc,ss,dd,oo,tt,gg);
                arr.add(auto_obj);
            
               JOptionPane.showMessageDialog(null,"You have sucessfully added autorickshaw with following details:"+"\n Vehicle Id: "+aa+
               "\n Vehicle Name: "+nn+"\n Vehicle Speed: "+ss+"\n Vehicle Color: "+cc+"\n Engine Displacement: "+dd+"\n Fuel Tank Capacity: "
               +tt+"\n Torque: "+oo+"\n Weight: "+ww+"\n Ground Clearance: "+gg);           
            
            }
            }
            catch(NumberFormatException ne)
            {
                JOptionPane.showMessageDialog(null,"Invalid datatype","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
        }
        
        //this is for the add button in electric scooter
        if(ee.getSource()==add_scooter)
         {
            if(id3_text.getText().isEmpty()||battery_text.getText().isEmpty()||name1_text.getText().isEmpty()||speed1_text.getText().isEmpty()||
             color1_text.getText().isEmpty()||weight1_text.getText().isEmpty())
             {
                 JOptionPane.showMessageDialog(null,"Empty field present","Error",JOptionPane.ERROR_MESSAGE);
             }
            else
            {
            try
            {
            /*the int variable aa1 store the data in the text field of id and Integer.parseInt is used to change the string data of the text
            field into int because the id field in vehicle class is in int*/
            
            int aa1=Integer.parseInt(id3_text.getText()); 
            
            /*the int variable bb store the data in the text field of battery capacity and Integer.parseInt is used to change the string
              data of the text field into int because the engine displacement field in electric scooter class is in int*/
              
            int bb=Integer.parseInt(battery_text.getText());
            
            String nn1=name1_text.getText();  //the variable nn store the data of the vehicle name textfield
            String ss1=speed1_text.getText(); //the variable ss store the data of the vehicle speed textfield
            String cc1=color1_text.getText(); //the variable cc store the data of the vehicle color textfield1
            String ww1=weight1_text.getText();//the variable ww store the data of the vehicle weight textfield
            boolean unique=true;
            
            for(Vehicle veh:arr)
            {
                if(veh.getId()==aa1)
                {
                    unique=false;
                    
                    if(unique==false)//exicutes only when unique==true
                    {
                        JOptionPane.showMessageDialog(null,"vehicle id: "+aa1+"Already added","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }   
            }
            
             if(unique==true)//exicutes only when unique==true
             {
               Electric_scooter elec_obj=new Electric_scooter(aa1,nn1,ww1,ss1,cc1,bb);
               arr.add(elec_obj);
            
               JOptionPane.showMessageDialog(null,"You have sucessfully added electric scooter of following details:"+"\nVehicle Id: "+aa1+
               "\nVehicle Name: "+nn1+"\nVehicle Speed: "+ss1+"\nVehicle Color: "+cc1+"\nVehicle Weigth: "+ww1+"\nBattery Capacity: "+bb);
             }
            
            }
            catch(NumberFormatException ne)
            {
                JOptionPane.showMessageDialog(null,"Invalid datatype","Error",JOptionPane.ERROR_MESSAGE);
            }
            }
         } 
         
        //this is for the boook button in auto rickshaw
        if(ee.getSource()==book_auto)
        {
            if(arr.size()==0)
            {
                JOptionPane.showMessageDialog(null,"Add vehicle first");
            }
            else{
                 if(seat_text.getText().isEmpty() ||  year.getSelectedItem() == null || month.getSelectedItem() == null|| day.getSelectedItem() == null||
                    amount_text.getText().isEmpty()  )
                 {
                     JOptionPane.showMessageDialog(null,"empty field present","Error",JOptionPane.ERROR_MESSAGE);
                 }
             else{
            try
            {
            int seat=Integer.parseInt(seat_text.getText());
            String bookdateday=(String)day.getSelectedItem();
            String bookdateyear=(String)year.getSelectedItem();
            String bookdatemonth=(String)month.getSelectedItem();
            String date= bookdateday+bookdatemonth+bookdateyear;
            int amount=Integer.parseInt(amount_text.getText());
            
            for(Vehicle object:arr)
            {
                if(object instanceof Auto_rickshaw)
                {
                    Auto_rickshaw rick=(Auto_rickshaw) object;
                    int aa2 = Integer.parseInt(id1_text.getText());
                    if (rick.getId()== aa2)
                    {
                        //exicutes only when getIs_booked()==false
                        if(rick.getIs_booked()==false)
                        {
                            rick.book(date,amount,seat);//calling auto rickshaw book method
                            //to display the message in dialog box
                            JOptionPane .showMessageDialog(null,"you have successfully booked the AutoRickShaw with following details: "
                            +"\n Vehicle Id: "+aa2+"\n booked date: "+date+"\n charged amount:"+amount+"\n No of Seat: "+seat);
                        }
                        
                        else if(rick.getIs_booked()==true)//exicutes only when getIs_booked()==true
                        {
                            //to display the message in dialog box
                            JOptionPane.showMessageDialog(null,"You have already booked the Auto Rickshaw");
                        }
                    }
                     else
                    {
                        //to display the message in dialog box
                        JOptionPane.showMessageDialog(null,"Invalid ID!!!","Error",JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
            }
            catch(NumberFormatException ne)
            {
                //to display the message in dialog box
                JOptionPane.showMessageDialog(null,"Invalid DataType","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        }
        }
        
        // this is for the purchase button in electric scooter
        if(ee.getSource()==purchase_scooter)
        {
            if(arr.size()==0)
            {
                JOptionPane.showMessageDialog(null,"Add vehicle first");
            }
            else{
                if(id4_text.getText().isEmpty()||price_text.getText().isEmpty()||range_text.getText().isEmpty()||
                brand_text.getText().isEmpty()||charge_text.getText().isEmpty()||mile_text.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"empty field present","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                try
                {
                /*the int variable id store the data in the text field of id and Integer.parseInt is used to change the string data of the text
                field into int because the id field in vehicle class is in int*/
                int id=Integer.parseInt(id4_text.getText());
                
                /*the int variable price store the data in the text field of price and Integer.parseInt is used to change the string data of the text
                field into int because the price field in electric scooter class is in int*/
                int price=Integer.parseInt(price_text.getText());
                
                /*the int variable range store the data in the text field of range and Integer.parseInt is used to change the string data of the text
                field into int because the range field in electric scooter class is in int*/
                int range=Integer.parseInt(range_text.getText());
                
                String brand=brand_text.getText();//the variable brand store the data of the brand textfield
                String charge=charge_text.getText();//the variable charge store the data of the charging amount textfield
                String mileage=mile_text.getText();//the variable mileage store the data of the mileage textfield
                
                for(Vehicle object1:arr)
                {
                    if(object1 instanceof Electric_scooter)
                    {
                        Electric_scooter scoo=(Electric_scooter) object1;
                        
                        //only exicute when the purachsing id match with the existing id
                        if (scoo.getId()== id)
                        {
                            if(scoo.getHas_purchased()==true)
                            {
                                //to display the message in dialog box
                                JOptionPane.showMessageDialog(null,"Electric scooter is already purchased");
                            }
                            
                            if(scoo.getHas_purchased()==false)
                            {
                                scoo.purchase(brand,price,charge,mileage,range);//calling the purchase method of the electric scooter
                                
                                JOptionPane.showMessageDialog(null,"You have successfully purchased the ElectricScooter with following details: "
                                +"\n Vehicle Id: "+id+"\n Price: "+price+"\n Range:"+range+"\n Brand: "+brand+"\n Charging Time: "+charge+
                                "\n Mileage: "+mileage);//to display the message in dialog box
                            }
                        }
                        
                        //exicutes when the purchasing id dont match with the existing id
                        else
                        {
                            //to display the message in the dialog box
                            JOptionPane.showMessageDialog(null,"Invalid ID!!!","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }  
                } 
                }
                catch(NumberFormatException ne)
                {
                    //to display message in the dialog box
                    JOptionPane.showMessageDialog(null,"Invalid DataType","Error",JOptionPane.ERROR_MESSAGE);
                }
        }
        }
        }
        
        //this is for the sell button in the electric scooter
        if(ee.getSource()==sell_scooter)
        {
            if(arr.size()==0)
            {
                JOptionPane.showMessageDialog(null,"Add vehicle first");
            }
            else
            {
                if(id4_text.getText().isEmpty()||price_text.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(null,"empty field present","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                try
                {
                /*the int variable id store the data in the text field of id and Integer.parseInt is used to change the string data of the text
                field into int because the id field in vehicle class is in int*/
                int id1=Integer.parseInt(id4_text.getText());
                
                /*the int variable price store the data in the text field of price and Integer.parseInt is used to change the string data of the text
                field into int because the price field in electric scooter class is in int*/
                int price1=Integer.parseInt(price_text.getText());
                
                for(Vehicle object2:arr)
                {
                    if(object2 instanceof Electric_scooter)
                    {
                        Electric_scooter scoo1=(Electric_scooter) object2;//downcasting the vehicle class
                        
                        //only exicutes when the selling id match with the vehicle id
                        if(scoo1.getId()== id1)//exicutes only when getId()==id1
                        {
                            
                            //only exicutes when has sold is true
                            if(scoo1.getHas_sold()==true)//exicutes only when getHas_sold()==true
                            {
                                scoo1.sell(price1);//calling electric scooter sell  method
                                JOptionPane.showMessageDialog(null,"Electric scooter is already sold");//to display message in the dialog box
                            }
                            
                            //only executes when the has sold is false
                            if(scoo1.getHas_sold()==false)//exicutes only when getHas_sold()==false
                            {
                                scoo1.sell(price1);//calling electric scooter sell method
                                JOptionPane.showMessageDialog(null,"You have successfully sold the ElectricScooter with following details: "
                                +"\nVehicle Id: "+id1+"\nprice: "+price1);//to display message in the dialog box
                            }
                            
                        }
                        
                        //exicutes when the purchasing id dont match with the existing id
                        else
                        {
                            //to display the message in the dialog box
                            JOptionPane.showMessageDialog(null,"Invalid ID!!!","Error",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                }
                catch(NumberFormatException ne)
                {
                    //to display message in the dialog box
                    JOptionPane.showMessageDialog(null,"Invalid datatype","Error",JOptionPane.ERROR_MESSAGE);
                }
                }
        }
        }
        
        if(ee.getSource()==display_auto)
        {
            if(arr.size()==0)
            {
                JOptionPane.showMessageDialog(null,"Add vehicle first");
            }
            else
            {
            for(Vehicle object3:arr)
            {
                if(object3 instanceof Auto_rickshaw)
                {
                    Auto_rickshaw shaw=(Auto_rickshaw) object3;
                    
                    if(shaw.getIs_booked()==true)//exicutes only when getIs_booked()==true
                    {
                        try
                        {
                        /*the int variable aa store the data in the text field of id and Integer.parseInt is used to change the string 
                          data of the text field into int because the id field in vehicle class is in int*/    
                        int id=Integer.parseInt(id_text.getText()); 
            
                        /*the int variable dd store the data in the text field of engine displacement and Integer.parseInt is used to 
                          change the string data of the text field into int because the engine displacement field in autorickshaw class 
                          is in int*/
              
                        int dis=Integer.parseInt(ed_text.getText());
            
                        /*the int variable tt store the data in the text field of fuel tank capacity and Integer.parseInt is used to 
                          change the string data of the text field into int because the fuel tank capacity field in autorickshaw class 
                          is in int*/
             
                        int tank=Integer.parseInt(tank_text.getText());
            
            
                        String name=name_text.getText();  //the variable nn store the data of the vehicle name textfield
                        String speed=speed_text.getText(); //the variable ss store the data of the vehicle speed textfield
                        String color=color_text.getText(); //the variable cc store the data of the vehicle color textfield
                        String torque=tor_text.getText();   //the variable oo store the data of the torque textfield
                        String weight=weight_text.getText();//the variable ww store the data of the vehicle weight textfield
                        String ground=ground_text.getText();//the variable gg store the data of the ground clearance textfield
                        
                        String bookdateday=(String)day.getSelectedItem();
                        String bookdateyear=(String)year.getSelectedItem();
                        String bookdatemonth=(String)month.getSelectedItem();
                        String date= bookdateday+bookdatemonth+bookdateyear;
                        int amount=Integer.parseInt(amount_text.getText());
                        int seat=Integer.parseInt(seat_text.getText());
                        
                        shaw.display();//calling autorickshaw display method
                        //to display the dialog box
                        JOptionPane.showMessageDialog(null,"the details of the electric scooter is below: "+"\n Vehicle Id: "+id+
                        "\n Vehicle Name: "+name+"\n Vehicle Color: "+color+"\n Vehicle speed: "+speed+"\n Vehicle Weight: "+weight+
                        "\n Ground Clearance: "+ground+"\n Torque: "+torque+"\n Fuel Tank Capacity: "+tank+"\n Engine Displacement: "+dis+
                        "\n Booked Date: "+date+"\n Charged Amount: "+amount+"\n No Of Seat: "+seat);
                        }
                        catch(NumberFormatException ne)
                        {
                            //to display the dialog box
                           JOptionPane.showMessageDialog(null,"Invalid datatype","Error",JOptionPane.ERROR_MESSAGE);
                        }  
                    
                    }

                    if(shaw.getIs_booked()==false)//exicutes only when getIs_booked()==false
                    {

                        try
                        {
                        /*the int variable aa store the data in the text field of id and Integer.parseInt is used to change the string 
                          data of the text field into int because the id field in vehicle class is in int*/  
                          
                        int id=Integer.parseInt(id_text.getText());
                        
                        String name=name_text.getText();  //the variable nn store the data of the vehicle name textfield
                        String speed=speed_text.getText(); //the variable ss store the data of the vehicle speed textfield
                        String color=color_text.getText(); //the variable cc store the data of the vehicle color textfield
                        String weight=weight_text.getText();//the variable ww store the data of the vehicle weight textfield
                        
                        shaw.display();//calling autorickshaw display method
                        //to display the dialog box
                        JOptionPane.showMessageDialog(null,"the details of the electric scooter is below: "+"\n Vehicle Id: "+id+
                        "\n Vehicle Name: "+name+"\n Vehicle Color: "+color+"\n Vehicle speed: "+speed+"\n Vehicle Weight: "+weight);
                        }
                        catch(NumberFormatException ne)
                        {
                            //to display the dialog box
                           JOptionPane.showMessageDialog(null,"Invalid Datatype","Error",JOptionPane.ERROR_MESSAGE);
                        }  
                    }
                    }
                }
            }
        }
        
        if(ee.getSource()==display_scooter)
        {   
            if(arr.size()==0)
            {
                 JOptionPane.showMessageDialog(null,"Add vehicle first");
            }
            else
            {
            for(Vehicle object4:arr)
            {
                if(object4 instanceof Electric_scooter)
                {
                    Electric_scooter scoo2=(Electric_scooter) object4;//downcasting the vehicle class
                    if(scoo2.getHas_purchased()==true)//exicutes only when getHas_purchased()==true
                    {
                      
                       try
                       {
                        /*the int variable id store the data in the text field of id and Integer.parseInt is used to change the string 
                         data of the text field into int because the id field in vehicle class is in int*/
            
                       int id=Integer.parseInt(id3_text.getText()); 
            
                       String name=name1_text.getText();  //the variable name store the data of the vehicle name textfield
                       String speed=speed1_text.getText(); //the variable speed store the data of the vehicle speed textfield
                       String color=color1_text.getText(); //the variable color store the data of the vehicle color textfield1
                       String weight=weight1_text.getText();//the variable weight store the data of the vehicle weight textfield
            
            
                       /*the int variable range store the data in the text field of range and Integer.parseInt is used to change the 
                         string data of the text field into int because the range field in electric scooter class is in int*/
                       int range=Integer.parseInt(range_text.getText());
            
                       String brand=brand_text.getText();//the variable brand store the data of the brand textfield
                       String charge=charge_text.getText();//the variable charge store the data of the charging amount textfield
                       String mileage=mile_text.getText();//the variable mileage store the data of the mileage textfield
            
                       /*the int variable bb store the data in the text field of battery capacity and Integer.parseInt is used to change
                         the string data of the text field into int because the engine displacement field in electric scooter class is in 
                         int*/
              
                       int battery=Integer.parseInt(battery_text.getText());
                       
                       /*the int variable price store the data in the text field of price and Integer.parseInt is used to change the 
                         string data of the text field into int because the price field in electric scooter class is in int*/
                       int price=Integer.parseInt(price_text.getText());
                       
                       scoo2.display();//calling electric scooter display method
                       //to display the dialog box
                       JOptionPane.showMessageDialog(null,"the details of the electric scooter is below: "+"\n Vehicle Id: "+id+
                       "\n Vehicle Name: "+name+"\n Vehicle Color: "+color+"\n Vehicle speed: "+speed+"\n Vehicle Weight: "+weight+
                       "\n Brand: "+brand+"\n Charging Time: "+charge+"\n Mileage: "+mileage+"\n Battery Capacity: "+battery+
                       "\n Range: "+range+"\n Price: "+price);
                    }
                    catch(NumberFormatException ne)
                    {
                        //to display the dialog box
                       JOptionPane.showMessageDialog(null,"Empty field present","Error",JOptionPane.ERROR_MESSAGE);
                    }  
                    }
                    
                    if(scoo2.getHas_purchased()==false)//exicutes only when getHas_purchased()==false
                    {
                       
                       try
                       {
                         /*the int variable id store the data in the text field of id and Integer.parseInt is used to change the string 
                           data of the text field into int because the id field in vehicle class is in int*/
            
                       int id=Integer.parseInt(id3_text.getText()); 
            
                       String name=name1_text.getText();  //the variable name store the data of the vehicle name textfield
                       String speed=speed1_text.getText(); //the variable speed store the data of the vehicle speed textfield
                       String color=color1_text.getText(); //the variable color store the data of the vehicle color textfield1
                       String weight=weight1_text.getText();//the variable weight store the data of the vehicle weight textfield
                       
                       scoo2.display();//calling electric scooter display method
                       //to display the dialog box
                       JOptionPane.showMessageDialog(null,"the details of the electric scooter is below: "+"\n Vehicle Id: "+id+
                       "\n Vehicle Name: "+name+"\n Vehicle Color: "+color+"\n Vehicle speed: "+speed+"\n Vehicle Weight: "+weight);
                       }
                       catch(NumberFormatException ne)
                       {
                           //to display the dialog box
                           JOptionPane.showMessageDialog(null,"Empty field present","Error",JOptionPane.ERROR_MESSAGE);
                       }    
                    }
                    
                }
            }
            }
            }
            }
            
    public static void main(String[] aargs)
    {
        TransportGUI obj = new TransportGUI();//creating object of class
        obj.choose();//calling choose method
    }
}
    

      

    