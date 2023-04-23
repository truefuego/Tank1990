import java.awt.*;

import javax.swing.JFrame;


public class Main {

    public static void main(String[] args) {
        JFrame obj=new JFrame();
        Gameplay gamePlay = new Gameplay();

        Image icon = Toolkit.getDefaultToolkit().getImage("Assets/game_icon.png");
        obj.setBounds(10, 10, 800, 630);
        obj.setIconImage(icon);
        obj.setTitle("Tank 1990");
        obj.setBackground(Color.gray);
        obj.setResizable(false);

        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj.add(gamePlay);
        obj.setVisible(true);

    }

}