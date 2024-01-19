import java.security.PublicKey;
import java.util.Objects;

public class Pessoa implements Comparable<Pessoa> {
    private int id;

    private String nome;


    public Pessoa(int id,String nome){
        Objects.requireNonNull(nome);
        Objects.requireNonNull(id);
        this.nome = nome;
        this.id = id;

    }

    public String getNome(){
        return nome;

    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public int getId(){
        return id;

    }
    public void setId(int id){
        this.id = id;

    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null)return false ;
        if(this == obj)return true ;
        if(this.getClass() != obj.getClass())return false ;
        Pessoa p = (Pessoa) obj;
        return nome != null && this.nome.equals(p.getNome())  && id == p.getId();

    }

    @Override
    public int hashCode() {
return nome ==null?0: Objects.hash(id,nome);
    }

    @Override
    public String
    toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoas) {
        if(id<pessoas.getId()){
            return -1;

        }else if (id == pessoas.getId()){

            return 0;
        }else{
            return 1;
        }



    }
}
