package HW_2.Classes.Rewards;

import HW_2.Classes.iGameItem;

public class PotionReward implements iGameItem {
    @Override
    public void open() {
        System.out.println("Potion");
    }
}
