import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class MyStringTest {

    @Test
    public void returneazaNumarulCaracterelorTest(){
        MyString myString = new MyString();
        int result  = myString.returneazaNumarulCaracterelor("HAPPY NEW YEAR");
        Assertions.assertEquals(result,14);
    }

    @Test
    public void concateneaza(){
        MyString myString = new MyString();
        String result = myString.concateneaza("Luca", " are", " patru ani");
        Assertions.assertEquals(result,"Luca are patru ani");
    }

    @Test
    public void IncepeCuVocala(){
        MyString myString = new MyString();
        boolean result = myString.incepeCuVocala("Ioana");
        boolean result1 = myString.incepeCuVocala("cacafonie");
        Assertions.assertTrue(result);
        Assertions.assertFalse(result1);
    }

    @Test
    public void InverseazaString(){
        MyString myString =new MyString();
        String result = myString.inverseazaString("abcd");
        Assertions.assertEquals(result,"dcba");
    }


    @ParameterizedTest
    @CsvSource({"Ioana", "Ayan", "Erik", "oana", "Uranus"})
    public void IncepeCuVocalaParemeterized(String name){
        MyString myString = new MyString();
        boolean result = myString.incepeCuVocala(name);
        Assertions.assertTrue(result);
    }
    @BeforeEach
    public void beforeEach(){
        System.out.println("executing BeforeEach method");
    }
    @AfterEach
    public void afterEach(){
        System.out.println("executing AfterEach method");
    }

}