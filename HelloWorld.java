public class HelloWorld {
    private int i;
<<<<<<< HEAD
    public HelloWorld() {
        i = 0;
    }
=======
    private String text;
    public HelloWorld() {
        i = 0;
        text = "";
    }
    public HelloWorld(String text) {
        System.out.println(text);
    }

>>>>>>> featureA
    public int getI() {
        return i;
    }
}