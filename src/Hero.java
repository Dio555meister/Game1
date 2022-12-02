public class Hero {

   private int xp;
    int lvl;
    int damage;
    int defense;
    String name;
    String rasa;

    String profession;


    public int getXp(){
        return xp;
    }

    public void setXp(int newXp){
        if (newXp < 0 ){

        }else {
            xp = xp - newXp;
        }

    }
    public Hero(int lvl, int xp, int damage, int defense, String name, String rasa) {
        this.lvl = lvl;
        this.xp = xp;
        this.damage = damage;
        this.defense = defense;
        this.name = name;
        this.rasa = rasa;
    }

    public void info() {
        System.out.println(("Имя: " + name) + ", " + ("Здоровье: " + xp) + ", "
                + ("Уровень: " + lvl) + ", " + ("Урон: " + damage) + ", " + ("Защита: " + defense));
    }
}


