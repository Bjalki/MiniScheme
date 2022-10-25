import java.util.ArrayList;

public class Pair extends Exp{

    ArrayList<Exp> pair = new ArrayList<>();

    public Pair(Exp e1, Exp e2){
        pair.add(e1);
        pair.add(e2);
    }
    @Override
    ValEnv eval(Env env) {
        
        return new ValEnv(pair, env); //I don't think this is right
    }
    @Override
    void print() {
        System.out.println("(" + pair.get(0) + " . " + pair.get(1) + ")");

    }
}
