package model;

/**
 *
 * @author Atila e Dheyson
 */
public interface iFilmes {
    
    public abstract void status();
    public abstract void reproduzir();
    public abstract void reproduzir( boolean pause );
    public abstract void reproduzir( int stop );
    
}
