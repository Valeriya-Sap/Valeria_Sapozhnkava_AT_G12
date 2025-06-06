package homework.unitTests.people;

public class Engineer extends Person {

    private int skill;
    private int experience;

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Engineer(int age, int skill, int experience) {
        super(age);
        this.skill = skill;
        this.experience = experience;
    }
}
