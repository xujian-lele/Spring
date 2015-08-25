package first_spring;

/**
 * Created by xujian on 2015/8/25.
 */
public class HelloWorld {
    private String message;

    public HelloWorld(String message) {
        this.message = message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void printMessage() {
        System.out.println("Your Message : " + this.getMessage());
    }
}
