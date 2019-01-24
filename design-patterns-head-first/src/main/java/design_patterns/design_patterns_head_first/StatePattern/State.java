package design_patterns.design_patterns_head_first.StatePattern;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnCrank();
    void dispense();
}
