public class Eagle extends Animal implements Canfly { 
    private String type;

    public Eagle(String name, Integer age, String genre, String type) {
        super(name, age, genre);
        this.type = type;
    }

    public String getType() {
        return type;
    }
    @Override // se implementa el metodo de la interfaz Canfly en la clase Eagle
    public void fly() {
        System.out.printf("%s esta volando.%n", getName());
    }

    boolean canPutEggs() {
        return getGenre().equalsIgnoreCase("hembra");
    
}

    void squeal() {
        System.out.printf("%s esta chillando.%n", getName());
    }

    @Override  // se uso la clase abstracta Animal para forzar la implementacion de este metodo
    public void hunt() {
        System.out.printf("El águila %s está cazando en las montañas.%n", getName());
    }

    @Override  // se uso la clase abstracta Animal para forzar la implementacion de este metodo
    public void makeNoise() {
        squeal();
    }

}