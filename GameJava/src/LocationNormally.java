public class LocationNormally extends Location {
    public LocationNormally ( Player player, String name)
    {
        super(player ,name);
    }

    @Override
    public boolean onLocation()
    {
        return true;
    }

}
