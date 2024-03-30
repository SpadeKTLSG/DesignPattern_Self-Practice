package DesignPatternEGs.Creational.Builder.MediaPlayer.director;

import DesignPatternEGs.Creational.Builder.MediaPlayer.builder.PlayScreenBuilder;
import DesignPatternEGs.Creational.Builder.MediaPlayer.product.PlayScreen;

// 具体播放界面建造指挥者类：具体指挥者类
public class Director {
    public PlayScreen construct(PlayScreenBuilder builder) {
        builder.buildMainWindow();
        builder.buildMenu();
        builder.buildPlayList();
        builder.buildControlBar();
        builder.buildFavoriteList();
        return builder.getResult();
    }
}
