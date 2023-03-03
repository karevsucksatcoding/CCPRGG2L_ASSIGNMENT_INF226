import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.LayoutManager;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainMenu extends JFrame {

    MainMenu() {

        super("Snake Game");
        this.setLayout(new FlowLayout());

        JLabel imageLabel = new JLabel();
        ImageIcon jettImage = new ImageIcon("img0.jpg");
        imageLabel.setIcon(jettImage);
        this.add(imageLabel);

        JButton button = new JButton();
        button.setText("Start Game");
        button.setFont(new Font("Arial", Font.BOLD, 25));

        EventHandler handler = new EventHandler();
        button.addActionListener(handler);

        this.add(button);

        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLUE);

    }

    private class EventHandler implements ActionListener {
        public void actionPerformed(ActionEvent event){

            new ColorMenu();
            dispose();
        }
    }
    
}
