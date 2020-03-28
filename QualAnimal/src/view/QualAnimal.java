package view;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import model.Animal;

public class QualAnimal {
	private Animal animalPensado = new Animal();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QualAnimal frame = new QualAnimal();
					frame.penseAnimal();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void penseAnimal() {
		int test = JOptionPane.showConfirmDialog(null, "Pense em um animal", "Jogo dos Animais",
				JOptionPane.OK_CANCEL_OPTION);
		if (test == JOptionPane.OK_OPTION) {
			int ret = JOptionPane.showConfirmDialog(null, "O animal que voc� pensou vive na �gua?", "Jogo do Animais",
					JOptionPane.YES_NO_OPTION);
			if (ret == JOptionPane.YES_OPTION) {
				primeiroPalpite();
			} else {
				segundoPalpite();
			}
		} else {

		}
	}

	public void primeiroPalpite() {
		int ret = JOptionPane.showConfirmDialog(null, "O animal que voc� pensou � um Tubar�o?", "Jogo do Animais",
				JOptionPane.YES_NO_OPTION);
		if (ret == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo dos Animais", JOptionPane.OK_OPTION);
			penseAnimal();
		} else {
			animalPensadoAquatico();
		}
	}

	public void segundoPalpite() {
		int ret = JOptionPane.showConfirmDialog(null, "O animal que voc� pensou � um Macaco?", "Jogo do Animais",
				JOptionPane.YES_NO_OPTION);
		if (ret == JOptionPane.YES_OPTION) {
			JOptionPane.showMessageDialog(null, "Acertei de novo!", "Jogo dos Animais", JOptionPane.OK_OPTION);
			penseAnimal();
		} else {
			animalPensadoNaoAquatico();
		}
	}

	public void animalPensadoAquatico() {
		if (animalPensado.getNome() == null || animalPensado.getNome().isEmpty()) {
			animalPensado.setNome(JOptionPane.showInputDialog("Qual Animal voc� pensou?:"));
		}

		if (animalPensado.getNome() == null || animalPensado.getNome().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe algum valor!", "Jogo dos Animais", JOptionPane.OK_OPTION);
			animalPensadoAquatico();

		} else if (animalPensado.getNome() != null && !animalPensado.getNome().isEmpty()) {
			animalPensado.setDescricao(
					JOptionPane.showInputDialog("Um(a)" + animalPensado.getNome() + " � ____ mas um(a) Tubar�o n�o."));
			if (animalPensado.getDescricao() == null || animalPensado.getDescricao().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Informe algum valor!", "Jogo dos Animais", JOptionPane.OK_OPTION);
				animalPensadoAquatico();

			} else if (animalPensado.getDescricao() != null && !animalPensado.getDescricao().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ent�o o/a  " + animalPensado.getNome() + " "
						+ animalPensado.getDescricao() + " mas um(a) Tubar�o n�o.");
				penseAnimal();

			} else {
				return;
			}
		} else {
			return;
		}

		penseAnimal();
	}

	public void animalPensadoNaoAquatico() {
		if (animalPensado.getNome() == null || animalPensado.getNome().isEmpty()) {
			animalPensado.setNome(JOptionPane.showInputDialog("Qual Animal voc� pensou?:"));
		}

		if (animalPensado.getNome() == null || animalPensado.getNome().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Informe algum valor!", "Jogo dos Animais", JOptionPane.OK_OPTION);
			animalPensadoNaoAquatico();

		} else if (animalPensado.getNome() != null && !animalPensado.getNome().isEmpty()) {
			animalPensado.setDescricao(
					JOptionPane.showInputDialog("Um(a)" + animalPensado.getNome() + " � ____ mas um(a) Macaco n�o."));
			if (animalPensado.getDescricao() == null || animalPensado.getDescricao().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Informe algum valor!", "Jogo dos Animais", JOptionPane.OK_OPTION);
				animalPensadoNaoAquatico();

			} else if (animalPensado.getDescricao() != null && !animalPensado.getDescricao().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Ent�o o/a  " + animalPensado.getNome() + " "
						+ animalPensado.getDescricao() + " mas um(a) Macaco n�o.");
				penseAnimal();

			} else {
				return;
			}
		} else {
			return;
		}
	}

}
