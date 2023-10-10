package aula16;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Retangulo implements CalculaArea {

	private Double altura;

	private Double largura;

	public Retangulo(Double altura, Double largura) {

		this.altura = altura;

		this.largura = largura;
	}

	public void calcularArea() {

		Double area = altura * largura;

		JOptionPane.showMessageDialog(null, "Área do Retângulo:  " + formatarDecimais(area));

	}

	public Double getAltura() {

		return altura;
	}

	public void setAltura(Double altura) {

		if (altura <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a zero");

		}

		else {

			this.altura = altura;

		}
	}

	public Double getLargura() {

		return largura;
	}

	public void setLargura(Double largura) {

		if (largura <= 0) {

			JOptionPane.showMessageDialog(null, "Não é possível inserir um número negativo ou igual a zero");

		}

		else {

			this.largura = largura;

		}
	}

	public String formatarDecimais(Double numero) {

		String decimalFormatado;

		DecimalFormat df = new DecimalFormat("##.## m²");

		decimalFormatado = df.format(numero);

		return decimalFormatado;

	}

}
