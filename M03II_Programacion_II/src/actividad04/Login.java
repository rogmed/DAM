package actividad04;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Arrays;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Login extends JFrame {
	private JTextField nombreField;
	private JPasswordField passwordField;
	private User user;
	
	public Login(String file) {
		user = loadLoginData(file);
		
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(500,275);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(90, 70, 80, 14);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contrase\u00F1a");
		lblNewLabel_1.setBounds(90, 120, 80, 14);
		getContentPane().add(lblNewLabel_1);
		
		nombreField = new JTextField();
		nombreField.setBounds(180, 67, 140, 20);
		getContentPane().add(nombreField);
		nombreField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(180, 117, 140, 20);
		getContentPane().add(passwordField);
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(180, 155, 89, 23);
		getContentPane().add(btnAceptar);
		
		JLabel lblMensaje = new JLabel();
		lblMensaje.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensaje.setForeground(Color.RED);
		lblMensaje.setBounds(10, 189, 464, 36);
		getContentPane().add(lblMensaje);
		
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean correctPassword = Arrays.equals(passwordField.getPassword(),user.getPassword().toCharArray());		
				boolean correctUsername = nombreField.getText().equals(user.getUsername());
				if (nombreField.getText().length() == 0 && passwordField.getPassword().length == 0) {
					lblMensaje.setText("DEBES INTRODUCIR LOS DATOS");
				} else if (!correctUsername || !correctPassword) {
					lblMensaje.setText("CREDENCIALES INCORRECTAS");
				} else if (correctUsername && correctPassword ) {
					lblMensaje.setText("CORRECTO!");
			    	new Ventana(user.getUsername());
				}
			}
		});
	}
	
	/*
	 * Load Login Data
	 * 
	 * Esta función coge un String con la dirección del archivo donde está el 
	 * usuario serializado y devuelve ese usuario. El constructor de Login está
	 * hecho de forma que acepta este String y lo usa en esta función.
	 */
	static User loadLoginData(String file) {
		User user;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
			user = (User) ois.readObject();
			ois.close();
			return user;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
