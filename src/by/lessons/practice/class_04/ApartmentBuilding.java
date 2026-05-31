package by.lessons.practice.class_04;

public class ApartmentBuilding extends CivilBuilding {
    private int countApart;

    public ApartmentBuilding(String street, String wall, int year, String appointment, int floors, int countApart) {
        super(street, wall, year, appointment, floors);
        this.countApart = countApart;
    }
}
