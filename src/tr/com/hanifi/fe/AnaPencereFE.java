package tr.com.hanifi.fe;

import tr.com.hanifi.interfaces.FeInterfaces;

import javax.swing.*;

public class AnaPencereFE extends JFrame implements FeInterfaces {
    @Override
    public void initPrncere() {
        initPrncere();
    }

    @Override
    public void initPencere() {
        JTabbedPane tabs = initTabs();
        JMenuBar bar =initBar();

       // add(tabs);
       // setJMenuBar(bar);
    setTitle("Satıs ve Stok Programı");
    pack();
    setVisible(true);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public JPanel initPanel() {
        return null;
    }

    @Override
    public JMenuBar initBar() {
        return null;
    }

    @Override
    public JTabbedPane initTabs() {
        return null;
    }
}
