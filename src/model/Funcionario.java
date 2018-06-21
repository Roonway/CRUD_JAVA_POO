package model;

import java.util.Date;
import java.util.Random;

/**
 *
 * @author Atila e Dheyson
 */
public class Funcionario extends Pessoa implements iFuncionarios{
    
    private double salario;
    private Date dataContratacao = new Date();
    private boolean ferias = false;

    
    public Funcionario(double salario, String nome, int idade, String cpf, String numTelefone, Endereco endereco) {
        super(nome, idade, cpf, numTelefone, endereco);
        this.salario = salario;
    }

    
    public boolean tirarFerias(){
        Random r = new Random();

        if (r.nextInt(2) == 1) {
            this.ferias = true;
            return true;
        }else{
            this.ferias = false;
            return false;
        }
    }
    public void baterPonto(){
        System.out.println(new Date());
    }
    public void trabalhar(){
        System.out.println("Trabalhando...");
    }   
    
    
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public Date getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public String isFerias() {
        String sit;
        if (ferias != true) {
            sit = "Trabalhando.";
        }else{
            sit = "De ferias.";
        }
        return sit;
    }
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }
    
    public String statusFucionario(){
        return  this.satatusPessoa()
                +"\n\n salário: "+salario
                +"\n data de contratacao: "+dataContratacao
                +"\n ferias: "+ferias;
    }
    
    
}
