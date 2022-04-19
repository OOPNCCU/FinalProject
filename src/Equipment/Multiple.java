package Equipment;

public class Multiple extends Thing{
    private int amount;

    public Multiple(String name, int buyDate, int amount){
        super(name, buyDate);
        this.amount = amount;
    }

    public int getAmount(){
        return this.amount;
    }
    
    public void setAmount(int newAmount){
        this.amount = newAmount;
    }
}
