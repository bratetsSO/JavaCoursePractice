package by.lessons.practice.class_04;

public class CivilBuilding extends Building {
    private String appointment;
    private int floors;

    public CivilBuilding(String street, String wall, int year, String appointment, int floors) {
        super(street, wall, year);
        this.appointment = appointment;
        this.floors = floors;
    }
}
