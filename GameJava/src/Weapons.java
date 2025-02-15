public class Weapons {
    private int id;
    private String name;
    private int damage;
    private int price;
    public Weapons(int id, String name, int damage, int price) {
        this.id = id;
        this.name = name;
        this.damage = damage;
        this.price = price;
    }

    public static Weapons[] weapons(){
        Weapons[] weaponList = {new Weapons(1, "Tabanca", 2, 20),
                new Weapons(2, "Kılıç", 3, 35),
                new Weapons(3, "Tüfek", 7, 45)};
        return weaponList;
    }

    public static Weapons getWeaponById(int id){
        for (Weapons weapon : Weapons.weapons()) {
            if (weapon.getId() == id){
                return weapon;
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
