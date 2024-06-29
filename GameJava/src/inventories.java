public class inventories {
    private Weapons weapon;
    private Armour armour;
    private boolean food;
    private boolean firewood;
    private boolean water;

    public inventories()
    {
        this.weapon = new Weapons(-1,"yumruk",0,0);
        this.armour = new Armour(-1, "paçavra", 0, 0);
        food= false;
        firewood=false;
        water = false;

    }

    public boolean  isFullAwards()
    {
        return (isFood() && isFirewood() && isWater());
    }

    public Weapons getWeapons()
    {
        return weapon;

    }
    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public Armour getArmor() {
        return armour;
    }

    public void setArmor(Armour armor) {
        this.armour = armour;
    }

    public boolean isFood() {
        return food;
    }

    public void setFood(boolean food) {
        this.food = food;
    }

    public boolean isFirewood() {
        return firewood;
    }

    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }

    public boolean isWater() {
        return water;
    }

    public void setWater(boolean water) {
        this.water = water;
    }

}
