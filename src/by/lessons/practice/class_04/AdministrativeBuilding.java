package by.lessons.practice.class_04;

public class AdministrativeBuilding extends CivilBuilding {
    //1.4 Создать класс Административном здание.
    // Административное здание должно наследоваться от Гражданского здания.
    // Поля, которые можно определить в Административном здании: назначение административного здания (офисное, кинотеатр, спортсооружение),число людей, на которое рассчитано здание.
    private String purpose;
    private int numberOfPeople;

    public AdministrativeBuilding(String street, String wall, int year, String appointment, int floors, String purpose, int numberOfPeople) {
        super(street, wall, year, appointment, floors);
        this.purpose = purpose;
        this.numberOfPeople = numberOfPeople;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
