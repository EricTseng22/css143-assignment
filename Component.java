/**
 * This class represents a PC component such as a CPU, GPU, RAM, or storage device.
 * It is considered a simple object because it only uses primitive data types.
 * 
 * I used overloaded constructors so a component can be created with full details
 * or with fewer inputs using default values. I also used overloaded methods to
 * either directly set or toggle the selected state, which makes the class more flexible.
 */

public class Component
{
    private double price;
    private int cores;
    private int threads;
    private double baseClock;
    private boolean selected;
    
    public Component(double price, int cores, int threads, double baseClock, boolean selected){
        setPrice(price);
        setCores(cores);
        setThreads(threads);
        setBaseClock(baseClock);
        setSelected(selected);
    }
    
    public Component(double price, int cores, int threads){
        this(price, cores, threads, 1.0, false);
    }
    
    public double getPrice(){
        return price;
    }
    
    private void setPrice(double price){
        if (price > 0){
            this.price = price;
        }else{
            this.price = 0.01;
        }
    }
    
    public int getCores(){
        return cores;
    }

    private void setCores(int cores){
        if (cores > 0){
            this.cores = cores;
        }else{
            this.cores = 1;
        }
    }
    
    public int getThreads(){
        return threads;
    }

    private void setThreads(int threads){
        if (threads > 0){
            this.threads = threads;
        }else{
            this.threads = 1;
        }
    }
    
    public double getBaseClock(){
        return baseClock;
    }

    private void setBaseClock(double baseClock){
        if (baseClock > 0){
            this.baseClock = baseClock;
        }else{
            this.baseClock = 1.0;
        }
    }
    
    public boolean getSelected(){
        return selected;
    }

    private void setSelected(boolean selected){
        this.selected = selected;
    }
    
    public void selectComponent(boolean selected){
        this.selected = selected;
    }

    public void selectComponent(){
        this.selected = !this.selected;
    }
    
    /**
     * The toString() method is structured to display the object's data
     * in a clear and readable format for testing.
     */
    @Override
    public String toString(){
        return "Price: $" + price
            + ", Cores: " + cores
            + ", Threads: " + threads
            + ", Base Clock: " + baseClock
            + ", Selected: " + selected;
    }
    
    /**
     * The equals() method compares objects based on their actual data
     * rather than just their names.
     */
    @Override
    public boolean equals(Object obj){
        if (obj == this)
        {
            return true;
        }

        if (!(obj instanceof Component))
        {
            return false;
        }

        Component other = (Component) obj;

        return this.price == other.price
            && this.cores == other.cores
            && this.threads == other.threads
            && this.baseClock == other.baseClock
            && this.selected == other.selected;
    }
    
    
}
