public class SetCarExp extends Exp{

Exp lst = null;
Exp car = null;
Pair p = null;

public SetCarExp(Exp lst, Exp car){
    this.lst=lst;
    this.car=car;
}
    @Override
    ValEnv eval(Env env) {
        if (lst instanceof Pair){
            p = (Pair) lst;
            p.pair[0] = car;
        }else{
            System.out.print("");
            System.err.println("set-car!: expects argument of type pair");
		    System.exit(11);
        }
        return new ValEnv(p, env);
    }

    @Override
    void print() {
        System.out.print("(" + p.pair[0] + " . " + p.pair[1] + ")");
    }
    
}
