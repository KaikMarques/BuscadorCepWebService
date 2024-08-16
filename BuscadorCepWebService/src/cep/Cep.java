package cep;

import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Atxy2k.CustomTextField.RestrictedTextField;

public class Cep extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtCep;
	private JTextField txtEndereco;
	private JTextField txtBairro;
	private JTextField txtCidade;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cep frame = new Cep();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Cep() {
		setTitle("Buscar CEP");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Cep.class.getResource("/img/home.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CEP");
		lblNewLabel.setBounds(10, 25, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtCep = new JTextField();
		txtCep.setBounds(60, 22, 125, 20);
		contentPane.add(txtCep);
		txtCep.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Endereço");
		lblNewLabel_1.setBounds(10, 58, 60, 14);
		contentPane.add(lblNewLabel_1);
		
		txtEndereco = new JTextField();
		txtEndereco.setBounds(95, 53, 240, 20);
		contentPane.add(txtEndereco);
		txtEndereco.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Bairro");
		lblNewLabel_2.setBounds(10, 94, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txtBairro = new JTextField();
		txtBairro.setBounds(60, 91, 275, 20);
		contentPane.add(txtBairro);
		txtBairro.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Cidade");
		lblNewLabel_3.setBounds(10, 134, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		txtCidade = new JTextField();
		txtCidade.setBounds(60, 131, 97, 20);
		contentPane.add(txtCidade);
		txtCidade.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("UF");
		lblNewLabel_4.setBounds(228, 134, 24, 14);
		contentPane.add(lblNewLabel_4);
		
		JComboBox cboUf = new JComboBox();
		cboUf.setModel(new DefaultComboBoxModel(new String[] {"", "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cboUf.setBounds(275, 130, 60, 22);
		contentPane.add(cboUf);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setBounds(10, 213, 89, 23);
		contentPane.add(btnLimpar);
		
		JButton btnCep = new JButton("Buscar");
		btnCep.setBounds(195, 21, 89, 23);
		contentPane.add(btnCep);
		
		JButton btnSobre = new JButton("");
		btnSobre.setToolTipText("Sobre");
		btnSobre.setIcon(new ImageIcon(Cep.class.getResource("/img/about.png")));
		btnSobre.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSobre.setBorder(null);
		btnSobre.setBackground(SystemColor.control);
		btnSobre.setBounds(375, 201, 49, 49);
		contentPane.add(btnSobre);
		
		/* Uso da biblioteca Atxy2k para validação do campo txtCep */
		RestrictedTextField validar = new  RestrictedTextField(txtCep);
		validar.setOnlyNums(true);
		validar.setLimit(8);
	}//fim do construtor
}
