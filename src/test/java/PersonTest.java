import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void trueifagesup18falseifelse() {
        // Arrange
        Person p= new Person("hamza", "ots",23);

        // Act
        boolean result = p.isAdult();
        // Assert
        assertEquals(true, result);
    }

}
