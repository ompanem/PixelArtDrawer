import javax.swing.*;

public class Frame extends JFrame {
    private Panel panel;
    public Frame(Panel panel){
        this.panel = panel;
        setSize(640,640);
        setResizable(false);
        setTitle("Pixel Art Drawer");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);
    }
}
