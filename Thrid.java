import java.util.Scanner;
public class Thrid {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] Products ={"LEds","Lights","Fans","Tv"};
        String[] Specifications = {"90w","100w","ceiling","24inches"};
        int[] Cost= {200,400,1500,40000};
        int[] Quantity= {20,10,50,100};
        while(true){
            Menu();
            int n = sc.nextInt();
            sc.nextLine();
            if(n==1){
                ProductsList(Products);
            }
            if(n==2){
                ProductQuantity(Products, Quantity);
            }
            if(n==3) {
                viewProductDetails(Products, Specifications,Quantity,Cost);
            }
            if(n==4){
                viewProductDetails(Products, Specifications,Quantity,Cost);
                System.out.println("Enter what you want from above");
                int index = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the specification to be change");
                String newSpecification = sc.nextLine();
                editProducts(Products,Specifications,index,newSpecification);
            }
            if(n==5){
                ProductsList(Products);
                System.out.println("what you want to increment?");
                int IncrementIndex = sc.nextInt();
                sc.nextLine();
                ProductQuantity(Products, Quantity);
                System.out.println("Enter nagitive value to decrement\nEnter increment or decrement value");
                int quantityToBeChanged = sc.nextInt();sc.nextLine();
                updateInventory(Products,Quantity,IncrementIndex,quantityToBeChanged);
            }
            System.out.println("Press 'c' to continue");
            char ch = sc.nextLine().charAt(0);
            if(ch == 'c'){
                continue;
            }
            else{
                System.exit(0);
            }
            sc.close();
        }
    }
    static  void ProductsList(String[] Products){
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1+". "+Products[i]);
        }
    }
    static void ProductQuantity(String[] products,int[]quantity){
        for(int i=0;i<4;i++){
            System.out.println(i+1+". "+products[i]+"--- "+quantity[i]);
        }
    }
    static void viewProductDetails(String[] Products, String[] Specifications, int[] Count, int[]Cost){
        for (int i = 0; i < 4; i++) {
            System.out.println(i+1+". Productname: "+Products[i]+"  Specifications: "+Specifications[i]+"  Available: "+Count[i]+"  MRP: "+Cost[i]);
        }
    }
    static void editProducts(String[] Products,String[] Specification,int Increment,String Modified ) {
            Specification[Increment-1] = Modified;
        System.out.println(" Product "+Products[Increment-1]+" Specification Available  "+Specification[Increment-1]);

    }
        static void updateInventory(String[]Products,int[]count,int Increment,int countt){
        count[Increment-1] = count[Increment-1]+countt;
        System.out.println("After new stock delivered :"+Products[Increment-1]+" Availablity :"+count[Increment-1]);
    }
    static void Menu(){
        System.out.println("1.Product List");
        System.out.println("2.Product count");
        System.out.println("3.View Product Details");
        System.out.println("4.Edit Product");
        System.out.println("5.Update Inventory");
    }
}