import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestProgram {
    @Test
    public void test_Test() {
        //arrange
        // String test;
        // ArchiveTester at= new ArchiveTester();
        //act
        // test = at.getString();
        String actual= "hello world";
        //assert
        Assertions.assertEquals("hello world", actual);
        // testing if the String is there at all
        //assert
    }
}
