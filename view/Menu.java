package view;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import controller.ButtonClicker;




public class Menu {
    private JFrame window;
    private JTextArea display = new JTextArea();
    private JButton askButton = new JButton("Ask Me!");



    public Menu(JFrame window){
        this.window = window;

        window.setTitle("Magic 8 ball");
        window.setPreferredSize(new Dimension(600,600));
        

    }

    public void init() {

        Container cp = window.getContentPane();
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(200,200));
        panel.setLayout(new GridLayout(2,1));
        JLabel label = new JLabel("Ask the magic 8 ball anything!");
        panel.add(askButton);
        cp.add(BorderLayout.SOUTH,panel);
        cp.add(BorderLayout.NORTH,label);
        cp.add(new JLabel(new ImageIcon("C:/Users/ninte/Pictures/DnR6.gif")));


        ButtonClicker buttonClicker = new ButtonClicker(this);

        askButton.addActionListener(buttonClicker);
        
    }

    public JTextArea getDisplay(){
        return display;
    }

    public JButton getAskButton() {
        return askButton; 
    }

    public JFrame getWindow() {
        return window;
    }
    
}