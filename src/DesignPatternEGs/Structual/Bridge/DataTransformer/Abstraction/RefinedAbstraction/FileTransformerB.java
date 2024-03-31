package DesignPatternEGs.Structual.Bridge.DataTransformer.Abstraction.RefinedAbstraction;

import DesignPatternEGs.Structual.Bridge.DataTransformer.Abstraction.AbstractFileTransformer;
import DesignPatternEGs.Structual.Bridge.DataTransformer.Implementor.DbReadImplementor;

// B格式文件转换器 ：扩充抽象类
public class FileTransformerB extends AbstractFileTransformer {

    public FileTransformerB(DbReadImplementor dbReadImplementor) {
        this.impl = dbReadImplementor;
    }

    @Override
    public void fileTransform() {
        impl.readDb();
        System.out.println("开始转换为对应格式B的文件");
    }
}
