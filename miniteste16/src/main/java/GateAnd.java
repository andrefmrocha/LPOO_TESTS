public class GateAnd extends LogicGate {

    public GateAnd(LogicVariable internal, LogicVariable x1, LogicVariable x2) throws ColisionException, CycleException {
        super(internal, x1, x2);
        this.internal.setValue(x1.getValue() && x2.getValue());
        this.internal.setFormula(this.getFormula());
    }


    @Override
    public String getSymbol() {
        return "AND";
    }

    @Override
    public String getFormula() {
        return "AND(" + this.x1.getFormula() + "," + this.x2.getFormula() + ")";
    }

    @Override
    public boolean calculate(LogicVariable x1, LogicVariable x2) {
        return x1.getValue() && x2.getValue();
    }
}
