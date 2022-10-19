
public class BindSpec {

	Variable var;
	Exp exp;

	public BindSpec(Variable var, Exp exp) {
		this.var = var;
		this.exp = exp;
	}

	void print() {
		System.out.printf("(%s ", var.id);
		exp.print();
		System.out.print(")");

	}

}
