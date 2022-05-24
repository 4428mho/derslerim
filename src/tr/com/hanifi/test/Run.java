package tr.com.hanifi.test;

import tr.com.hanifi.fe.AnaPencereFE;

import javax.swing.*;

public class Run {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AnaPencereFE();
            }
        });
    }
}
