package br.com.serratec.projetofinal;

import java.time.LocalDate;

public class Pessoas {
	
	    protected String nome;
	    protected String cpf;
	    protected LocalDate dataNascimento;
	    protected Sexo sexo;

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

	    public LocalDate getDataNascimento() {
	        return dataNascimento;
	    }

	    public void setDataNascimento(LocalDate dataNascimento) {
	        this.dataNascimento = dataNascimento;
	    }

	    public Pessoas(String nome, String cpf, LocalDate dataNascimento, Sexo sexo) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.dataNascimento = dataNascimento;
	        this.sexo = sexo;
	    }

		public void calculaInss() {
			
			
		}

		public void calculaIr() {
			
			
		}



	    
	}


