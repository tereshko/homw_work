import models.Battery;
import models.Camera;
import models.Phone;

import java.builder.PhoneBuilder;

public class main {
    public static void main(String[] args) {
        Camera camera = new Camera();
        Battery battery = new Battery();

        PhoneBuilder phoneBuilder = new PhoneBuilder();
        phoneBuilder.setBattery(battery);
        phoneBuilder.setCamera(camera);
        
        Phone phone = phoneBuilder.build();
    }
}
