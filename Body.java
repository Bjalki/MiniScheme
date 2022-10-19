import java.util.ArrayList;

public class Body extends ASTNode {
	
	ArrayList<Line> lines = new ArrayList<>();

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = new ValEnv(null, env);
		for(Line l: lines) {
			ve = l.eval(ve.env);
		}
		return ve;
	}

	@Override
	void print() {
		for (Line l: lines) {
			l.print();
		}
	}

}
