public class HelloWorld {
    private int i;
<<<<<<< HEAD
<<<<<<< HEAD
=======
    private String name;
    
>>>>>>> bc366a67dd4f9b4d05d2b58e483cc88367dca2da
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
    
    public String getName(){
    	return name;
    }
    
    public void setName(String name){
    	this.name = name;
    }
}