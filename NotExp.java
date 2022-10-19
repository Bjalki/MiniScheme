public class NotExp extends Exp {
	
	Exp exp;

	public NotExp(Exp exp) {
		this.exp = exp;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = exp.eval(env);
		Object value = ve.val;
		boolean result = value instanceof Boolean && !((boolean) value);
		return new ValEnv(result, ve.env);
	}

	@Override
	void print() {
		System.out.print("(not ");
		exp.print();
		System.out.print(")");
	}

}
