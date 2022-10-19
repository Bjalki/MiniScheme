
public class WriteExpression extends Exp {
	
	Exp e;

	public WriteExpression(Exp e) {
		this.e = e;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = e.eval(env);
		if(!(ve.val instanceof Integer)) {
			System.err.println("write: expects type <integer> as 1st argument");
			System.exit(3);
		}
		System.out.print(ve.val);
		return new ValEnv(null, ve.env);
	}

	@Override
	void print() {
		System.out.print("(write ");
		e.print();
		System.out.print(")");
	}

}
