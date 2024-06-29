public class HouseSafe extends LocationNormally{

    public HouseSafe(Player player)
    {
        super (player ,"Güvenli ev");

    }

    @Override
    public boolean  onLocation()
    {
        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        if(this.getPlayer().getInventory().isFullAwards())
        {
            System.out.println("Good Job - Oyun Bitti Kazandınız");
            return false;

        }
        return true;

    }

}
