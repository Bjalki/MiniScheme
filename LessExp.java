public class LessExp extends Exp {
	
	Exp exp1;
	Exp exp2;

	public LessExp(Exp exp1, Exp exp2) {
		this.exp1 = exp1;
		this.exp2 = exp2;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve1 = exp1.eval(env);
		ValEnv ve2 = exp2.eval(ve1.env);
		if(!(ve1.val instanceof Integer)) {
			System.err.println("<: expects type <integer> as 1st argument");
			System.exit(3);
		}
		if(!(ve2.val instanceof Integer)) {
			System.err.println("<: expects type <integer> as 2nd argument");
			System.exit(3);
		}
		
		int a = (Integer) ve1.val;
		int b = (Integer) ve2.val;
		
		return new ValEnv((a < b), ve2.env);
	}

	@Override
	void print() {
		System.out.print("(< ");
		exp1.print();
		System.out.print(" ");
		exp2.print();
		System.out.print(")");
	}

}
