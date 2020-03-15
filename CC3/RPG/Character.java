
public class Character {
    static Dice dice = new Dice();
    
    protected String name;
    protected int strength;
    protected int dexterity;
    protected int intelligence;
    protected int maxLife;
    protected int currentLife;

    public Character(String n, int s, int d, int i) {
        name = n;
        strength = s;
        dexterity = d;
        intelligence = i;
        
        maxLife = dice.roll() * 10;
        currentLife = maxLife;
    }
    
    public int attack() {
        return (dice.roll() + strength - dice.roll());
    }
    
    public void wound(int damage) {
        currentLife -= damage;
    }
    
    public void heal(int heal) {
        currentLife += heal;
    }
    
    public String getName() {
        return name;
    }
    
    public int getStrength(){
        return strength;
    }
    
    public int getDexterity() {
        return dexterity;
    }
    
    public int getIntelligence() {
        return intelligence;
    }
    
    public int getCurrentLife(){
        return currentLife;
    }
    
    public int getMaxLife() {
        return maxLife;
    }    
    
    
}
