package DesignPatternEGs.Creational.Singleton.LoadBalancer3;

public class Client {

    public static void main(String[] args) {

        //test IoDHDesignMode
        IoDHDesignMode s1 = IoDHDesignMode.getInstance();
        IoDHDesignMode s2 = IoDHDesignMode.getInstance();

        //判断服务器负载均衡器是否相同
        if (s1 == s2) {
            System.out.println("IODH 服务器负载均衡器具有唯一性！");
        }

        //模拟增加服务器，
        s1.addService("Service 1");
        s1.addService("Service 2");
        s1.addService("Service 3");
        s1.addService("Service 4");

        //模拟客户端请求的分发
        for (int i = 0; i < 10; i++) {
            String service = s1.getService();
            System.out.println("分发请求至服务器：" + service);
        }
    }
}
