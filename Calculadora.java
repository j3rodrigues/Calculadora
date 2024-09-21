package Calculadora;

public class Calculadora {
	private double resultado;
	private double num1;
	private double num2;
	private int operador;
	private String informacoes; //utilizada para avisar ao usuário algum problema durante a realização dos cálculos
	
	public Calculadora(double resultado, double num1, double num2, int operador, String informacoes) {
		this.resultado = resultado;
		this.num1 = num1;
		this.num2 = num2;
		this.operador = operador;
		this.informacoes = informacoes;
	}
	

	private double somar() {
		this.resultado = this.num1 + this.num2;
		return this.resultado;
	}

	private double subtrair() {
		return this.resultado = this.num1 - this.num2;
	}

	private double multiplicar() {
		return this.resultado = this.num1 * this.num2;
	}

	private double dividir() {
		return this.resultado = (this.num1 / this.num2);
	}

	public void setNum1(double n1) {
		this.num1 = n1;
	}

	public void setNum2(double n2) {
		this.num2 = n2;
	}
	
	public void setOperador(int op) {
		this.operador = op;
	}
	
	public double getResultado() {
		return this.resultado;
	}
	
	public String getInformacoes() {
		this.informacoes = "ERRO, TENTE NOVAMENTE";
		return informacoes;
	}
	
	public void realizarOperacao() {
		switch(this.operador){
			case 2:
				somar();
				break;
			case 3:
				subtrair();
				break;
			case 4:
				multiplicar();
				break;
			case 5:
				dividir();
				break;
			case 6:
				break;
		}
		
//		if (this.operador == 2) {
//			System.out.println("Resultado da opcao 2: " + somar());
//		}
//		else if (this.operador == 3) {
//			System.out.println("Resultado da opcao 3: " + subtrair());
//		}
//		else if (this.operador == 4) {
//			System.out.println("Resultado da opcao 4: " + multiplicar());
//		}
//		else if (this.operador == 5) {
//			System.out.println("Resultado da opcao 5: " + dividir());
//		}
//		else if (this.operador <= 0  || this.operador > 6) {
//			System.out.println("Digite novamente entre 1 e 6");
//		}
			
	}

	
}
