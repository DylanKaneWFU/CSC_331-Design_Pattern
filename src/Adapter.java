public class Adapter implements TypeC {
    //Completed with LLM assistance (Gemini)
    private HDMI hdmiDevice;

    public Adapter(HDMI hdmiDevice) {
        this.hdmiDevice = hdmiDevice;
    }

    @Override
    public void connectWithTypeC() {
        hdmiDevice.connectWithHDMI();
    }
}
