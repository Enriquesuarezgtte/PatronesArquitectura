import java.awt.Color;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


/**
 * Ventana que permite cambiar de un boton con el color que ha sido seleccionado desde la ventana
 * opciones o directamente desde la misma, cumple el papel de
 * clase observador y clase observable
 * @author Juan Amortegui
 *
 */
public class VentanaBoton extends JFrame implements Observer{
	
	JPanel miPanelColor;
	JLabel titulo;
	int colorSeleccionado;
	ClaseObservador miObservador;
        JButton colorButton;

	
	public VentanaBoton(ClaseObservador observador)
	{
	  miObservador=observador;
		
	  titulo= new JLabel();
	  titulo.setText("COLOR SELECCIONADO");
	  titulo.setBounds(130, 10, 150, 25);
	  
	  colorButton = new JButton();
          colorButton.setText("Color");
          colorButton.setBounds(20,40,180,25);
          //colorButton.setBackground(Color.gray);
		
	  miPanelColor=new JPanel();
	  miPanelColor.setBounds(5, 66, 380, 190);
	  

	 
	  

	  add(titulo);
	  add(colorButton);
	  
	  setSize(400,300);
	  setTitle("Ventana Button Color");
	  setLocation(280, 300);
	  setLayout(null);
	  setVisible(true);
		
	}


/**Metodo de actualizar, comun para todos los metodos que implementen observer*/
	@Override
	public void update(Observable arg0, Object arg1) 
	{
		colorSeleccionado=miObservador.getColorSeleccionado();
		switch (colorSeleccionado)
		{
		case 1: 
		colorButton.setBackground(Color.yellow);
		break;
		case 2:colorButton.setText("");
		colorButton.setBackground(Color.blue);
		break;
		case 3: colorButton.setText("");
		colorButton.setBackground(Color.red);
		break;
		case 4: colorButton.setText("");
		colorButton.setBackground(Color.green);
		break;
		case 5:colorButton.setText("");
		colorButton.setBackground(Color.black);
		break;
		case 6:colorButton.setText("");
		colorButton.setBackground(Color.white);
		break;
		case 7:colorButton.setText("");
		colorButton.setBackground(Color.orange);
		break;
		default : colorButton.setText("NO HA SELECCIONADO UN COLOR");
		colorButton.setBackground(null);
		}
	
	}


}
