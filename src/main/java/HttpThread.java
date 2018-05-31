import java.util.List;

/**
 * Created by iss on 2018/4/24.
 */
public class HttpThread implements Runnable{
    Integer status;
    List list;
    HttpThread(Integer status,List list){
        this.status=0;
        this.list=list;
    }
    public void run() {
        status=1;
        //list.add(1);
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
    }
}
