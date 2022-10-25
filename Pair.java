public class Pair extends Exp{

    Exp[] pair = {null, null};

    public Pair(Exp e1, Exp e2){
        pair[0] = e1;
        pair[1] = e2;
    }
    @Override
    ValEnv eval(Env env) {       
        return new ValEnv(this, env); //I don't think this is right
    }
    @Override
    void print() {
        System.out.println("(" + pair[0] + " . " + pair[1] + ")");

    }
}
