package model;

/**
 *
 * @author Atila e Dheyson
 */

public class Filme implements iFilmes{
    
    private String titulo;
    private String classificacao;
    private String diretor;
    private String produtora;
    private int duracao;
    private String genero;
    

    public Filme(String titulo, String classificacao, String diretor, String produtora, int duracao, String genero) {
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.diretor = diretor;
        this.produtora = produtora;
        this.duracao = duracao;
        this.genero = genero;
    }
    
    
    public void status () {
        System.out.println("Título: " +getTitulo());
        System.out.println("Classificação: " +getClassificacao());
        System.out.println("Diretor: " +getDiretor());
        System.out.println("Produtora: " +getProdutora());
        System.out.println("Duração: "+getDuracao() +" min");
        System.out.println("Gênero: "+getGenero());
    }
    public void reproduzir(){
        System.out.println("Play");
    }
    public void reproduzir( boolean pause ){
        if (!pause) {
            System.out.println("Pausa");
        }
    }
    public void reproduzir( int stop ){
        if (stop == 1) {
            System.out.println("Stop");
        }
    }
    

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public String getProdutora() {
        return produtora;
    }
    public void setProdutora(String produtora) {
        this.produtora = produtora;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }  
    
    
  @Override
    public String toString() {
    return "\ntitulo:"+ titulo + 
                "\n, classificação:" + classificacao + 
                "\n, genero:" + genero + 
                "\n, diretor:" +diretor + 
                "\n, produtora:" + produtora + 
                "\n, duração:" + duracao;
    }    
    
}
