package patterns.abstractFactory;

import patterns.abstractFactory.abstractLayer.CpuFactory;

public class Computer {
    Cpu cpu;

    public Computer(CpuFactory factory) {
        cpu = factory.produceCpu();
        cpu.process();
    }
}
