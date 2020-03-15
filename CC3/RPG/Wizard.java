
public class Wizard extends Character {
    
    protected int maxMagic;
    protected int currentMagic;
    
    public Wizard (String n, int s, int d, int i){
        super(n,s,d,i);
        this.maxMagic = dice.roll() * 10;
        this.currentMagic = maxMagic;     
    }
    
    public int castLightningBolt(){
        if (currentMagic >= 5){ 
            currentMagic -= 5;
            return dice.roll()+ intelligence;   
        } else {
            return  0;
        }
    }
       
    public int castHeal(){
        int Heal = dice.roll() + intelligence;
        if (currentMagic >= 8) {
            currentMagic -= 8;
            heal(Heal);
        }
        return Heal;
    }
    
    public int getMaxMAgic(){
        return maxMagic;
    }
    
    public int getCurrentMagic(){
        return currentMagic;
    }
}
