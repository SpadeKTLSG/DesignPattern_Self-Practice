package DesignPatternEGs.Creational.Builder.MediaPlayer.builder;

import DesignPatternEGs.Creational.Builder.MediaPlayer.product.PlayScreen;

// 抽象播放界面建造者类：抽象建造者类
public abstract class PlayScreenBuilder {
    private PlayScreen playScreen = new PlayScreen();

    public PlayScreen getResult() {
        return this.playScreen;
    }

    public void buildMainWindow() {
        System.out.println("显示主窗口");
    }

    public abstract void buildMenu();

    public abstract void buildPlayList();

    public abstract void buildControlBar();

    public abstract void buildFavoriteList();
}
