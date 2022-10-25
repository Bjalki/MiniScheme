import java.util.ArrayList;

public class ProcCall extends Exp {
	
	ArrayList<Exp> expList = new ArrayList<>();

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = expList.get(0).eval(env);
		Object value = ve.val;
		if(!(value instanceof Closure)) {
			System.err.println("procedure application: expected procedure, given non-procedure");
			System.exit(7);
		}
		ArrayList<Object> operands = new ArrayList<>();
		
		for(int i = 1; i < expList.size(); i++) {
			ve = expList.get(i).eval(ve.env);
			operands.add(ve.val);
		}
		
		Closure operator = (Closure) value;
		LambdaExp lambda = operator.lambda;
		ArrayList<Variable> vars = lambda.varList;
		
		int m = vars.size();
		int n = operands.size();
		if(m != n) {
			System.err.println("procedure expects " + m + " arguments, given " + n);
			System.exit(8);
		}
		Env local = new Env(operator.env);
		for(int i = 0; i < m; i++) {
			String var = vars.get(i).id;
			local.define(var, operands.get(i));
		}
		ValEnv result = lambda.body.eval(local);
		result.env = ve.env;
		return result;
	}

	@Override
	void print() {
		System.out.print("(");
		for(int i = 0; i < expList.size(); i++) {
			if(i != 0) {
				System.out.print(" ");
			}
			expList.get(i).print();
		}
		System.out.print(")");
	}

}
