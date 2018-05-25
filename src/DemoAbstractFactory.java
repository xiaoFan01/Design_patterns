abstract class Car{
    public abstract String getEngine();
    public abstract String getWheel();
    public abstract String getFrame();
    public abstract String getInterior();
    public String toString(){
        return "Engine:" + this.getEngine() + ",Wheel:" + this.getWheel() + ",Frame:" + this.getFrame() + ",Interior:" + this.getInterior();
    }
}
class BMW extends Car{
    private String engine;
    private String wheel;
    private String frame;
    private String interior;
    BMW(String engine,String wheel,String frame,String interior){
        this.engine = engine;
        this.wheel = wheel;
        this.frame = frame;
        this.interior = interior;
    }
    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getWheel() {
        return wheel;
    }

    @Override
    public String getFrame() {
        return frame;
    }

    @Override
    public String getInterior() {
        return interior;
    }
}
class LandRover extends Car{
    private String engine;
    private String wheel;
    private String frame;
    private String interior;
    LandRover(String engine,String wheel,String frame,String interior){
        this.engine = engine;
        this.wheel = wheel;
        this.frame = frame;
        this.interior = interior;
    }
    @Override
    public String getEngine() {
        return engine;
    }

    @Override
    public String getWheel() {
        return wheel;
    }

    @Override
    public String getFrame() {
        return frame;
    }

    @Override
    public String getInterior() {
        return interior;
    }
}
interface CarAbstractFactory{
    Car produceCars();
}
class BMWFactory implements CarAbstractFactory{
    private String engine;
    private String wheel;
    private String frame;
    private String interior;
    BMWFactory(String engine,String wheel,String frame,String interior){
        this.engine = engine;
        this.wheel = wheel;
        this.frame = frame;
        this.interior = interior;
    }
    @Override
    public Car produceCars() {
        return new BMW(engine,wheel,frame,interior);
    }
}
class LandRoverFactory implements CarAbstractFactory{
    private String engine;
    private String wheel;
    private String frame;
    private String interior;
    LandRoverFactory(String engine,String wheel,String frame,String interior){
        this.engine = engine;
        this.wheel = wheel;
        this.frame = frame;
        this.interior = interior;
    }
    @Override
    public Car produceCars() {
        return new BMW(engine,wheel,frame,interior);
    }
}
interface CarFactory{
    public static Car getCar(CarAbstractFactory factory){
        return factory.produceCars();
    }
}
public class DemoAbstractFactory {
    public static void main(String[] args){
        startProduceCars();
    }
    private static void startProduceCars(){
        Car bmwX1 = CarFactory.getCar(new BMWFactory("N20","PP2","X1","CCM"));
        Car bmwX5 = CarFactory.getCar(new BMWFactory("N55","CPC","X5","CMS"));
        Car landroverJG = CarFactory.getCar(new LandRoverFactory("Si4","Qr","JG","MMD"));
        System.out.println("BMW_X1::" + bmwX1.toString());
        System.out.println("BMW_X5::" + bmwX5.toString());
        System.out.println("LandRover_JG::" + landroverJG.toString());
    }
}
