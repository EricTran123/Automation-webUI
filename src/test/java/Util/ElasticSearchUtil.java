package Util;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import com.google.gson.JsonObject;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.action.update.UpdateResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentFactory;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.transport.client.PreBuiltTransportClient;
public class ElasticSearchUtil {
    public static void connectES(String address, int port) throws UnknownHostException {
        //创建客户端
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
                new InetSocketTransportAddress(InetAddress.getByName(address),port));
        //关闭客户端
        client.close();
    }
    public void createIndex(String address, int port) throws IOException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
                new InetSocketTransportAddress(InetAddress.getByName(address),port));
        IndexResponse response = client.prepareIndex("msg", "tweet", "1").setSource(XContentFactory.jsonBuilder()
                .startObject().field("userName", "张三")
                .field("sendDate", new Date())
                .field("msg", "你好李四")
                .endObject()).get();
    }
    public void insertJson(String address, int port) throws UnknownHostException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
                new InetSocketTransportAddress(InetAddress.getByName(address),port));
        String jsonStr = "{" +
                "\"userName\":\"张三\"," +
                "\"sendDate\":\"2017-11-30\"," +
                "\"msg\":\"你好李四\"" +
                "}";
        IndexResponse response = client.prepareIndex("weixin", "tweet").setSource(jsonStr,XContentType.JSON).get();
    }
    public void insertMap(String address, int port) throws UnknownHostException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
                new InetSocketTransportAddress(InetAddress.getByName(address),port));
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("userName", "张三");
        map.put("sendDate", new Date());
        map.put("msg", "你好李四");
        IndexResponse response = client.prepareIndex("momo", "tweet").setSource(map).get();
    }
    public void insertJsonObject(String address, int port) throws UnknownHostException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
                new InetSocketTransportAddress(InetAddress.getByName(address),port));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userName", "张三");
        jsonObject.addProperty("sendDate", "2017-11-23");
        jsonObject.addProperty("msg","你好李四");
        IndexResponse response = client.prepareIndex("qq", "tweet").setSource(jsonObject, XContentType.JSON).get();
    }
    public void getData(String address, int port) throws UnknownHostException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
                new InetSocketTransportAddress(InetAddress.getByName(address),port));
        GetResponse getResponse = client.prepareGet("msg", "tweet", "1").get();
    }
    public void updateData(String address, int port) throws UnknownHostException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
                new InetSocketTransportAddress(InetAddress.getByName(address),port));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("userName", "王五");
        jsonObject.addProperty("sendDate", "2008-08-08");
        jsonObject.addProperty("msg","你好,张三，好久不见");
        UpdateResponse updateResponse = client.prepareUpdate("msg", "tweet", "1")
                .setDoc(jsonObject.toString(),XContentType.JSON).get();
    }
    public void deleteData(String address, int port) throws UnknownHostException {
        TransportClient client = new PreBuiltTransportClient(Settings.EMPTY).addTransportAddresses(
                new InetSocketTransportAddress(InetAddress.getByName(address),port));
        DeleteResponse deleteResponse = client.prepareDelete("msg", "tweet", "1").get();
    }
}

