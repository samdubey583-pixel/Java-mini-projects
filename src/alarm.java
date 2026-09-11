import javax.sound.sampled.*;
import javax.tools.Tool;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class alarm implements Runnable{
    private final LocalTime alarmTime;
    private final String filepath;
    private final Scanner scanner;

    alarm(LocalTime alarmTime,String filepath,Scanner scanner){
        this.alarmTime=alarmTime;
        this.filepath=filepath;
        this.scanner=scanner;
    }

    @Override
    public void run(){
        while (LocalTime.now().isBefore(alarmTime)){
            try{
                Thread.sleep(1000);

                int hour=LocalTime.now().getHour();
                int minute=LocalTime.now().getMinute();
                int second =LocalTime.now().getSecond();

                System.out.printf("\r%02d:%02d:%02d",hour,minute,second);
            }
            catch (InterruptedException e){
                System.out.println("Thread was interrupted");
            }
        }
        System.out.println("\nAlarm noises");
        // Toolkit.getDefaultToolkit().beep(); // makes a beep noise
        alarmSound(filepath);
    }
    private void alarmSound (String filepath){

        File file = new File(filepath);
        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Press enter to stop the alarm");
            scanner.nextLine();
            clip.close();

            scanner.close();
        }
        catch (UnsupportedAudioFileException e) {
            System.out.println("File not supported");
        }
        catch(LineUnavailableException e){
            System.out.println("Audio is unavailable");
        }
        catch (IOException e) {
            System.out.println("An error occured");
        }

    }

}
