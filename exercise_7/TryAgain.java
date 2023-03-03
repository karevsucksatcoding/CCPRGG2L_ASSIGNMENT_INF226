import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import java.awt.event.ActionEvent;

public class TryAgain extends JFrame {

    TryAgain() {

        this.setLayout(new FlowLayout());
        JLabel label = new JLabel();
        label.setText("GAME OVER");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        JButton tryAgainButton = new JButton();
        tryAgainButton.setText("Play Again");
        tryAgainButton.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(tryAgainButton);

        JButton exitButton = new JButton();
        exitButton.setText("Quit Game");
        exitButton.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(exitButton);

        TryAgainEventHandler handler = new TryAgainEventHandler();
        tryAgainButton.addActionListener(handler);
        ExitEventHandler handler2 = new ExitEventHandler();
        exitButton.addActionListener(handler2);

        

        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLUE);
        this.setResizable(false);
    }
    private class TryAgainEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event){

            new GameFrame();
            dispose();
            
            
        }

        
    }

    private class ExitEventHandler implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            dispose();
        }
    }
    
    
}
