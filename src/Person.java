/**
 * Created by Suwadith on 7/6/2017.
 */

public class Person {

    private String name;
    private int age;
    private String gender;
    private boolean happy = false;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public boolean isHappy() {
        return happy;
    }

    public void playWithRock() {
        happy = true;
    }
}
