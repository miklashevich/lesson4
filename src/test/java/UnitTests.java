import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTests {

    //a>0, b>0 проверить a+b
    @Test
    public void sumTests1(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2,3), 5);
    }
    //a<0, b<0 проверить a+b
    @Test
    public void sumTests2(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(-2,-3), -5);
    }
    //a>0, b<0 проверить a+b
    @Test
    public void sumTests3(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2,-3), -1);
    }
    //
    @Test
    public void divTests1(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.div(4,2), 2);
    }
    @Test
    public void divTests2(){
        Calculator calc = new Calculator();
       // Assert.assertEquals(calc.div(4,0), 0);
        Assert.assertThrows(java.lang.ArithmeticException.class, () -> calc.div(4, 0));
    }
// проверка деления дробных чисел
    @Test
    public void dovTests1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.dov(88.88, 4.0),22.22);
    }

    // проверка корня квадратного
    @Test
    public void sqrtTest1(){
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sqrt(16),4);
    }

}


