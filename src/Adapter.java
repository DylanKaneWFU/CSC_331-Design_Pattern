public class Adapter implements TypeC {
    private HDMI hdmiDevice;

    public Adapter(HDMI hdmiDevice) {
        this.hdmiDevice = hdmiDevice;
    }

    @Override
    public void connectWithTypeC() {
        hdmiDevice.connectWithHDMI();
    }
}
