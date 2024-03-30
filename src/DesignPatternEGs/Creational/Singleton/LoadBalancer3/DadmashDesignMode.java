package DesignPatternEGs.Creational.Singleton.LoadBalancer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 饿汉式单例类实现负载均衡器
 */
public class DadmashDesignMode {

    //当类被加载时，静态变量instance就会被初始化
    private static final DadmashDesignMode instance = new DadmashDesignMode();
    //管理的服务器集合
    private List<String> serverList = null;

    /**
     * 私有构造函数
     */
    private DadmashDesignMode() {
        serverList = new ArrayList<>();
    }


    /**
     * 获取实例
     *
     * @return 单例对象
     */
    public static DadmashDesignMode getInstance() {
        return instance;
    }

    //增加服务器
    public void addService(String servver) {
        System.out.println(servver);
        serverList.add(servver);
    }

    //删除服务器
    public void removeServer(String servver) {
        serverList.remove(servver);
    }

    //使用Random类随机获取服务器
    public String getService() {
        Random random = new Random();
        //根据集合的大小来随机生成
        int i = random.nextInt(serverList.size());
        return (String) serverList.get(i);
    }

}
