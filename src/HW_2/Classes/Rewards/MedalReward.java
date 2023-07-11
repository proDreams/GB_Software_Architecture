package HW_2.Classes.Rewards;

import HW_2.Classes.iGameItem;

public class MedalReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Medal");
    }
}
