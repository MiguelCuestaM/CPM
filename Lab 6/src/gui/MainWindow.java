package gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logic.Game;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.border.LineBorder;
import javax.swing.plaf.basic.BasicSliderUI.ComponentHandler;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainWindow extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private Game game = null;
	private JButton btnDice;
	private JLabel lblSpaceship;
	private JLabel lblScore;
	private JTextField textScore;
	private JLabel lblEarth;
	private JPanel pnShots;
	private JPanel pnBoard;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;

	/**
	 * Create the frame.
	 */
	public MainWindow(Game game) {
		setResizable(false);
		setTitle("Space Invasion!");
		setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/img/invader.jpg")));
		this.game = game;

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getBtnDice());
		contentPane.add(getLblSpaceship());
		contentPane.add(getLblScore());
		contentPane.add(getTextScore());
		contentPane.add(getLblEarth());
		contentPane.add(getPnShots());
		contentPane.add(getPnBoard());
		
	
	}

	private JButton getBtnDice() {
		if (btnDice == null) {
			btnDice = new JButton("");
			btnDice.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					initGame();
				}
			});
			btnDice.setDisabledIcon(new ImageIcon(MainWindow.class.getResource("/img/dice.jpg")));
			btnDice.setFocusPainted(false);
			btnDice.setBorderPainted(false);
			btnDice.setIcon(new ImageIcon(MainWindow.class.getResource("/img/dice.jpg")));
			btnDice.setBounds(10, 11, 114, 113);
		}
		return btnDice;
	}

	private JLabel getLblSpaceship() {
		if (lblSpaceship == null) {
			lblSpaceship = new JLabel("");
			lblSpaceship.setIcon(new ImageIcon(MainWindow.class.getResource("/img/spaceship.png")));
			lblSpaceship.setBounds(274, 11, 137, 97);
		}
		return lblSpaceship;
	}

	private JLabel getLblScore() {
		if (lblScore == null) {
			lblScore = new JLabel("Score");
			lblScore.setFont(new Font("Consolas", Font.BOLD, 22));
			lblScore.setForeground(Color.WHITE);
			lblScore.setBounds(566, 25, 74, 39);
		}
		return lblScore;
	}

	private JTextField getTextScore() {
		if (textScore == null) {
			textScore = new JTextField();
			textScore.setForeground(Color.GREEN);
			textScore.setHorizontalAlignment(SwingConstants.CENTER);
			textScore.setFont(new Font("Consolas", Font.BOLD, 26));
			textScore.setText("0");
			textScore.setEditable(false);
			textScore.setBounds(541, 63, 114, 48);
			textScore.setColumns(10);
		}
		return textScore;
	}

	private JLabel getLblEarth() {
		if (lblEarth == null) {
			lblEarth = new JLabel("");
			lblEarth.setIcon(new ImageIcon(MainWindow.class.getResource("/img/earth.jpg")));
			lblEarth.setBounds(731, 11, 193, 175);
		}
		return lblEarth;
	}

	private JPanel getPnShots() {
		if (pnShots == null) {
			pnShots = new JPanel();
			pnShots.setBounds(215, 126, 256, 73);
		}
		return pnShots;
	}

	private JPanel getPnBoard() {
		if (pnBoard == null) {
			pnBoard = new JPanel();
			pnBoard.setBorder(new LineBorder(new Color(0, 0, 255), 5));
			pnBoard.setBounds(10, 390, 914, -119);
			pnBoard.setLayout(new GridLayout(1, 0, 0, 0));
			pnBoard.add(getBtnNewButton());
			pnBoard.add(getBtnNewButton_1());
			pnBoard.add(getBtnNewButton_2());
			pnBoard.add(getBtnNewButton_3());
			pnBoard.add(getBtnNewButton_4());
			pnBoard.add(getBtnNewButton_5());
			pnBoard.add(getBtnNewButton_6());
			pnBoard.add(getBtnNewButton_7());
		}
		return pnBoard;
	}

	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shoot(0);
				}
			});
			btnNewButton.setBorder(new LineBorder(Color.BLUE, 5));
		}
		return btnNewButton;
	}

	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("New button");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shoot(1);
				}
			});
			btnNewButton_1.setBorder(new LineBorder(Color.BLUE, 5));
		}
		return btnNewButton_1;
	}

	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("New button");
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shoot(2);
				}
			});
			btnNewButton_2.setBorder(new LineBorder(Color.BLUE, 5));
		}
		return btnNewButton_2;
	}

	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("New button");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shoot(3);
				}
			});
			btnNewButton_3.setBorder(new LineBorder(Color.BLUE, 5));
		}
		return btnNewButton_3;
	}

	private JButton getBtnNewButton_4() {
		if (btnNewButton_4 == null) {
			btnNewButton_4 = new JButton("New button");
			btnNewButton_4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shoot(4);
				}
			});
			btnNewButton_4.setBorder(new LineBorder(Color.BLUE, 5));
		}
		return btnNewButton_4;
	}

	private JButton getBtnNewButton_5() {
		if (btnNewButton_5 == null) {
			btnNewButton_5 = new JButton("New button");
			btnNewButton_5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shoot(5);
				}
			});
			btnNewButton_5.setBorder(new LineBorder(Color.BLUE, 5));
		}
		return btnNewButton_5;
	}

	private JButton getBtnNewButton_6() {
		if (btnNewButton_6 == null) {
			btnNewButton_6 = new JButton("New button");
			btnNewButton_6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shoot(6);
				}
			});
			btnNewButton_6.setBorder(new LineBorder(Color.BLUE, 5));
		}
		return btnNewButton_6;
	}

	private JButton getBtnNewButton_7() {
		if (btnNewButton_7 == null) {
			btnNewButton_7 = new JButton("New button");
			btnNewButton_7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shoot(7);
				}
			});
			btnNewButton_7.setBorder(new LineBorder(Color.BLUE, 5));
		}
		return btnNewButton_7;
	}

	private JLabel newShot() {
		JLabel newShot = new JLabel("");
		newShot.setBorder(new LineBorder(Color.GREEN, 1));
		newShot.setIcon(ImageFactory.getImage());
		return newShot;
	}

	private void enableBoard(boolean state) {
		for (Component c : pnBoard.getComponents()) {
			c.setEnabled(state);
		}
	}

	private void paintShots() {
		for (int i = 0; i < game.getShots(); i++) {
			getPnShots().add(newShot());
		}
		pnShots.validate();
	}

	private void initGame() {
		game.launch();
		paintShots();
		btnDice.setEnabled(false);
		enableBoard(true);
	}
	
	private void removeShot() {
		pnShots.remove(0);
		pnShots.repaint();
	}
	
	private void paintCell(int position) {
		ImageIcon image = ImageFactory.getImage(game.getBoard().getCells()[position]);
		((JButton)pnBoard.getComponent(position)).setIcon(image);
		((JButton)pnBoard.getComponent(position)).setDisabledIcon(image);
	}
	
	private void updateStateOfTheGame(int position) {
		getTextScore().setText(String.valueOf(game.getScore()));
		removeShot();
		paintCell(position);
		if (game.isGameOver()) {
			JOptionPane.showMessageDialog(this, "Game Over!", "Space Invasion!", JOptionPane.INFORMATION_MESSAGE);
			enableBoard(false);
		}
	}
	
	private void shoot(int position) {
		game.shoot(position);
		updateStateOfTheGame(position);
	}
}
