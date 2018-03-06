package JavaCore_HomeWork15;

public class Pets {
    private String petsName;
    private String petsClass;
    private int petsAge;

    public Pets(String petsName, String petsClass, int petsAge) {
        this.petsName = petsName;
        this.petsClass = petsClass;
        this.petsAge = petsAge;
    }

    public String getPetsName() {
        return petsName;
    }

    public void setPetsName(String petsName) {
        this.petsName = petsName;
    }

    public String getPetsClass() {
        return petsClass;
    }

    public void setPetsClass(String petsClass) {
        this.petsClass = petsClass;
    }

    public int getPetsAge() {
        return petsAge;
    }

    public void setPetsAge(int petsAge) {
        this.petsAge = petsAge;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + petsAge;
        result = prime * result + ((petsClass == null) ? 0 : petsClass.hashCode());
        result = prime * result + ((petsName == null) ? 0 : petsName.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pets other = (Pets) obj;
        if (petsAge != other.petsAge)
            return false;
        if (petsClass == null) {
            if (other.petsClass != null)
                return false;
        } else if (!petsClass.equals(other.petsClass))
            return false;
        if (petsName == null) {
            if (other.petsName != null)
                return false;
        } else if (!petsName.equals(other.petsName))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return petsClass + " ->   Кличка тварини - " + petsName + ", Вік тварини - " + petsAge;
    }
}
