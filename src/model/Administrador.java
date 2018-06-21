package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Atila e Dheyson
 */
public final class Administrador extends Gerente implements iAdministradores {
    
    private  String usuario="adm";
    private  String senha="adm";
    private ArrayList<Filme> filmes;
    

    public Administrador() {
        filmes = new ArrayList<>();
    }
    public Administrador(String setor, double salario, String nome, int idade, String cpf, String numTelefone, Endereco endereco) {
        super(setor, salario, nome, idade, cpf, numTelefone, endereco);
        filmes = new ArrayList<>();
    }
    
      
    public void addFilmes(Filme f){
        filmes.add(f);
    }
    public int quantidadeFilmes(){
        return filmes.size();
    }
    public void removerFilme(int f){
        filmes.remove(f);
    }
    public List<Filme> getFilmes(){
        List<Filme> f = new ArrayList();
        
            for (Filme filme : filmes) {
                f.add(filme);
            }
        
        return f;
    }
    public void alterarFilme(Filme f){
        
        for (int i = 0; i < filmes.size(); i++) {
            if ((f.getTitulo().equalsIgnoreCase(filmes.get(i).getTitulo())|| f.getDiretor().equalsIgnoreCase(filmes.get(i).getDiretor()))) {
                filmes.set(i, f);
            }
        }   
    } 
    
    
    
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    } 
}
