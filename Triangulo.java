package aula16;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Triangulo implements CalculaArea {

	private Double altura;

	private Double base;

	public Double getAltura() {
		
		return altura;
	}

	public void setAltura(Double altura) {

		if (altura <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a 0");

		}

		else {

			this.altura = altura;

		}

	}

	public Double getBase() {

		return base;
	}

	public void setBase(Double base) {

		if (base <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a 0");

		}

		else {

			this.base = base;

		}
	}

	public Triangulo(Double base, Double altura) {

		this.base = base;

		this.altura = altura;
	}

	public void calcularArea() {

		Double area = base * altura / 2;

		JOptionPane.showMessageDialog(null, "Área do Triângulo:  " + formatarDecimais(area));

	}

	public String formatarDecimais(Double numero) {

		String decimalFormatado;

		DecimalFormat df = new DecimalFormat("##.## m²");

		decimalFormatado = df.format(numero);

		return decimalFormatado;

	}

}
