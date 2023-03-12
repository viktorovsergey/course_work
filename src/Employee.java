public class Employee {
   private static int idGen =0;
    private int id;
    private String fio;
    private int department;
    private double wage;


    public Employee(String fio, int department, int wage) {
        this.id=idGen++;
        this.fio = fio;
        this.department = department;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getDepartment() {
        return department;
    }

    public double getWage() {
        return wage;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public String toString() {
        return "id - " + getId() + ". Ф.И.О - " + getFio() + ". Отдел - " + getDepartment() + ". Заработная плата - " + getWage();
    }
}
