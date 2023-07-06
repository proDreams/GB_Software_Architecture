package HW_1.InMemoryModel;

import HW_1.ModelElements.Camera;
import HW_1.ModelElements.Flash;
import HW_1.ModelElements.PoligonalModel;
import HW_1.ModelElements.Scene;

import java.util.ArrayList;
import java.util.List;

public class ModelStore implements iModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<iModelChangerObserver> changeObservers;

    public ModelStore(List<iModelChangerObserver> changeObservers) {
        this.changeObservers = changeObservers;
        models = new ArrayList<>();
        scenes = new ArrayList<>();
        flashes = new ArrayList<>();
        cameras = new ArrayList<>();
    }

    @Override
    public void NotifyChange(iModelChanger sender) {
    }

    public Scene getScene(int id){
        for (Scene scene: scenes){
            if (scene.id == id){
                return scene;
            }
        }
        return null;
    }
}
