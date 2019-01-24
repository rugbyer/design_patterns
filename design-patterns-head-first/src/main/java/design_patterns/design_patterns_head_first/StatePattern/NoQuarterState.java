package design_patterns.design_patterns_head_first.StatePattern;

public class NoQuarterState implements State{
    
    GumballMachine gumballMachine;
    
    public NoQuarterState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You have insterted a quarter!");
        gumballMachine.setState(gumballMachine.getHasQuarterState());   
    }

    public void ejectQuarter() {
        System.out.println("You havn't inserted a quarter!");
        
    }

    public void turnCrank() {
        System.out.println("You turned,but there is no quarter!");
        
    }

    public void dispense() {
        System.out.println("You need to pay first");
        
    }

}
