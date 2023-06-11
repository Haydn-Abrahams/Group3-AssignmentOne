package za.ac.cput.domain;

public class Inventory {
    private String stock_Keeping_Unit;
    private String product_Name;
    private String category;
    private int quantity;
    private double unit_Cost;
    private double selling_Price;
    private String supplier;
    private ProductWarehouse productWarehouse;
    private String reOder_Point; //The minimum quantity of the inventory item that triggers a reorder or restocking process.

}
