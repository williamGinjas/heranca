package Parte3;

public class Animais {

    private String nome;
    private  int patas;
    public Animais(){

    }

    public Animais(String nome, int patas){
        super();
        this.nome = nome;
        this.patas = patas;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public String toString(){
        return String.format("Nome: "+ nome + "; Patas: "+ patas);
    }
}