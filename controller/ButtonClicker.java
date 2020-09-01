package controller;
import model.Magic8ball;
import view.Menu;
import view.askScreen;
import java.awt.Dimension;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;


public class ButtonClicker implements ActionListener {

    private  Menu panel;
    private final Magic8ball mBall;

    public ButtonClicker( Menu panel) {
        this.panel = panel;
        mBall = new Magic8ball();

    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        final var button = e.getSource();

        if (button == panel.getAskButton()) {
             JFrame window = panel.getWindow();
             var ask = new askScreen(window);
            window.getContentPane().removeAll();
            window.setPreferredSize(new Dimension(400,400));
            window.pack();
            window.setVisible(true);
            ask.init();
            String message = mBall.answer();
            ask.getDisplay().setText(message);
        } 

    }
    
}