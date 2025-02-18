package org.example;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();
        Funcionario f1 = new Funcionario("caio",15,50000);
        Funcionario f2 = new Funcionario("jao",19,70000);
        Funcionario f3 = new Funcionario("carlos",49,5000);
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);


        for(Funcionario f : funcionarios){
            double vx ;
            vx=(double)f.getSalario()/1200;
            System.out.println(vx);
            if(f.getNome()=="jao"){
                funcionarios.remove(f);
            }

        }
        for(Funcionario f : funcionarios){
           System.out.println(f);

        }




    }
}