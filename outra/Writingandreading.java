package TesteEnum;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public enum Writingandreading {
    WRITING(1){
        public void whiting(Path... Name) {

            for (Path File:Name){
                File files = File.toFile();
                try(FileWriter fw = new FileWriter(files)){


                }catch (IOException ex){
                    ex.printStackTrace();

                }

            }

        }

    },READING(2){
        public void reading(Path... Name) {System.err.println("DO NOT USE");}

    };

    private final int values;

    Writingandreading(int values){
        this.values=values;

    }
    public void whiting(Path... Name) {System.err.println("DO NOT USE");}
    public void reading(Path... Name) {System.err.println("DO NOT USE");}



}
