import java.util.ArrayList;

public class OrExp extends Exp {
	
	ArrayList<Exp> expList = new ArrayList<>();

	@Override
	ValEnv eval(Env env) {
		if(expList.isEmpty()) {
			return new ValEnv(false, env);
		}
		ValEnv ve = new ValEnv(null, env);
		for(Exp e: expList) {
			ve = e.eval(ve.env);
			Object value = ve.val;
			if(!(value instanceof Boolean) || ((boolean)value)) {
				return ve;
			}
		}
		return new ValEnv(false, ve.env);
	}

	@Override
	void print() {
		System.out.print("(or ");
		expList.get(0).print();
		for(int i = 1; i < expList.size(); i++) {
			System.out.print(" ");
			expList.get(i).print();
		}
		System.out.print(")");
	}

}
