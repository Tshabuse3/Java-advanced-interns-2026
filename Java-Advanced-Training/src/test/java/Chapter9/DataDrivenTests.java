package Chapter9;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Livhuwani Tshabuse
 * Project : IntelliJ IDEA
 * Date : 10/14/2026
 **/
public class DataDrivenTests {


    @ParameterizedTest(name = "Test Exam Score - [{index}] : {arguments}")
    @ValueSource(doubles = {77.5, 63.8, 66.5, 57.8, 78})
    void testExamScore(double examMark){

        boolean actual = examMark >= 65;

       assertTrue(actual, " Pass mark should be >=65 [" + examMark + "]");
    }
    @ParameterizedTest
    @ValueSource(strings = {"Kate" , "Jane", "Carol", "Jessica" , "Morgan"})
    void testNameStartsWithJ(String name){
        assertTrue(name.startsWith("J"), name + " doesnt start with J");
    }
    @ParameterizedTest
    @CsvSource(value = {"Milk,20.00,50", "Bread,18.55,25", "Cheese,55.35,17", "Eggs,80.55,60"})
    void testLowStockProducts(String product, double price, int qtyInstock){
        assertTrue(qtyInstock < 50, "This is enough stock for [" + product + "] ");

        System.out.println("product = " + product + ", price = " + price + ", qtyInstock = " + qtyInstock);
    }

    @ParameterizedTest
    @MethodSource("randomNumbers")
    void testEvenNumbers(int number){
        assertTrue(number %2 == 0, number + " is not even ");
    }

    @ParameterizedTest
   @MethodSource("Chapter9.DataScore#randomNumbers")//Package,Name of the class
    void testExternalRandomNumbers(int number){
      assertTrue(number >= 45, number + "is less than 45");


    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/Student Results.csv", numLinesToSkip = 1)
      void testExamMark(String module, int testMark){
      assertTrue(testMark >=65, "You have failed [" + module + "] with [" + testMark + "]. You need 65 to pass");
    }


    static List<Integer> randomNumbers (){
        Random rnd = new Random();
        List<Integer> numbers = new  ArrayList<>();

        int count = rnd.nextInt(5,12);
        for(int i = 0; i < count ; i++){
            numbers.add(rnd.nextInt(10, 70));
        }

        return numbers;
    }

}
