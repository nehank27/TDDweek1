import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

//• Iced tea can be created with a default value 50 - done
//• Iced tea can be created with a specified value - done
//• Iced tea price is 200 cents - done
//• Coffee can be created with a default value 100
//• Coffee can be created with a specified value
//• Coffee price is 300 cents
//• Sugar can be added to iced tea - done
//• Sugar can be added to coffee
//• A bar with a tab exists
//• Drinks can be added to the bar’s tab
//• Price can be retrieved from the bar based on the tab

public class IcedTeaTest {

    IcedTea icedTea;

    @BeforeEach
    public void setUp(){
        icedTea = new IcedTea();
    }

    @Test
    public void iced_tea_created_with_50mg_sugar_by_default() {
        double actual = icedTea.getSugar();

        assertEquals(IcedTea.ICED_TEA_DEFAULT_SUGAR, actual);
    }

    @Test
    public void price_is_200cents(){
        int actual = icedTea.getPrice();

        assertEquals(IcedTea.ICED_TEA_COST, actual);
    }



}
