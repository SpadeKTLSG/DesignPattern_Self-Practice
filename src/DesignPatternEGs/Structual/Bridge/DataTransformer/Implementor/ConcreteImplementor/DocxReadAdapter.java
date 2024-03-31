package DesignPatternEGs.Structual.Bridge.DataTransformer.Implementor.ConcreteImplementor;

import DesignPatternEGs.Structual.Bridge.DataTransformer.Adaptee.DbReader;
import DesignPatternEGs.Structual.Bridge.DataTransformer.Implementor.DbReadImplementor;

// 文档读取适配器：适配器类
public class DocxReadAdapter extends DbReadImplementor {

    private DbReader dbReader;

    public void setDbReader(DbReader dbReader) {
        this.dbReader = dbReader;
    }

    @Override
    public void readDb() {
        dbReader.doReadDb();
    }
}
