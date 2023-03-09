
public class pgmPrinf{
    public static void main(String[] args) {
        System.out.println("+-----------------------+");
        System.out.println("|-----pgm: Print 🖨 -----|");
        System.out.println("|--Autor: Luis Caicedo--|");
        System.out.println("+-----------------------+");

        
            try {
            System.out.println("Imprimir desde el shell a las " + new Date());
            Thread.sleep(3000);
            System.out.println("📃");
            Thread.sleep(1000);
            System.out.println("Impresion Finalizada...... ⭐⭐⭐⭐⭐");
                
            } catch (Exception e) {
                System.out.println("🔴" + e);
            } 
        
    
    }
      
}