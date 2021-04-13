package java.builder;

import models.Battery;
import models.Camera;
import models.Os;
import models.Screen;

public interface Builder {
    void setDisplaySize(Screen screen);
    void setBattery(Battery battery);
    void setOs(Os os);
    void setCamera(Camera camera);
}
