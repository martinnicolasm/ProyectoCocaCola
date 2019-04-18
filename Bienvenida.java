import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Bienvenida extends JFrame implements ActionListener{
	private JLabel label1, label2, label3, label4;
	private JTextField textfield1;
	private JButton boton1;
	public static String texto = "";

	public Bienvenida(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

		ImageIcon imagen = new ImageIcon("images/logo-coca.png");

		textfield1 = new JTextField();
		textfield1.setBounds(45,248,255,25);
		textfield1.setBackground(new Color(220,220,220));
		textfield1.setFont(new Font("Andale Mono", 3, 18)); //0: texto normal 1: negrita 2:cursiva, 3:negrita y cursiva
		textfield1.setForeground(new Color(255,0,0));
		add(textfield1);

		label1 = new JLabel(imagen);
		label1.setBounds(25,15,300,150);
		add(label1);

		label2 = new JLabel("Sistema de Control Vacacional");
		label2.setBounds(35,135,300,30);
		label2.setFont(new Font("Andale Mono", 3, 18)); //0: texto normal 1: negrita 2:cursiva, 3:negrita y cursiva
		label2.setForeground(new Color(255,255,255));
		add(label2);

		label3 = new JLabel("ingrese su nombre");
		label3.setBounds(45,212,200,30);
		label3.setFont(new Font("Andale Mono", 1,12));
		label3.setForeground(new Color(255,255,255));
		add(label3);

		label4 = new JLabel("2019 The Coca-Cola Company");
		label4.setBounds(85,375,300,30);
		label4.setFont(new Font("Andale Mono", 1, 12));
		label4.setForeground(new Color(255,255,255));
		add(label4);

		boton1 = new JButton("Ingresar");
		boton1.setBounds(125,280,100,30);
		boton1.setBackground(new Color(220,220,220));
		boton1.setFont(new Font("Andale Mono", 3, 12));
		boton1.setForeground(new Color(255,0,0));
		boton1.addActionListener(this);
		add(boton1);
	}

	public void actionPerformed(ActionEvent e){
		if (e.getSource() == boton1) {
			texto = textfield1.getText().trim();
			if (texto.equals("")) {
				JOptionPane.showMessageDialog(null, "Por favor, ingrese su nombre."); //Mensaje si no pone el nombre
			}else{
				Terminosycond interfaztyc = new Terminosycond();
				interfaztyc.setBounds(0,0,600,360);
				interfaztyc.setVisible(true);
				interfaztyc.setResizable(false);
				interfaztyc.setLocationRelativeTo(null);
				this.setVisible(false); //this hace referencia a la interfaz Bienvenida
			}
		}
	}

	public static void main(String args[]) {
		Bienvenida interfazBienvenida = new Bienvenida();
		interfazBienvenida.setBounds(0,0,350,450);
		interfazBienvenida.setVisible(true);
		interfazBienvenida.setResizable(false);
		interfazBienvenida.setLocationRelativeTo(null);
	}
}