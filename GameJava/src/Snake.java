import java.util.Random;

public class Snake extends Monster{
    public Snake()
    {
        super(4, "Yılan",11);
        Random rnd = new Random();
        this.setDamage(rnd.nextInt(5)+3);
    }

}
