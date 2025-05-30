import java.util.*;
class Arry{
    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<String>();
        cars.add("Lamborgini");
        cars.add("BMW");
        cars.add("Ferrari");
        System.out.println(cars);
        System.out.println(cars.get(1));
        cars.set(2,"Tesla");
        System.out.println(cars);
        cars.remove(1);
        System.out.println(cars);

    }
}
