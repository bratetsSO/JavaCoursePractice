package by.lessons.practice.class_04;

public class IndustrialBuilding extends Building {
    private String industry;

    public IndustrialBuilding(String street, String wall, int year, String industry) {
        super(street, wall, year);
        this.industry = industry;
    }
}
