public class EqvExp extends Exp {
	
	Exp exp1;
	Exp exp2;

	public EqvExp(Exp exp1, Exp exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve1 = exp1.eval(env);
		ValEnv ve2 = exp2.eval(ve1.env);
		Object val1 = ve1.val;
		Object val2 = ve2.val;
		boolean result = false;
		if(val1 == null) {
			result = (val2 == null);
		}
		else {
			result = val1.equals(val2);
		}
		return new ValEnv(result, ve2.env);
	}

	@Override
	void print() {
		System.out.print("(eqv? ");
		exp1.print();
		System.out.print(" ");
		exp2.print();
		System.out.print(")");
	}

}
