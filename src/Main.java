import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Main extends JPanel implements MouseListener {

    final static int WINDOW_WIDTH = 800;
    final static int WINDOW_HEIGHT = 800;

    public Main() {

        JFrame frame = new JFrame("Checkers");
        frame.add(this);
        frame.setSize(800, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.addMouseListener(this);

        repaint();
    }

    public static void main(String[] args) {
        new Main();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
