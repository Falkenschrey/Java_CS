import javax.swing.*;
import java.awt.*;

public class ChessGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(10, 10 , 512, 512);
        frame.setUndecorated(true);
        JPanel pn= new JPanel(){
            @Override
            public void paint(Graphics g) {
                boolean light=true;
                for (int y = 0; y<8 ; y++) {
                    for (int x = 0; x<8 ; x++) {
                        if (light) {
                            g.setColor(Color.orange);
                        } else {
                            g.setColor(Color.red.darker());
                        }
                        g.fillRect(x*64, y*64, 64, 64);
                        light=!light;
                    }
                light=!light;
                }
            }
        };
        frame.add(pn);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);
    }
}
