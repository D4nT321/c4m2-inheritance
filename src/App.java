public class App {
    public static void main(String[] args) throws Exception {
        var eagle = new Eagle("Aguila Real", 5, "Hembra", "Real");
        var lion = new Lion("Simba", 8, "Macho", "Dorado");
        var fish = new Fish("Nemo", 2, "Hembra", "Naranja", true);
        var duck = new Duck("Donald", 4, "Macho", "Negro");

        eagle.fly();
        eagle.hunt();
        eagle.happyBirthday();
        System.out.println("El " + eagle.getName()+ " tiene " + eagle.getAge() + "años");
        System.out.println("El " + eagle.getName()+ " " + (eagle.canPutEggs() ? "si" : "no") + " puede poner huevos");

        lion.run();
        lion.hunt();
        lion.happyBirthday();
        System.out.println("El "+ lion.getName()+ " tiene " + lion.getAge()+ " años");


        fish.swim();
        fish.hunt();
        fish.happyBirthday();
        System.out.println("El  "+ fish.getName()+ "tiene " + fish.getAge()+ "años");
        System.out.println("El " + fish.getName()+ " " + (fish.canPutEggs() ? "si" : "no") + " puede poner huevos");
        System.out.println("El " + fish.getName()+ " " + (fish.isFormSea() ? "es de mar" : "vive en el rio"));


        duck.swim();
        duck.fly();
        duck.run();
        duck.hunt();
        duck.happyBirthday();
        System.out.println("El  "+ duck.getName()+ "tiene " + duck.getAge()+ "años");
        System.out.println("El " + duck.getName()+ " " + (duck.canPutEggs() ? "si" : "no") + " puede poner huevos");

        CanSwim animal1 = new Fish("Kronos", 3, "Macho", "Azul", false);
        animal1.swim();
        CanSwim animal2 = new Duck("Lola", 6, "Hembra", "Rosado");
        animal2.swim();
        Canfly animal3 = (Canfly) animal2;
        animal3.fly();
        Animal animal4 = (Animal) animal3;
        animal4.happyBirthday();
        animal4.makeNoise();
    }
}
