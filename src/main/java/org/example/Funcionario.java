package org.example;

public class Funcionario extends Pessoa {
    private int salario;

    public Funcionario(String nome, int idade, int salario) {
        super(nome, idade);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + getNome() + '\'' +
                ", idade=" + getIdade() +
                ", salario=" + salario +
                '}';
    }
}
