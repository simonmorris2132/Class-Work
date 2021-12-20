import javax.swing.JFrame;

public class ArrowKeyDetect {

    public ArrowKeyDetect() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setFocusable(true);
    }

    public static void main(String[] args) {
        new ArrowKeyDetect();
    }
}
