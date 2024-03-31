package DesignPatternEGs.Structual.Bridge.DataTransformer.Adaptee.AdapteeImpl;

import DesignPatternEGs.Structual.Bridge.DataTransformer.Adaptee.DbReader;

// 数据库读取类：具体适配者
public class MysqlDbReader extends DbReader {
    @Override
    public void doReadDb() {
        System.out.println("从Mysql数据库获取数据");
    }
}
