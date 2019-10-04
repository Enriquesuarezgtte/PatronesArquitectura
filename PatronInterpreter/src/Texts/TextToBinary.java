package Texts;

import Context.Context;
import Interface.Interpreter;

import java.util.stream.IntStream;


public class TextToBinary implements Interpreter {

	@Override
	public void interpreter(Context context) {

		IntStream.range(0,context.entrada.toCharArray().length).forEach(x->{
			context.salida += Integer.toBinaryString(context.entrada.toCharArray()[x]);
		});
		
	}

}
