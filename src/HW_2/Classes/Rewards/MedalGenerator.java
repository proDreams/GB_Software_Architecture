package HW_2.Classes.Rewards;

import HW_2.Classes.ItemFabric;
import HW_2.Classes.iGameItem;

public class MedalGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        return new MedalReward();
    }
}
