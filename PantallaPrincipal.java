import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class PantallaPrincipal extends JFrame implements ActionListener{
	private JLabel labelLogo, labelBienvenido, labelTitle, labelNombre, labelAPaterno, labelAMaterno, labelDepartamento, labelAntiguedad, labelResultado, labelfooter;
	private JTextField txtFNombre, txtFApellidoPaterno, txtFApellidoMaterno;
	private JComboBox comboDepartamento, comboAntiguedad;
	private JTextArea textarea1;
	private JScrollPane scrollpane1;
	private JMenuBar menubar1;
	private JMenu menuOpciones, menuCalcular, menuAcercaDe, menuColorFondo;
	private JMenuItem miCalculo, miRojo, miMorado, miNegro, miElCreador, miSalir, miNuevo;
	String nombreAdmin = "";

	public PantallaPrincipal(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pantalla principal");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombreAdmin = ventanaBienvenida.texto;

		menubar1 = new JMenuBar();
		menubar1.setBackground(new Color(255,0,0));
		setJMenuBar(menubar1);

		menuOpciones = new JMenu("Opciones");
		menuOpciones.setBackground(new Color(255,0,0));
		menuOpciones.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.setForeground(new Color(255,255,255));
		menubar1.add(menuOpciones);

		menuCalcular = new JMenu("Calcular");
		menuCalcular.setBackground(new Color(255,0,0));
		menuCalcular.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.setForeground(new Color(255,255,255));
		menubar1.add(menuCalcular);

		menuAcercaDe = new JMenu("Acerca de");
		menuAcercaDe.setBackground(new Color(255,0,0));
		menuAcercaDe.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.setForeground(new Color(255,255,255));
		menubar1.add(menuAcercaDe);

		menuColorFondo = new JMenu("Color de fondo");
		menuColorFondo.setForeground(new Color(255,0,0));
		menuColorFondo.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.add(menuColorFondo);

		miCalculo = new JMenuItem("Vacaciones");
		miCalculo.setForeground(new Color(255,0,0));
		miCalculo.setFont(new Font("Andale Mono", 1, 14));
		menuCalcular.add(miCalculo);
		miCalculo.addActionListener(this);

		miNegro = new JMenuItem("Negro");
		miNegro.setForeground(new Color(255,0,0));
		miNegro.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.add(miNegro);
		miNegro.addActionListener(this);


		miRojo = new JMenuItem("Rojo");
		miRojo.setForeground(new Color(255,0,0));
		miRojo.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.add(miRojo);
		miRojo.addActionListener(this);


		miMorado = new JMenuItem("Morado");
		miMorado.setForeground(new Color(255,0,0));
		miMorado.setFont(new Font("Andale Mono", 1, 14));
		menuColorFondo.add(miMorado);
		miMorado.addActionListener(this);

		miNuevo = new JMenuItem("Nuevo");
		miNuevo.setFont(new Font("Andale Mono", 1, 14));
		miNuevo.setForeground(new Color(255,0,0));
		menuOpciones.add(miNuevo);
		miNuevo.addActionListener(this);

		miSalir = new JMenuItem("Salir");
		miSalir.setForeground(new Color(255,0,0));
		miSalir.setFont(new Font("Andale Mono", 1, 14));
		menuOpciones.add(miSalir);
		miSalir.addActionListener(this);

		miElCreador = new JMenuItem("El creador");
		miElCreador.setForeground(new Color(255,0,0));
		miElCreador.setFont(new Font("Andale Mono", 1, 14));
		menuAcercaDe.add(miElCreador);
		miElCreador.addActionListener(this);

		ImageIcon imagen = new ImageIcon("images/logo-coca.png");
		labelLogo = new JLabel(imagen);
		labelLogo.setBounds(5,5,250,100);
		add(labelLogo);

		labelBienvenido = new JLabel("Bienvenido " + nombreAdmin);
		labelBienvenido.setBounds(280,30,300,50);
		labelBienvenido.setForeground(new Color(255,255,255));
		labelBienvenido.setFont(new Font("Andale Mono", 1, 14));
		add(labelBienvenido);

		labelTitle = new JLabel("Datos del trabajador para el calculo de vacaciones");
		labelTitle.setBounds(45,140,900,25);
		labelTitle.setForeground(new Color(255,255,255));
		labelTitle.setFont(new Font("Andale Mono", 1, 14));
		add(labelTitle);

		labelNombre = new JLabel("Nombre:(*) ");
		labelNombre.setBounds(25,188,180,25);
		labelNombre.setForeground(new Color(255,255,255));
		labelNombre.setFont(new Font("Andale Mono", 1, 12));
		add(labelNombre);

		txtFNombre = new JTextField();
		txtFNombre.setBounds(25,213,150,25);
		txtFNombre.setFont(new java.awt.Font("Andale Mono",1,14));
		txtFNombre.setBackground(new java.awt.Color(224,224,224));
		txtFNombre.setForeground(new java.awt.Color(255,0,0));
		add(txtFNombre);

		labelAPaterno = new JLabel("Apellido paterno:(*)");
		labelAPaterno.setBounds(25,248,180,25);
		labelAPaterno.setForeground(new Color(255,255,255));
		labelAPaterno.setFont(new Font("Andale Mono", 1, 12));
		add(labelAPaterno);

		txtFApellidoPaterno = new JTextField();
		txtFApellidoPaterno.setBounds(25,273,150,25);
		txtFApellidoPaterno.setFont(new java.awt.Font("Andale Mono",1,14));
		txtFApellidoPaterno.setBackground(new java.awt.Color(224,224,224));
		txtFApellidoPaterno.setForeground(new java.awt.Color(255,0,0));
		add(txtFApellidoPaterno);

		labelAMaterno = new JLabel("Apellido materno:(*)");
		labelAMaterno.setBounds(25,308,180,25);
		labelAMaterno.setForeground(new Color(255,255,255));
		labelAMaterno.setFont(new Font("Andale Mono", 1, 12));
		add(labelAMaterno);

		txtFApellidoMaterno = new JTextField();
		txtFApellidoMaterno.setBounds(25,334,150,25);
		txtFApellidoMaterno.setFont(new java.awt.Font("Andale Mono",1,14));
		txtFApellidoMaterno.setBackground(new java.awt.Color(224,224,224));
		txtFApellidoMaterno.setForeground(new java.awt.Color(255,0,0));
		add(txtFApellidoMaterno);

		labelDepartamento = new JLabel("Seleccione su departamento:(*)");
		labelDepartamento.setBounds(220,188,180,25);
		labelDepartamento.setForeground(new Color(255,255,255));
		labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
		add(labelDepartamento);

		comboDepartamento = new JComboBox();
		comboDepartamento.setBounds(220,213,220,25);
		comboDepartamento.setBackground(new java.awt.Color(224,224,224));
		comboDepartamento.setFont(new java.awt.Font("Andale Mono", 1, 14));
		comboDepartamento.setForeground(new java.awt.Color(255,0,0));
		add(comboDepartamento);
		comboDepartamento.addItem("");
		comboDepartamento.addItem("Atencion al cliente");
		comboDepartamento.addItem("Departamento de logistica");
		comboDepartamento.addItem("Departamento de gerencia");

		labelAntiguedad = new JLabel("Seleccione su antiguedad:(*)");
		labelAntiguedad.setBounds(220,248,180,25);
		labelAntiguedad.setFont(new Font("Andale Mono", 1, 12));
		labelAntiguedad.setForeground(new Color(255,255,255));
		add(labelAntiguedad);

		comboAntiguedad = new JComboBox();
		comboAntiguedad.setBounds(220,273,220,25);
		comboAntiguedad.setBackground(new java.awt.Color(224,224,224));
		comboAntiguedad.setFont(new java.awt.Font("Andale Mono", 1, 14));
		comboAntiguedad.setForeground(new java.awt.Color(255,0,0));
		add(comboAntiguedad);
		comboAntiguedad.addItem("");
		comboAntiguedad.addItem("1 anio de servicio");
		comboAntiguedad.addItem("2 a 6 anios de servicio");
		comboAntiguedad.addItem("7 o mas anios de servicio");

		labelResultado = new JLabel("Resultado del calculo:");
		labelResultado.setBounds(220,307,180,25);
		labelResultado.setFont(new Font("Andale Mono", 1, 12));
		labelResultado.setForeground(new Color(255,255,255));
		add(labelResultado);

		textarea1 = new JTextArea();
		textarea1.setEditable(false);
		textarea1.setBackground(new Color(255,255,255));
		textarea1.setText("\n    Aqui aparacera el resultado del calculo de las vacaciones." );
		textarea1.setFont(new Font("Andale Mono", 1, 11));
		textarea1.setForeground(new Color(0,0,0));
		scrollpane1 = new JScrollPane(textarea1);
		scrollpane1.setBounds(220,333,385,90);
		add(scrollpane1);

		labelfooter = new JLabel("©2019 The Coca-Cola Company | Todos los derechos reservados.");
		labelfooter.setBounds(135,445,500,30);
		labelfooter.setFont(new java.awt.Font("Andale Mono", 1, 12));
		labelfooter.setForeground(new java.awt.Color(255,255,255));
		add(labelfooter);
	}

	public void actionPerformed(ActionEvent e) {

		Container fondo = this.getContentPane();

		if (e.getSource() == miCalculo) {
			String nombreTrab = txtFNombre.getText();
			String ap = txtFApellidoPaterno.getText();
			String am = txtFApellidoMaterno.getText();
			String depto = comboDepartamento.getSelectedItem().toString();
			String antiguedadTrab = comboAntiguedad.getSelectedItem().toString();

			if (nombreTrab.equals("") || ap.equals("") || depto.equals("") || antiguedadTrab.equals("")) {
				JOptionPane.showMessageDialog(null, "Por favor, llene todos los campos con su informacion.");	
				} else {
					if (depto.equals("Atencion al cliente")) {
						if (antiguedadTrab.equals("1 anio de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 6 dias de vacaciones.");
						}
						if (antiguedadTrab.equals("2 a 6 anios de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 14 dias de vacaciones.");	
						}
						if (antiguedadTrab.equals("7 o mas anios de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 20 dias de vacaciones.");
						}
					}

					if (depto.equals("Departamento de logistica")) {
						if (antiguedadTrab.equals("1 anio de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 7 dias de vacaciones.");
						}
						if (antiguedadTrab.equals("2 a 6 anios de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 15 dias de vacaciones.");	
						}
						if (antiguedadTrab.equals("7 o mas anios de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 22 dias de vacaciones.");
						}
					}

					if (depto.equals("Departamento de gerencia")) {
						if (antiguedadTrab.equals("1 anio de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 10 dias de vacaciones.");
						}
						if (antiguedadTrab.equals("2 a 6 anios de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 20 dias de vacaciones.");	
						}
						if (antiguedadTrab.equals("7 o mas anios de servicio")) {
							textarea1.setText("\n El trabajador " + nombreTrab + " " + ap + " " + " " + am + "\n quien trabaja en " + depto + " con " + antiguedadTrab + "\n recibe 30 dias de vacaciones.");
						}
					}
				}	
		}
		if (e.getSource() == miRojo) {
			fondo.setBackground(new Color(255,0,0));
		}
		if (e.getSource() == miNegro) {
			fondo.setBackground(new Color(0,0,0));
		}
		if (e.getSource() == miMorado) {
			fondo.setBackground(new Color(51,0,51));
		}
		if (e.getSource() == miNuevo) {
			txtFNombre.setText("");
			txtFApellidoMaterno.setText("");
			txtFApellidoPaterno.setText("");
			comboAntiguedad.setSelectedIndex(0);
			comboDepartamento.setSelectedIndex(0);
		}
		if (e.getSource() == miSalir) {
			Bienvenida interfazBienvenida = new Bienvenida();
			interfazBienvenida.setBounds(0,0,350,450);
			interfazBienvenida.setVisible(true);
			interfazBienvenida.setResizable(false);
			interfazBienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
		if (e.getSource() == miElCreador) {
			JOptionPane.showMessageDialog(null, "Desarrollado por Martin Martinez \nmas info: www.linkedin.com/in/martin/nicolas/martinez/");
		}
	}

	public static void main(String[] args) {
		PantallaPrincipal principal = new PantallaPrincipal();
		principal.setBounds(0,0,640,535);
		principal.setVisible(true);
		principal.setResizable(false);
		principal.setLocationRelativeTo(null);
	}
}