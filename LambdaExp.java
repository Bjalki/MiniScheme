import java.util.ArrayList;

public class LambdaExp extends Exp {
	
	ArrayList<Variable> varList = new ArrayList<>();
	Body body = null;

	@Override
	ValEnv eval(Env env) {
		return new ValEnv(new Closure(this, env), env);
	}

	@Override
	void print() {
		System.out.print("(lambda (");
		for(int i = 0; i < varList.size(); i++) {
			if(i != 0) {
				System.out.print(" ");
			}
			varList.get(i).print();
		}
		System.out.print(") ");
		body.print();
		System.out.print(")");
	}

}
