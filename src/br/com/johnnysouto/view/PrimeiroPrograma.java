package br.com.johnnysouto.view;

import br.com.johnnysouto.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Tom", "Vermelho", 3);
		
		System.out.println(gato.toString());

	}

}
