//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MacBook myMac = new MacBook();

        OldMonitor oldDisplay = new OldMonitor();

        Adapter adapter = new Adapter(oldDisplay);

        myMac.connectToTypeCDevice(adapter);
    }
}