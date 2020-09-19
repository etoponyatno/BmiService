public class Main {
    public static void main(String[] args){
        BmiService service = new BmiService();
        double bodyMassIndex = service.calculate(77, 1.8);
        System.out.println(bodyMassIndex);
    }
}
