import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Terminosycond extends JFrame implements ActionListener, ChangeListener{
	private JLabel label1, label2;
	private JScrollPane scrollpane1;
	private JTextArea area1;
	private JCheckBox checkbox1;
	private JButton boton1, boton2;
	String nombre = "";

	public Terminosycond(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());
		Bienvenida ventanaBienvenida = new Bienvenida();
		nombre = ventanaBienvenida.texto;

		ImageIcon imagen = new ImageIcon("images/coca-cola.png");

		label1 = new JLabel(imagen);
		label1.setBounds(315,135,300,300);
		add(label1);

		label2 = new JLabel("TERMINOS Y CONDICIONES");
		label2.setBounds(215,5,200,30);
		label2.setFont(new Font("Andale Mono", 1, 14));
		label2.setForeground(new Color(0,0,0));
		add(label2);

		area1 = new JTextArea();
		area1.setEditable(false);
		area1.setFont(new Font("Andale Mono", 0, 9));
		area1.setText("Terminos y condiciones");
		scrollpane1 = new JScrollPane(area1);
		scrollpane1.setBounds(10,40,575,200);
		add(scrollpane1);

		checkbox1 = new JCheckBox("Yo, " + nombre +", acepto");
		checkbox1.setBounds(10,250,300,30);
		checkbox1.setFont(new Font("Arial", 1, 12));
		checkbox1.addChangeListener(this);
		add(checkbox1);

		boton1 = new JButton("Continuar");
		boton1.setBounds(10,290,100,30);
		boton1.addActionListener(this);
		boton1.setEnabled(false);
		add(boton1);

		boton2 = new JButton("No acepto");
		boton2.setBounds(120,290,100,30);
		boton2.addActionListener(this);
		boton2.setEnabled(false);
		add(boton2);
	}

	public void stateChanged(ChangeEvent e){
		if (checkbox1.isSelected() == true) {
			boton1.setEnabled(true);
			boton2.setEnabled(false);
		} else{
			boton1.setEnabled(false);
			boton2.setEnabled(true);
		}
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == boton1) {
			PantallaPrincipal principal = new PantallaPrincipal();
			principal.setBounds(0,0,640,535);
			principal.setVisible(true);
			principal.setResizable(false);
			principal.setLocationRelativeTo(null);
			this.setVisible(false);
		} else if (e.getSource() == boton2) {
			Bienvenida interfazBienvenida = new Bienvenida();
			interfazBienvenida.setBounds(0,0,350,450);
			interfazBienvenida.setVisible(true);
			interfazBienvenida.setResizable(false);
			interfazBienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}

	public static void main(String[] args) {
		Terminosycond interfaztyc = new Terminosycond();
		interfaztyc.setBounds(0,0,600,360);
		interfaztyc.setVisible(true);
		interfaztyc.setResizable(false);
		interfaztyc.setLocationRelativeTo(null);
	}
}