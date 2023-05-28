import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        try {

            Constructor<Car> car = Car.class.getDeclaredConstructor(null);
            car.setAccessible(true);
            Object obj = car.newInstance();
            Method m = Car.class.getDeclaredMethod("getCarInfo");
            m.setAccessible(true);
            m.invoke(obj);

            Constructor<Car> car1 = Car.class.getDeclaredConstructor(String.class, int.class);
            car1.setAccessible(true);
            Object obj1 = car1.newInstance("Camaro", 2022);
            Method m1 = Car.class.getDeclaredMethod("getCarInfo");
            m1.setAccessible(true);
            m1.invoke(obj1);

            Class car2 = Class.forName("Car");
            Object obj2 = car2.newInstance();
            Method met = car2.getDeclaredMethod("getCarInfo", null);
            met.setAccessible(true);
            met.invoke(obj2, null);

        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
