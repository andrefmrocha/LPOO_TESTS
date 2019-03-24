public class GateOr extends LogicGate {
    public GateOr(LogicVariable internal, LogicVariable x1, LogicVariable x2) throws ColisionException, CycleException {
        super(internal, x1, x2);
        this.internal.setValue(x1.getValue() || x2.getValue());
        this.internal.setFormula(this.getFormula());
    }

    @Override
    public String getSymbol() {
        return "OR";
    }

    @Override
    public String getFormula() {
        return "OR(" + this.x1.getFormula() + "," + this.x2.getFormula() + ")";
    }

    @Override
    public boolean calculate(LogicVariable x1, LogicVariable x2) {
        return x1.getValue() || x2.getValue();
    }
}
