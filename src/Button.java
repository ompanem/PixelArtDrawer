import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Button {
    private boolean pressed;
    private JButton button;
    private boolean drawing = false;
    public Button(JButton button, boolean pressed){
        this.button = button;
        button.setBackground(Color.WHITE);
        this.pressed = pressed;


    }

    public void changeBackground(){
        if(!pressed){
            button.setBackground(Color.BLACK);
            pressed = true;
        }

        else{
            button.setBackground(Color.WHITE);
            pressed = false;
        }
    }

    public JButton getButton(){
        return button;
    }
}
