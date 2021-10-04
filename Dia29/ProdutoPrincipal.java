package Dia29;

public class ProdutoPrincipal {
    
    // Criando as variáveis da Classe Produto, todas privadas

    private int codigo;
    private String nome;
    private String descricao;
    private double valor;

    // Criando o método GET (inserir) e SET ("pegar informação") para todos os atributos 

    public void setCodgio(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){
        return this.codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return this.descricao;
    }

    public void setValor(double valor){
        this.valor = valor;
    } 
    public double getValor(){
        return this.valor;
    }

}
