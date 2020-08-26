package br.com.serratec.projetofinal;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionarios extends Pessoas implements Calculos {
	private double salarioBruto  ;
	private double descontoInss  ;
	private double descontoIR    ;
	private double salarioLiquido;
	private double contaIr       ;
	
	private List <String    > listaCpf   = new ArrayList<String>();
	private List <dependente> dependentes;

	@Override
	public void calculaInss() {
		
		if (salarioBruto <= 1751.81) {
			descontoInss = salarioBruto * 0.08;
		} else if (salarioBruto >= 1751.82 && salarioBruto <= 2919.72) {
			descontoInss = salarioBruto * 0.09;
		} else if (salarioBruto >= 2919.73 && salarioBruto <= 5839.45) {
			descontoInss = salarioBruto * 0.11;
		} else {
			descontoInss = 5839.456 * 0.11;
		}
	}

	@Override
	public void calculaIr() {
		 
		contaIr = salarioBruto - descontoInss - (189.59 * dependentes.size());
		if (contaIr <= 1903.98) {
			salarioLiquido = salarioBruto - descontoInss;
		} else if (contaIr >= 1903.99 && contaIr <= 2826.65) {
			descontoIR = contaIr * 0.075 - 142.80;
			salarioLiquido = salarioBruto - descontoIR - descontoInss;
		} else if (contaIr >= 2826.66 && contaIr <= 3751.05) {
			descontoIR = contaIr * 0.15 - 354.80;
			salarioLiquido = salarioBruto - descontoIR - descontoInss;
		} else if (contaIr >= 3751.06 && contaIr <= 4664.68) {
			descontoIR = contaIr * 0.225 - 636.13;
			salarioLiquido = salarioBruto - descontoIR - descontoInss;
		} else {
			descontoIR = contaIr * 0.275 - 869.36;
			salarioLiquido = salarioBruto - descontoIR - descontoInss;
		}
	}

	public void tratamentoExcecoes() {
		if (cpf.length() != 11) {
			throw new DependentException("O cpf inválido");
		}
		for (dependente d : dependentes) {
			if (d.getIdade() < 18) {
				throw new DependentException("O dependente já¡ passou dos 18, não é mais reconhecido como tal");
			}
		}
		for (dependente d : dependentes) {
			for (dependente e : dependentes) {
				if (e.getCpf().equals(d.getCpf())) {
					throw new DependentException("O cpf do dependente " + e.getNome()
							+ "Já foi cadastrado, por favor verifique e digite o cpf corretamente");
				}
			}
		}

	}

	public void adicionarCpf(String cpf) {
		listaCpf.add(cpf);
	}

	public List<String> getListaCpf() {
		return listaCpf;
	}

	@Override
	public String toString() {
		return "Funcionarios [dependentes=" + dependentes + " Lista de cpf" + listaCpf;
	}

	public Funcionarios(String nome, String cpf, LocalDate dataNascimento, Sexo sexo, double salarioBruto) {
		super(nome, cpf, dataNascimento, sexo);
		this.salarioBruto = salarioBruto;
	}

}