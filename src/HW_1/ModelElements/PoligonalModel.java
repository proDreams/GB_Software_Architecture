package HW_1.ModelElements;

import java.util.ArrayList;
import java.util.List;

public class PoligonalModel {
    public List<Texture> textures;
    public List<Poligon> positions;

    public PoligonalModel(List<Texture> textures) {
        this.textures = textures;
        positions = new ArrayList<>();
    }
}
