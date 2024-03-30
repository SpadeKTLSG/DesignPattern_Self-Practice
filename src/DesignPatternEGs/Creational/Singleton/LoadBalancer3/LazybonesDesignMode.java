package DesignPatternEGs.Creational.Singleton.LoadBalancer3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 懒汉式单例类实现负载均衡器
 */
public class LazybonesDesignMode {

    private volatile static LazybonesDesignMode instance = null;


    private List<String> serverList = null;

    private LazybonesDesignMode() {
        serverList = new ArrayList();
    }


    /**
     * 用双重检查锁定来实现懒汉式单例类
     */
    public static LazybonesDesignMode getInstance() {
        //第一重判断
        if (instance == null) {
            //锁定代码块
            synchronized (LazybonesDesignMode.class) {
                //第二重判断
                if (instance == null) {
                    instance = new LazybonesDesignMode(); //创建单例实例
                }
            }
        }
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
