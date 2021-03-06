package javaLearningsAndAssignments.OOPSDesgin;

import java.util.Collections;
import java.util.Comparator;

public class Department {
    public Library library;

    public Department() {
        this.library = new Library();
    }


    public int totalChairs() {
        if (this.library == null) {
            return 0;
        }
        int totalEngChairs = 0;
        int noOfEngFurniture = this.library.furnitures.size();
        for (int i = 0; i < noOfEngFurniture; i++) {
            FurnitureType typeOfFurniture = this.library.furnitures.get(i).furnitureType;
            if (typeOfFurniture == FurnitureType.Chair) {
                totalEngChairs = totalEngChairs + 1;
            }
        }
        return totalEngChairs;
    }

    public int totalBooks() {
        return this.library.books.size();

    }

    public int totalRentedBooks() {
        int booksRented = 0;
        int totalBooks = this.library.books.size();
        for (int i = 0; i < totalBooks; i++) {
            Boolean bookRentedStatus = this.library.books.get(i).isBookRented;
            if (bookRentedStatus) {
                booksRented++;
            }
        }
        return booksRented;
    }
    public int totalStaff()
    {
       return this.library.staffs.size();
    }
    public Staff eldestMember()
    {
        int totalStaff=totalStaff();
        Collections.sort(this.library.staffs, new Comparator<Staff>() {
            public int compare(Staff p1, Staff p2) {
                return Integer.valueOf(p1.age).compareTo(p2.age);
            }
        });
        return this.library.staffs.get(totalStaff()-1);
    }

}
