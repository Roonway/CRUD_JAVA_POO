package model;

import java.util.Date;

/**
 *
 * @author Atila e Dheyson
 */
public final class Atendente extends Funcionario implements iFuncionarios {
    
    private String cargo = "Atendente";
    private String turno;
    private String local;

    
    public Atendente() {
        super(0, null, 0, null, null, null);
    }
    public Atendente(String turno, String local, double salario, String nome, int idade, String cpf, String numTelefone, Endereco endereco) {
        super(salario, nome, idade, cpf, numTelefone, endereco);
        this.turno = turno;
        this.local = local;
    }

    
    @Override
    public void baterPonto(){
        Date d = new Date();
        System.out.println("O atendente: "+this.getNome()+"bateu o ponto as "+d.getHours()+":"+d.getMinutes()+" Horas");
    }
    @Override
    public void trabalhar(){
        if (this.local == "bilheteria" || this.local == "Bilheteria" ) {
            System.out.println("Vendendo bilhetes...");
        } else {
            System.out.println("Vendendo lanches");
        }
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
        System.out.println("Local: "+this.getLocal());
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
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return  this.statusFucionario()
                + "\n\n cargo: "+cargo
                +"\n turno: "+turno
                +"\n local: "+local+"\n";
    }
    
}
