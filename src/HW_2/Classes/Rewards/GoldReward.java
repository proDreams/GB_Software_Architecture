package HW_2.Classes.Rewards;

import HW_2.Classes.iGameItem;

public class GoldReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}
