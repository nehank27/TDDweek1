import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeverageTest {

    Beverage icedTea;

    @BeforeEach
    public void setUp(){
        icedTea = new IcedTea(10);
    }


    @Test
    public void iced_tea_can_be_created_with_specified_value(){
        double actual = icedTea.getSugar();
        assertEquals(10, actual);
    }

    @Test
    public void add_20mg_sugar(){
        icedTea.addSugar(20);
        double actual = icedTea.getSugar();
        assertEquals(30, actual);
    }

}
