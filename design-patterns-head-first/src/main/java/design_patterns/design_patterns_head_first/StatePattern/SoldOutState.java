package design_patterns.design_patterns_head_first.StatePattern;

public class SoldOutState implements State{
    GumballMachine gumballMachine;
    
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine=gumballMachine;
    }

    public void insertQuarter() {
        System.out.println("You can't insert a quarter,the machine is sold out");
        
    }

    public void ejectQuarter() {
        System.out.println("You can't eject,you haven't insert a quarter yet");
        
    }

    public void turnCrank() {
        System.out.println("You turned,but there are no gumballs");
        
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
        
    }

}
