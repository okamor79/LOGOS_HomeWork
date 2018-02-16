package JavaCore_HomeWork8;

public class MonthSalary implements Salary {

    private String user;
    private int dayCostWork;
    private int dayCountWork;

    public MonthSalary(String user, int dayCostWork, int dayCountWork) {
        this.user = user;
        this.dayCostWork = dayCostWork;
        this.dayCountWork = dayCountWork;
    }

    public void setDayCostWork(int dayCostWork) {
        this.dayCostWork = dayCostWork;
    }

    public void setDayCountWork(int dayCountWork) {
        this.dayCountWork = dayCountWork;
    }

    public String getUser() {
        return user;
    }

    public int getSalary() {
        return dayCostWork * dayCountWork;
    }


}
