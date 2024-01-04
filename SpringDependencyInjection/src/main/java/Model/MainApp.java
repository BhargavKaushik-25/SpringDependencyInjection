package Model;

//this is constructor injection example here we are injecting the engine properties in car with the help of constructor(parameterized)
//here if we want to change the engine type then we only have to change in the constructor-ref in applicationContext.xml file
//means we do not have to change the whole code we just have to make a minor change inside context fle and new properties will be injected
//in this way we can create a ready to deploy application with the help of spring framework
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class MainApp
{
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. NEXON");
        System.out.println("2. THAR");
        int choice = scanner.nextInt();

        Car car = null;

        if (choice == 1){
            car = context.getBean("nexon", NexonCar.class);
        } else if (choice == 2) {
            car = context.getBean("thar", Thar.class);
        }else {
            System.out.println("INVALID CHOICE");
        }

        if (car != null){
            car.getCarInformation();
            car.getEngineInformation();
        }else {
            System.out.println("SOMETHING WENT WRONG");
        }
    }
}
