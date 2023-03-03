import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

import java.awt.*;

public class ColorMenu extends JFrame {

    //Jlist
    JList colorList;
    private String[] colorNameArray = {"GRAY", "LIGHT GRAY", "WHITE", "BLACK"};
    private Color[] colorClassArray = {Color.GRAY, Color.LIGHT_GRAY, Color.WHITE, Color.BLACK};

    ColorMenu (){

        JLabel label = new JLabel();
        label.setText("Choose background color");
        label.setFont(new Font("Arial", Font.BOLD, 25));
        this.add(label);

        colorList = new JList(colorNameArray);
        //Restricts to one selection
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        colorList.setFont(new Font("Arial", Font.BOLD, 25));
        BGColorEventHandler bgcolorHandler = new BGColorEventHandler();
        colorList.addListSelectionListener(bgcolorHandler);
        this.add(colorList);

        this.setLayout(new FlowLayout());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLUE);

    }

    private class BGColorEventHandler implements ListSelectionListener {

        public void valueChanged(ListSelectionEvent event) {
            GamePanel gp = new GamePanel();
            gp.gameBGcolor = colorClassArray[colorList.getSelectedIndex()];

            new GameFrame();
            dispose();
        }
    }
}
