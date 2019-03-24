public class LogicVariable {

    private String name;
    private String formula;
    private LogicVariable x1;
    private LogicVariable x2;
    private boolean value;
    private LogicGate gate;
    private LogicGate calculatedBy;

    public LogicVariable(String name, boolean value) {
        this.name = name;
        this.formula = name;
        this.value = value;
        this.calculatedBy = null;
    }

    public LogicVariable(String name) {
        this.name = name;
        this.formula = name;
        this.calculatedBy = null;
    }

    public String getName() {
        return name;
    }

    public void setValue(boolean value) {
        this.value = value;
    }

    public void setDependencies(LogicVariable x1,LogicVariable x2, LogicGate gate) throws CycleException {
        x1.checkDependencies(this, x2);
        if(x2 != null)
            x2.checkDependencies(this, x1);
        this.x1 = x1;
        this.x2 = x2;
        this.gate = gate;
    }

    public void checkDependencies(LogicVariable x1, LogicVariable x2) throws CycleException {
        if(x2 == null){
            if(x1.equals(this.x1) || x1.equals(this.x2))
                throw new CycleException();
        }
        else if(x1.equals(this.x1) || x1.equals(this.x2) || x2.equals(this.x1) || x2.equals(this.x2))
            throw new CycleException();
    }

    public boolean getValue() {
        if(gate != null)
            return this.gate.calculate(this.x1, this.x2);
        return this.value;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null)
            return false;
        if(this == o)
            return true;
        if(this.getClass() != o.getClass())
            return false;
        LogicVariable var = (LogicVariable) o;
        return this.getName().equals(var.getName());
    }

    public LogicGate getCalculatedBy() {
        return calculatedBy;
    }

    public void setCalculatedBy(LogicGate calculatedBy) throws ColisionException {
        if(this.calculatedBy != null)
            throw new ColisionException();
        this.calculatedBy = calculatedBy;
    }

    public String getFormula() {
        return this.formula;
    }

    public void setFormula(String formula){
        this.formula = formula;
    }
}
