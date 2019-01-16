package design_patterns.design_patterns_head_first.CommandPattern;

public class NoCommand implements Command{

    public void execute() {
        System.out.println("NoCommand");
    }

}
