package Calculadora;

import java.util.Scanner;

public class TUI {
	Scanner tec = new Scanner(System.in);
	Calculadora calc = new Calculadora(0, 0, 0, 0, null);
	
	private String [][] interfaceG;
	private String s1;
	private String s2;
	private int op;
	private double n1 = 0;
	private double n2 = 0;
	private String resul;
	private void interfaceCalc() {
		interfaceG = new String [][]	{
			{"###################"},
			{"#                 #"},
			{"#*****************#"},
			{"#*               *#"},
			{"#*               *#"},
			{"#*               *#"},
			{"#*****************#"},
			{"#                 #"},
			{"# Operacao:       #"},
			{"# 1-Entrar Dados  #"},
			{"# 2-Soma          #"},
			{"# 3-Subtracao     #"},
			{"# 4-Multiplicacao #"},
			{"# 5-Divisao       #"},
			{"# 6-Exit          #"},
			{"#                 #"},
			{"###################"}
		};
	}
	
	public TUI() {
		interfaceCalc();
	}
	
	private void exibirInterface() {
		for(int i = 0; i < 17; i++) {
			for(int j = 0; j < 1; j++) {
				System.out.print(interfaceG[i][j]);
			}
			System.out.println();
		}
	}
	
	private void maximoS() {
		s1 = Double.toString (this.n1);
		s2 = Double.toString (this.n2);
		resul = Double.toString (calc.getResultado());
		if(s1.length() >= 11 || s2.length() >= 11) {
			System.out.println(calc.getInformacoes());
			System.out.println("Quantidade de numero invalida (max. 7)");
		}
	}
	
	private void cases() {
		while(interfaceG[5][0].length() < 17) {
			interfaceG[5][0] += " ";
		}
		interfaceG[5][0] += "*#";
		if(resul.length() > 11) {
			System.out.println(calc.getInformacoes());
			System.out.println("A quantidade de numero da resposta eh invalida (max. 7)");
			interfaceG[5][0] = "#*               *#";
		}
	}
	
	private void mudandoTui() {
		maximoS();
		
		switch(this.op){
		case 1:
			if(s1.length() < 11 && s2.length() < 11) {
				interfaceG[3][0] = "#*n1:" + s1;
				interfaceG[4][0] = "#*n2:" + s2;
				while(interfaceG[3][0].length() < 17) {
					interfaceG[3][0] += " ";
				}
				while(interfaceG[4][0].length() < 17) {
					interfaceG[4][0] += " ";
				}
				interfaceG[3][0] += "*#";
				interfaceG[4][0] += "*#";
			}
			else {
				interfaceG[3][0] = "#*               *#";
				interfaceG[4][0] = "#*               *#";
			}
			break;
			case 2:
				interfaceG[5][0] = "#*2- " + resul;
				cases();
				break;
			case 3:
				interfaceG[5][0] = "#*3- " + resul;
				cases();
				break;
			case 4:
				interfaceG[5][0] = "#*4- " + resul;
				cases();
				break;
			case 5:
				interfaceG[5][0] = "#*5- " + resul;
				cases();
				break;
		}
	}
	
	public void rodando() {
		exibirInterface();
		System.out.println("LEMBRE-SE:");
		System.out.println("Operacoes sao entre 1 e 6");
		System.out.println("E numeros que voce pode inserir e os resultados sao no maximo ate 7");
		System.out.println(" ");
		System.out.println("Escolha uma opcao: ");
		op = tec.nextInt();
		calc.setOperador(op);
		
		while (op != 6) {
			if (op != 1) {
				calc.realizarOperacao();
			}
			if (op > 6) {
				System.out.println(calc.getInformacoes()); 
				System.out.println("Operacoes sao entre 1 e 6");
			}
			if (op == 1) {
				System.out.println("Digite o primero numero: ");
				n1 = tec.nextDouble();
				calc.setNum1(n1);
			
				System.out.println("Digite o segundo numero: ");
				n2 = tec.nextDouble();
				calc.setNum2(n2);
			}
			mudandoTui();
			exibirInterface();
			
			System.out.println("Escolha uma opcao: ");
			op = tec.nextInt();
			calc.setOperador(op);
		}
		interfaceG[3][0] = "#*    OPCAO 6    *#";
		interfaceG[4][0] = "#*      EXIT     *#";
		interfaceG[5][0] = "#*               *#";
		exibirInterface();
	}
}
