import java.util.ArrayList;

public class LetExp extends Exp {
	
	ArrayList<BindSpec> binds = new ArrayList<>();
	Body body;

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = new ValEnv(null, env);
		Object[] results = new Object[binds.size()];
		for(int i = 0; i < binds.size(); i++) {
			ve = binds.get(i).exp.eval(ve.env);
			results[i] = ve.val;
		}
		Env letEnv = new Env(ve.env);
		for(int i = 0; i < binds.size(); i++) {
			String var = binds.get(i).var.id;
			try {
				letEnv.lookupLocal(var);
				System.err.printf("duplicate identifier: %s", var);
				System.exit(5);
			}
			catch(RuntimeException e) {
				letEnv.define(var, results[i]);
			}
		}
		ve = body.eval(letEnv);
		return new ValEnv(ve.val, env);
	}

	@Override
	void print() {
		System.out.print("(let (");
		for(BindSpec bind: binds) {
			bind.print();
		}
		System.out.print(")");
		body.print();
		System.out.print(")");
	}

}
