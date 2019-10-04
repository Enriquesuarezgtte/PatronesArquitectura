package Texts;

import Context.Context;
import Interface.Interpreter;

import java.util.Base64;


public class TextToBase64 implements Interpreter {

	@Override
	public void interpreter(Context context) {
		context.salida = Base64.getEncoder().encodeToString(context.entrada.getBytes());
	}

}
