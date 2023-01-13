package patterns.abstractFactory;

public class IntelCpu implements Cpu {
    @Override
    public void process() {
        System.out.println("Intel is processing...");
    }
}
