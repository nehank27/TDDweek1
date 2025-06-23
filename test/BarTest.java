import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BarTest {

    Bar bar;

    @BeforeEach
    public void setUp(){
        bar = new Bar();

    }


    @Test
    public void bar_tab_starts_empty(){
        int actual = bar.getTab();

        assertEquals(0, actual);
    }

    @Test
    public void add_iced_tea_to_tab(){
        bar.addBeverage(new IcedTea());
        int actual = bar.getTab();

        assertEquals(IcedTea.ICED_TEA_COST, actual);
    }

    @Test
    public void add_coffee_to_tab(){
        bar.addBeverage(new Coffee());
        int actual = bar.getTab();

        assertEquals(Coffee.COFFEE_PRICE, actual);
    }

    @Test
    public void add_multiple_drinks_to_tab(){
        bar.addBeverage(new Coffee());
        bar.addBeverage(new IcedTea());

        int actual = bar.getTab();
        assertEquals(Coffee.COFFEE_PRICE + IcedTea.ICED_TEA_COST, actual);
    }

}
