package Assignments;

import javax.swing.*;
import java.awt.*;

public class Assignment1 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        // 1. الإطار الخارجي الكبير للوحة
        g.setColor(Color.BLACK);
        g.drawRect(20, 20, 540, 500);

        // 2. كتابة الاسم والرقم الجامعي في الأعلى
        g.setColor(Color.blue);
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString("Name: Deema Mohammed AL-Maqadma | ID: 2320230766", 40, 50);

        // 3. رسم خط متعرج (Polyline) في أعلى اللوحة
        g.setColor(Color.MAGENTA);
        int[] polylineX = {50, 100, 150, 200, 250, 300};
        int[] polylineY = {90, 70, 90, 70, 90, 70};
        g.drawPolyline(polylineX, polylineY, 6);

        // 4. رسم 3 مربعات على صف واحد باستخدام Loop
        // مربع 1، مربع 2، (فراغ للدائرة)، ثم مربع 3
        g.setColor(Color.BLUE);
        int[] squareXPositions = {60, 140, 300}; // مواقع X للمربعات الثلاثة
        for (int i = 0; i < 3; i++) {
            g.drawRect(squareXPositions[i], 130, 60, 60); // رسم المربع
        }

        // 5. رسم بيضاوي ممتلئ بين المربع الثاني والثالث
        g.setColor(Color.ORANGE);
        g.fillOval(220, 135, 60, 50);

        // 6. رسم محاور الإحداثيات (X و Y متعامدان)
        g.setColor(Color.GRAY);
        // المحور الأفقي X
        g.drawLine(50, 280, 510, 280);
        g.drawString("X", 515, 285);
        // المحور الرأسي Y
        g.drawLine(280, 220, 280, 340);
        g.drawString("Y", 275, 215);

        // 7. رسم مثلث في الأسفل باستخدام كلاس Polygon
        g.setColor(Color.RED);
        Polygon triangle = new Polygon();
        triangle.addPoint(280, 370); // رأس المثلث العلوي
        triangle.addPoint(200, 470); // الزاوية السفلية اليسرى
        triangle.addPoint(360, 470); // الزاوية السفلية اليمنى
        g.drawPolygon(triangle);
    }

    public static void main(String[] args) {
        // إنشاء النافذة وتشغيل العرض
        JFrame frame = new JFrame("Computer Graphics - Assignment 1");
        Assignment1 panel = new Assignment1();

        frame.add(panel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // توسيط النافذة في الشاشة
        frame.setVisible(true);
    }
}
