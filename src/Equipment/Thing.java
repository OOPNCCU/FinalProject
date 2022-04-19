package Equipment;

public class Thing {
    protected String name;
    protected boolean usable;
    protected int buyDate;

    public Thing(String name, int buyDate){
        this.name = name;
        this.usable = true;
        this.buyDate = buyDate;
    }

    public String getName(){
        return this.name;
    }

    public boolean getUsable(){
        return this.usable;
    }

    public void setUsable(boolean newstatus){
        this.usable = newstatus;
    }
}
