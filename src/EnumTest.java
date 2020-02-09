public class EnumTest {
    public static void main(String [] agrs){
        System.out.println("RED".equals(Color.RED.name()));
        System.out.println(Color.RED.ordinal());
    }
}
enum Color{
    RED,YELLOW,BLUE
}