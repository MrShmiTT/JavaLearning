package patterns.abstractFactory;

public class AmdCpu implements Cpu {
    @Override
    public void process() {
        System.out.println("AMD is processing...");
    }
}
