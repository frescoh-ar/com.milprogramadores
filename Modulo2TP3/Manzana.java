package com.milprogramadores.Modulo2TP3;

public class Manzana  extends Fruta{

	public Manzana(double Peso) {
		super(Peso);
		// TODO Auto-generated constructor stub
	}

	public double hacerJugo() {
		return this.getPeso()*0.3;
	}

}
