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
        System.out.println("_____________________________________________________________");
        printEmployees();
        System.out.println("_____________________________________________________________");
        indexWage(1.1);
        System.out.println("_____________________________________________________________");
        System.out.println("_____________________________________________________________");
        printEmployees();
    }

    static void printEmployees() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Сотрудник " + employees[i]);
        }
    }

    static double sum() {
        int sum = 0;
        for (int i = 0; i < employees.length - 1; i++) {
            sum += employees[i].getWage();
        }
        return sum;
    }

    static Employee minWage() {
        Employee min = employees[0];
        for (int i = 1; i < employees.length - 1; i++) {
            if (employees[i].getWage() < min.getWage()) {
                min = employees[i];
            }
        }
        return min;
    }

    static Employee maxWage() {
        Employee max = employees[0];
        for (int i = 1; i < employees.length - 1; i++) {
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
        for (int i = 0; i < employees.length - 1; i++) {
            System.out.println((i + 1) + ". -  " + employees[i].getFio());
        }
    }

    static void  indexWage(double index) {
        for (int i = 0; i < employees.length - 1; i++) {
         employees[i].setWage((employees[i].getWage()*index));
         }

    }

}
