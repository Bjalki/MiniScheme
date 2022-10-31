public class CarExp extends Exp {

    Exp exp = null;

    public CarExp(Exp exp){
        this.exp=exp;
    }

    @Override
    ValEnv eval(Env env) {
       // ValEnv ve = exp.eval(env);
       Exp car = null;
		if((exp instanceof Pair)) {
			Pair p = (Pair)exp;
            car = p.pair[0];
		}else{
            System.out.print("");
            System.err.println("car: expects argument of type pair");
		    System.exit(9);
        }
		return new ValEnv(car, env);        		
    }

    @Override
    void print() {
        System.out.print("(");
		exp.print();
		System.out.print(")");
    }
    
}
