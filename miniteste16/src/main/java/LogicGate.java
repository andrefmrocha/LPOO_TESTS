
public abstract class LogicGate {
    protected LogicVariable internal;
    protected LogicVariable x1;
    protected LogicVariable x2;

    LogicGate(LogicVariable internal, LogicVariable x1) throws CycleException {
        this.internal = internal;
        this.x1 = x1;
        this.internal.setDependencies(x1, null, this);
    }

    LogicGate(LogicVariable internal, LogicVariable x1, LogicVariable x2) throws ColisionException, CycleException {
        this.internal = internal;
        this.x1 = x1;
        this.x2 = x2;
        this.internal.setCalculatedBy(this);
        this.internal.setDependencies(x1, x2, this);
    }

    LogicVariable getOutput(){
        return this.internal;
    }

    Object[] getInputs(){
        LogicVariable[] array = new LogicVariable[]{x1, x2};
        return array;
    }

    public abstract String getSymbol();

    public abstract String getFormula();

    public abstract boolean calculate(LogicVariable x1, LogicVariable x2);
}
