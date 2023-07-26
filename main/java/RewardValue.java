import java.util.Scanner;

public class RewardValue {

    private double cash;
    private int miles;

    //two constructors overriden 
    public RewardValue (double cash){
        this.cash = cash;
    }
    public RewardValue(int miles){
        this.miles = miles;
    }
    
    //METHODS
    public double getCashValue(){
        int reward;
        reward = (miles * 0.0035);
    }

    public int getMilesValue(){
        int reward;
        reward = (int) (cash / 0.0035);
    }
}