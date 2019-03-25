public class Speaker extends Person {
    int fee;
    public Speaker(String name, int age) {
        super(name, age);
    }
    public Speaker(String name) {
        super(name, 0);
    }

    public int getFee() {
        return fee;
    }

    public void setFee(int fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Speaker " + this.getName() + " as a fee value of " + this.getFee() + ".";
    }
}
