import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Grid extends JPanel{
    private int rows = 16;
    private int cols = 16;
    private Button [][] buttons;
    private boolean mouseDown = false;
    public Grid(){
        setLayout(new GridLayout(rows, cols));
        addButtonListeners();
        writeToFile();

    }

    public void addButtonListeners() {
        buttons = new Button[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                JButton button = new JButton();
                buttons[i][j] = new Button(button, false);
            }
        }

        for (int i = 0; i < rows; i++) {
            int finalI = i;
            for (int j = 0; j < cols; j++) {

                int finalJ = j;
                buttons[i][j].getButton().addMouseListener(new MouseListener() {

                    @Override
                    public void mouseClicked(MouseEvent e) {

                    }

                    @Override
                    public void mousePressed(MouseEvent e) {
                            buttons[finalI][finalJ].changeBackground();
                            mouseDown = true;

                    }

                    @Override
                    public void mouseReleased(MouseEvent e) {
                        mouseDown = false;
                    }

                    @Override
                    public void mouseEntered(MouseEvent e) {
                        if(mouseDown){
                            buttons[finalI][finalJ].changeBackground();
                        }
                    }

                    @Override
                    public void mouseExited(MouseEvent e) {

                    }
                });
                add(buttons[i][j].getButton());
            }
        }
    }


    public void writeToFile()  {
        BufferedImage img = new BufferedImage(16,16, BufferedImage.TYPE_INT_RGB);
        for(int i =0; i<rows; i++){
            for(int j =0; j<cols; j++){
                Color color = buttons[i][j].getButton().getBackground();
                img.setRGB(j,i, color.getRGB());
            }
        }
        try{
            ImageIO.write(img, "png", new File("image.png"));
        }catch (IOException e){
            e.printStackTrace();
        }

    }


}
