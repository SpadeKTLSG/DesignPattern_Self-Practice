package DesignPatternEGs.Creational.Builder.MediaPlayer.builder.builderImpl;

import DesignPatternEGs.Creational.Builder.MediaPlayer.builder.PlayScreenBuilder;

// 具体记忆模式播放界面建造者类：具体建造者类
public class MemoryModeBuilder extends PlayScreenBuilder {
    @Override
    public void buildMenu() {

    }

    @Override
    public void buildPlayList() {

    }

    @Override
    public void buildControlBar() {
        System.out.println("显示控制条");
    }

    @Override
    public void buildFavoriteList() {
        System.out.println("显示收藏列表");
    }
}
