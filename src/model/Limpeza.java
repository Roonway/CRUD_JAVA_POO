package model;

import java.util.Date;

/**
 *
 * @author Atila e Dheyson
 */
public final class Limpeza extends Funcionario implements iFuncionarios{
    
    private String cargo = "Limpeza";
    private String turno;
    

    public Limpeza() {
        super(0, null, 0, null, null, null);
    }
    public Limpeza(String turno, double salario, String nome, int idade, String cpf, String numTelefone, Endereco endereco) {
        super(salario, nome, idade, cpf, numTelefone, endereco);
        this.turno = turno;
    }
    
    
    @Override
    public void baterPonto(){
        Date d = new Date();
        System.out.println("O funcionário de limpeza: "+this.getNome()+"bateu o ponto as "+d.getHours()+":"+d.getMinutes()+" Horas");
    }
    @Override
    public void trabalhar(){
        System.out.println("Limpando o cinema...");
    }
    public void status(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("Numero de Telefone: "+this.getNumTelefone());
        System.out.print("Bairro: "+this.getEndereco().getBairro());
        System.out.print("Rua: "+this.getEndereco().getRua());
        System.out.println("Nº da casa: "+this.getEndereco().getCasa());
        System.out.println("Salário: "+this.getSalario());
        System.out.println("Data de contratação: "+this.getDataContratacao());
        System.out.println("Esta: "+this.isFerias());
        System.out.println("Turno: "+this.getTurno());
    }

    
    
    public String getCargo() {
        return cargo;
    }
    public String getTurno() {
        return turno;
    }
    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return this.statusFucionario() 
                +"\n\n cargo: "+cargo
                +"\n turno: "+turno+"\n";
    }
    
}
