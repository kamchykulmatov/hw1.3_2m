public class Grandfather {
    private int age;
    private String name;
    private HobbyEnum hobbyEnum;

    public Grandfather(int age, String name, HobbyEnum hobbyEnum) {
        this.age = age;
        this.name = name;
        this.hobbyEnum = hobbyEnum;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public HobbyEnum getHobbyEnum() {
        return hobbyEnum;
    }
}
