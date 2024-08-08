public class Principal {
    public static void main(String[] args) {
        System.out.println(verificaNumeroPar(2));
    }
    public static boolean verificaNumeroPar(int num) {
        if(num % 2 == 0){
            return true; //GERANDO ERRO
        }
        else {
            return false;
        }
    }
}
