public class Penguin extends Aquatic{
    protected float swimmingDepth;
    public Penguin(String family, String name, int age, Boolean isMammel , String habitat,float swimmingDepth)
    {
        super( family,  name,  age,  isMammel ,  habitat);
        this.swimmingDepth=swimmingDepth;
    }
    @Override
    public String toString()
    {
        String s;
        s=super.toString();
        s+="swimmingDepth :"+swimmingDepth+"\n";
        return s;
    }
}
