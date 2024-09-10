import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;


public class MyFrame extends JFrame{

    public static void main(String[] args) {
        MyFrame myframe = new MyFrame();
    }

    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;
    String time;
    String day;
    String date;
    
    MyFrame(){

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Clock_App");
    this.setLayout(new FlowLayout());
    this.setSize(250,200);
    this.setResizable(false);
    this.setLocationRelativeTo(null);
    

    timeFormat = new SimpleDateFormat("hh:mm:ss a");
    dayFormat = new SimpleDateFormat("EEEE");
    dateFormat = new SimpleDateFormat("dd  MMM  yyyy");

    timeLabel = new JLabel();
    timeLabel.setFont(new Font("Times New Roman",Font.BOLD,40));
    timeLabel.setForeground(Color.GREEN);
    timeLabel.setBackground(Color.BLACK);
    timeLabel.setOpaque(true);

    dayLabel = new JLabel();
    dayLabel.setFont(new Font("Times New Roman",Font.BOLD,30));

    dateLabel = new JLabel();
    dateLabel.setFont(new Font("Showcard Gothic",Font.PLAIN,25));

    this.add(timeLabel);
    this.add(dayLabel);
    this.add(dateLabel);
    this.setVisible(true);
    
    setTime();

   }
   public void setTime(){
    while(true){
    time = timeFormat.format(Calendar.getInstance().getTime());
    timeLabel.setText(time);

    day = dayFormat.format(Calendar.getInstance().getTime());
    dayLabel.setText(day);

    date = dateFormat.format(Calendar.getInstance().getTime());
    dateLabel.setText(date);

    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
    }
}
   }
}
