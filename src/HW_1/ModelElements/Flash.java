package HW_1.ModelElements;

import HW_1.Stuff.Angle3D;
import HW_1.Stuff.Point3D;

import java.awt.*;

/**
 * Класс источника света
 */
public class Flash {
    public Point3D location;
    public Angle3D angle;
    public Color color;
    public float power;

//    public Flash(Point3D location, Angle3D angle, Color color, float power) {
//        this.location = location;
//        this.angle = angle;
//        this.color = color;
//        this.power = power;
//    }

    /**
     * Поворот источника света на угол
     *
     * @param angleAction
     */
    public void rotate(Angle3D angleAction) {
    }

    /**
     * Перемещение света к точке
     *
     * @param pointAction
     */
    public void move(Point3D pointAction) {
    }
}
