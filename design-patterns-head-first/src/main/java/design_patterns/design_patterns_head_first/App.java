package design_patterns.design_patterns_head_first;

import ObserverPattern.CurrentConditionsDisplay;
import ObserverPattern.WeatherData;
import design_patterns.design_patterns_head_first.DecoratorPattern.Beverage;
import design_patterns.design_patterns_head_first.DecoratorPattern.Espresso;
import design_patterns.design_patterns_head_first.DecoratorPattern.HouseBlend;
import design_patterns.design_patterns_head_first.DecoratorPattern.Mocha;
import design_patterns.design_patterns_head_first.StrategyPattern.Duck;
import design_patterns.design_patterns_head_first.StrategyPattern.FlyRocketPowered;
import design_patterns.design_patterns_head_first.StrategyPattern.MallardDuck;
import design_patterns.design_patterns_head_first.StrategyPattern.ModelDuck;

/**
 * Test design patterns!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //StrategyPattern();
        ObserverPattern();
        DecoratorPattern();
    }
    
    public static void StrategyPattern(){
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
        
        Duck model= new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
    
    public static void ObserverPattern(){
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(10, 38, 1024);
        weatherData.setMeasurements(20, 48, 1026);
    }
    
    public static void DecoratorPattern(){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription()+" $"+beverage.cost());
        
        Beverage beverage2 = new HouseBlend();
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
        
    }
}
