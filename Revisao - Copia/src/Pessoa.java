import java.io.Serializable;
import java.util.Objects;

public class Pessoa implements Serializable , Comparable<Pessoa> {
    private String nome;
    private String idade;
    private String cpf;

    public Pessoa(String nome , String idade , String cpf){
        Objects.requireNonNull(nome,"NOME NÃO PODE SER NULL");
        Objects.requireNonNull(idade ,"IDADAE NÃO PODE SER NULL");
        Objects.requireNonNull(cpf,"CPF NÃO PODE SER NULL");
        this.nome =nome;
        this.idade =idade;
        this.cpf = cpf;


    }
    public String getNome(){
        return nome;

    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public String getIdade() {
        return idade;

    }
    public void setIdade(String idade){
        this.idade = idade;

    }
    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;

    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return this.nome.compareTo(pessoa.getNome());
    }
}
