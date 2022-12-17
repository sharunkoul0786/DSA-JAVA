package OOP.Singleton;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;
    static public Singleton getInstance(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
