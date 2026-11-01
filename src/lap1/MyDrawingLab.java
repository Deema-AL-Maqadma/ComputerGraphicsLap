package lap1;

import javax.swing.*;
import java.awt.*;

// 1. كلاس اللوحة القماشية التي نرسم بداخلها
public class MyDrawingLab extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        // تنظيف الشاشة قبل الرسم (مهم جداً)
        super.paintComponent(g);

        // --- تطبيق محتوى الشابتر 1 و 2 ---

        // 1. تغيير اللون إلى الأزرق ورسم مستطيل ممتلئ
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 150, 80); // (X, Y, Width, Height)

        // 2. تغيير اللون إلى الأحمر ورسم إطار دائرة مفرغة
        g.setColor(Color.RED);
        g.drawOval(250, 50, 80, 80);  // إذا تساوى العرض والارتفاع أصبح دائرة

        // 3. رسم خط مستقيم بلون أسود (من نقطة إلى نقطة)
        g.setColor(Color.BLACK);
        g.drawLine(50, 200, 350, 200); // (x1, y1, x2, y2)

        // 4. كتابة نص
        g.drawString("مرحباً بك في عالم جافا جرافيكس!", 100, 250);
    }

    // 2. الدالة الرئيسية لتشغيل النافذة وعرض اللوحة
    public static void main(String[] args) {
        // إنشاء النافذة
        JFrame frame = new JFrame("Computer Graphics Lab - Chapter 1 & 2");

        // إنشاء لوحتنا وإضافتها داخل النافذة
        MyDrawingLab panel = new MyDrawingLab();
        frame.add(panel);

        // إعدادات النافذة الأساسية
        frame.setSize(500, 400); // العرض والارتفاع
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // إغلاق البرنامج عند الضغط على X
        frame.setLocationRelativeTo(null); // جعل النافذة تفتح في منتصف شاشتك
        frame.setVisible(true); // إظهار النافذة
    }
}