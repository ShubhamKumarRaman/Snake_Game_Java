package snakegame;

import javax.swing.*;

public class SnakeGame extends JFrame {

    public SnakeGame() {
        super("Snake Game");
        add(new Board());
        pack();

//        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300, 300);

        setLocationRelativeTo(null);
        setVisible(true);

    } 

    public static void main(String[] args) {
        new SnakeGame();

    }

}
