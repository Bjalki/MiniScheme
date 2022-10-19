public class BoolCheckExp extends Exp {
	
	Exp exp;

	public BoolCheckExp(Exp exp) {
		this.exp = exp;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = exp.eval(env);
		Object value = ve.val;
		boolean result = value instanceof Boolean;
		return new ValEnv(result, ve.env);
	}

	@Override
	void print() {
		System.out.print("(boolean? ");
		exp.print();
		System.out.print(")");
	}

}
