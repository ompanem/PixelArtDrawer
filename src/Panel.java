import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel extends JPanel {
    private int rows = 16;
    private int cols = 16;
    boolean pressed = false;
    private JPanel drawingGridPanel;
    public Panel(){
        setLayout(new BorderLayout());
        drawingGridPanel = new JPanel();
        Grid grid = new Grid();
        add(grid, BorderLayout.CENTER);
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        JButton saveButton = new JButton("Save file");
        saveButton.addActionListener(e ->{
            grid.writeToFile();
        });


        JButton other = new JButton("E");
        buttonsPanel.add(saveButton);
        buttonsPanel.add(other);
        add(buttonsPanel, BorderLayout.NORTH);
        setVisible(true);
    }
}
