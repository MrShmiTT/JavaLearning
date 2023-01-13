package patterns.singleton;

public class Test {
    public static void main(String[] args) {
        NonSynchronizedSingleton nonSynchronizedSingleton = NonSynchronizedSingleton.getInstance();
        NonSynchronizedSingleton secondNonSynchronizedSingleton = NonSynchronizedSingleton.getInstance();
        SynchronizedSingleton synchronizedSingleton = SynchronizedSingleton.getInstance();
        SynchronizedSingleton secondSynchronizedSingleton = SynchronizedSingleton.getInstance();

        System.out.println(nonSynchronizedSingleton.hashCode());
        System.out.println(secondNonSynchronizedSingleton.hashCode());
        System.out.println(nonSynchronizedSingleton.equals(secondNonSynchronizedSingleton));

        System.out.println(synchronizedSingleton.hashCode());
        System.out.println(secondSynchronizedSingleton.hashCode());
        System.out.println(synchronizedSingleton.equals(secondSynchronizedSingleton));

        Car car1 = new Car();
        Car car2 = new Car();
        System.out.println(car1.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car1.equals(car2));
    }

    public static class Car {
    }
}
