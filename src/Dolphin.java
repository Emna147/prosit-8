public class Dolphin extends Aquatic{
    protected float swimmingSpeed;
    public Dolphin(String family, String name, int age, Boolean isMammel , String habitat,float swimmingSpeed)
    {
        super( family,  name,  age,  isMammel ,  habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    @Override
    public String toString()
    {
        String s;
        s=super.toString();
        s+="swimmingSpeed :"+swimmingSpeed+"\n";
        return s;
    }
}
