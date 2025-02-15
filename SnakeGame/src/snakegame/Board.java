package snakegame;

import java.awt.Color;
import javax.swing.JPanel;

public class Board extends JPanel {

    private int dots;
    
    public Board() {
        setBackground(Color.BLACK);
        setFocusable(true);
        
        
        LoadImages();
        initGame();
    }
    
    public void loadImages(){
        
    }
    
    public void initGame(){
        dots = 3;
        
        for(int i = 0;i<dots;i++){
            
        }
    }
}
