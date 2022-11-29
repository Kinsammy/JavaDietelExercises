package chapter4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TaxCalculatorMethodTest {
    private TaxCalculatorMethod calculator;
    private Citizen mathias;
    private Citizen adewumi;
    private Citizen deola;

    @BeforeEach
    public void setUp() {
        mathias = new Citizen();
        mathias.setFirstName("Mathias");
        mathias.setSurname("Momodu");
        mathias.setEarning( new BigDecimal(17_000));

        adewumi = new Citizen("Adewumi", "Adegunwa");
        adewumi.setEarning(new BigDecimal(25_000));

        deola = new Citizen("Adeola", "Adekunle", new BigDecimal(45_000));
    }

    @Test
    public void calculatorTax() {
        BigDecimal mathiasTax = TaxCalculatorMethod.calculatorTax(mathias);
        assertEquals(2550, mathiasTax.intValue());

        BigDecimal wumniTax = TaxCalculatorMethod.calculatorTax(adewumi);
        assertEquals(3750, mathiasTax.intValue());

    }

    @Test
    public void calculateExcessTax(){
        BigDecimal deolaTax = TaxCalculatorMethod.calculatorTax(deola);
        assertEquals(7500, deolaTax.intValue());
    }


}