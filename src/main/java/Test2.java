import java.util.ArrayList;
import java.util.List;

/**
 * Created by iss on 2018/4/24.
 */
public class Test2 {
    public static void main(String[] args) {

        Integer status=-1;
        List list = new ArrayList();

        while (true){

            new HttpThread(status,list).run();
            if(list.size()>0){
                break;
            }else{
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(list);
    }
    private static int geta(){
        int i =0;
        System.out.println(i);
        return i;
    }


}
