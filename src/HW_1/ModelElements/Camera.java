package HW_1.ModelElements;

import HW_1.Stuff.Angle3D;
import HW_1.Stuff.Point3D;

public class Camera {
    public Point3D location;
    public Angle3D angle;

    public Camera(Point3D location, Angle3D angle) {
        this.location = location;
        this.angle = angle;
    }

    public void rotate(Angle3D angle3D) {
    }

    public void move(Point3D point3D) {
    }
}
