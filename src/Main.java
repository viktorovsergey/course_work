public class Main {
    static Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee("Иванов Иван Иванович", 1, 50_000);
        employees[1] = new Employee("Левин Артём Дмитриевич", 2, 50_987);
        employees[2] = new Employee("Тарасов Артур Арсентьевич", 3, 60_987);
        employees[3] = new Employee("Митрофанов Никита Матвеевич", 4, 60_927);
        employees[4] = new Employee("Троицкий Гордей Давидович", 5, 76_967);
        employees[5] = new Employee("Филиппова Александра Викторовна", 3, 45_967);
        employees[6] = new Employee("Столяров Михаил Александрович", 2, 55_967);
        employees[7] = new Employee("Моисеева Алина Егоровна", 1, 55_967);
        employees[8] = new Employee("Морозов Кирилл Максимович", 4, 95_967);
        employees[9] = new Employee("Соколов Матвей Константинович", 5, 55_967);
        System.out.println("_____________________________________________________________");
        printEmployees();
        System.out.println("_____________________________________________________________");
        System.out.printf("Сумма зарплат = " + "%.2f", sum());
        System.out.println();
        System.out.println("_____________________________________________________________");
        System.out.println("Сотрудник с минимальной зарплатой -  " + minWage());
        System.out.println("_____________________________________________________________");
        System.out.println("Сотрудник с максимальной зарплатой -  " + maxWage());
        System.out.println("_____________________________________________________________");
        System.out.printf("Средняя зарплата = " + "%.2f", averageWage());
        System.out.println();
        System.out.println("_____________________________________________________________");
        printFio();
        System.out.println("_____________________________________________________________");
        printEmployees();
        System.out.println("_____________________________________________________________");
        indexWage(1.1);
        System.out.println("_____________________________________________________________");
        printEmployees();
        System.out.println("_____________________________________________________________");
        searchDepartmentMin(2);
        System.out.println("_____________________________________________________________");
        departmentWage(1);
        System.out.println("_____________________________________________________________");
        departmentWageAverage(5);
        System.out.println("_____________________________________________________________");
        printEmployeesWithoutDepartment();
    }

    static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник " + employees[i]);
        }
    }

    static double sum() {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getWage();
        }
        return sum;
    }

    static Employee minWage() {
        Employee min = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getWage() < min.getWage()) {
                min = employees[i];
            }
        }
        return min;
    }

    static Employee maxWage() {
        Employee max = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].getWage() > max.getWage()) {
                max = employees[i];
            }
        }
        return max;
    }

    static double averageWage() {
        double average = sum() / employees.length;
        return average;
    }

    static void printFio() {
        System.out.println("Ф.И.О сотрудников ");
        for (int i = 0; i < employees.length; i++) {
            System.out.println((i + 1) + ". -  " + employees[i].getFio());
        }
    }

    static void indexWage(double index) {
        for (int i = 0; i < employees.length; i++) {
            employees[i].setWage((employees[i].getWage() * index));
        }

    }

    /*Метод поиска сотрудника с минимальной зарплатой*/
    static void searchDepartmentMin(int department) {
        int maskArray = 0;
        double departmentMinWege = 0;
        for (int i = 0; i < employees.length; i++) {
            maskArray = i;
            departmentMinWege = employees[maskArray].getWage();
            if (employees[i].getDepartment() == department) break;
        }
        for (int i = maskArray; i < employees.length; i++) {
            if (employees[i].getWage() < departmentMinWege && employees[i].getDepartment() == department) {
                departmentMinWege = employees[i].getWage();
            }
        }
        System.out.println("Минимальная зарпалата в департаменте " + department + " равна " + departmentMinWege + " " + employees[maskArray].getFio());
    }

    static void departmentWage(int department) {
        double departmentWegeSumm = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                departmentWegeSumm = departmentWegeSumm + employees[i].getWage();
            }
        }
        System.out.println("Сумму затрат на зарплату по отделу департаменте " + department + " равна " + departmentWegeSumm);
    }
    static void departmentWageAverage(int department) {
       int sumPeopleInDepartment=0;
       double sumWageDepartment=0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getDepartment() == department) {
                sumPeopleInDepartment++;
                sumWageDepartment=sumWageDepartment+employees[i].getWage();
            }
        }
        if (sumPeopleInDepartment!=0){
             System.out.println( "Средняя зарпла по отделу " + department + " равна " + sumWageDepartment/sumPeopleInDepartment);
        } else {
            System.out.println("Нет такого отдела");
        }
    }
    static void printEmployeesWithoutDepartment() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник id - " + employees[i].getId()+" Ф.И.О. "+ employees[i].getFio()+" зарплата "+ employees[i].getWage());
        }
    }
}



