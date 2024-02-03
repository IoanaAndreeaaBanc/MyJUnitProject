import org.junit.jupiter.api.*;

public class ConvertorUnitatiMasuraTest {

    @BeforeEach
    public void BeforeEachMethod(){

        System.out.println("BeforeEachMethod");
    }

    @Test
    public void fahrenheitToCelsiusTest(){
        ConvertorUnitatiMasura convertorUnitatiMasura = new ConvertorUnitatiMasura();
        double result = convertorUnitatiMasura.fahrenheitToCelsius(100);
        Assertions.assertEquals(result,37.77777777777778 );
    }

    @Test
    public void milesToKilometersTest(){
        ConvertorUnitatiMasura convertorUnitatiMasura = new ConvertorUnitatiMasura();
        double result = convertorUnitatiMasura.milesToKilometers(10);
        Assertions.assertEquals(result, 16.0934);

    }
    @Test
    public void poundsToKilogramTest(){
        ConvertorUnitatiMasura convertorUnitatiMasura = new ConvertorUnitatiMasura();
        double result = convertorUnitatiMasura.poundsToKilograms(10);
        Assertions.assertEquals(result, 4.53592);

    }
    @Test
    public void gallonsToLitresTest(){
        ConvertorUnitatiMasura convertorUnitatiMasura = new ConvertorUnitatiMasura();
        double result = convertorUnitatiMasura.gallonsToLiters(10);
        Assertions.assertEquals(result, 37.8541);
    }

    @AfterEach
    public void AfterEachMethod(){

        System.out.println("Executing After Each Method");
    }

}
