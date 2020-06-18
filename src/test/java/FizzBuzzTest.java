import com.twschool.practice.FizzBuzz;
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {
    @Test
    public void  should_return_1_when_ginven_number_1(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(1);

        //then
        Assert.assertEquals("1", result);
    }

    @Test
    public void  should_return_Fizz_when_ginven_number_3(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(3);

        //then
        Assert.assertEquals("FiZZ", result);
    }

    @Test
    public void  should_return_Bizz_when_ginven_number_5(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(5);

        //then
        Assert.assertEquals("BiZZ", result);
    }
}
