package vido.geekbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyWindow extends JFrame {
    public MyWindow() {
        setTitle("Test Window");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 395, 350);

        JButton button = new JButton("Button");
        add(button, BorderLayout.EAST);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paintG(getGraphics());
            }
        });

        JButton button2 = new JButton("Button2");
        add(button2, BorderLayout.WEST);
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                paintG2(getGraphics());
            }
        });
        setVisible(true);

    }

    public void paintG(Graphics g)
    {
        Random random = new Random();
        Color newColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        g.setColor(newColor);

        g.drawLine(110, 50, 150, 150);
        g.drawLine(150, 150, 190, 50);

        g.drawLine(220, 50, 280, 50);
        g.drawLine(220, 150, 280, 150);
        g.drawLine(250, 50, 250, 150);

        g.drawLine(110, 190, 150, 190);
        g.drawLine(110, 190, 110, 290);
        g.drawLine(110, 290, 150, 290);
        g.drawLine(180, 220, 180, 260);
        g.drawArc(120, 190, 60, 60, 90, -90);
        g.drawArc(120, 230, 60, 60, 0, -90);

        g.drawRoundRect(215, 190, 70, 100, 40, 40);

    }

    public void paintG2(Graphics g)
    {
        Random random = new Random();
        Color newColor = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
        g.setColor(newColor);
        g.drawRect(100, 40, 200, 270);
    }
}
