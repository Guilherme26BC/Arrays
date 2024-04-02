package usuário;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;

public class SegundaTela {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaTela window = new SegundaTela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SegundaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Teste");
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// CRIAÇÃO e PROPRIEDADES DO BOTAO
		JButton btnNewButton = new JButton("Sair");
		btnNewButton.setBackground(SystemColor.window);
		btnNewButton.setToolTipText("Clique aqui para sair da aplicação\r\n");
		btnNewButton.setForeground(SystemColor.controlShadow);
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btnNewButton.setBounds(334, 227, 90, 25);

		btnNewButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		// ADICIONANDO O BOTÂO AO PAINEL
		panel.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(20, 11, 46, 14);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setBounds(20, 28, 389, 33);
		panel.add(textField);
		textField.setColumns(10);

		JButton btnBemVindo = new JButton("Bem vindo");
		btnBemVindo.setToolTipText("Clique aqui para sair da aplicação\r\n");
		btnBemVindo.setForeground(SystemColor.controlShadow);
		btnBemVindo.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		btnBemVindo.setBackground(Color.WHITE);
		btnBemVindo.setBounds(213, 227, 102, 25);

		btnBemVindo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				textField.setText(" ");
				JOptionPane.showMessageDialog(null, "bemVindo: " + text);
			}
		});
		panel.add(btnBemVindo);
	}
}
