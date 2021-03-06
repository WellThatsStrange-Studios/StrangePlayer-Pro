import javax.sound.sampled.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

public class Music {

    ClassLoader classLoader = ClassLoaderFinder.class.getClassLoader();

    //TODO: Put each track into separate class

    //Music track 1
    URL url1 = classLoader.getResource("assets/Nokia_ringtone_arabic.wav");

    AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(url1);
    Clip clip1 = AudioSystem.getClip();

    Boolean clip1IsStopped = false;

    ActionListener p1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!clip1.isOpen()){
                try {
                    clip1.open(audioStream1);
                    System.out.println("[DEBUG] Opened audio clip 1");
                } catch (LineUnavailableException | IOException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                }
            }

            if (clip1.getMicrosecondLength() <= clip1.getMicrosecondPosition()) {
                if (clip1IsStopped){
                    clip1IsStopped = false;
                }else {
                    clip1.setMicrosecondPosition(0);
                }
            }
            clip1.start();
            System.out.println("[DEBUG] Started audio clip 1");

        }
    };
    ActionListener s1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("[DEBUG] Stopped audio clip 1");
            clip1.stop();
            clip1IsStopped = true;
        }
    };
    ActionListener r1 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("[DEBUG] Reseted audio clip 1");
            clip1.setMicrosecondPosition(0);
        }
    };


    //Music track 2
    URL url2 = classLoader.getResource("assets/Dancing_triangle_pumped_up_kicks.wav");

    AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(url2);
    Clip clip2 = AudioSystem.getClip();

    Boolean clip2IsStopped = false;

    ActionListener p2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!clip2.isOpen()){
                try {
                    clip2.open(audioStream2);
                    System.out.println("[DEBUG] Opened audio clip 2");
                } catch (LineUnavailableException | IOException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                }
            }

            if (clip2.getMicrosecondLength() <= clip2.getMicrosecondPosition()) {
                if (clip2IsStopped){
                    clip2IsStopped = false;
                }else {
                    clip2.setMicrosecondPosition(0);
                }
            }
            clip2.start();
            System.out.println("[DEBUG] Started audio clip 2");

        }
    };
    ActionListener s2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("[DEBUG] Stopped audio clip 2");
            clip2.stop();
            clip2IsStopped = true;
        }
    };
    ActionListener r2 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("[DEBUG] Reseted audio clip 2");
            clip2.setMicrosecondPosition(0);
        }
    };

    //Music track 3
    URL url3 = classLoader.getResource("assets/Mine_diamonds.wav");

    AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(url3);
    Clip clip3 = AudioSystem.getClip();

    Boolean clip3IsStopped = false;

    ActionListener p3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (!clip3.isOpen()){
                try {
                    clip3.open(audioStream3);
                    System.out.println("[DEBUG] Opened audio clip 3");
                } catch (LineUnavailableException | IOException lineUnavailableException) {
                    lineUnavailableException.printStackTrace();
                }
            }

            if (clip3.getMicrosecondLength() <= clip3.getMicrosecondPosition()) {
                if (clip3IsStopped){
                    clip3IsStopped = false;
                }else {
                    clip3.setMicrosecondPosition(0);
                }
            }
            clip3.start();
            System.out.println("[DEBUG] Started audio clip 3");

        }
    };
    ActionListener s3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("[DEBUG] Stopped audio clip 3");
            clip3.stop();
            clip3IsStopped = true;
        }
    };
    ActionListener r3 = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("[DEBUG] Reseted audio clip 3");
            clip3.setMicrosecondPosition(0);
        }
    };

    //Default constructor just for throwing errors
    public Music() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
    }

}
