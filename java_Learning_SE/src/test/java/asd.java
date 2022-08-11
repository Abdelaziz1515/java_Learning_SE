import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class asd {
    Calculator calculator=new
            Calculator();
    @Test
    public void itShouldAddnum(){
        //given
        int num1=10;
        int num2=20;
        //when
        int result=calculator.add(num1,num2);
        //Then
        int expected_result=30;
        assertEquals(expected_result,result);




    }
    class Calculator{
        int add(int a,int b){
            return a+b;
        }
    }
}
