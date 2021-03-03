package javaLearningsAndAssignments.InheritanceConcepts;

public class Laptop {

    public final String Name;
    public final int Price;
    public final String Processor;
    public final int Ram;
    public final int HardDrive;

    public Laptop(String Name, int Price, String Processor, int Ram, int HardDrive) {
        this.Name = Name;
        this.Price = Price;
        this.Processor = Processor;
        this.Ram = Ram;
        this.HardDrive = HardDrive;
    }

    public void printLaptopDetails() {
        String hddString;
        if(HardDrive < 1000)
        {
            hddString = " HDD: "+HardDrive+"GB";
        }
        else
        {
            hddString = " HDD: "+HardDrive/1000+"TB";
        }
        System.out.println("Name: "+Name+ " Price: $"+Price+ " Processor: "+Processor+" Ram: "+Ram+"GB"+ hddString);

    }


}


