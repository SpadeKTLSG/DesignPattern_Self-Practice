package DesignPatternEGs.Structual.Bridge.DataTransformer;

import DesignPatternEGs.Structual.Bridge.DataTransformer.Abstraction.AbstractFileTransformer;
import DesignPatternEGs.Structual.Bridge.DataTransformer.Abstraction.RefinedAbstraction.FileTransformerA;
import DesignPatternEGs.Structual.Bridge.DataTransformer.Adaptee.AdapteeImpl.MysqlDbReader;
import DesignPatternEGs.Structual.Bridge.DataTransformer.Adaptee.DbReader;
import DesignPatternEGs.Structual.Bridge.DataTransformer.Implementor.ConcreteImplementor.DbReadAdapter;
import DesignPatternEGs.Structual.Bridge.DataTransformer.Implementor.DbReadImplementor;

public class Client {

    public static void main(String[] args) {
        AbstractFileTransformer fileTransformer;
        DbReadImplementor dbReadImplementor;
        DbReader dbReader;
        DbReadAdapter dbReadAdapter;

        dbReader = new MysqlDbReader();

        dbReadAdapter = new DbReadAdapter();
        dbReadAdapter.setDbReader(dbReader);
        dbReadImplementor = dbReadAdapter;
        fileTransformer = new FileTransformerA(dbReadImplementor);
        fileTransformer.fileTransform();
    }


}
