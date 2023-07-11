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

    /**
     * Конструктор
     *
     * @param texture
     * @throws Exception
     */
    public ModelStore(List<iModelChangerObserver> changeObservers) throws Exception {
        this.changeObservers = changeObservers;

        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));
    }

    /**
     * Регистрация изменений
     *
     * @param sender
     */
    @Override
    public void NotifyChange(iModelChanger sender) {
    }

    /**
     * Возвращает scena по ID
     *
     * @param id
     * @return
     */
    public Scene getScena(int id) {
        for (Scene scene : scenes) {
            if (scene.id == id) {
                return scene;
            }
        }
        return null;
    }
}
