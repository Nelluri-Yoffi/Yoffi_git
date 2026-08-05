
interface chargers {
    int voltage = 220;
    void plugIn();
    void charge();
    void unplug();
    default void powerConnected() {
        System.out.println("Charger Connected Successfully");
    }
    static void safetyTips() {
        System.out.println("Do not place charger in areas with moist.");
    }
}
interface SmartDevice {
    void playMusic();
}
class AppleCharger implements chargers {
    @Override
    public void plugIn() {
        System.out.println("Apple Charger Plugged In");
    }
    @Override
    public void charge() {
        System.out.println("Charging iPhone...");
    }
    @Override
    public void unplug() {
        System.out.println("Apple Charger Unplugged");
    }
}
class SamsungCharger implements chargers {
    @Override
    public void plugIn() {
        System.out.println("Samsung Charger Plugged In");
    }
    @Override
    public void charge() {
        System.out.println("Charging Samsung Phone...");
    }
    @Override
    public void unplug() {
        System.out.println("Samsung Charger Unplugged");
    }
}
class SmartCharger implements chargers,SmartDevice {

    @Override
    public void plugIn() {
        System.out.println("Smart Charger Plugged In");
    }

    @Override
    public void charge() {
        System.out.println("Fast Charging Started...");
    }

    @Override
    public void unplug() {
        System.out.println("Smart Charger Unplugged");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing Music via Bluetooth...");
    }
}
public class Charger {

    public static void main(String[] args) {
        chargers apple = new AppleCharger();
        apple.plugIn();
        apple.powerConnected();
        apple.charge();
        apple.unplug();

        chargers samsung = new SamsungCharger();
        samsung.plugIn();
        samsung.powerConnected();
        samsung.charge();
        samsung.unplug();

        SmartCharger smart = new SmartCharger();
        smart.plugIn();
        smart.powerConnected();
        smart.charge();
        smart.playMusic();
        smart.unplug();
        System.out.println("Voltage = " + chargers.voltage);
        chargers.safetyTips();
    }
}