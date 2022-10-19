
public class Assignment extends Exp {
	
	Variable var;
	Exp exp;

	public Assignment(Variable var, Exp exp) {
		this.var = var;
		this.exp = exp;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = exp.eval(env);
		try {
			ve.env.assign(var.id, ve.val);
		}
		catch(RuntimeException e) {
			System.err.printf("cannot set undefined variable: %s", var.id);
			System.exit(6);
		}
		return new ValEnv(null, ve.env);
	}

	@Override
	void print() {
		System.out.printf("(set! %s ", var.id);
		exp.print();
		System.out.print(")");
	}

}
