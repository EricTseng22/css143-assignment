public class Driver3
{
    public static void main(String[] args){
        Component cpu1 = new Component(549.0, 16, 32, 4.5, true);
        Component gpu1 = new Component(1599.0, 1, 1, 2.2, true);
        Component ram1 = new Component(149.0, 32, 32, 1.0, true);
        Component storage1 = new Component(189.0, 2, 2, 1.0, true);

        Component cpu2 = new Component(549.0, 16, 32, 4.5, true);
        Component gpu2 = new Component(1599.0, 1, 1, 2.2, true);
        Component ram2 = new Component(149.0, 32, 32, 1.0, true);
        Component storage2 = new Component(189.0, 2, 2, 1.0, true);

        ComputerSystem system1 = new ComputerSystem("Zenith V1", "Enthusiast", cpu1, gpu1, ram1, storage1);
        ComputerSystem system2 = new ComputerSystem("Custom Build", "Enthusiast", cpu2, gpu2, ram2, storage2);

        System.out.println("=== VALID TESTS ===");
        System.out.println(cpu1);
        System.out.println(system1);
        System.out.println("System total with tax: $" + system1.totalPrice(0.10));

        System.out.println("\n=== EQUALITY TESTS ===");
        System.out.println("cpu1 equals cpu2: " + cpu1.equals(cpu2));
        System.out.println("system1 equals system2: " + system1.equals(system2));

        System.out.println("\n=== INVALID INPUT TESTS ===");
        Component badComponent1 = new Component(-50.0, 0, -3, -2.0, false);
        System.out.println(badComponent1);

        ComputerSystem badSystem = new ComputerSystem("", null, null, null, null);
        System.out.println(badSystem);

        System.out.println("\n=== BOUNDARY TESTS ===");
        Component boundaryComponent1 = new Component(0.01, 1, 1, 1.0, false);
        System.out.println(boundaryComponent1);

        Component boundaryComponent2 = new Component(1.0, 1, 1);
        System.out.println(boundaryComponent2);

        System.out.println("\n=== OVERLOADED METHOD TEST ===");
        boundaryComponent2.selectComponent();
        System.out.println(boundaryComponent2);
    }
}