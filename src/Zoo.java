public class Zoo {
    String name ;
    String city ;
    int nbrCages ;
    Animal [] animals =new Animal[25];

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    public void displayZoo() {
        System.out.println("Nom du Zoo: " + name + ", Ville: " + city + ", le nombre de cages : " + nbrCages);
    }
    public String toString() {
        return  "name: " + name + ", city: " + city + ", nombre de cages : " + nbrCages ;
    }

}
