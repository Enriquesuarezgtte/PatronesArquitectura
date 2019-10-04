package Texts;

import Context.Context;
import Interface.Interpreter;

import java.util.stream.IntStream;

public class TextToHexadecimal implements Interpreter {

	@Override
	public void interpreter(Context context) {
		IntStream.range(0,context.entrada.toCharArray().length).forEach(x->{
			context.salida += Integer.toHexString(context.entrada.toCharArray()[x]);
		});
		
	}

}
