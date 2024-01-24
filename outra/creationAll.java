package TesteEnum;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipOutputStream;
import java.util.zip.ZipEntry;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public enum creationAll {
    DIRECTORY(1) {
        @Override
        public void Creation(Path... NameDirectory) {
try {
    for(Path Name:NameDirectory){
        if(Files.notExists(Name)){
            Files.createDirectory(Name);
        }else{
            System.err.println("THIS DIRECTORY ALREADY EXISTS");

        }
    }
}catch (IOException ex){
    ex.printStackTrace();
}
        }
    },SUBDIRECTORIES(2) {
        @Override
        public void Creation(Path... NameSubDirectories) {
            try {


            for(Path Name:NameSubDirectories){
                if(Files.notExists(Name)){
                    Files.createDirectories(Name);
                }else{
                    System.err.println("THIS DIRECTORIES ALREADY EXISTS");

                }
            }}catch (IOException ex){
                ex.printStackTrace();

            }


        }
    },CreateFiles(3) {
        @Override
        public void Creation(Path... NameFiles) {
            try {
                for(Path Name:NameFiles){
                if (Files.notExists(Name)){
                    Files.createFile(Name);

                }else{
                    System.err.println("THIS FILES ALREADY EXISTS");

                }
                }

            }catch (IOException ex){
                ex.printStackTrace();
            }

        }
    },COPYINFORMATION(4) {
        public void COPY(Path Source ,Path... Target) {
            for(Path Name:Target){
                try {
                   if (Files.exists(Source)){
                       Files.copy(Source,Name, StandardCopyOption.REPLACE_EXISTING);
                   }else{
                       System.err.println("FILES TO COPY DO NOT EXIST");
                   }
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    },DIRECTORYZIP(5){

        public void CreationZip(Path ForZip,Path...FilesZip) {
            for(Path File:FilesZip){
            try(ZipOutputStream Zip = new ZipOutputStream(Files.newOutputStream(File));
                DirectoryStream<Path> strem = Files.newDirectoryStream(ForZip)
            ) {
                for(Path file:strem){
                    ZipEntry entry = new ZipEntry(file.getFileName().toString());
                    Zip.putNextEntry(entry);
                    Files.copy(file,Zip);
                    Zip.closeEntry();

                }

            }catch (IOException ex){
               ex.printStackTrace();

            }
            }


        }
    },SERIALIZAR(6){
        public void Serializar(FORSER test,Path...PastaSer) {
            for(Path Ser:PastaSer){
               try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Ser))){
                   oos.writeObject(test);

                   oos.flush();


               }catch (IOException ex){
                   ex.printStackTrace();

               }

            }




        }


    },DESERIALIZE(7){
        public void Deserializar(Path...Filesser) {



            for (Path file:Filesser){

                try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(file))) {
                   FORSER fo = (FORSER) ois.readObject();
                   System.out.println(fo);

                }catch (Exception ex){
                    ex.printStackTrace();
                }

            }
        }
    };

    private final int value ;

    creationAll( int value){
      this.value = value;
    }

    public void Creation(Path... Name) {
        System.err.println("DO NOT USE");
    }
    public void COPY(Path Source ,Path... Target) {
        System.err.println("DO NOT USE");
    }
    public void CreationZip(Path ForZip,Path...FilesZip) {System.err.println("DO NOT USE");}
    public void Serializar(FORSER test,Path...PastaSer) {System.err.println("DO NOT USE");}
    public void Deserializar(Path...FilesZip) {System.err.println("DO NOT USE");}

}
