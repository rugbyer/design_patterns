package design_patterns.design_patterns_head_first.StatePattern;

public class GumballMonitor {
    
    GumballMachine gumballMachine;
    public GumballMonitor(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }
    public void report(){
        System.out.println("Gumball Machine: "+gumballMachine.getLocation());
        System.out.println("Current inventor: "+gumballMachine.getCount()+" gumballs");
        System.out.println("Current state: "+gumballMachine.getState());
    }

}
