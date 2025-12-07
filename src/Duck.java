public class Duck extends Animal implements Canfly, CanRun, CanSwim {
     private String color;


    public Duck(String name, Integer age, String genre, String color) {
        super(name, age, genre);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    @Override // se implementa el metodo de la interfaz Canfly en la clase Duck
    public void fly() {
        System.out.printf("%s esta volando.%n", getName());
    }
    
    @Override // se implementa el metodo de la interfaz CanSwim en la clase Duck
    public void swim() {
        System.out.printf("%s esta nadando.%n", getName());
    }
    @Override // se implementa el metodo de la interfaz CanRun en la clase Duck
    public void run() {
        System.out.printf("%s esta corriendo.%n", getName());
    }

    public boolean canPutEggs() {
        return getGenre().equalsIgnoreCase("hembra");
    }

    @Override  // se uso la clase abstracta Animal para forzar la implementacion de este metodo
    public void hunt() {  
        System.out.printf("%s va nadando, se posa sobre el pez y mete la cabeza para tomarlo.%n", getName());
    }

    @Override // se uso la clase abstracta Animal para forzar la implementacion de este metodo
    public void makeNoise() {
        System.out.printf("%s hace cuac cuac.%n", getName());
    }

    

}