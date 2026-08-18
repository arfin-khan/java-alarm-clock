import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class alarm implements Runnable{
    private final LocalTime alarmtime;
    private final String filepath;
    private final Scanner scanner;


    alarm(LocalTime alarmtime, String filepath ,Scanner scanner){
        this.alarmtime = alarmtime;
        this.filepath = filepath;
        this.scanner = scanner;
    }

    @Override
    public void run(){

        while (LocalTime.now().isBefore(alarmtime)){
            try {
                Thread.sleep(1000);

                System.out.printf("\r%02d:%02d:%02d" ,
                        LocalTime.now().getHour(),
                        LocalTime.now().getMinute(),
                        LocalTime.now().getSecond());

            } catch (InterruptedException e) {
                System.out.println("Thread was Interrupted");
            }

        }
        playsound(filepath);
    }
    private void playsound(String filepath){
        File audiofile = new File(filepath);


        try(AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(audiofile);){
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            System.out.println("Press *Enter* to stop the Alarm :");
            scanner.nextLine();
            clip.stop();
            scanner.close();
        }
        catch (UnsupportedAudioFileException e){
            System.out.println("Audio format is not supported ");

        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavialable");
        }
        catch (IOException e){
            System.out.println("Error reading audio file");

        }

    }

}
