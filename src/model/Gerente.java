package model;

import java.util.Date;

/**
 *
 * @author Atila e Dheyson
 */
public class Gerente extends Funcionario implements iFuncionarios{
    
    private String cargo = "Gerente";
    private double bonusSalario = 150;
    private String setor;
    

    public Gerente() {
        super(0, null, 0, null, null, null);
    }
    public Gerente(String setor, double salario, String nome, int idade, String cpf, String numTelefone, Endereco endereco) {
        super(salario, nome, idade, cpf, numTelefone, endereco);
        this.setor = setor;
    }
    
    
    @Override
    public void baterPonto(){
        Date d = new Date();
        System.out.println("O gerente: "+this.getNome()+"bateu o ponto as "+d.getHours()+":"+d.getMinutes()+" Horas");
    }
    @Override
    public void trabalhar(){
        System.out.println("Gerenciando cinema...");
    }
    public void status(){
        double s = this.bonusSalario+this.getSalario();
          
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("Numero de Telefone: "+this.getNumTelefone());
        System.out.print("Bairro: "+this.getEndereco().getBairro());
        System.out.print(" Rua: "+this.getEndereco().getRua());
        System.out.println(" Nº da casa: "+this.getEndereco().getCasa());
        System.out.println("Bonus no salário: "+this.getBonusSalario());
        System.out.println("Salario: "+s);
        System.out.println("Data de contratação: "+this.getDataContratacao());
        System.out.println("Esta: "+this.isFerias()); 
        System.out.println("Setor: "+this.getSetor());
    }
    

    
    public String getCargo() {
        return cargo;
    }
    public double getBonusSalario() {
        return bonusSalario;
    }
    public void setBonusSalario(double bonusSalario) {
        this.bonusSalario = bonusSalario;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String toString() {
        return  this.statusFucionario()
                +"\n\n cargo: " + cargo
                +"\n bonus no salario:" + bonusSalario 
                +"\n setor: " + setor+"\n";
    }
    
}
