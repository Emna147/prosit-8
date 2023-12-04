import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      /*
      Animal a= new Animal();
      Zoo z= new Zoo();
      a.family="lion";
       a.name="lio";
      a.age=9;
      a.isMammel=true;
        z.name="bilv";
        z.city="tun";
        z.nb=9;
       */
        Animal lion=new Animal("lion","leo",9,true);
        Animal chat =new Animal("chat","miow",4,false);
        Animal tigre=new Animal("tigre","tie",78,true);
        Zoo z=new Zoo("bilv","tun");
        Zoo zm=new Zoo("idk","idk");

        z.DisplayZoo();
        System.out.println(z);
        System.out.println(z.toString());

        z.AddAnimal(lion);
        z.AddAnimal(chat);
        z.AddAnimal(tigre);
        System.out.println("************");
        System.out.println(z.toString());
        System.out.println(z.SearchAnimal(chat));
        System.out.println(z.SearchAnimal(lion));
        System.out.println(z.SearchAnimal(tigre));
        System.out.println("************");
        z.RemoveAnimal(lion);
        zm.AddAnimal(lion);
        System.out.println("le nb de cage = "+z.getNb_a());
        System.out.println("le nb de cage = "+zm.getNb_a());
        z.comparezZoo(z,zm);
        Aquatic aqua=new Aquatic("aquatic","aqua",100,true,"bhar sahbi");
        Aquatic aqua2=new Aquatic("aquatic","aqua",100,true,"bhar sahbi");
        Terrestrial ter =new Terrestrial("ter","ter",80,false,4);
        Dolphin dof=new Dolphin("aquatic","dofdof",55,true,"bharr",2);
        Penguin peg =new Penguin("aquatic","ananasa",55,true,"bharr",5);
        String s,s1,s2,s3;
        s=aqua.toString();
        System.out.println("***********");
        System.out.println(s);
        s1=ter.toString();
        System.out.println(s1);
        s2=dof.toString();
        System.out.println(s2);
        s3=peg.toString();
        System.out.println(s3);
        aqua.swim();
        dof.swim();

        z.addAquaticAnimal(aqua);
        z.addAquaticAnimal(aqua2);
        System.out.println(z.maxPenguinSwimmingDepth());
        z.displayNumberOfAquaticsByType();
        aqua.eatMeat(Food.MEAT);
        aqua.eatMeat(Food.valueOf("food"));

    }
}