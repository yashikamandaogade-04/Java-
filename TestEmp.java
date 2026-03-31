abstract class Employee {
    String name; int id;
    Employee(String n,int i){name=n;id=i;}
    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;
    Manager(String n,int i,double s){super(n,i);salary=s;}
    double calculateBonus(){return 0.2*salary;}
}

class Developer extends Employee {
    double salary, incentive;
    Developer(String n,int i,double s,double inc){super(n,i);salary=s;incentive=inc;}
    double calculateBonus(){return 0.1*salary+incentive;}
}

public class TestEmp {
    public static void main(String[] args) {
        Employee e1 = new Manager("Ravi",1,50000);
        Employee e2 = new Developer("Yashika",2,40000,5000);
        System.out.println(e1.name+" Bonus: "+e1.calculateBonus());
        System.out.println(e2.name+" Bonus: "+e2.calculateBonus());
    }
}
