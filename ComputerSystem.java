/**
 * Program 3
 * This class represents a full computer system made up of multiple components.
 * It is considered a complex object because it contains other objects
 * (Component instances) as properties.
 * 
 * I used overloaded constructors so a system can be created with or without
 * specifying a tier. I also used overloaded methods to calculate total price
 * with or without tax, which adds flexibility.
 */

public class ComputerSystem
{
    private String name;
    private String tier;
    private Component cpu;
    private Component gpu;
    private Component ram;
    private Component storage;

    public ComputerSystem(String name, String tier, Component cpu, Component gpu, Component ram, Component storage){
        setName(name);
        setTier(tier);
        setCpu(cpu);
        setGpu(gpu);
        setRam(ram);
        setStorage(storage);
    }

    public ComputerSystem(String name, Component cpu, Component gpu, Component ram, Component storage){
        this(name, "Mainstream", cpu, gpu, ram, storage);
    }

    public String getName(){
        return name;
    }

    private void setName(String name){
        if (name != null && !name.trim().equals("")){
            this.name = name;
        }else{
            this.name = "Untitled Build";
        }
    }

    public String getTier(){
        return tier;
    }

    private void setTier(String tier){
        if (tier != null && !tier.trim().equals("")){
            this.tier = tier;
        }else{
            this.tier = "Mainstream";
        }
    }

    public Component getCpu(){
        return cpu;
    }

    private void setCpu(Component cpu){
        if (cpu != null){
            this.cpu = cpu;
        }else{
            this.cpu = new Component(0.01, 1, 1, 1.0, false);
        }
    }

    public Component getGpu(){
        return gpu;
    }

    private void setGpu(Component gpu){
        if (gpu != null){
            this.gpu = gpu;
        }else{
            this.gpu = new Component(0.01, 1, 1, 1.0, false);
        }
    }

    public Component getRam(){
        return ram;
    }

    private void setRam(Component ram){
        if (ram != null){
            this.ram = ram;
        }else{
            this.ram = new Component(0.01, 1, 1, 1.0, false);
        }
    }

    public Component getStorage(){
        return storage;
    }

    private void setStorage(Component storage){
        if (storage != null){
            this.storage = storage;
        }else{
            this.storage = new Component(0.01, 1, 1, 1.0, false);
        }
    }

    public double totalPrice(){
        return cpu.getPrice() + gpu.getPrice() + ram.getPrice() + storage.getPrice();
    }

    public double totalPrice(double taxRate){
        return totalPrice() + (totalPrice() * taxRate);
    }
    
    /**
     * The toString() method is structured to display the object's data
     * in a clear and readable format for testing.
     */
    @Override
    public String toString(){
        return "System Name: " + name
            + ", Tier: " + tier
            + "\nCPU -> " + cpu
            + "\nGPU -> " + gpu
            + "\nRAM -> " + ram
            + "\nStorage -> " + storage
            + "\nTotal Price: $" + totalPrice();
    }
    
    /**
     * The equals() method compares objects based on their actual data
     * rather than just their names.
     */
    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        
        if (!(obj instanceof ComputerSystem)){
            return false;
        }

        ComputerSystem other = (ComputerSystem) obj;

        return this.cpu.equals(other.cpu)
            && this.gpu.equals(other.gpu)
            && this.ram.equals(other.ram)
            && this.storage.equals(other.storage)
            && this.tier.equals(other.tier);
    }
}
