class Employee {
    String name; int id;
    static int employeeCount=0;

    Employee(String n,int i){name=n;id=i;employeeCount++;}

    static void showCount(){System.out.println("Total employees: "+employeeCount);}

    public static void main(String[] args) {
        new Employee("A",1);
        new Employee("B",2);
        Employee.showCount();
    }
}
