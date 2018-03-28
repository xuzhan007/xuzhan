package range;


import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.security.cert.X509Certificate;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

//import org.apache.commons.httpclient.HttpClient;
//import org.apache.commons.httpclient.methods.GetMethod;
//import org.apache.commons.httpclient.methods.PostMethod;
//import org.apache.commons.httpclient.params.HttpClientParams;
//import org.apache.commons.httpclient.protocol.Protocol;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//import com.hengeasy.profiles.rest.util.MyProtocolSocketFactory;
//import com.hengeasy.profiles.rest.util.MyX509TrustManager;

/**
 * Created by iss on 17/9/12.
 */
public class Test {

    private static final String WECHAT_API = "https://api8.stockemotion.com:8701/stock/v2.0/user?ak=9d5fda72-8909-11e5-9063-003048c93ea6&code=verify";

//  public static void main(String[] args) throws Exception
//  {
//    HttpClient hc = new HttpClient();
//    GetMethod httpget = new GetMethod("http://api.stockemotion.com:8100/stock/v1.2/query?code=WD0001&ak=from.android&shop=wode");
//
//    try
//    {
//      hc.executeMethod(httpget);
//      JSONObject response = new JSONObject(httpget.getResponseBodyAsString());
//      System.out.println(response);
//      System.out.println(response.getString("stock_id"));
//    }
//    catch (IOException io)
//    {
//      System.out.println("Get video from qiniu duration failed");
//    }
//    catch (JSONException jsone)
//    {
//      System.out.println("Failed to transfer record to json");
//    }
//  }
//
//  public static void main(String[] args) throws Exception
//  {
//    SSLContext sslContext = SSLContext.getInstance("SSL", "SunJSSE");
//    TrustManager[] tms = { ignoreCertificationTrustManger };
//    sslContext.init(null, tms, new java.security.SecureRandom());
//    javax.net.ssl.SSLSocketFactory ssf = sslContext.getSocketFactory();
//
//    URL reqURL = new URL(WECHAT_API); // 创建URL对象
//
//    HttpsURLConnection httpsConn = (HttpsURLConnection) reqURL.openConnection();
//    httpsConn.setSSLSocketFactory(ssf);
//
//    httpsConn.setRequestMethod("POST");
//    httpsConn.setDoInput(true);
//    httpsConn.setDoOutput(true);
//    String data = "{\"device\": \"354829054334366\", \"version\": \"2.0 beta 12\", \"id\": \"18910131152\"}";
//    DataOutputStream out = new DataOutputStream(httpsConn.getOutputStream());
//    out.writeBytes(data);
//    out.flush();
//    out.close();
//    // 取得该连接的输入流，以读取响应内容
//    InputStreamReader insr = new InputStreamReader(httpsConn.getInputStream());
//
//    // 读取服务器的响应内容并显示
//    int respInt = insr.read();
//    StringBuffer sb = new StringBuffer();
//    while (respInt != -1)
//    {
//      sb.append((char) respInt);
//      respInt = insr.read();
//    }
//    System.out.println(sb.toString());
//    JSONObject tokenObj = new JSONObject(sb.toString());
//    System.out.println(tokenObj.getString("user_name"));
//  }

    public static void main(String[] args) throws Exception{









    }











//    {
//        String  data = "{\"device\": \"354829054334366\", \"version\": \"2.0 beta 12\", \"id\": \"18910131152\"}";
//        String jsonStr = getDataByHttpClient(WECHAT_API, data);
//        System.out.println(jsonStr);
//        JSONObject tokenObj = new JSONObject(jsonStr.toString());
//        System.out.println(tokenObj.getString("user_name"));
//    }
//
//    public static String getDataByHttpClient(String url, String data){
//        JSONObject jsonObj = new JSONObject();
//        X509TrustManager x509TrustMgr = new MyX509TrustManager();
//        SSLContext sslContext = null;
//        try
//        {
//            sslContext = SSLContext.getInstance("SSL");
//            sslContext.init(null, new TrustManager[] { x509TrustMgr }, null);
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        Protocol.registerProtocol("https", new Protocol("https", new MyProtocolSocketFactory(),
//                443));
//        try {
//
//            HttpClient hc = new HttpClient();
//            PostMethod httpPost = new PostMethod(url);
//            HttpClientParams ps = hc.getParams();
//            ps.setContentCharset("UTF-8");
//            httpPost.setRequestBody(data);
//            hc.executeMethod(httpPost);
//            jsonObj = new JSONObject(httpPost.getResponseBodyAsString());
//            //System.out.println(jsonObj);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        return jsonObj.toString();
//    }
//
//    private static TrustManager ignoreCertificationTrustManger = new X509TrustManager()
//    {
//
//        private X509Certificate[] certificates;
//
//        public void checkClientTrusted(X509Certificate[] arg0, String arg1) throws java.security.cert.CertificateException
//        {
//            if (this.certificates == null)
//            {
//                this.certificates = certificates;
//            }
//
//        }
//
//        public void checkServerTrusted(X509Certificate[] arg0, String arg1) throws java.security.cert.CertificateException
//        {
//            if (this.certificates == null)
//            {
//                this.certificates = certificates;
//            }
//        }
//
//        public X509Certificate[] getAcceptedIssuers()
//        {
//            // TODO Auto-generated method stub
//            return null;
//        }
//
//    };
}
