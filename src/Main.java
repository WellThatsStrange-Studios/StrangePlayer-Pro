import javax.sound.sampled.*;
import javax.swing.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException {
        GUI();

    }

    public static void GUI() throws LineUnavailableException, UnsupportedAudioFileException, IOException {

        System.out.println("[DEBUG] Doing GUI!");

        //Setting JFrame and JPanel
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(500, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setTitle("StrangePlayer Pro 1.0.0");   //TODO: Everytime theres new release change this

        panel.setLayout(null);

        System.out.println("[DEBUG] Frame and panel done!");

        Music m = new Music();

        //Line of content 1
        JLabel label1 = new JLabel("Arabic Nokia Ringtone");
        label1.setBounds(20, 30, 200, 25);
        panel.add(label1);

        JButton play1 = new JButton("play");
        JButton stop1 = new JButton("stop");
        JButton reset1 = new JButton("reset");

        play1.setBounds(250, 30, 70, 25);
        stop1.setBounds(319, 30, 70, 25);
        reset1.setBounds(388, 30, 70, 25);

        play1.addActionListener(m.p1);
        stop1.addActionListener(m.s1);
        reset1.addActionListener(m.r1);

        panel.add(play1);
        panel.add(stop1);
        panel.add(reset1);

        System.out.println("[DEBUG] Line 1 done!");

        //Line of content 2
        JLabel label2 = new JLabel("Pumped up kicks triangle");
        label2.setBounds(20, 70, 200, 25);
        panel.add(label2);

        JButton play2 = new JButton("play");
        JButton stop2 = new JButton("stop");
        JButton reset2 = new JButton("reset");

        play2.setBounds(250, 70, 70, 25);
        stop2.setBounds(319, 70, 70, 25);
        reset2.setBounds(388, 70, 70, 25);

        play2.addActionListener(m.p2);
        stop2.addActionListener(m.s2);
        reset2.addActionListener(m.r2);

        panel.add(play2);
        panel.add(stop2);
        panel.add(reset2);

        System.out.println("[DEBUG] Line 2 done!");

        frame.setVisible(true);

        System.out.println("[DEBUG] Main frame shown!");

    }

}
