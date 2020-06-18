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
        Assert.assertEquals("Fizz", result);
    }

    @Test
    public void  should_return_Bizz_when_ginven_number_5(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(5);

        //then
        Assert.assertEquals("Buzz", result);
    }
    @Test
    public void  should_return_Whizz_when_ginven_number_7(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(7);

        //then
        Assert.assertEquals("Whizz", result);
    }
    @Test
    public void  should_return_FizzBuzz_when_ginven_number_15(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(15);

        //then
        Assert.assertEquals("FizzBuzz", result);
    }
    @Test
    public void  should_return_FiZZWhiZZ_when_ginven_number_21(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(21);

        //then
        Assert.assertEquals("FizzWhizz", result);
    }
    @Test
    public void  should_return_BuzzWhiZZ_when_can_be_divided_by_number_70(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(70);

        //then
        Assert.assertEquals("BuzzWhizz", result);
    }

    @Test
    public void  should_return_FiZZBuzzWhiZZ_when_ginven_number_105(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(105);

        //then
        Assert.assertEquals("FizzBuzzWhizz", result);
    }
    @Test
    public void  should_return_FiZZBuzzWhiZZ_when_ginven_number_13(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(13);

        //then
        Assert.assertEquals("Fizz", result);
    }
    @Test
    public void  should_return_FiZZBuzzWhiZZ_when_ginven_number_15(){
        //given
        FizzBuzz fizzBuzz=new FizzBuzz();

        //when
        String result=fizzBuzz.say(15);

        //then
        Assert.assertEquals("BuzzWhizz", result);
    }
}
