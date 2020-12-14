package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;

public class Feladatok extends Main{
    public Feladatok(){
        JFrame frame = new JFrame("Balkezesek");
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JTabbedPane tp = new JTabbedPane();
        JLabel label_f3 = new JLabel("Adatsorok mennyisége: "+Main.list.size());
        JTextField textField = new JTextField("Évszám (pl. 2021-01-01");
        JButton button = new JButton("SUBMIT");

        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel1);
        frame.add(tp);

        tp.setBounds(50,50,200,200);
        tp.add("3.feladat",panel1);
        tp.add("4.feladat",panel2);
        tp.add("5.feladat",panel3);
        tp.add("6.feladat",panel4);

        button.setBounds(50,100,95,30);
        textField.setBounds(5,200, 200,30);

        panel1.add(label_f3);
        panel3.add(textField);
        panel3.add(button);

        for (Balkezes e:list ) {
            String date = e.getLast().toString();
            if(date.substring(0,4) == "1999"){
                DecimalFormat df = new DecimalFormat("#.000");
                double height = e.getHeight();
                String height_new = df.format(height*2.54);
                JLabel label_f4 = new JLabel(e.getName()+", "+height_new+" cm");
                panel2.add(label_f4);
            }
        }
    }
}
