package actividad04;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ventana extends JFrame {
	private JTextField nombreField;
	private JCheckBox chckbxProgramar, chckbxDeporte, chckbxCine;
	private JComboBox<String> comboEdad;
	private ButtonGroup groupSexo;
	private JRadioButton rdbtnHombre, rdbtnMujer;
	private File file = new File("datos_empleados");
	private ArrayList<Empleado> empleados;
	private ArrayList<String> nombresEmpleados = new ArrayList<String>();
	private ArrayList<String> aficiones = new ArrayList<String>();
	
	public Ventana(String username) {
		//Ventana de "Agregar nuevo trabajador"
		setTitle("Agregar nuevo trabajador");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		//Mensaje de buenvenida a <usuario>
		JLabel lblBienvenida = new JLabel("Bienvenido, " + username);
		lblBienvenida.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblBienvenida.setBounds(69, 11, 465, 14);
		getContentPane().add(lblBienvenida);
		
		//Instrucciones breves de la ventana
		JLabel lblInstrucciones = new JLabel("Introduce datos de nuevo trabajador:");
		lblInstrucciones.setBounds(69, 36, 505, 14);
		getContentPane().add(lblInstrucciones);
		
		//Nombre empleado
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(69, 61, 100, 14);
		getContentPane().add(lblNombre);
		
		nombreField = new JTextField();
		lblNombre.setLabelFor(nombreField);
		nombreField.setBounds(179, 58, 200, 20);
		getContentPane().add(nombreField);
		nombreField.setColumns(10);
		
		//Aficiones empleado
		JLabel lblAficiones = new JLabel("Aficiones:");
		lblAficiones.setBounds(69, 106, 100, 14);
		getContentPane().add(lblAficiones);
		
		chckbxProgramar = new JCheckBox("Programar");
		chckbxProgramar.setBounds(175, 102, 97, 23);
		getContentPane().add(chckbxProgramar);
		
		chckbxDeporte = new JCheckBox("Deporte");
		chckbxDeporte.setBounds(282, 102, 97, 23);
		getContentPane().add(chckbxDeporte);
		
		chckbxCine = new JCheckBox("Cine");
		chckbxCine.setBounds(393, 102, 97, 23);
		getContentPane().add(chckbxCine);
		
		//Edad empleado
		JLabel lblEdad = new JLabel("Edad:");
		lblEdad.setBounds(69, 151, 100, 14);
		getContentPane().add(lblEdad);
		
		comboEdad = new JComboBox<String>();
		lblEdad.setLabelFor(comboEdad);
		comboEdad.setModel(new DefaultComboBoxModel(new String[] {"", "0-15", "16-20", "21-25", "26-30", "31-40", "41-50", "51+"}));
		comboEdad.setBounds(179, 147, 70, 22);
		getContentPane().add(comboEdad);
		
		//Sexo empleado
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(69, 196, 100, 14);
		getContentPane().add(lblSexo);
		
		rdbtnHombre = new JRadioButton("Hombre");
		lblSexo.setLabelFor(rdbtnHombre);
		rdbtnHombre.setToolTipText("");
		rdbtnHombre.setBounds(175, 192, 109, 23);
		getContentPane().add(rdbtnHombre);
		
		rdbtnMujer = new JRadioButton("Mujer");
		rdbtnMujer.setBounds(282, 192, 109, 23);
		getContentPane().add(rdbtnMujer);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(600,400);
		
		groupSexo = new ButtonGroup();
		groupSexo.add(rdbtnHombre);
		groupSexo.add(rdbtnMujer);
		
		//Botones "Nuevo Empleado" y "Mostrar Empleados"
		JButton btnNuevoEmpleado = new JButton("Nuevo Empleado");
		btnNuevoEmpleado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				checkFile(file);
				
				/* Comprueba si todos los campos están rellenos y muestra
				 * un mensaje de error si falta alguno
				 */
				if(	nombreField.getText().isEmpty() || 
					comboEdad.getSelectedItem().toString().length() == 0 ||
					groupSexo.getSelection() == null ||
					(!chckbxProgramar.isSelected() &&
					!chckbxDeporte.isSelected() &&
					!chckbxCine.isSelected())
					) {
					JOptionPane.showMessageDialog(null, "Rellena todos los campos", "Aviso",2);
				
				/* Si el usuario ya existe, muestra una advertencia
				 * 
				 */
				} else if (nombresEmpleados.contains(nombreField.getText())){
					for (int i = 0; i < empleados.size() ; i++) {
						System.out.println(empleados.get(i).toString());
						if(empleados.get(i).getNombre().equals(nombreField.getText())) {
							System.out.println("Se borra " +i+" - " + empleados.get(i).toString());
							empleados.remove(i);
							break;
						}
					}
					addEmpleado("Empleado "+ nombreField.getText()+" ya existe."
							+ " Se ha actualizado con la información introducida.");
					
				/* Si todos los campos están rellenos, crea el nuevo empleado y
				 * lo añade al archivo. Luego limpia el formulario y muestra
				 * un mensaje de nuevo empleado creado con su nombre.
				 */
				} else {
					addEmpleado("Nuevo empleado creado: "+ nombreField.getText());
				}
			}
		});
		btnNuevoEmpleado.setBounds(69, 265, 150, 23);
		getContentPane().add(btnNuevoEmpleado);
		
		JButton btnMostrarEmpleados = new JButton("Mostrar Empleados");
		btnMostrarEmpleados.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkFile(file);
				String listaEmpleados = "Empleados:\n";
				if (empleados != null) {
					for (Empleado em:empleados) {
						listaEmpleados += "- " + em.toString() + "\n";
					}
					JOptionPane.showMessageDialog(null, listaEmpleados, "Lista de empleados",-1);
				}
			}
		});
		btnMostrarEmpleados.setBounds(282, 265, 150, 23);
		getContentPane().add(btnMostrarEmpleados);
	}
	
	/* Check File
	 * Comprueba que el archivo pasado como parámetro existe
	 */
	private void checkFile(File file) {
		if(file.exists()) {
			//System.out.println("Archivo datos_empleados ya existe.");
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
				empleados = (ArrayList<Empleado>) ois.readObject();
				for (Empleado em: empleados) {
					nombresEmpleados.add(em.getNombre());
				}
				ois.close();
			} catch (Exception e) {
				e.getStackTrace();
			}
			
		} else {
			//System.out.println("Archivo datos_empleados no existe.");
			empleados = new ArrayList<Empleado>();
		}
	}
	
	/* Clear Fields
	 * Vacía todos los campos de esta ventana
	 */
	private void clearFields() {
		nombreField.setText(null);
		chckbxProgramar.setSelected(false);
		chckbxDeporte.setSelected(false);
		chckbxCine.setSelected(false);
		comboEdad.setSelectedIndex(0);
		groupSexo.clearSelection();
	}
	
	/* Usa los valores actuales de todos los campos para crear un nuevo empleado
	 * y al final usa clearFields() para limpiar todos los campos.
	 */
	private void addEmpleado(String texto) {
		if (chckbxProgramar.isSelected()) { aficiones.add(chckbxProgramar.getText()); }
		if (chckbxDeporte.isSelected()) { aficiones.add(chckbxDeporte.getText()); }
		if (chckbxCine.isSelected()) { aficiones.add(chckbxCine.getText()); }
		String sexo = (rdbtnHombre.isSelected())?"Hombre":"Mujer";

		Empleado nuevoEmpleado = new Empleado(
				nombreField.getText(),
				comboEdad.getSelectedItem().toString(),
				sexo,
				aficiones
				);
		
		empleados.add(nuevoEmpleado);
		nombresEmpleados.add(nuevoEmpleado.getNombre());
		//System.out.println("Empleado anadido");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file)); 
			oos.writeObject(empleados);
			oos.close();
			JOptionPane.showMessageDialog(null, texto,"Empleados",1);
		} catch (FileNotFoundException e) {
			e.getMessage();
		} catch (IOException e) {
			e.getMessage();
		} 
		clearFields();
		aficiones.clear();
	}
}