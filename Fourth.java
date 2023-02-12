import java.util.*;
class Product{
    double Cost;
    int Quantity;
    String Specification;
    String ProductName;
    Product(String name,String spec,double cost,int count){
        this.Cost = cost;
        this.Quantity = count;
        this.ProductName = name;
        this.Specification = spec;
    }
    public int productCount() {
        return this.Quantity;
    }
    public void productDetails() {
        System.out.println("product name : "+this.ProductName);
        System.out.println("product Specification : "+this.Specification);
        System.out.println("product cost : "+this.Cost);
        System.out.println("product count : "+this.Quantity);
        System.out.println();
    }
    public void editOrUpdate(String spec) {
        this.Specification = spec;
    }
    public void editProductName(String name) {
        this.ProductName = name;
    }
    public String getProduct() {
        return this.ProductName;
    }
    public void editOrUpdate(int count) {
        this.Quantity = count;
    }
    public void editOrUpdate(double cost) {
        this.Cost = cost;
    }
}
public class Fourth {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter No of products");
        int n = sc.nextInt();
        sc.nextLine();
        List<Product>list = new ArrayList<Product>();
        System.out.println("Note : enter details of product with name in one line seperared with spaces \n");
        for(int i = 0 ; i < n ; i++) {
            System.out.println("Enter productName - Specification -  cost - count:");
            String t = sc.nextLine();
            String []arr = t.split(" ");
            String name = arr[0];
            String spec = arr[1];
            double cost = Double.parseDouble(arr[2]);
            int count = Integer.parseInt(arr[3]);
            Product p1 = new Product(name,spec,cost,count);
            list.add(p1);
            System.out.println();
        }
        boolean flag=true;
        while(flag!=false) {
            System.out.println("1.Product List ");
            System.out.println("2.Product count");
            System.out.println("3.Product details");
            System.out.println("4.Edit product details");
            System.out.println("5.Update Inventory");
            System.out.println("6.Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            if(choice == 1) {
                productList(list);
            }else if(choice == 2) 
            {
                Productcount(list);
            }
            else if(choice == 3) 
            {
                productdetails(list);
            }
            else if(choice == 4)
            {
                Editproduct(list);
            }
            else if(choice == 5)
            {
                updateInventory(list);
            }
            else if(choice  == 6)
            {
                flag = false;
            }
            else
            {
            System.out.println("Enter number between 1 to 6"); 
            }
        }
        sc.close();
    }
    public static void Editproduct(List<Product>list) 
    {
        System.out.println("Enter product name : ");
        sc.nextLine();
        String pname = sc.nextLine();
        for(Product p: list) {
            if(p.getProduct().compareToIgnoreCase(pname) == 0) {
                System.out.println("what do you want to edit :\n1.Specification\n2.Cost\n3.Product count");
                int ch = sc.nextInt();
                if(ch == 1) {
                    System.out.println("Enter product specification ");
                    sc.nextLine();
                    String st = sc.nextLine();
                    p.editOrUpdate(st);
                }else if(ch == 2) {
                    System.out.println("Enter product cost ");
                    double cost = sc.nextDouble();
                    p.editOrUpdate(cost);
                }else {
                    System.out.println("\nEnter product count ");
                    int count = sc.nextInt();
                    p.editOrUpdate(count);
                }
                return;
            }System.out.println();
        }
        System.out.println("\nProduct not found");
    }
    public static void productdetails(List<Product> list) {
        System.out.println("\nEnter product name : ");
        sc.nextLine();
        String pname = sc.nextLine();
        for(Product p: list) {
            if(p.getProduct().compareToIgnoreCase(pname) == 0) {
                p.productDetails();
                return;
            }
        }
        System.out.println("\nProduct not found");System.out.println();
    }
    public static void Productcount(List<Product> list) {
        System.out.print("\nEnter product name : ");
        sc.nextLine();
        String Productname = sc.nextLine();
        boolean flag = false;
        for(Product p: list) {
            if((p.getProduct()).compareToIgnoreCase(Productname)==0) 
            {
                System.out.println("count of "+p.getProduct() + " is "+p.productCount());
                flag= true;
                break;
            }
        }
        if(!flag)
            System.out.println("Product not found");
    }
    public static void productList(List<Product>list) {
        if(list.size() == 0)
         {
            System.out.println("Empty");
            return;
        }
        int i = 1 ;
        for(Product p:list)
            System.out.println((i++) + " " +p.getProduct());
        System.out.println();
    }
    public static void updateInventory(List<Product> list) {
        System.out.println("-----------------------");
        System.out.println("   1. Add poduct");
        System.out.println("   2. Delete product");
        System.out.println("Enter your choice");System.out.println();
        sc.nextLine();
        int n = sc.nextInt();
        if(n == 1) {
            System.out.println("Enter productName,Specification,cost,count : ");
            sc.nextLine();
            String t = sc.nextLine();
            String []arr = t.split(" ");
            String name = arr[0];
            String spec = arr[1];
            double cost = Double.parseDouble(arr[2]);
            int count = Integer.parseInt(arr[3]);
            Product p1 = new Product(name,spec,cost,count);
            list.add(p1);
        }else {
            System.out.println("Enter name to delete product : ");
            sc.nextLine();
            String pname = sc.nextLine();
            int i = 0;
            for(Product p: list) {
                if((p.getProduct()).compareToIgnoreCase(pname) == 0) {
                    break;
                }
                i++;
            }
            if(i == list.size())
                System.out.println("product not found");
            else {
                list.remove(i);
                System.out.println("Product removed successfully");
            }
        }
   }
}