package OOP.Cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args)throws CloneNotSupportedException {
        Human sharun = new Human(34,"sharun koul");
//        Human twin = new Human(sharun);

        Human twin = (Human)sharun.clone();
        System.out.println(twin.age);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=100;
        twin.name="Suman";
        System.out.println(Arrays.toString(sharun.arr)+"| "+sharun.name);

    }
}
