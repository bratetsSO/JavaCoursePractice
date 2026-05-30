package by.lessons.practice.class_04;

public class VillageMain {
    public static void main(String[] args) {
        AdministrativeBuilding sportBuild = new AdministrativeBuilding("Ленина", "кирпич", 1975, "спортивный", 5, "спортивная", 500);

        //2.2 Получить значение количества людей, которые могут находится в спортсооружении, созданном выше и вывести это в консоль (метод getter)
        System.out.println(sportBuild.getNumberOfPeople());

        //2.3 Изменить количество людей, которые могут находится в спорртсооружении и вывести их в консоль после изменения (методы setter и getter)
        sportBuild.setNumberOfPeople(450);
        System.out.println(sportBuild.getNumberOfPeople());

        Fabric fabricBuild = new Fabric("Ленина", "кирпичная", 1975, "аграрная", 50, "хлопок");

        Building[] buildings = new Building[2];
        buildings[0] = sportBuild;
        buildings[1] = fabricBuild;
        Village village = new Village(buildings);
    }
}
