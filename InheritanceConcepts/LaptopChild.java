package javaLearningsAndAssignments.InheritanceConcepts;

 class LapTopChild extends Laptop {
    public LapTopChild(String Name, int Price, String Processor, int Ram, int HardDrive) {
        super(Name, Price, Processor,Ram, HardDrive);
    }

     public static void main(String[] args) {
         //Print the laptop details
         LapTopChild lenovo=new LapTopChild("Lenovo",1000,"i3",2,500);
         lenovo.printLaptopDetails();

         LapTopChild dell=new LapTopChild("Dell",1500,"i5",4,1000);
         dell.printLaptopDetails();

         LapTopChild sony =new LapTopChild("Sony",2000,"i9",8,1000);
         sony.printLaptopDetails();

     }
}