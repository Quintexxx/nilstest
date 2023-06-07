public class HelloWorld {
    private int i;
    private String text;
    public HelloWorld() {
        i = 0;
        text = "";
    }
    public HelloWorld(String text) {
        System.out.println(text);
    }

    public int getI() {
        return i;
    }
}