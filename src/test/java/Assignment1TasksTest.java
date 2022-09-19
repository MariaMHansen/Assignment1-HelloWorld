//import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class Assignment1TasksTest {

    @DisplayName("checks if sayHello method returns String hello world")
    @Test
    void Should_ReturnHelloWorld () {
        assertEquals("hello world!", Assignment1Tasks.sayHello());
    }

    @DisplayName("countDogs no dogs in string")
    @Test
    void Should_ReturnZero_When_NoDogInString () {
        int count = Assignment1Tasks.countDogs("cat cat catcat");
        assertEquals(0, count);
    }
}