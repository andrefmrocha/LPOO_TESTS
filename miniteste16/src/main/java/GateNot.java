public class GateNot extends LogicGate {
    public GateNot(LogicVariable y1, LogicVariable x1) throws CycleException {
        super(y1, x1);
        this.internal.setValue(!x1.getValue());
        this.internal.setFormula(this.getFormula());
    }

    @Override
    Object[] getInputs() {
        LogicVariable [] array = new LogicVariable[]{this.x1};
        return array;
    }

    @Override
    public String getSymbol() {
        return "NOT";
    }

    @Override
    public String getFormula() {
        return "NOT(" + this.x1.getFormula() + ")";
    }

    @Override
    public boolean calculate(LogicVariable x1, LogicVariable x2) {
        return ! x1.getValue();
    }
}