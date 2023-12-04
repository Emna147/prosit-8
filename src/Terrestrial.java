public non-sealed class Terrestrial extends Animal {

    protected int nbLeg;
    public Terrestrial(String family, String name, int age, Boolean isMammel,int nbLeg)
    {
        super( family,  name,  age,  isMammel);
        this.nbLeg=nbLeg;
    }
    @Override
    public String toString()
    {
        String s;
        s=super.toString();
        s+="nbLeg :"+nbLeg+"\n";
        return s;
    }



}
