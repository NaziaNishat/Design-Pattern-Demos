package singletonpattern;

class SingleObject {
    private static SingleObject instance = new SingleObject();
    private SingleObject(){}

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello World!");
    }
}

public class SingletonPatternDemo {
    public static void main(String[] args) {

        //illegal construct
        //Compile Time Error: The constructor SingleObject() is not visible
        //SingleObject object = new SingleObject();

        SingleObject object = SingleObject.getInstance();
        object.showMessage();
    }
}
