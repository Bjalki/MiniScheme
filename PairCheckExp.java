public class PairCheckExp extends Exp{

    Exp exp;


    public PairCheckExp(Exp exp){
        this.exp = exp;
    }

    @Override
    ValEnv eval(Env env) {
        ValEnv ve = exp.eval(env);
		Object value = ve.val;
        System.out.println("test: " + value.getClass());
		boolean result = value instanceof Pair;
		return new ValEnv(result, ve.env);
    }

    @Override
    void print() {
        System.out.print("(Pair? ");
		exp.print();
		System.out.print(")");
    }
    
}
