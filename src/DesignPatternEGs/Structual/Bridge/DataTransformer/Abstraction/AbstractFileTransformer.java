package DesignPatternEGs.Structual.Bridge.DataTransformer.Abstraction;

import DesignPatternEGs.Structual.Bridge.DataTransformer.Implementor.DbReadImplementor;

// 抽象文件转换类：抽象类
public abstract class AbstractFileTransformer {

    /**
     * 包含(有一个)实现类接口对象
     */
    protected DbReadImplementor impl;

    public abstract void fileTransform();
}
