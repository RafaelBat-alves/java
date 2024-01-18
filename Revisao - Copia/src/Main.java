import java.io.*;
import java.nio.file.StandardCopyOption;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.ZoneId;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

class VerPastas extends SimpleFileVisitor<Path>{
    private PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:***/*.{???,????}");

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (matcher.matches(file)){
            System.out.println("ARQUIVOS ENCONTRADO: "+ file.getFileName());

        }
        return FileVisitResult.CONTINUE;
    }
}

public class Main {
    public static void main(String[] args) {
        Path geral = Paths.get(".");
        Path Diretorio = Paths.get("PASTA");
        Path SubDiretorio = Paths.get("PASTA/SUBPASTA/PASTACOPY");
        Path Arquivos = Paths.get(SubDiretorio.getParent().toString(),"Arquivos.txt");
        Path CopayArquivos = Paths.get(SubDiretorio.toString(),"ArquivosCopy.txt");
        Path Sourcer = Arquivos;
        Path Target = CopayArquivos;

        File file = Arquivos.toFile();

        Path PastaZip = Paths.get("PASTA/PASTAZIP.zip");
        Path ParaZipar = Paths.get(SubDiretorio.toString());

        try {
            if(Files.notExists(Diretorio)){
                Files.createDirectory(Diretorio);
            }
            if(Files.notExists(SubDiretorio)){
                Files.createDirectories(SubDiretorio);

            }
            if(Files.notExists(Arquivos)){
                Files.createFile(Arquivos);
            }

            Files.copy(Sourcer,Target,StandardCopyOption.REPLACE_EXISTING);
            Main.Zip(PastaZip,ParaZipar);

            Files.walkFileTree(Diretorio, new VerPastas());



        }catch (IOException ex){
            ex.printStackTrace();
        }


        try(FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
            for (int i =0;i<=5;i++){
            bw.write("Nome"+i+";"+i+";CPF;");
            bw.newLine();
            bw.flush();
            }
            /*
            BasicFileAttributes basicFileAttributes = Files.readAttributes(Arquivos,BasicFileAttributes.class);
            String hora =String.valueOf( basicFileAttributes.lastModifiedTime().toInstant().atZone(ZoneId.systemDefault()));
            bw.write(hora);
            bw.flush();

             */


        }catch (IOException ex){
           ex.printStackTrace();

        }

        try(FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr)
        ) {
            /*
            char[] info = new char[10];
            fr.read(info);
            for (char infos:info){
                System.out.println(infos);

            }
            int inf;
            while ((inf = fr.read())!=-1){
                System.out.print((char) inf);

            }

             */


            String info;
            String informa = "";

            StringBuffer sb = new StringBuffer();

            while ((info = br.readLine())!=null){
informa += info; }

String [] infos = informa.split(";");

for(int k=0; k<infos.length;k++){
    Pattern regex = Pattern.compile("\\d");
    Matcher ma = regex.matcher(infos[k]);

    if(k%3==0){

    }else if(infos[k].equals("CPF")){
        
    }else if(ma.find()){

        System.out.println(infos[k]);

    }
}



            Pessoa p = new Pessoa("Rafael","19","cpf");
            Main.serializar(p);
            Main.Deserializar();


        }catch (IOException ex){
            ex.printStackTrace();

        }



        }











public static void Zip(Path PastaZip,Path ParaZip){
        try(ZipOutputStream zio =new ZipOutputStream(Files.newOutputStream(PastaZip));
            DirectoryStream<Path> strem = Files.newDirectoryStream(ParaZip);
    ) {

            for(Path file: strem){
                ZipEntry entry = new ZipEntry(file.getFileName().toString());
                zio.putNextEntry(entry);
                Files.copy(file ,zio);
                zio.closeEntry();


            }

        }catch (IOException ex){

            ex.printStackTrace();

        }

}

public static void serializar(Pessoa p){
        Path Arquivoseria = Paths.get("PASTA/SUBPASTA/ARQUIVO.ser");
        try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Arquivoseria))) {
            oos.writeObject(p);
            oos.flush();

        }catch (IOException ex){
            ex.printStackTrace();
        }

}

    public static void Deserializar(){
        Path Arquivoseria = Paths.get("PASTA/SUBPASTA/ARQUIVO.ser");
        try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Arquivoseria))) {
        Pessoa p =  (Pessoa) ois.readObject();
        System.out.println(p);

        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }

    }




    }
