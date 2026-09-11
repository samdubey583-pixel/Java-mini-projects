import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class musicPlayer {
    public static void main(String[] args){
        String filePath = "C:\\Users\\radax\\IdeaProjects\\mini projects\\OnTheLoose.wav";
        File file = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Scanner scanner=new Scanner(System.in)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String response = "";

            while(!response.equals("q")){
                System.out.println("p = play");
                System.out.println("s = stop");
                System.out.println("r = reset");
                System.out.println("q = quit");

                System.out.print("Enter your choice: ");
                response=scanner.next().toLowerCase();

                switch (response){
                    case "p" -> clip.start();
                    case "s" -> clip.stop();
                    case "r" -> clip.setMicrosecondPosition(0);
                    case "q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Unsupported audio file");
        }
        catch (FileNotFoundException e){
            System.out.println("Could not locate the file");
        }
        catch (LineUnavailableException e){
            System.out.println("Unable to access audio resource");
        }
        catch (IOException e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("Bye!");
        }
    }
}
