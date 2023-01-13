package patterns.abstractFactory.abstractLayer;

import patterns.abstractFactory.AmdCpu;
import patterns.abstractFactory.Cpu;

public class AmdFactory implements CpuFactory{
    @Override
    public Cpu produceCpu() {
        return new AmdCpu();
    }
}
