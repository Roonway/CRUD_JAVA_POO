package model;

import java.util.List;

/**
 *
 * @author Atila e Dheyson
 */
public interface iAdministradores {
    
    public abstract void addFilmes(Filme f);
    public abstract int quantidadeFilmes();
    public abstract void removerFilme(int f);
    public abstract List<Filme> getFilmes();
    public abstract void alterarFilme(Filme f);
    
}
