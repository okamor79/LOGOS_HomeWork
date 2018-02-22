package JavaCore_HomeWork9;

public class Helm {

    private String mathrial;

    public Helm(String mathrial) {
        this.mathrial = mathrial;
    }

    public String getMathrial() {
        return mathrial;
    }

    public void setMathrial(String mathrial) {
        this.mathrial = mathrial;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "mathrial='" + mathrial + '\'' +
                '}';
    }
}
