package design_patterns.design_patterns_head_first;

import ObserverPattern.CurrentConditionsDisplay;
import ObserverPattern.WeatherData;
import design_patterns.design_patterns_head_first.AdapterPattern.TurkeyAdapter;
import design_patterns.design_patterns_head_first.AdapterPattern.WildTurkey;
import design_patterns.design_patterns_head_first.CommandPattern.Light;
import design_patterns.design_patterns_head_first.CommandPattern.LightOffCommand;
import design_patterns.design_patterns_head_first.CommandPattern.LightOnCommand;
import design_patterns.design_patterns_head_first.CommandPattern.RemoteControl;
import design_patterns.design_patterns_head_first.CommandPattern.SimpleRemoteControl;
import design_patterns.design_patterns_head_first.CommandPattern.Stereo;
import design_patterns.design_patterns_head_first.CommandPattern.StereoOnWithCDCommand;
import design_patterns.design_patterns_head_first.DecoratorPattern.Beverage;
import design_patterns.design_patterns_head_first.DecoratorPattern.Espresso;
import design_patterns.design_patterns_head_first.DecoratorPattern.HouseBlend;
import design_patterns.design_patterns_head_first.DecoratorPattern.Mocha;
import design_patterns.design_patterns_head_first.SimpleFactoryPattern.NYStylePizzaStore;
import design_patterns.design_patterns_head_first.SimpleFactoryPattern.PizzaStore;
import design_patterns.design_patterns_head_first.SimpleFactoryPattern.SimplePizzaFactory;
import design_patterns.design_patterns_head_first.SingletonPattern.SingletonStatic;
import design_patterns.design_patterns_head_first.SingletonPattern.SingletonSyn;
import design_patterns.design_patterns_head_first.SingletonPattern.SingletonSynDC;
import design_patterns.design_patterns_head_first.StrategyPattern.Duck;
import design_patterns.design_patterns_head_first.StrategyPattern.FlyRocketPowered;
import design_patterns.design_patterns_head_first.StrategyPattern.MallardDuck;
import design_patterns.design_patterns_head_first.StrategyPattern.ModelDuck;
import design_patterns.design_patterns_head_first.TemplatePattern.CaffeineBeverageWithHook;
import design_patterns.design_patterns_head_first.TemplatePattern.CoffeeWithHook;

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
        FactoryMethod();
        Singleton();
        Command();
        AdapterPattern();
        TemplatePattern();
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
    
    //工厂模式区分简单工厂，工厂方法，抽象工厂，简单工厂在simple commit里，已覆盖
    public static void FactoryMethod(){
        
        PizzaStore pizzaStore = new NYStylePizzaStore();
        pizzaStore.orderPizza("clam");
        pizzaStore.orderPizza("cheese");
        
    }
    
    public static void Singleton(){
        
        SingletonSyn instanceSyn = SingletonSyn.getInstance();
        
        SingletonStatic instanceStatic = SingletonStatic.getInstance();
        
        SingletonSynDC instanceDC = SingletonSynDC.getInstance();
    }
    
    public static void Command(){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("");
        LightOnCommand lightOn = new LightOnCommand(light);
        
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight=new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        Stereo stereo = new Stereo("Living Room");
        
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRooLightOff = new LightOffCommand(livingRoomLight);
        
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
        
        StereoOnWithCDCommand stereoOnWithCommand = new StereoOnWithCDCommand(stereo);
        
        remoteControl.setCommand(0, livingRoomLightOn, livingRooLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(3, stereoOnWithCommand, stereoOnWithCommand);
        System.out.println(remoteControl.toString()+"@@");
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        
        
    }
    
    public static void AdapterPattern(){
        design_patterns.design_patterns_head_first.AdapterPattern.MallardDuck duck = 
                new design_patterns.design_patterns_head_first.AdapterPattern.MallardDuck();
        WildTurkey turkey = new WildTurkey();
        design_patterns.design_patterns_head_first.AdapterPattern.Duck turkeyAdapter = 
                new TurkeyAdapter(turkey);
        System.out.println("The turkey says:");
        turkey.gobble();
        turkey.fly();
        
        System.out.println("The duck says:");
        duck.quack();
        duck.fly();
        
        System.out.println("The TurkeyAdapter says:");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        
    }
    
    public static void TemplatePattern(){
        CaffeineBeverageWithHook coffeeHook = new CoffeeWithHook();
        coffeeHook.prepareReciple();
    }
}
