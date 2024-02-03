import org.junit.jupiter.api.*;

public class CalculatorTest {
    private static Calculator calculator;
    @BeforeAll
    public static void BeforeAllMethod() {
        calculator = new Calculator();
        System.out.println("BeforeAll");}

    @BeforeEach
        public void beforeEachMethod(){
        System.out.println("BeforeEach");

    }


    @Test
    public void addTest() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);
        Assertions.assertEquals(result, 5);
    }
    @Test
        public void inmultireTest(){
            Calculator calculator = new Calculator();
            int result = calculator.inmultire(5,7);
            Assertions.assertEquals(result,35);

    }
    @Test
    public void impartireTest(){
        Calculator calculator = new Calculator();
        int result = calculator.impartire(10,5);
        Assertions.assertEquals(result,2);

    }
    @Test
    public void calculeazaRestulImpartiriiTest(){
        Calculator calculator = new Calculator();
        int result = calculator.calculeazaRestulImpartirii(10, 7);
        Assertions.assertEquals(result, 3);
    }
    @Test
    public void scadereTest(){
        Calculator calculator = new Calculator();
        int result = calculator.scadere(10, 9);
        Assertions.assertEquals(result, 1);
    }


}
