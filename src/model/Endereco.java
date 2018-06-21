package model;

/**
 *
 * @author Atila e Dheyson
 */
public class Endereco {
    
    private String bairro;
    private String rua;
    private String casa;
    

    public Endereco(String bairro, String rua, String casa) {
        this.bairro = bairro;
        this.rua = rua;
        this.casa = casa;
    }
    

    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getRua() {
        return rua;
    }
    public void setRua(String rua) {
        this.rua = rua;
    }
    public String getCasa() {
        return casa;
    }
    public void setCasa(String casa) {
        this.casa = casa;
    } 

    @Override
    public String toString() {
        return "bairro:"+ bairro + ", rua:" + rua + ", casa:" + casa ;
    }
    
}
