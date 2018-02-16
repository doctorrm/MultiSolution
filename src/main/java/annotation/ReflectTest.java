package annotation;

public class ReflectTest {
    @Reflect
    public void idolOne(String name) {
        System.out.println("==>>I am a huge fan of : " + name + "[idolOne]");
    }

    @Reflect(name = "Bill Gates")
    public void idolTwo(String name) {
        System.out.println("==>>I am a huge fan of : " + name + "[idolTwo]");
    }

    public static void main(String[] args) throws Exception {
        ReflectProcessor reflectProcessor = new ReflectProcessor();
        reflectProcessor.parseMethod(ReflectTest.class);
    }

}
