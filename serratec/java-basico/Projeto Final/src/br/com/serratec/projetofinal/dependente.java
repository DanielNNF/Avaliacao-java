package br.com.serratec.projetofinal;

import java.time.LocalDate;

public class dependente extends Pessoas {
    private Parentesco parentesco;
    private int ano = LocalDate.now().getYear();
    private int idade = (ano - dataNascimento.getYear());


    public Parentesco getParentesco() {
        return parentesco;
    }

    public void setParentesco(Parentesco parentesco) {
        this.parentesco = parentesco;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public dependente(String nome, String cpf, LocalDate dataNascimento, Sexo sexo, Parentesco parentesco) {
        super(nome, cpf, dataNascimento, sexo);
        this.parentesco = parentesco;
    }

    
}