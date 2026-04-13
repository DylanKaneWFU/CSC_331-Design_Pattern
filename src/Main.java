//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MacBook myMac = new MacBook();

        // 2. Create the OldMonitor (The Adaptee)
        OldMonitor oldDisplay = new OldMonitor();

        // 3. Create the Adapter and plug the monitor into it
        Adapter adapter = new Adapter(oldDisplay);

        // 4. Connect the MacBook to the adapter
        // The MacBook thinks it's talking to a Type-C device!
        myMac.connectToTypeCDevice(adapter);
    }
}