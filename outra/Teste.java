package TesteEnum;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Teste {

    public static void main(String[] args) {
        Path Diretorio = Paths.get("PASTA");
        Path SubDiretorio = Paths.get(Diretorio.toString(),"SubPasta/SubPastaCopy");
        Path CreateFiles = Paths.get(SubDiretorio.getParent().toString(),"Arquivo.txt");
        Path CreateFilesCopy = Paths.get(SubDiretorio.toString(),"ArquivoCopy.txt");
        Path DiretorioZip = Paths.get("PASTA/Pasta.zip");

        Path source = CreateFiles;
        creationAll.DIRECTORY.Creation(Diretorio);

        creationAll.SUBDIRECTORIES.Creation(SubDiretorio);

        creationAll.CreateFiles.Creation(CreateFiles,CreateFilesCopy);

        creationAll.COPYINFORMATION.COPY(source,CreateFilesCopy);
        creationAll.DIRECTORYZIP.CreationZip(SubDiretorio,DiretorioZip);

        Teste.conta(1,2,3,4);
        Path FilesSer =Paths.get("PASTA/file.ser");
       FORSER fors = new FORSER("RAFAEL",1);
        creationAll.SERIALIZAR.Serializar(fors,FilesSer);
        creationAll.DESERIALIZE.Deserializar(FilesSer);

    }

    public static void conta(int... valor){
        int valor2 = 0;
        for (int i =0;i< valor.length;i++){
            valor2 +=valor[i];

        }
        System.out.println(valor2);

    }
}
