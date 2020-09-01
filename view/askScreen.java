package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;




public class askScreen {
    private JFrame window;
    private JButton tryAgainButton = new JButton("Try Again");
    private JTextArea display = new JTextArea();


    public askScreen(JFrame window) {
        this.window = window;
        window.setTitle("Result Screen");
        
    }
    
    public void init() {
        Container cp =  window.getContentPane();
        JPanel panel = new JPanel();
        cp.add(BorderLayout.NORTH,panel);

        panel.setPreferredSize(new Dimension(400,400));
        panel.setLayout(new GridLayout(2,1));
        panel.add( display);
        panel.add(tryAgainButton);


        tryAgainButton.addActionListener(e -> {
            window.getContentPane().removeAll();
            var menu = new Menu(window);
            window.setPreferredSize(new Dimension(600,600));

            menu.init();

            window.pack();
            window.revalidate();
        });

        
        


    }

    public JTextArea getDisplay(){
        return display;
    }

    
}