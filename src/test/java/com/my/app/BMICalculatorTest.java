package com.my.app;

import com.my.app.BMICalculator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class BMICalculatorTest {

    @Test
    void IsRecommendationNeeded(){

     //  when
         double w=78.0;
         double h=1.6;

         boolean val= BMICalculator.isDietRecommended(w,h);
        System.out.println("+++++++++++++++++++++++++ TESTING ++++++++++++++++++++++++++ ");
         assertTrue(val);
         System.out.println("Everything is just wonderful !");
       /*

        final double w2=0.0;
          final double h2=0.0;

       //   Executable exec= () -> BMICalculator.isDietRecommended(w2,h2);

        //  assertThrows(ArithmeticException.class,exec);

        List<Coder> coders=new ArrayList();
        coders.add(new Coder(1.80,60));
        coders.add(new Coder(1.82,98));
        coders.add(new Coder(1.82,56));

        assertAll();
*/
    }
}