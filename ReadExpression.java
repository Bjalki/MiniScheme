import java.util.Scanner;

public class ReadExpression extends Exp {
	
	Scanner in;

	public ReadExpression(Scanner in) {
		this.in = in;
	}

	@Override
	ValEnv eval(Env env) {
		String line = in.nextLine();
		int val = 0;
		try {
			val = Integer.parseInt(line);
		}
		catch(NumberFormatException e) {
			System.err.println("read expects type <integer>, given: " + line);
			System.exit(13);
		}
		return new ValEnv(val, env);
	}

	@Override
	void print() {
		System.out.print("(read)");
	}

}
