public class IntCheckExp extends Exp {
	
	Exp exp;

	public IntCheckExp(Exp exp) {
		this.exp = exp;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = exp.eval(env);
		Object value = ve.val;
		boolean result = value instanceof Integer;
		return new ValEnv(result, ve.env);
	}

	@Override
	void print() {
		System.out.print("(integer? ");
		exp.print();
		System.out.print(")");
	}

}
