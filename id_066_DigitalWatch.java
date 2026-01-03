import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class id_066_DigitalWatch extends JFrame implements Runnable {
    
    private JLabel timeLabel;
    private Thread thread;

    public id_066_DigitalWatch() {
       
        setTitle("Digital Watch");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null); 

      
        timeLabel = new JLabel();
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setForeground(Color.BLUE);
        add(timeLabel, BorderLayout.CENTER);

        thread = new Thread(this);
        thread.start();

        setVisible(true);
    }

    @Override
    public void run() {
        try {
            while (true) {
             
                SimpleDateFormat formatter = new SimpleDateFormat("HH:mm:ss");
                formatter.setTimeZone(TimeZone.getDefault());
                String currentTime = formatter.format(new Date());

              
                timeLabel.setText(currentTime);

                
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new id_066_DigitalWatch();
    }
}
