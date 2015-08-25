package first_spring;

/**
 * Created by xujian on 2015/8/25.
 */
public class HelloWorld {
    private String message;
    private String setterMessage;

    public String getSetterMessage() {
        return setterMessage;
    }

    public void setSetterMessage(String setterMessage) {
        this.setterMessage = setterMessage;
    }

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

    public void printSetterMessage() {
        System.out.println("Your Setter Message : " + this.getSetterMessage());
    }
}
