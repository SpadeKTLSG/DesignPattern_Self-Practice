package DesignPatternEGs.Creational.Builder.MediaPlayer.product;

/**
 * 具体播放界面类:具体产品角色类
 */
public class PlayScreen {
    private String menu;
    private String playList;
    private String mainWindow;
    private String controlBar;
    private String favoriteList;

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getPlayList() {
        return playList;
    }

    public void setPlayList(String playList) {
        this.playList = playList;
    }

    public String getMainWindow() {
        return mainWindow;
    }

    public void setMainWindow(String mainWindow) {
        this.mainWindow = mainWindow;
    }

    public String getControlBar() {
        return controlBar;
    }

    public void setControlBar(String controlBar) {
        this.controlBar = controlBar;
    }

    public String getFavoriteList() {
        return favoriteList;
    }

    public void setFavoriteList(String favoriteList) {
        this.favoriteList = favoriteList;
    }
}
