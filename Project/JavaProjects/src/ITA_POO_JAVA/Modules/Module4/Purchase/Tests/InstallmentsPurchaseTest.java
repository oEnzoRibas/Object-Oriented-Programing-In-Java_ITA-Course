package ITA_POO_JAVA.Modules.Module4.Purchase.Tests;

import ITA_POO_JAVA.Modules.Module4.Purchase.Project.InstallmentsPurchase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstallmentsPurchaseTest {

    /**
     * The InstallmentsPurchaseTest class tests the behavior of the jurosCompostos() method
     * in the InstallmentsPurchase class. The jurosCompostos method calculates the compound
     * interest based on the principal value, monthly interest rate, and the number of installments.
     */

    @Test
    void testJurosCompostos_BasicCalculation() {
        
        int value = 1000; 
        int installments = 5; 
        int monthlyInterest = 2; 
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);
        
        double result = purchase.jurosCompostos();

        double expected = 1000 * Math.pow(1 + 0.02, 5) - 1000;
        assertEquals(expected, result, 0.01, "Compound interest calculation is incorrect.");
    }

    @Test
    void testJurosCompostos_NoInterest() {
        int value = 1000;
        int installments = 5;
        int monthlyInterest = 0;
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.jurosCompostos();

        assertEquals(0, result, "Compound interest should be 0 when there is no interest.");
    }

    @Test
    void testJurosCompostos_SingleInstallment() {
        int value = 1000;
        int installments = 1; 
        int monthlyInterest = 2; 
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.jurosCompostos();

        double expected = 1000 * Math.pow(1 + 0.02, 1) - 1000;
        assertEquals(expected, result, 0.01, "Compound interest should be correct for one installment.");
    }

    @Test
    void testJurosCompostos_ZeroInstallments() {
        int value = 1000;
        int installments = 0; 
        int monthlyInterest = 2; 
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.jurosCompostos();

        assertEquals(0, result, "Compound interest should be 0 when the number of installments is 0.");
    }

    @Test
    void testJurosCompostos_HighInterestRate() {
        int value = 1000;
        int installments = 3;
        int monthlyInterest = 50;
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.jurosCompostos();

        double expected = 1000 * Math.pow(1 + 0.50, 3) - 1000;
        assertEquals(expected, result, 0.01, "Compound interest calculation is incorrect for high interest rates.");
    }

    @Test
    void testTotal_BasicCalculation() {
        int value = 1000;
        int installments = 5;
        int monthlyInterest = 2;
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.total();

        double expected = 1000 + (1000 * Math.pow(1 + 0.02, 5) - 1000);
        assertEquals(expected, result, 0.01, "Total calculation is incorrect.");
    }

    @Test
    void testTotal_NoInterest() {
        int value = 1000;
        int installments = 5;
        int monthlyInterest = 0;
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.total();

        assertEquals(1000, result, 0.01, "Total calculation is incorrect with no interest.");
    }

    @Test
    void testTotal_SingleInstallment() {
        int value = 1000;
        int installments = 1;
        int monthlyInterest = 2;
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.total();

        double expected = 1000 + (1000 * Math.pow(1 + 0.02, 1) - 1000);
        assertEquals(expected, result, 0.01, "Total calculation is incorrect with a single installment.");
    }

    @Test
    void testTotal_ZeroInstallments() {
        int value = 1000;
        int installments = 0;
        int monthlyInterest = 2;
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.total();

        assertEquals(1000, result, 0.01, "Total calculation is incorrect with zero installments.");
    }

    @Test
    void testTotal_HighInterestRate() {
        int value = 1000;
        int installments = 3;
        int monthlyInterest = 50;
        InstallmentsPurchase purchase = new InstallmentsPurchase(value, installments, monthlyInterest);

        double result = purchase.total();

        double expected = 1000 + (1000 * Math.pow(1 + 0.50, 3) - 1000);
        assertEquals(expected, result, 0.01, "Total calculation is incorrect with a high interest rate.");
    }
}