
public class Definition extends Line {
	
	Variable var;
	Exp exp;

	public Definition(Variable var, Exp exp) {
		this.var = var;
		this.exp = exp;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = exp.eval(env);
		
		if(ve.env.nextEnv == null) {
			try {
				ve.env.assign(var.id, ve.val);
			}
			catch(RuntimeException e) {
				ve.env.define(var.id, ve.val);
			}
		}
		else {
			try {
				ve.env.lookupLocal(var.id);
				System.err.printf("duplicate identifier: %s", var.id);
				System.exit(5);
			}
			catch(RuntimeException e) {
				ve.env.define(var.id, ve.val);
			}
		}
		return new ValEnv(null, ve.env);
	}

	@Override
	void print() {
		System.out.printf("(define %s ", var.id);
		exp.print();
		System.out.print(")");

	}

}
