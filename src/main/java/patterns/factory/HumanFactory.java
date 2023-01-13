package patterns.factory;

public class HumanFactory {
    public HumanFactory() {
    }

    public static Human createHuman(String m) {
        Human p = null;
        if (m.equals("boy")) {
            p = new Boy();
        } else if (m.equals("girl")) {
            p = new Girl();
        }
        return p;
    }
}
