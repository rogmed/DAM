package workspacejava;
        
public class Tema04_Act01 {

    public static void main(String[] args) {
        contador(0);
    }
    
    public static void contador(int cont){
        System.out.println(cont);
        cont++;
        if (cont<=20){
            contador(cont);
        }
    }
    
}
