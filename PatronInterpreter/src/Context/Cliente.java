package Context;

import Interface.Interpreter;
import Texts.TextToASCII;
import Texts.TextToBase64;
import Texts.TextToBinary;
import Texts.TextToHexadecimal;

public class Cliente {

	public static void main(String[] args) {
		Context context = new Context("Enrique");
		
		Interpreter hd = new TextToHexadecimal();
		hd.interpreter(context);
		System.out.println("Hexadecimal: "+context.salida);
		context.salida="";

		Interpreter asc = new TextToASCII();
		asc.interpreter(context);
		System.out.println("ASCII: "+context.salida);
		context.salida="";


		Interpreter base64 = new TextToBase64();
		base64.interpreter(context);
		System.out.println("Base64: "+context.salida);
		context.salida="";

		Interpreter binary = new TextToBinary();
		binary.interpreter(context);
		System.out.println("Binary: "+context.salida);
		context.salida="";



	}

}
