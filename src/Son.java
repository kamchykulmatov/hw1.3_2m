public final class Son extends Father {

    private String university;

    public Son(int age, String name, HobbyEnum hobbyEnum, String work, String university) {
        super(age, name, hobbyEnum, work);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    @Override
    public void goWork(String work) {
        System.out.println("Едет на работу после учебы" + this.getWork());
    }

    @Override
    public String toString() {
        return super.toString() + "\nName =" + getName() + "\n" +
                "\n age son" + getAge() +
                "\n University" + getUniversity() +
                "\n Work " + getWork() +
                "\n Hobby " + getHobbyEnum();

    }
}