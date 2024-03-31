package DesignPatternEGs.Structual.Bridge.DataTransformer.Adaptee;

// 数据库读取抽象类：适配者接口
public abstract class DbReader {
    /**
     * 获取数据源数据
     */
    public abstract void doReadDb();
}
