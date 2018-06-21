package model;

/**
 *
 * @author Atila e Dheyson
 */
public abstract class Pessoa implements iFuncionarios{
    
    private String nome;
    private int idade;
    private String cpf;
    private String numTelefone;
    private Endereco endereco;
    
    
    public Pessoa(String nome, int idade, String cpf, String numTelefone, Endereco endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.numTelefone = numTelefone;
        this.endereco = endereco;
    }
   
    
    public void mudarNumeroTelefone( String numero ){
        this.numTelefone = numero;
    }

    

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
      
        char[] c = this.cpf.toCharArray();
            
        String val = c[0]+""+c[1]+""+c[2]+"."+c[3]+""+c[4]+""+c[5]+"."+c[6]+""+c[7]+""+c[8]+"-"+c[9]+""+c[10];
        
        return val;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNumTelefone() {
        
        char[] n = this.numTelefone.toCharArray();
            
        String valn = "("+n[0]+""+n[1]+")"+n[2]+"."+n[3]+""+n[4]+""+n[5]+""+n[6]+"-"+n[7]+""+n[8]+""+n[9]+""+n[10];
        
        return valn;
        
    }
    public void setNumTelefone(String numTelefone) {
        this.numTelefone = numTelefone;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String satatusPessoa(){
        return  " nome: "+nome
                +"\n idade: "+idade
                +"\n cpf: "+cpf
                +"\n número de telefone: "+numTelefone 
                +"\n endereco: "+endereco.toString();
    }
   
}
