public class Armour {

    private int id;
    private String name;
    private int block;
    private int price;
    public Armour(int id, String name, int block, int price) {
        this.id = id;
        this.name = name;
        this.block = block;
        this.price = price;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlock() {
        return block;
    }
    public void setBlock(int block) {
        this.block = block;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    

    public static Armour[] armours()
    {
        Armour [] armourList = { new Armour (2,"hafif",2,13),
                               new Armour (3,"Orta",3,35),
                               new Armour (4,"Ağır",4,40)
    
    
    };
    return armourList;
    }
    


    public static Armour getArmourById(int id)
    {

        for (Armour armour : Armour.armours())
        {
            if(armour.getId()==id)
            {return armour;}
        }
        return null ;
    }


}
