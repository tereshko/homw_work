package java.builder;

import models.*;

public class PhoneBuilder implements Builder{
    private Screen screen;
    private Battery battery;
    private Os os;
    private Camera camera;

    @Override
    public void setDisplaySize(Screen screen) {

    }

    @Override
    public void setBattery(Battery battery) {

    }

    @Override
    public void setOs(Os os) {

    }

    @Override
    public void setCamera(Camera camera) {

    }
    public Phone build() {
        return new Phone(screen, battery, os, camera);
    }
}
