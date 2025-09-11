/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade2;

import java.util.Date;

public class Atividade2 {
    
    // Classe Pessoa
    public static class Pessoa {
        private String nome;
        private String cpf;
        private Date dataNascimento;

        // Construtor que recebe todos os atributos
        public Pessoa(String nome, String cpf, Date dataNascimento) {
            this.nome = nome;
            this.cpf = cpf;
            this.dataNascimento = dataNascimento;
        }

        // Método para calcular o valor das cópias
        public double tirarCopias(int qtd) {
            return 0.10 * qtd;
        }

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public Date getDataNascimento() {
            return dataNascimento;
        }

        public void setDataNascimento(Date dataNascimento) {
            this.dataNascimento = dataNascimento;
        }
    }

    // Classe Aluno que herda de Pessoa
    public static class Aluno extends Pessoa {
        private String matricula;

        // Construtor que recebe os atributos
        public Aluno(String nome, String cpf, Date dataNascimento, String matricula) {
            super(nome, cpf, dataNascimento);
            this.matricula = matricula;
        }

        // Sobrescreve o método tirarCopias para aluno
        @Override
        public double tirarCopias(int qtd) {
            return 0.07 * qtd;
        }

        // Getter e Setter
        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }
    }

    // Classe Professor que herda de Pessoa
    public static class Professor extends Pessoa {
        private double salario;
        private String disciplina;

        // Construtor que recebe todos os atributos
        public Professor(String nome, String cpf, Date dataNascimento, double salario, String disciplina) {
            super(nome, cpf, dataNascimento);
            this.salario = salario;
            this.disciplina = disciplina;
        }

        // Getter e Setter
        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public String getDisciplina() {
            return disciplina;
        }

        public void setDisciplina(String disciplina) {
            this.disciplina = disciplina;
        }
    }

    // Classe Funcionario que herda de Pessoa
    public static class Funcionario extends Pessoa {
        private double salario;
        private String cargo;
        private Date dataAdmissao;

        // Construtor que recebe todos os atributos
        public Funcionario(String nome, String cpf, Date dataNascimento, double salario, String cargo, Date dataAdmissao) {
            super(nome, cpf, dataNascimento);
            this.salario = salario;
            this.cargo = cargo;
            this.dataAdmissao = dataAdmissao;
        }

        // Getter e Setter
        public double getSalario() {
            return salario;
        }

        public void setSalario(double salario) {
            this.salario = salario;
        }

        public String getCargo() {
            return cargo;
        }

        public void setCargo(String cargo) {
            this.cargo = cargo;
        }

        public Date getDataAdmissao() {
            return dataAdmissao;
        }

        public void setDataAdmissao(Date dataAdmissao) {
            this.dataAdmissao = dataAdmissao;
        }
    }

    // Classe principal para o teste
    public static void main(String[] args) {
        // Instanciando objetos
        Aluno aluno = new Aluno("guilherme", "123.456.789-10", new Date(), "A12345");
        Professor professor = new Professor("Bianca", "987.654.321-00", new Date(), 5000.00, "matematica");
        Funcionario funcionario = new Funcionario("Alexandre", "111.222.333-44", new Date(), 3000.00, "secretario", new Date());

        // Exibindo nome e valor gasto ao tirar 100 cópias
        System.out.println("Nome do Aluno: " + aluno.getNome());
        System.out.println("Valor gasto pelo Aluno para 100 copias: R$ " + aluno.tirarCopias(100));

        System.out.println("\nNome do Professor: " + professor.getNome());
        System.out.println("Valor gasto pelo Professor para 100 copias: R$ " + professor.tirarCopias(100));

        System.out.println("\nNome do Funcionario: " + funcionario.getNome());
        System.out.println("Valor gasto pelo Funcionario para 100 copias: R$ " + funcionario.tirarCopias(100));
    }
}
