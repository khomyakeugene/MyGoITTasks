package com.company;

/**
 * Created by Yevgen on 21.12.2015.
 */
public class TestMusicShop {
    private MusicShop musicShop = null;

    private void initMusicShopData() {
        musicShop = new MusicShop(Const.MUSIC_SHOP_NAME);

        musicShop.addInstrument(new Guitar());
        musicShop.addInstrument(new Guitar());
        musicShop.addInstrument(new Piano());
        musicShop.addInstrument(new Trumpet());
    }

    private void showMusicShop() {
        musicShop.showMusicShop();
    }

    public void demonstrateMusicShop() {
        initMusicShopData();
        showMusicShop();
    }
}
