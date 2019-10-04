package Texts;

import Context.Context;
import Interface.Interpreter;
import java.util.stream.IntStream;


public class TextToASCII implements Interpreter {

	@Override
	public void interpreter(Context context) {
		IntStream.range(0,context.entrada.length()).forEach(x-> context.salida += context.entrada.codePointAt(x));
	}

}
