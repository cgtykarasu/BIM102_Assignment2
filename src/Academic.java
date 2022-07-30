public class Academic extends Personal {

    public int numberOfPaper;
    public int numberOfSymposium;

    public Academic(String name, int birthYear, String department, int numberOfPaper, int numberOfSymposium) {
        super(name, birthYear, department);
        this.numberOfPaper = numberOfPaper;
        this.numberOfSymposium = numberOfSymposium;
    }

    @Override
    public double calculateAchievement() {
        return ((3 * numberOfPaper) + (2 * numberOfSymposium)) / (double)(year - birthYear);
    }
}



