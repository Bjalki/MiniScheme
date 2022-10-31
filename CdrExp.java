public class CdrExp extends Exp {

    Exp exp = null;

    public CdrExp(Exp exp){
        this.exp=exp;
    }

    @Override
    ValEnv eval(Env env) {
       // ValEnv ve = exp.eval(env);
       Exp cdr = null;
		if((exp instanceof Pair)) {
			Pair p = (Pair)exp;
            cdr = p.pair[1];
		}else{
            System.out.print("");
            System.err.println("cdr: expects argument of type pair");
		    System.exit(10);
        }
		return new ValEnv(cdr, env);        		
    }

    @Override
    void print() {
        System.out.print("(");
		exp.print();
		System.out.print(")");
    }
    
}

