public class Fish extends Animal implements CanSwim {
    private String color;
    private Boolean formSea;

    public Fish(String name, Integer age, String genre, String color, Boolean formSea) {
        super(name, age, genre);
        this.color = color;
        this.formSea = formSea;
    }

    public String getColor() {
        return color;
    }

    public Boolean isFormSea() {
        return formSea; 
    }
    @Override // se implementa el metodo de la interfaz CanSwim en la clase Fish
     public void swim() {
        System.out.printf("%s esta nadando.%n", getName());
    }

    boolean canPutEggs() {
        return getGenre().equalsIgnoreCase("hembra");
    
}

    @Override  // se uso la clase abstracta Animal para forzar la implementacion de este metodo
    public void hunt() {
        System.out.printf("%s está nadando, se cruza con su objetivo y abre su boca y se lo come.%n", getName());
    
    }

    @Override // se uso la clase abstracta Animal para forzar la implementacion de este metodo
    public void makeNoise() {
        System.out.printf("%s hace blub blub.%n", getName());
    }
    
}
