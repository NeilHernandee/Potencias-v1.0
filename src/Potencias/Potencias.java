package Potencias;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.ProcessHandle.Info;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Potencias extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected static final Short Integrer = null;
	private JPanel contentPane;
	private JTextField textBase;
	private JTextField textExponente;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Potencias frame = new Potencias();
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
	public Potencias() {
		setTitle("Calculadora de Potencias");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 266);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblBase = new JLabel("Base :");
		
		textBase = new JTextField();
		textBase.setColumns(10);
		
		JLabel lblExponente = new JLabel("Exponente :");
		
		textExponente = new JTextField();
		textExponente.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int base = Integer.parseInt(textBase.getText());
				int exponente = Integer.parseInt(textExponente.getText());
				int resultado = 0;
				resultado = base;
				
					for(int i = exponente; i>1; i--) {
						
						resultado *= base;
						
					}

					
				String resultadoText = Integer.toString(resultado);
				lblResultado.setText("Su resultado es: " + resultadoText);
							
			}
		});
		
		lblResultado = new JLabel("");
		lblResultado.setHorizontalAlignment(SwingConstants.LEFT);
		
		JButton btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textBase.setText("");
				textExponente.setText(null);
				lblResultado.setText(null);
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(btnCalcular, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
				.addComponent(btnLimpiar, GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblExponente)
						.addComponent(lblBase))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textExponente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(93, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblResultado, GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
					.addGap(65))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(lblBase)
							.addComponent(textBase, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblExponente)
								.addComponent(textExponente, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(lblResultado, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(btnCalcular)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnLimpiar)
					.addContainerGap(32, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
