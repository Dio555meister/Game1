public class Hero {

   private int xp;
    int lvl;
    int damage;
    int defense;
    String name;
    String rasa;

    String profession;
    int energy=10;



    public int getXp(){
        return xp;
    }

    public void setXp(int newXp){
        if (newXp < 0 ){

        }else {
            xp = xp - newXp;
        }

    }
    public Hero(int lvl, int xp, int damage, int defense, String name, String rasa, int
                 energy) {
        this.lvl = lvl;
        this.xp = xp;
        this.damage = damage;
        this.defense = defense;
        this.name = name;
        this.rasa = rasa;
        this.energy = energy;

    }

    public void info() {
        System.out.println(("Имя: " + name) + ", " + ("Здоровье: " + xp) + ", "
                + ("Уровень: " + lvl) + ", " + ("Урон: " + damage) + ", " + ("Защита: " + defense)+", "+("Энергия: " + energy));
    }
}


