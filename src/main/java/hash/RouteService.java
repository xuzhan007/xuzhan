package hash;

import java.util.List;

public class RouteService {

    private static List<String> pushNodes = new ArrayList<String>();
    static {
        //Push服务器节点初始化
//        List<String> ipList = BaseConfig.getNodeIps();
//        for (String ip : ipList) {
//            pushNodes.add(ip + ":" + BaseConfig.getTcpPort());
//        }
    }
    //初始化一致性哈希算法
    private static Ketama hash = new Ketama(pushNodes);

    @Autowired
    private ClientInfoDao clientInfoDao;

    /**
     * 根据客户端标识获取对应的push服务器节点
     *
     * @param clientId
     * @param version
     * @return
     */
    public String getServerNode(final long clientId, final String version) {
        ThreadPool.getInstance().executeTask(new Runnable() {
            @Override
            public void run() {
                try {
                    //update client last access time and version
                    clientInfoDao.updateClientInfo(clientId, version);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        return hash.findNode("" + clientId);
    }

    /**
     * 根据客户端标识获取对应的push服务器HTTP端口的地址
     *
     * @param clientId
     * @return
     */
    public String getHttpServerNode(long clientId) {
        String tcpAddr = hash.findNode("" + clientId);
        return tcpAddr.replace("" + BaseConfig.getTcpPort(), "" + BaseConfig.getHttpPort());
    }

    /**
     * 根据客户端标识获取对应的push服务器MQ端口的地址
     *
     * @param clientId
     * @return
     */
    public String getMQNode(long clientId) {
//        String tcpAddr = hash.findNode("" + clientId);
//        return tcpAddr.replace("" + BaseConfig.getTcpPort(), "" + BaseConfig.getMqPort());
        return "";
    }

    public List<String> getPushNodes() {
        return pushNodes;
    }

    //TODO 后续版本中用ZK来管理节点信息
}