package design_patterns.design_patterns_head_first;

import design_patterns.design_patterns_head_first.StrategyPattern.Duck;
import design_patterns.design_patterns_head_first.StrategyPattern.FlyRocketPowered;
import design_patterns.design_patterns_head_first.StrategyPattern.MallardDuck;
import design_patterns.design_patterns_head_first.StrategyPattern.ModelDuck;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        
        Duck model= new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}