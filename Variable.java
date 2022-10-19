
public class Variable extends Exp {
	
	String id;

	public Variable(String id) {
		this.id = id;
	}

	@Override
	ValEnv eval(Env env) {
		Object val = null;
		try {
			val = env.lookup(id);
		}
		catch(RuntimeException e) {
			System.err.printf("reference to undefined identifier: %s", id);
			System.exit(4);
		}
		return new ValEnv(val, env);
	}

	@Override
	void print() {
		System.out.print(id);
	}

}
