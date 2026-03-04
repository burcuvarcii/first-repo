

    import java.util.Scanner ;
public class NoteCalculation {
    public static void main(String[] args) {
   
        Scanner enter = new Scanner (System.in);
        double note ;

    System.out.println("Enter your note:");
    note = enter.nextDouble();

    if ( note >= 90 ) {
        System.out.println("A");
    }
    else if ( note >= 70){
        System.out.println("B");
    }
    else if ( note >= 40){
        System.out.println("C");
    
    }
    else {
        System.out.println("F");
    
    }
    
    



        
    }
}


