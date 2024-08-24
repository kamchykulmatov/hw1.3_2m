public class Father extends Grandfather {
    private String work;

    public Father(int age, String name, HobbyEnum hobbyEnum, String work) {
        super(age, name, hobbyEnum);
        this.work = work;
    }

    public void goWork(String work) {
        System.out.println("Идет на работу" + work);
    }

    public final void goWork() {
        System.out.println("Идет на работу в 8 утра");
    }

    public String getWork() {
        return work;
    }
    @Override
    public String toString() {
        return "Age = " + getAge() +
                "\nColorEnum = " + getHobbyEnum() +
                "\nName = " + getName() +
                "\n Work = "+getWork();
    }
}
