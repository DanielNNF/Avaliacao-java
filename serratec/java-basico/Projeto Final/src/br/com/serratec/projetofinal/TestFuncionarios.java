package br.com.serratec.projetofinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestFuncionarios {

        public static void main(String[] args) {
                String caminho;
                String file;
                Scanner in = new Scanner(System.in);



                System.out.println("Digite o caminho ABSOLUTO para leitura do arquivo");
                caminho = in.nextLine();
                file = caminho.replace("\"", "\\");
                /*try {
                        BufferedReader read = new BufferedReader(new FileReader(file));
                        
                        String[] lista = read.readLine().split(",");
                        // System.out.println(func1.getNome() + " " + func1.getCpf() + " " + func1.getDataNascimento());
                        
                } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                }*/

                try {
        			BufferedReader bf = new BufferedReader(new FileReader("c:\\teste\\arquivo2.txt"));
        			String linha = bf.readLine();
        			String[]palavras = linha.split(",");
        			for(String s : palavras) {
        				System.out.println(s);
        				
        				while ((linha = bf.readLine()) != null) {
        				     System.out.println(linha);
        				}

        				bf.close();
        			}
        		}catch (IOException e) {
        			System.out.println("Erro ao acessar o arquivo");
        			
        		}


    }
}