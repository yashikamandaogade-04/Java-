class Staff {
    void work(){System.out.println("General staff work.");}
}

class Doctor extends Staff {
    void work(){System.out.println("Doctor treats patients.");}
}
class Nurse extends Staff {
    void work(){System.out.println("Nurse assists doctors.");}
}
class Receptionist extends Staff {
    void work(){System.out.println("Receptionist manages appointments.");}
}

public class TestStaff {
    public static void main(String[] args) {
        Staff[] s = {new Doctor(), new Nurse(), new Receptionist()};
        for(Staff st: s) st.work();
    }
}
