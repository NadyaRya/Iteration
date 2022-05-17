import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();

        int bottomLine = 200;
        int upperLine = 300;
        int result = service.numbersOfSquaresIncCertainRange(bottomLine, upperLine);

        System.out.println(result);
    }
}

