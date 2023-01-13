package patterns.abstractFactory;

import patterns.abstractFactory.abstractLayer.AmdFactory;
import patterns.abstractFactory.abstractLayer.CpuFactory;
import patterns.abstractFactory.abstractLayer.IntelFactory;

public class Client {

    public static void main(String[] args) {
        new Computer(createSpecificFactory());
    }

    public static CpuFactory createSpecificFactory() {
        int sys = 1;
        if (sys == 0) {
            return new AmdFactory();
        } else {
            return new IntelFactory();
        }
    }
}
