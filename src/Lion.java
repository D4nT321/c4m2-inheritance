public class Lion extends Animal implements CanRun {
    private String color;

    public Lion(String name, Integer age, String genre, String color) {
        super(name, age, genre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void roar() {
        System.out.printf("%s esta rugiendo.%n", getName());
    }

    @Override // se implementa el metodo de la interfaz CanRun en la clase Lion
    public void run() {
        System.out.printf("%s esta corriendo.%n", getName()); 
    }

    @Override // se uso la clase abstracta Animal para forzar la implementacion de este metodo
    public void hunt() {
        System.out.printf("%s se esconde, se mueve sigilosamente y ataca está.%n", getName());
    }
    
    @Override // se uso la clase abstracta Animal para forzar la implementacion de este metodo
    public void makeNoise() {
        roar();
    }
}
