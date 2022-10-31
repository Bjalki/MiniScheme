public class Pair extends Exp{

    public Exp[] pair = {null, null};


    public static Pair NULL = new Pair(null, null);

    public Pair(Exp e1, Exp e2){
        pair[0] = e1;
        pair[1] = e2;
    }

    @Override
    ValEnv eval(Env env) {       
        return new ValEnv(this, env);
    }

    @Override
    void print() {
        System.out.print("(" + pair[0] + " . " + pair[1] + ")");

    }
}
