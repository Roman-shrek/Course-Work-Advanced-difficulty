public class Main {
    public static Employee[] employee = new Employee[10];

    // Индексация сотрудников на один процент
    public static void calculateSallaryIndex() {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null) {
                int indexSallary = employee[i].getSallary() + (employee[i].getSallary() / 100);
                System.out.println("Индексация сотрудников отдела - " + employee[i].getNameEmployee() +
                        " индексированная зарплата" + " " + indexSallary + " отдел: "
                        + employee[i].getNumberDepartment() + ". Id -" + employee[i].id);
            }
        }
    }

    // Метод для поиска сотрудника отдела с минимальной зарплатой
    public static void findDepartamentEmployeeMinSallary(int departaments) {
        Employee minSallary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && (minSallary.getSallary() > employee[i].getSallary() &&
                    departaments == employee[i].getNumberDepartment())) {
                minSallary = employee[i];
            }
        }
        System.out.println("Cотрудник " + minSallary.getNameEmployee() + " имеет самую низкую зарплату: " +
                minSallary.getSallary() + " рублей в " + minSallary.getNumberDepartment() + " отделе");
    }

    // Поиск сотрудника отдела с максимальной зарплатой
    public static void findDepartamentEmployeeMaxSallary(int departaments) {
        Employee maxSallary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && (maxSallary.getSallary() < employee[i].getSallary()) &&
                    (departaments == employee[i].getNumberDepartment())) {
                maxSallary = employee[i];
            }
        }
        System.out.println("Cотрудник " + maxSallary.getNameEmployee() + " имеет самую высокую зарплату: " +
                maxSallary.getSallary() + " рублей в " + maxSallary.getNumberDepartment() + " отделе");
    }

    // Подсчет общей суммы затрат на зарплату сотрудников одного отдела
    public static void calculateSumSullaryDepartment(int departament) {
        int sumSallaryDepartament = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && departament == employee[i].getNumberDepartment()) {
                sumSallaryDepartament = sumSallaryDepartament + employee[i].getSallary();
            }
        }
        System.out.println("Общая сумма затрат на сотрудников " + departament + " отдела состаляет " +
                sumSallaryDepartament + " рублей");
    }

    // Подсчет средней зарплаты сотрудников одного отдела
    public static void calculateAvergeSumDepartament(int departament) {
        int avergeSumDepartament = 0;
        int totalEmployeeDepartament = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getNumberDepartment() == departament) {
                avergeSumDepartament = avergeSumDepartament + employee[i].getSallary();
                totalEmployeeDepartament++;
            }
        }
        System.out.println("Средняя зарплата в " + departament + " отделе, равна " +
                avergeSumDepartament / totalEmployeeDepartament + " рублей");

    }

    // Индексация сотрудников одного отдела на один процент
    public static void calculateSallaryIndexDepartament(int departament) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && departament == employee[i].getNumberDepartment()) {
                int indexSallary = employee[i].getSallary() + (employee[i].getSallary() / 100);
                System.out.println("Индексация сотрудников отдела - " + employee[i].getNameEmployee() + " " +
                        " " + indexSallary + " отдел: " + employee[i].getNumberDepartment());
            }
        }
    }

    // Печатаю сотрудников одного отдела без номера отдела
    public static void printEmployeeWithoutNumberDepartament(int departament) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && departament == employee[i].getNumberDepartment()) {
                int indexSallary = employee[i].getSallary() + (employee[i].getSallary() / 100);
                System.out.println("Сотрудники одного отдела: " + employee[i].getNameEmployee()
                        + " зарплата " + indexSallary);
            }
        }
    }

    public static void findEmployeeLessNumber(int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSallary() < number) {
                System.out.println(employee[i] + " Id -" + employee[i].id);
            }
        }
    }

    public static void findEmployeeMoreNumber(int number) {
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] != null && employee[i].getSallary() >= number) {
                System.out.println(employee[i] + " Id -" + employee[i].id);
            }
        }
    }

    public static void main(String[] args) {
        employee[0] = new Employee("Иванов Алексей Сергеевич", 65_000, 1);
        employee[1] = new Employee("Крутов Роман Сергеевич", 70_000, 5);
        employee[2] = new Employee("Тихонов Семен Павлович", 87_000, 1);
        employee[3] = new Employee("Дмитриев Егор Олегович", 43_000, 3);
        employee[4] = new Employee("Смиронов Игорь Романович", 74_000, 2);
        employee[5] = new Employee("Денисов Сергей Валерьевич", 59_000, 1);
        employee[6] = new Employee("Кириллов Артем Валерьевич", 47_000, 1);
        employee[7] = new Employee("Павленко Павел Анатольевич", 100_000, 4);
        employee[8] = new Employee("Ильин Игорь Петрович", 32_000, 4);
        employee[9] = new Employee("Гришин Алексей Васильевич", 108_000, 1);

        // Проидексировали зарплату всех сотрудников на процент
        calculateSallaryIndex();
        System.out.println();

        // Зарплата сотрудника отдела с минимальной зарплатой
        System.out.println("Минимальная зарплата в отделе.");
        findDepartamentEmployeeMinSallary(4);
        System.out.println();

        // Сотрудник с максимальной зарплатой
        System.out.println("Максимальная зарплата в отделе.");
        findDepartamentEmployeeMaxSallary(1);

        // Траты на отдел
        System.out.println();
        System.out.println("Траты на зарплату сотрудников отдела");
        calculateSumSullaryDepartment(1);

        // Средняя зарплата в отделе
        System.out.println();
        System.out.println("Средняя зарплата в отделе");
        calculateAvergeSumDepartament(1);

        // Индексация зарплаты сотрудников отдела на 1 процент
        System.out.println();
        System.out.println("Индексация зарплаты в отделе");
        calculateSallaryIndexDepartament(1);

        // Печатаю сотрудников одного отдела без номера отдела
        System.out.println();
        System.out.println("Сотрудники без номера отдела");
        printEmployeeWithoutNumberDepartament(1);

        // Печатаю сотрудников у кого зарплата меньше значений
        System.out.println();
        System.out.println("Зарплата меньше значения");
        findEmployeeLessNumber(70000);

        // Печатать сотрудника у которых зарплата больше значения
        System.out.println();
        System.out.println("Зарплата больше или равна значение");
        findEmployeeMoreNumber(70000);
    }

}

