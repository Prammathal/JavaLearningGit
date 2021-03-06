package javaLearningsAndAssignments.OOPSDesgin;

enum FurnitureType
{
    Table,
    Chair,
    Racks
}
enum FurnitureMaterial
{
    Iron,
    Wood
}
public class Furniture
{
    public FurnitureType furnitureType;
    public FurnitureMaterial furnitureMaterial;

    public Furniture(FurnitureType furnitureType, FurnitureMaterial furnitureMaterial)
    {
        this.furnitureType = furnitureType;
        this.furnitureMaterial = furnitureMaterial;
    }
}
