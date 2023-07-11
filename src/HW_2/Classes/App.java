package HW_2.Classes;

import HW_2.Classes.Rewards.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
//        ItemFabric generator = new GoldGenerator();
//        generator.openReward();
//        generator = new GemGenerator();
//        generator.openReward();

        Random rnd = new Random();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());
        fabricList.add(new PotionGenerator());
        fabricList.add(new MedalGenerator());
        fabricList.add(new ArmourGenerator());
        fabricList.add(new WeaponGenerator());
        fabricList.add(new ExperienceGenerator());


        for (int i = 0; i < 20; i++) {
//            int index = Math.abs(rnd.nextInt() % 2) == 0 ? 0 : 1;
            int index = rnd.nextInt(0, fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openReward();
        }
    }
}
