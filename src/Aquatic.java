
 public  non-sealed class  Aquatic extends Animal implements Carnivore<Food>{

    protected String habitat;
    public Aquatic(String family, String name, int age, Boolean isMammel , String habitat)
    {
        super( family,  name,  age,  isMammel);
        this.habitat=habitat;
    }
    @Override
    public String toString()
    {
        String s;
        s=super.toString();
        s+="habitat :"+habitat+"\n";
        return s;
    }
    public  void swim()
    {
        System.out.println("This aquatic animal is swimming.");
    }
    public void eatMeat(Food food)
    {
        System.out.println("both");
    }

}

