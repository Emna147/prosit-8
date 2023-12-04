import java.util.Objects;

public class Zoo {
    private String name;
    private String city;
      static final int nb=25;
    private Animal[] a;
   private int nb_a=0;
    public Aquatic[] aquaticAnimals;
    public int numAquaticAnimals;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Animal[] getA() {
        return a;
    }

    public void setA(Animal[] a) {
        this.a = a;
    }

    public int getNb_a() {
        return nb_a;
    }

    public void setNb_a(int nb_a) {
        this.nb_a = nb_a;
    }

    public Zoo(String name, String city) {
        a = new Animal[nb];
        this.name = name;
        this.city = city;
        this.aquaticAnimals = new Aquatic[10]; // Initialisation du tableau pour 10 animaux aquatiques
        this.numAquaticAnimals = 0;


    }

    public void DisplayZoo() {
        System.out.println("le nom " + name + " city = " + city + " nb= " + nb);
    }
    @Override
    public String toString(){
        String s =  "Name : "+name+"\n" + "City :"+city+"\n"+"NbCages :"+nb +"\n";
        String r ="";
        for(int i=0;i<nb_a;i++){
            r+=a[i].toString();
        }
        return s+r;

    }

    public Boolean AddAnimal(Animal animal) {
        if (nb_a < nb && SearchAnimal(animal)==-1&& !isZooFull()) {
            a[nb_a] = animal;
            nb_a++;
            System.out.println("Animal ajouté!!");
            return true;
        } else {
            return false;
        }

    }

    public int SearchAnimal(Animal animal) {
        for (int i = 0; i < nb_a; i++) {//a.lenght whyy?
            if (Objects.equals(a[i].getName(), animal.getName()))
                return i;
        }
        return -1;
    }

    public boolean RemoveAnimal(Animal animal) {
        for (int i = 0; i < nb_a; i++) {//a.lenght whyy?
            if (SearchAnimal(animal) != -1)//a[i].equals(animal)
            {
                a[i] = null;
                nb_a--;
                System.out.println("supp");
                return true;

            }
        }
        return false;
    }
    public boolean isZooFull()
    {
        return nb==nb_a;
    }
    public Zoo comparezZoo(Zoo z1,Zoo z2)
    {
        if(z1.nb_a<z2.nb_a)
        {z1.DisplayZoo();
            return z1;}
        else {
            z2.DisplayZoo();
            return z2;}
    }
    public void addAquaticAnimal(Aquatic aquatic) {
        if (numAquaticAnimals < 10) {
            aquaticAnimals[numAquaticAnimals] = aquatic;
            numAquaticAnimals++;
            System.out.println("yes");

        } else {
            System.out.println("Le tableau est plein, impossible d'ajouter plus d'animaux aquatiques.");
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = -1;

        for (int i = 0; i < numAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Penguin penguin) {
                float depth = penguin.swimmingDepth;

                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }

        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int numDolphins = 0;
        int numPenguins = 0;

        for (int i = 0; i < numAquaticAnimals; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                numDolphins++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                numPenguins++;
            }
        }

        System.out.println("Nombre de dauphins : " + numDolphins);
        System.out.println("Nombre de pingouins : " + numPenguins);
    }

}




