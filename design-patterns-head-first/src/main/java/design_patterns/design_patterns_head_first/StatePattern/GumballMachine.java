package design_patterns.design_patterns_head_first.StatePattern;

public class GumballMachine {
    String location;
    
    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;
    
    State state = soldOutState;
    
    int count = 0;
    
    public GumballMachine(String location,int numberGumballs){
        this.location = location;
        soldState = new SoldState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        
        this.count = numberGumballs;
        if(numberGumballs>0){
            state = noQuarterState;
        }
    }
    
    public String getLocation(){
        return location;
    }
    
    public void  setState(State state){
        this.state = state;
    }
    
    public State getHasQuarterState(){
        return this.hasQuarterState;
    }
    public State getSoldOutState(){
        return this.soldOutState;
    }
    public State getNoQuarterState(){
        return this.noQuarterState;
    }
    public State getSoldState(){
        return this.soldState;
    }
    public State getWinnerState(){
        return this.winnerState;
    }
    
    public State getState(){
        return state;
    }
    
    public int getCount(){
        return this.count;
    }
    
    public void insertQuarter(){
        state.insertQuarter();
    }
    
    public void ejectQuarter(){
        state.ejectQuarter();
    }
    
    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }
    
    void releaseBall(){
        System.out.println("A gumball comes rolling out thoe slot...");
        if(count !=0){
            count = count -1;
        }
        
    }

}
