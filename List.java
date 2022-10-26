import java.util.ArrayList;

public class List extends Exp{

    public ArrayList<Exp> addList;

    public List(){
        addList = new ArrayList<>();
    }

    @Override
    ValEnv eval(Env env) {
       Pair p;
        if (addList.isEmpty()){
            p = Pair.NULL;
        }else{
            p =Pair.NULL;
            for (int i = addList.size() -1; i>= 0; i--){
                p = new Pair(addList.get(i), p);
            }
        
        }
        return new ValEnv(p, env);
    }

    public void addList(Exp e){
        addList.add(e);
    }
    
    @Override
    void print() {
        String s = "";//I could have just made a stack instead of an ArrayList, but here we are
        for (int i = addList.size() -1; i>= 0; i--){
            s += addList.get(i);
        }
        System.out.print("(" + s + ")");
    }
    
}
