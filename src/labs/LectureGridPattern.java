package labs;

import javax.swing.*;
import java.awt.*;

public class LectureGridPattern extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 1. رسم شبكة المربعات (Grid)
        g.setColor(Color.LIGHT_GRAY);
        int step = 30; // المسافة بين كل خط وآخر
        for (int i = 0; i <= getWidth(); i += step) {
            g.drawLine(i, 0, i, getHeight()); // خطوط عمودية
        }
        for (int i = 0; i <= getHeight(); i += step) {
            g.drawLine(0, i, getWidth(), i); // خطوط أفقية
        }

        // 2. تدرج الخطوط الحمراء من الزاوية العلوية
        g.setColor(Color.RED);
        for (int y = 0; y <= getHeight(); y += 10) {
            g.drawLine(0, 0, getWidth(), y);
        }

        // 3. تدرج الخطوط الخضراء من الزاوية العلوية
        g.setColor(Color.GREEN);
        for (int x = 0; x <= getWidth(); x += 10) {
            g.drawLine(0, 0, x, getHeight());
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Lecture: Grid & Patterns");
        LectureGridPattern panel = new LectureGridPattern();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setResizable(false); // منع التكبير والتصغير كما طُلب في المحاضرة
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}