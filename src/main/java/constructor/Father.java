package constructor;

public class Father {
    public int age;
    public Father(){}//如果没有这行，子类new一个父类时就必须传入参数
    public Father(int age){
        this.age=age;
    }
}
