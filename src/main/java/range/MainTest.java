package range;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by iss on 17/9/20.
 */
public class MainTest {
    public static void main(String[] args) {
        String str = "we\nare\ndic\nare\ne";
        String dic = "we he\nare is";
        Map map  = formatDic(dic);
        System.out.println(str);
        System.out.println(formatStr(str,map));
    }

    public static Map formatDic(String dic){
        Map dicMap  = new HashMap();
        String[] dicArr = dic.split("\n");
        for(int i=0;i<dicArr.length;i++){
            String[] cell = dicArr[i].split(" ");
            dicMap.put(cell[0],cell[1]);
        }
        return dicMap;
    }
    public static String  formatStr(String str,Map map){
        String[] dicArr = str.split("\n");
        StringBuffer Sb = new StringBuffer("");
        for(int i=0;i<dicArr.length;i++){
            if(map.get(dicArr[i])!=null){
                Sb.append(" "+map.get(dicArr[i]));
            }else{
                Sb.append(" "+dicArr[i]);
            }

        }
        return Sb.toString();
    }
}
