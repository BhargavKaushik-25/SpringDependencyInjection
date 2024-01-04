package Model;

public class NexonCar implements Car{
    private Engine engine;

    //we are using engine data member so that loose coupling could occur
    //it is a petrol engine or diesel engine it depends upon the time of object creation that which argument we are providing
    public NexonCar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void getCarInformation() {
        System.out.println("CAR NAME IS :- NEXON");
        System.out.println("CAR PRICE IS :- 150000");
    }

    @Override
    public void getEngineInformation() {
        //we are using object reference for loose coupling other wise there will be tight coupling if we provide direct petrol or diesel
        //engine so to not make that happen we are using object reference
        engine.getEngineInformation();
    }
}
