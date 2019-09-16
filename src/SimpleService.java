/**
 *  发布SimpleService的webservice服务
 *
 *  这是一个不在包中的类，只需要把编译后的class文件丢到axis-web的pojo文件夹下，即可自动发布为webservice服务
 */
public class SimpleService {
    public String getGreeting(String name) {
        return "你好 " + name;
    }

    public int getPrice() {
        return new java.util.Random().nextInt(1000);
    }
}