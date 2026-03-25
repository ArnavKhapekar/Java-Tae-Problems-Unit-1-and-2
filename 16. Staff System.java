class Staff {
    void work() {
        System.out.println("Staff work");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Treat patients");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Assist doctor");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Manage desk");
    }

    public static void main(String[] args) {
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}
