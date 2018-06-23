package viewCine;

import java.util.ArrayList;
import java.util.Scanner;
import model.Administrador;
import model.Atendente;
import model.Endereco;
import model.Filme;
import model.Gerente;
import model.Limpeza;

/**
 *
 * @author Atila e Dheyson
 */
public class Cinema {

    private static final ArrayList<Gerente>  G = new ArrayList(); 
    private static final ArrayList<Atendente> A = new ArrayList();
    private static final ArrayList<Limpeza> L = new ArrayList();
    private static final ArrayList<Filme> FIL = new ArrayList();
    private static final ArrayList<Administrador> ADMIN = new ArrayList<>();

    private static final Administrador ADM = new Administrador();
    
    private static final Scanner SCN = new Scanner(System.in);
    
    
    public static void main (String [] args){
        
        int z = 0;
        do {            
            System.out.println("---------- |Cinema| ----------");
            System.out.println("1 - Funcionário");
            System.out.println("2 - Filme");
            System.out.println("3 - Sair");
            int menu0 = SCN.nextInt();
            
            switch(menu0){
                
                case 1:  
                    int x = 0;
                    do {
                        System.out.println("---------- |Menu-Funcionário| ----------");
                        
                            System.out.println("1 - Cadastrar funcionário");
                            System.out.println("2 - Remover funcionário");
                            System.out.println("3 - Procurar funcionário");
                            System.out.println("4 - Alterar funcionário");
                            System.out.println("5 - Lista de funcionário");
                            System.out.println("6 - Sair");
                            int menu1 = SCN.nextInt();
                            
                        System.out.println("------------------------------");
                        
                        int qtdFun = G.size()+A.size()+L.size();

                        switch(menu1){

                            case 1:
                                System.out.println("---------- |Cadastrar Funcionário| ----------");

                                System.out.println("1 - Gerente | 2 - Atendente | 3 - Limpeza");
                                int menu2 = SCN.nextInt();

                                switch(menu2){
                                    case 1:
                                        Gerente ger = cadGerenteFun();
                                        G.add(ger);
                                        break;
                                    case 2:
                                        Atendente aten = cadAtendenteFun();
                                        A.add(aten);
                                        break;
                                    case 3:
                                        Limpeza lim = cadLimpezaFun();
                                        L.add(lim);
                                        break;

                                    default:
                                        System.out.println("Opção inválida");
                                        break;

                                }
                                System.out.println("----------------------------------------");
                                break;

                            case 2:
                                System.out.println("---------- |Remover Funcionário| ----------");

                                System.out.println("Remover qual funcionário? ");
                                String rmv = SCN.next();

                                removerFun(rmv);

                                System.out.println("----------------------------------------");
                                break;
                                
                            case 3:
                                System.out.println("---------- |Procurar Funcionário| ----------");

                                System.out.println("Você tem "+qtdFun+" funcionários");

                                System.out.print("Procurar qual funcionário? ");
                                String proc = SCN.next();

                                procurarFun(proc);

                                System.out.println("----------------------------------------");
                                break;
                            case 4:
                                System.out.println("---------- |Alterar Funcionário| ----------");

                                System.out.println("Você tem "+qtdFun+" funcionários");

                                System.out.print("Qual funcionário voce quer alterar? ");
                                String alte = SCN.next();
                                
                                alterarFun(alte);

                                System.out.println("----------------------------------------");
                                break;

                            case 5:
                                System.out.println("---------- |Listar Funcionário| ----------");
                                
                                System.out.println("1 - Lista de gerente");
                                System.out.println("2 - Lista de atendente");
                                System.out.println("3 - Lista de funcionários da limpeza");
                                System.out.println("4 - Lista de todos os funcionários");
                                int menu5 = SCN.nextInt();

                                listarFun(menu5);
                                
                                System.out.println("----------------------------------------");
                                break;

                            case 6:
                                x = 5;
                                break;
                        }
                    } while (x < 5); 
                    break;
                    
                case 2:
                    
                    System.out.println("Login: ");
                    String user = SCN.next();
                    
                    System.out.println("Senha: ");
                    String pass = SCN.next();
                    
                    if (verificaDados(user, pass)){
                        int mf = 0 ;//contador do menu filmes
                        do { 
                            System.out.println("----------------------------<Menu de Filmes>----------------------------");

                                System.out.println("\n1 - Cadastrar filme");
                                System.out.println("2 - Remover filme");
                                System.out.println("3 - Procurar filme");
                                System.out.println("4 - Alterar filme");
                                System.out.println("5 - Listar de filme");
                                System.out.println("6 - ADM e filmes");
                                System.out.println("7 - Sair\n");
                                int menuf1 = SCN.nextInt();

                            System.out.println("------------------------------------------------------------");
                            
                            switch(menuf1){
                                    
                                case 1:
                                    System.out.println("|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨Cadastrar Filmes¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|");
                                    
                                        Filme filme = cadFilme();
                                        ADM.addFilmes(filme);
                                        FIL.add(filme);
                                    
                                    break;
                                    
                                case 2:
                                    
                                    System.out.println("|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨Remover Filme¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|\n");
                                    
                                        System.out.println("\nVocê tem ["+FIL.size()+"] filmes cadastrados");

                                        if (+FIL.size()==0) {
                                            System.out.println("Você não tem filmes cadastrados");
                                        }
                                        System.out.println("\nDigite o título que quer remover: ");
                                        String rmvfil = SCN.next();

                                        removerFilme(rmvfil);
                                    break;
                                    
                                case 3:
                                    
                                    System.out.println("|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨Procurar Filme¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|\n");
                                    
                                    System.out.println("\nVocê tem ["+FIL.size()+"] filmes cadastrados");
                                    
                                    System.out.println("\nDigite o título do filme: ");
                                    String srcfil = SCN.next();
                                    
                                    procurarFilme(srcfil);
                                    break;
                                    
                                case 4:
                                    
                                    System.out.println("|¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨Alterar Filme¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|\n");
                                    
                                    System.out.println("\nVocê tem ["+FIL.size()+"] filmes cadastrados");
                                    
                                    System.out.println("\nDigite o título do filme: ");
                                    String altFilme = SCN.next();
                                    
                                    alterarFilme(altFilme);
                                       
                                    break;
                                    
                                case 5:
                                    System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|Lista de Filme¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|\n");
                                    
                                    System.out.println("\nVocê tem ["+FIL.size()+"'] filmes cadastrados");
                                    
                                    listarFilme();
                                    break;
                                    
                                case 6:
                                    
                                    System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|ADM e Filme¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|\n");
                                    
                                    verAdmFilme();
                                    
                                    break;
                                case 7:
                                    
                                    mf = 5;
                                    break;
                            }
                            
                        } while (mf < 5);
                    }
                    break;
                case 3: 
                    
                    z=5;
                    break;
            }
        } while (z < 5 );
    }
    
    
//Métodos do CRUD Funcionários
    
public static double salarioMenu( int s ){
    
    double salario = 0;
    
    switch(s){
            
        case 1:
            salario = 1000;
            break;
        case 2:
            salario = 954.75;
            break;
        default:
            salario = 975.75;
            break;
    }   
     return salario;
}

public static String setorLocalTurnoFunMenu ( String opcao, int valor ){
    
    String set = "null";
    String tur = "null";
    String loc = "null";
    
    if(opcao.equals("setor")){
        
            if (valor == 1) {
                set = "Bilheteria";
            }else if(valor ==2){
                set = "Lanchonete";
            }else if(valor==3){
                set = "Filmes";
            }
            return set;
        
    }else if(opcao.equals("turno")){
            if (valor == 1) {
                tur = "Manhã/Tarde";
            }else{
                tur = "Noite";
            }
            return tur;
        
    }else if(opcao.equals("local")){
            if (valor == 1) {
                loc = "Bilheteria";
            }else{
                loc = "Lanchonete";
            }
            return loc;
    }
    
    return "null";
}
    
public static Gerente cadGerenteFun(){
    
    System.out.println("Gerente");

    System.out.print("Nome: ");
    String nome = SCN.next();

    System.out.print("Idade: ");
    int idade = SCN.nextInt();

    System.out.print("CPF: ");
    String cpf = SCN.next();

    System.out.print("Telefone: ");
    String tel = SCN.next();

    System.out.print("Bairro: ");
    String bairro = SCN.next();

    System.out.print("Rua: ");
    String rua = SCN.next();

    System.out.print("Casa: ");
    String casa = SCN.next();

    System.out.println("Salário: 1 - 1000 | 2 - 900 ");
    int sl = SCN.nextInt();
    double salario = salarioMenu(sl);

    System.out.println("Setor: 1 - Bilheteria | 2 - Lanchonete | 3 - Filmes  ");
    int setor = SCN.nextInt();
    String set = setorLocalTurnoFunMenu("setor", setor);

    Endereco e = new Endereco(bairro,rua,casa);
    Gerente ger = new Gerente(set, salario, nome ,idade, cpf, tel, e);
    
    if (set.equals("Filmes")) {
        Administrador Adminisrador = new Administrador(set, salario, nome, idade, cpf, tel, e);
        ADMIN.add(Adminisrador);
    }
    ger.baterPonto();
    
    return ger;
}

public static Atendente cadAtendenteFun(){
    
    System.out.println("Atendente");

    System.out.print("Nome: ");
    String nome = SCN.next();

    System.out.print("Idade: ");
    int idade = SCN.nextInt();

    System.out.print("CPF: ");
    String cpf = SCN.next();

    System.out.print("Telefone: ");
    String tel = SCN.next();

    System.out.print("Bairro: ");
    String bairro = SCN.next();

    System.out.print("Rua: ");
    String rua = SCN.next();

    System.out.print("Casa: ");
    String casa = SCN.next();

    System.out.println("Salário: 1 - 1000 | 2 - 900 ");
    int sl = SCN.nextInt();
    double salario = salarioMenu(sl);

    System.out.println("Turno: 1 - Manhã/Tarde | 2 - Noite  ");
    int turno = SCN.nextInt();

    System.out.println("Local: 1 - Bilheteria | 2 - Lanchonete  ");
    int local = SCN.nextInt();

    String tur = setorLocalTurnoFunMenu("turno", turno);
    String loc = setorLocalTurnoFunMenu("local", local);

    Endereco en = new Endereco(bairro,rua,casa);
    Atendente aten = new Atendente(tur,loc,salario, nome, idade, cpf, tel,en);

    return aten;
}

public static Limpeza cadLimpezaFun(){
    
    System.out.println("Limpeza");

    System.out.print("Nome: ");
    String nome = SCN.next();

    System.out.print("Idade: ");
    int idade = SCN.nextInt();

    System.out.print("CPF: ");
    String cpf = SCN.next();

    System.out.print("Telefone: ");
    String tel = SCN.next();

    System.out.print("Bairro: ");
    String bairro = SCN.next();

    System.out.print("Rua: ");
    String rua = SCN.next();

    System.out.print("Casa: ");
    String casa = SCN.next();

    System.out.println("Salário: 1 - 1000 | 2 - 900 ");
    int sl = SCN.nextInt();
    double salario = salarioMenu(sl);

    System.out.println("Turno: 1 - Manhã/Tarde | 2 - Noite  ");
    int turno2 = SCN.nextInt();

    String tur2 = setorLocalTurnoFunMenu("turno", turno2);

    Endereco end = new Endereco(bairro,rua,casa);
    Limpeza lim =  new Limpeza(tur2,salario, nome, idade, cpf, tel,end);
    
    return lim;
}

public static void procurarFun( String proc ){
    
    for (int j = 0; j < G.size(); j++) {
        Gerente gerPesq = G.get(j); 
        if ((gerPesq.getNome().equalsIgnoreCase(proc)) || (gerPesq.getCpf().equals(proc)) ) {
            System.out.println(gerPesq);  
        }
    }
    
    for (int j = 0; j < A.size(); j++) {
        Atendente atePesq = A.get(j);
        if ((atePesq.getNome().equalsIgnoreCase(proc)) || (atePesq.getCpf().equals(proc))) {
            System.out.println(atePesq);
        }
    } 
    
    for (int j = 0; j < L.size(); j++) {
        Limpeza limPesq = L.get(j);
        if ((limPesq.getNome().equalsIgnoreCase(proc)) || (limPesq.getCpf().equals(proc))) {
            System.out.println(limPesq);
        }
    }
    
}

public static void removerFun( String rmv ){
    
    for (int j = 0; j < G.size(); j++) {
        Gerente gerPesq = G.get(j);
        if ((gerPesq.getNome().equalsIgnoreCase(rmv)) || (gerPesq.getCpf().equals(rmv)) ) {
            G.remove(j);
            System.out.println("Removido!");
        }
    }
    
    for (int j = 0; j < A.size(); j++) {
        Atendente atePesq = A.get(j);
        if ((atePesq.getNome().equalsIgnoreCase(rmv)) || (atePesq.getCpf().equals(rmv))) {
            A.remove(j);
            System.out.println("Removido!");
        }
    } 
    
    for (int j = 0; j < L.size(); j++) {
        Limpeza limPesq = L.get(j);
        if ((limPesq.getNome().equalsIgnoreCase(rmv)) || (limPesq.getCpf().equals(rmv))) {
            L.remove(j);
            System.out.println("Removido!");
        }
    }
    
}

public static void alterarFun( String alte ){
    
    for (int i = 0; i < G.size(); i++) {
        Gerente gerPesq = G.get(i); 
        if ((gerPesq.getNome().equalsIgnoreCase(alte)) || (gerPesq.getCpf().equals(alte)) ) {
            Gerente alterarG = cadGerenteFun();
            G.set(i, alterarG);
            System.out.println("Alterado!");
        }
    }
    
    for (int i = 0; i < A.size(); i++) {
        Atendente atePesq = A.get(i);
        if ((atePesq.getNome().equalsIgnoreCase(alte)) || (atePesq.getCpf().equals(alte))) {
            Atendente alterarA = cadAtendenteFun();
            A.set(i, alterarA);
            System.out.println("Alterado!");
        }
    } 
    
    for (int i = 0; i < L.size(); i++) {
        Limpeza limPesq = L.get(i);
        if ((limPesq.getNome().equalsIgnoreCase(alte)) || (limPesq.getCpf().equals(alte))) {
            Limpeza alterarL = cadLimpezaFun();
            L.set(i, alterarL);
            System.out.println("Alterado!");
        }
    }
    
}

public static void listarFun( int valor ){
    switch(valor){
        case 1:
            for (Gerente fun : G) {
                System.out.println("-----------------------Gerentes------------------------------");
                    fun.status();
                System.out.println("-------------------------------------------------------------");
            }
            break;
        case 2:
            for (Atendente fun : A) {
                System.out.println("---------------------Atendentes------------------------------");
                    fun.status();
                System.out.println("-------------------------------------------------------------");
            }
            break;
        case 3:
            for (Limpeza fun : L) {
                System.out.println("------------------Funcionários-da-Limpeza--------------------");
                    fun.status();
                System.out.println("-------------------------------------------------------------");
            }
            break;
        case 4:

            for (Gerente fun : G) {
                System.out.println("--------------------Funcionário------------------------------");
                    fun.status();
                System.out.println("-------------------------------------------------------------");
            }
            for (Atendente fun : A) {
                System.out.println("--------------------Funcionário------------------------------");
                    fun.status();
                System.out.println("-------------------------------------------------------------");
            }
            for (Limpeza fun : L) {
                System.out.println("--------------------Funcionário------------------------------");
                    fun.status();
                System.out.println("-------------------------------------------------------------");
            }
            break;
        default:
            System.out.println("Opção invalida");
            break;
    }
}


// Métodos do CRUD Filme

public static boolean verificaDados(String user , String pass) {
    boolean data = false;
    for (int i = 0; i < ADMIN.size(); i++) {
        if ((ADMIN.get(i).getNome().equals(user)) && (ADMIN.get(i).getSenha().equals(pass))) {
            return data = true;
        }
    }
    return data;
}

public static String classificacaoMenu( int clss ){
    String classificacao = "";
    switch(clss){
        case 1:
            classificacao = "L";
        case 2:
            classificacao = "+10";
        case 3:
            classificacao = "+12";
        case 4:
            classificacao = "+14";
        case 5:
            classificacao = "+16";
        case 6:
            classificacao = "+18";
        default:
           classificacao = "";
    }
    return classificacao;
}

public static String generoMenu( int gn ){
    String genero = "";
    switch(gn){
        case 1:
            genero = "Western";
            break;
        case 2:
            genero = "Noir";
            break;
        case 3:
            genero = "Pulp";
            break;
        case 4:
            genero = "Guerra";
            break;
        case 5:
            genero = "Ação";
            break;
        case 6:
            genero = "Aventura";
            break;
    }
    return genero;
}

public static void addFilmeADM( Filme f ){
    for (int i = 0; i < ADMIN.size(); i++) {
        if (ADMIN.get(i).getNome().equals(G.get(i).getNome())) {
            if (G.get(i).getSetor().equals("Filmes")) {
                ADMIN.get(i).addFilmes(f);
            }
        } 
    }
}

public static void removerFilmeADM( int i ){
    
    for (int j = 0; j < ADMIN.size(); j++) {
        if (ADMIN.get(j).getNome().equals(G.get(j).getNome())) {
            if (G.get(j).getSetor().equals("Filmes")) {
                if (FIL.get(i).getTitulo().equals(ADMIN.get(j).getFilmes().get(j).getTitulo())) {
                    ADMIN.get(i).removerFilme(j);
                }
            }
        }
    }
    
}

public static void alterarFilmeADM( int i, Filme f ){
    
    for (int j = 0; j < ADMIN.size(); j++) {
        if (ADMIN.get(j).getNome().equals(G.get(j).getNome())) {
            if (G.get(j).getSetor().equals("Filmes")) {
                if (FIL.get(i).getTitulo().equals(ADMIN.get(j).getFilmes().get(j).getTitulo())) {
                    ADMIN.get(i).alterarFilme(f);
                }
            }
        }
    }
    
}

public static void verAdmFilme(){
    
    for (int i = 0; i < ADMIN.size(); i++) {
        System.out.println("---------- | ADM - Filme | ----------");
        System.out.println("ADM: "+ADMIN.get(i).getNome());
        for (Filme fil : ADMIN.get(i).getFilmes()) {
            fil.status();
            System.out.println("");
        }
        System.out.println("--------------------------------------");
    }
    
}

public static Filme cadFilme(){
    
    System.out.println("Título:");
    String titulo = SCN.next();

    System.out.println("Classificação:"); 
    System.out.println("1 - |  L  |");
    System.out.println("2 - | +10 |");
    System.out.println("3 - | +12 |");
    System.out.println("4 - | +14 |");
    System.out.println("5 - | +16 |");
    System.out.println("6 - | +18 |");
    int clss = SCN.nextInt();

    String classificacao = classificacaoMenu(clss);
   
    System.out.println("Diretor(a):");                                   
    String diretor = SCN.next();

    System.out.println("Produtora:");
    String produtora = SCN.next();

    System.out.println("Duração:");
    System.out.println("| em minutos |");                         
    int duracao = SCN.nextInt();

    System.out.println("Gênero:");
    System.out.println("1 - Western");
    System.out.println("2 - Noir");
    System.out.println("3 - Pulp");
    System.out.println("4 - Guerra");
    System.out.println("5 - Ação");
    System.out.println("6 - Aventura");

    int gn = SCN.nextInt();
    
    String genero = generoMenu(gn);

    Filme filme = new Filme(titulo, classificacao, diretor, produtora, duracao, genero);
    
    addFilmeADM(filme);
    
    return filme; 
}

public static void procurarFilme( String srcfil ){
    
    for (int i = 0; i < FIL.size(); i++) {
        Filme srcFilm = FIL.get(i);
        if(srcFilm.getTitulo().equalsIgnoreCase(srcfil)){  
            System.out.println(srcFilm);
        }else{ 
            System.out.println("Voce digitou o título errado, tente novamente");     
        }
    } 
    
}

public static void removerFilme( String rmvfil ){
    
    for (int i = 0; i < FIL.size(); i++) { 
        Filme rmvFilm = FIL.get(i);
        if (rmvFilm.getTitulo().equalsIgnoreCase(rmvfil)) {
            
            removerFilmeADM(i);
            
            FIL.remove(i);
            System.out.println("Filme Removido");
        }
    } 
}

public static void alterarFilme( String alter ){
    
    for (int i = 0; i < FIL.size(); i++) {
        Filme srcFilm = FIL.get(i);
        if(srcFilm.getTitulo().equalsIgnoreCase(alter)){  
            Filme film = cadFilme();
            
            alterarFilmeADM(i, film);
            
            FIL.set(i, film);
        }
    } 
    
}

public static void listarFilme(){
    
    for (Filme film : FIL) {
        System.out.println("\"¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨<Filmes>¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨|\\n"); 
        film.status();
    }
   
}

}
