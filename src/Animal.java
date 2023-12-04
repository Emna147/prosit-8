public sealed class Animal permits Aquatic , Terrestrial {
    private String family;
    private String name;
    private int age;
    private Boolean isMammel;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
        {
            System.out.println("nope");}

        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getMammel() {
        return isMammel;
    }

    public void setMammel(Boolean mammel) {
        isMammel = mammel;
    }

    public Animal(String family, String name, int age, Boolean isMammel) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammel = isMammel;
    }
    @Override
    public String toString(){
        String s="";
        s+="Family :"+family+"\n";
        s+="name :"+name+"\n";
        s+="age :"+age+"\n";
        s+="isMammal :"+isMammel+"\n";
        return s;
    }

}
