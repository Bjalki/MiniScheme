public class NullCheckExp extends Exp{

    Exp exp;

	public NullCheckExp(Exp exp) {
		this.exp = exp;
	}

	@Override
	ValEnv eval(Env env) {
		ValEnv ve = exp.eval(env);
		Object value = ve.val;
        boolean result;
        if (value == Pair.NULL)result = true;
        else result = false;
		return new ValEnv(result, ve.env);
	}

	@Override
	void print() {
		System.out.print("(boolean? ");
		exp.print();
		System.out.print(")");
	}
}
