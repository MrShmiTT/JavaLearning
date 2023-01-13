package patterns.abstractFactory.abstractLayer;

import patterns.abstractFactory.Cpu;
import patterns.abstractFactory.IntelCpu;

public class IntelFactory implements CpuFactory{
    @Override
    public Cpu produceCpu() {
        return new IntelCpu();
    }
}
