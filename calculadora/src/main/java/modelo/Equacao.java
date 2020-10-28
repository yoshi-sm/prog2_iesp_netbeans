/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author xiuki
 */
public class Equacao {
    private double numero1;
    private double numero2;
    private String operador;

    //construtores
    public Equacao(){}
    
    public Equacao(double numero1, double numero2, String operador) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operador = operador;
    }
    
    //metodos
    public String conta(){
		if (this.operador.equals("+")){
			return String.valueOf(this.numero1 + this.numero2);
		}
		else if (this.operador.equals("-")){
			return String.valueOf(this.numero1 - this.numero2);
		}
		else if (this.operador.equals("*")){
			return String.valueOf(this.numero1 * this.numero2);
		}
		else if (this.operador.equals("/")){
			return String.valueOf(this.numero1 / this.numero2);
		}
		else {
			return "393939939";
		}
	}
    
    
    
    
    //toString
    public String toString() {
        return "Equacao{" + "numero1=" + numero1 + ", numero2=" + numero2 + ", operador=" + operador + '}';
    }
    
    
    //get & set
    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }
    
    
}
