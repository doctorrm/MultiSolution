package transfering;

public class PassValue {
    public static String name;
    public static void main(String[] args) {
        name="John";
        PassValue passValue=new PassValue();
        passValue.changeName(name);//值传递，John还是John，不会变成Mary
        System.out.println(name);
    }

    public void changeName(String name){
        name="Mary";
    }
}
