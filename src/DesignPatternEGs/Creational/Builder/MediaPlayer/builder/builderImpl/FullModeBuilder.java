package DesignPatternEGs.Creational.Builder.MediaPlayer.builder.builderImpl;

import DesignPatternEGs.Creational.Builder.MediaPlayer.builder.PlayScreenBuilder;

// 具体完整模式播放界面建造者类：具体建造者类
public class FullModeBuilder extends PlayScreenBuilder {
    @Override
    public void buildMenu() {
        System.out.println("显示菜单");
    }

    @Override
    public void buildPlayList() {
        System.out.println("显示播放列表");
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
