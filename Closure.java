public class Closure {
    ValEnv env;
    LambdaExpression node;

    public Closure(ValEnv ve, LambdaExpression exp){
        env = ve;
        node = exp;
    }
}
