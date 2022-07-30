abstract class Student implements Lecturable {

    public String name;
    public double GPA;

    public Student(String name, double GPA) {
        this.name = name;
        this.GPA = GPA;
    }

    @Override
    public boolean isQualified() {
        return calculateAchievement() > 100;
    }
}
