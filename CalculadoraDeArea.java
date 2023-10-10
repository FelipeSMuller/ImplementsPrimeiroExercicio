package aula16;

import javax.swing.JOptionPane;

public class CalculadoraDeArea {

	public static void main(String[] args) {

		Double altura = 0.0;

		Double base = 0.0;

		Double largura = 0.0;

		Triangulo triangulo1 = new Triangulo(0.0, 0.0);

		Retangulo retangulo1 = new Retangulo(0.0, 0.0);

		int opcao = 0;

		do {

			try {

				opcao = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Escolha uma opção \n1-Cálcular Área do Retângulo \n2-Cálcular Área do Triângulo"));

			} catch (NullPointerException | NumberFormatException erro) {

				JOptionPane.showMessageDialog(null,
						"Dados inválidos foram inseridos ou o programa foi fechado incorretamente");
			}

			switch (opcao) {

			case 1:

				altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura"));

				largura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a largura"));

				retangulo1.setAltura(altura);

				retangulo1.setLargura(largura);

				retangulo1.calcularArea();

				break;

			case 2:

				altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a altura"));

				base = Double.parseDouble(JOptionPane.showInputDialog(null, "Insira a base"));

				triangulo1.setAltura(altura);

				triangulo1.setBase(base);

				triangulo1.calcularArea();

				break;

			default:

				JOptionPane.showMessageDialog(null,
						"Nenhuma opção foi selecionada , portanto a aplicação foi finalizada!!");

				break;
			}

		} while (opcao > 0);

	}

}
