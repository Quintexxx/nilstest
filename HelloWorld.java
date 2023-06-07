public class HelloWorld {
    private int i;
    private String name;
    

    private String text;
    
    public HelloWorld() {
        i = 0;
        text = "";
    }
    
    public HelloWorld(String text) {
    	this.text = text;
        System.out.println(text);
    }

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