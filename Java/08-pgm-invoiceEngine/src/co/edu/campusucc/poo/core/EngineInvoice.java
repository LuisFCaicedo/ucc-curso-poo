package co.edu.campusucc.poo.core; 

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import co.edu.campusucc.poo.db.ClientsDB;
import co.edu.campusucc.poo.db.ProductsDB;
import co.edu.campusucc.poo.models.Bill;
import co.edu.campusucc.poo.models.BillProducts;
import co.edu.campusucc.poo.models.Client;
import co.edu.campusucc.poo.models.Product;
import co.edu.campusucc.poo.services.ClientService;
import co.edu.campusucc.poo.services.ProductService;
import co.edu.campusucc.poo.inter.Interfaz;



public class EngineInvoice {

    ClientsDB clients;
    ProductsDB products;
    ClientService clientService;
    ProductService productService;




    // Specific Methods

    public void addClient(){

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el id del cliente");
        int id = input.nextInt();
        input.nextLine();

        System.out.println("Ingresa el nombre del cliente");
        String name = input.nextLine();
        
        System.out.println(" Ingresa el Apellido del cliente");
        String lastName = input.nextLine();

        Client client = new Client(id,name,lastName, new Date(1));

        clientService.addClient(client);

        System.out.println("El cliente se ha creado Exitosamente ✅");



        
    }


    public void addProduct() {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el id del producto: ");
        int id = input.nextInt();
        input.nextLine();

        System.out.print("Ingrese el nombre del producto: ");
        String name = input.nextLine();

        System.out.print("Ingrese la marca del producto: ");
        String brand = input.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        double price = input.nextDouble();

        Product product = new Product(id,name, brand, price);

        productService.addProduct(product);

        System.out.println("El producto se ha registrado exitosamente. ✅");


        
    }

    public void createBill(){


        List<BillProducts> products = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el id del cliente" );
        int idClient = input.nextInt();
        input.nextLine();
        Client client = clientService.getClientById(idClient);

        System.out.println("Ingresa el id del producto");
        int idProduct = input.nextInt();
        input.nextLine();
        Product product = productService.getProductById(idProduct);

        System.out.println("Ingresa la cantidad del producto");
        int quantityProduct = input.nextInt();
        input.nextLine();

        BillProducts billProducts = new BillProducts(product, quantityProduct, product.getPrice()*quantityProduct);

        // TODO Create cicle to allows, add more than one product

        products.add(billProducts);
        double total = products.stream().mapToDouble(BillProducts::getTotal).sum();


        Bill bill = new Bill(1, products,total, new Date(1));

        // TODO Create BillDB to save, bills, and make auto-increment id


        System.out.println("+-------------------------------+");
        System.out.println("La factura : " +  bill.getId());
        products.stream().forEach(p -> System.out.println("Producto 📞: " + p.getProduct().getName() + " - Precio total 💵: " + p.getTotal()));
        System.out.println("Valor total de la factura es 💰: "+ bill.getTotal());

        System.out.println("Factura generada a nombre de 🤵");
        System.out.println("Cliente ➡️" +  client.getName() + " " + client.getLastName());
        System.out.println("+-------------------------------+");






    }




    //Constructor 

    public EngineInvoice() {
        
        clients = new ClientsDB();
        products = new ProductsDB();

        clientService = new ClientService(clients);
        productService = new ProductService(products);

    }

}