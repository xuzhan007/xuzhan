package nio;

/**
 * Created by iss on 2018/3/27.
 */
public class server {

    public static void main(String[] args) {


        new Thread(new Reactor()).start();

    }
}
