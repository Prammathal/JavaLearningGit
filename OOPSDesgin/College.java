package javaLearningsAndAssignments.OOPSDesgin;

import javafundamental.BookList;

import java.util.ArrayList;

public class College
{
    public EngineeringDepartment engDepartment;
    public ArtsDepartment artsDepartment;

    public College()
    {
        engDepartment = new EngineeringDepartment();
        artsDepartment = new ArtsDepartment();
        PopulateValues();
    }

    private void PopulateValues()
    {
        engDepartment.lab = "Engineering Lab";

        //Add engineering books
        Book mechanics = new Book( 1, false, "Smith");
        engDepartment.library.books.add(mechanics);
        Book electrical = new Book( 2, true, "Finch");
        engDepartment.library.books.add(electrical);
        Book civil = new Book( 1, false, "Starc");
        engDepartment.library.books.add(civil);

        //Add furnitures to engineering library
        Furniture furniture1 = new Furniture(FurnitureType.Chair,FurnitureMaterial.Wood);
        engDepartment.library.furnitures.add(furniture1);
        Furniture furniture2 = new Furniture(FurnitureType.Table,FurnitureMaterial.Wood);
        engDepartment.library.furnitures.add(furniture2);
        Furniture furniture3 = new Furniture(FurnitureType.Racks,FurnitureMaterial.Wood);
        engDepartment.library.furnitures.add(furniture3);
        Furniture furniture4 = new Furniture(FurnitureType.Chair,FurnitureMaterial.Iron);
        engDepartment.library.furnitures.add(furniture4);
        Furniture furniture5 = new Furniture(FurnitureType.Table,FurnitureMaterial.Iron);
        engDepartment.library.furnitures.add(furniture5);
        Furniture furniture6 = new Furniture(FurnitureType.Racks,FurnitureMaterial.Iron);
        engDepartment.library.furnitures.add(furniture6);

        //Add Staff to engineering Library
        Staff staff1 = new Staff("Jothy", "Balan", 36);
        engDepartment.library.staffs.add(staff1);
        Staff staff2 = new Staff("Sona", "David", 40);
        engDepartment.library.staffs.add(staff2);
        Staff staff3 = new Staff("Karthik", "Raja", 43);
        engDepartment.library.staffs.add(staff3);
        Staff staff4 = new Staff("Indhu", "Menon", 45 );
        engDepartment.library.staffs.add(staff4);

        //Arts
        artsDepartment.musicRoom = "Arts Music Room";

        //Add engineering books
        Book english = new Book( 1, false, "Steve");
        artsDepartment.library.books.add(english);
        Book history = new Book( 2, true, "Root");
        artsDepartment.library.books.add(history);
        Book science = new Book( 1, true, "Williamson");
        artsDepartment.library.books.add(science);

        //Add furnitures to engineering library
        Furniture furniture7 = new Furniture(FurnitureType.Chair,FurnitureMaterial.Wood);
        artsDepartment.library.furnitures.add(furniture7);
        Furniture furniture8 = new Furniture(FurnitureType.Table,FurnitureMaterial.Wood);
        artsDepartment.library.furnitures.add(furniture8);
        Furniture furniture9 = new Furniture(FurnitureType.Racks,FurnitureMaterial.Wood);
        artsDepartment.library.furnitures.add(furniture9);
        Furniture furniture10 = new Furniture(FurnitureType.Table,FurnitureMaterial.Iron);
        artsDepartment.library.furnitures.add(furniture10);
        Furniture furniture11 = new Furniture(FurnitureType.Table,FurnitureMaterial.Iron);
        artsDepartment.library.furnitures.add(furniture11);
        Furniture furniture12 = new Furniture(FurnitureType.Racks,FurnitureMaterial.Iron);
        artsDepartment.library.furnitures.add(furniture12);

        //Add Staff to engineering Library
        Staff staff5 = new Staff("Divya", "Balan", 36);
        artsDepartment.library.staffs.add(staff5);
        Staff staff6 = new Staff("Pallavi", "Mohan", 55);
        artsDepartment.library.staffs.add(staff6);
        Staff staff7 = new Staff("Chandra", "Sekaran", 54);
        artsDepartment.library.staffs.add(staff7);
        Staff staff8 = new Staff("Mani", "Pramman", 45 );
        artsDepartment.library.staffs.add(staff8);

    }

    public static void main(String[] args) {
        College clg = new College();
        int totalBooksAvailable=clg.engDepartment.totalBooks()+clg.artsDepartment.totalBooks();
        int totalChairs=clg.engDepartment.totalChairs()+clg.artsDepartment.totalChairs();
        int totalRentedBooks=clg.engDepartment.totalRentedBooks()+clg.artsDepartment.totalRentedBooks();
        int totalStaff=clg.engDepartment.totalStaff()+clg.artsDepartment.totalStaff();
        Staff engDeptEldestMember=clg.engDepartment.eldestMember();
        Staff artsDeptEldestMember=clg.artsDepartment.eldestMember();
        String libEldestMember= engDeptEldestMember.age > artsDeptEldestMember.age ?
                engDeptEldestMember.firstName+" "+engDeptEldestMember.lastName :
                artsDeptEldestMember.firstName+" "+artsDeptEldestMember.lastName;

        System.out.println("The total number of books available in college is: "+totalBooksAvailable);
        System.out.println("The total number of books rented : "+totalRentedBooks);
        System.out.println("Total Chairs:"+totalChairs);
        System.out.println("Total staff count :" +totalStaff);
        System.out.println("Eldest member working in library:" +libEldestMember);
    }


}
