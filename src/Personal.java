import java.time.Year;

public abstract class Personal implements Lecturable {

    public String name;
    public int birthYear;
    public String department;

    public int year = Year.now().getValue();

    public Personal(String name, int birthYear, String department) {
        this.name = name;
        this.birthYear = birthYear;
        this.department = department;
    }

    @Override
    public boolean isQualified() {
        return calculateAchievement() > 1;
    }
}