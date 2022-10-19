import java.util.ArrayList;

public class AndExp extends Exp {
	
	ArrayList<Exp> expList = new ArrayList<>();

	@Override
	ValEnv eval(Env env) {
		if(expList.isEmpty()) {
			return new ValEnv(true, env);
		}
		ValEnv ve = new ValEnv(null, env);
		for(Exp e: expList) {
			ve = e.eval(ve.env);
			Object value = ve.val;
			if(value instanceof Boolean && !((boolean)value)) {
				return new ValEnv(false, ve.env);
			}
		}
		return ve;
	}

	@Override
	void print() {
		System.out.print("(and ");
		expList.get(0).print();
		for(int i = 1; i < expList.size(); i++) {
			System.out.print(" ");
			expList.get(i).print();
		}
		System.out.print(")");
	}

}
