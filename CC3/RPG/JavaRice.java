public class JavaRice extends Character {
    
    protected int maxRice;
    protected int currentRice;
     
    public JavaRice (String n, int s, int d, int i){
        super(n,s,d,i);
        this.maxRice = dice.roll() * 10;
        this.currentRice = maxRice;     
    }

    public int castStun(){
        if (currentRice >= 6) {
            currentRice -= 6;
            return dice.roll() + dexterity;   
        }else{
            return  0;
        }
    }
    
    public int castHeal(){
        int Heal = dice.roll() + dexterity;
        if (currentRice >= 8) {
            currentRice -= 8;
            heal(Heal);
        }
        return Heal;
    }
    
    public int getMaxRice(){
        return maxRice;
    }
    
    public int getCurrentRice(){
        return currentRice;
    }
}
