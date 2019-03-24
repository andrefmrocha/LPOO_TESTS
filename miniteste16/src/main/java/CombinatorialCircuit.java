import java.util.ArrayList;
import java.util.List;

public class CombinatorialCircuit {
    private List<LogicVariable> variables = new ArrayList<>();
    public boolean addVariable(LogicVariable a) {
        if(this.variables.contains(a))
            return false;
        this.variables.add(a);
        return true;
    }

    public Object getVariableByName(String x1) {
        for(LogicVariable var: this.variables){
            if(var.getName().equals(x1))
                return var;
        }
        return null;
    }

}
