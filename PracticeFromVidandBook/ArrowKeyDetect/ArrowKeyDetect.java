import javax.swing.*;

public class ArrowKeyDetect {

    public ArrowKeyDetect() {
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel up = new JLabel();
        JLabel down = new JLabel();
        JLabel left = new JLabel();
        JLabel right = new JLabel();

        panel.add(up);
        panel.add(down);
        panel.add(left);
        panel.add(right);
        frame.add(panel);

        up.setText("Up: 0");
        down.setText("Down: 0");
        left.setText("Left: 0");
        right.setText("Right: 0");


    }

    public static void main(String[] args) {
        new ArrowKeyDetect();
    }
}
