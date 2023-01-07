import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CatTest {
    Cat newCat;

    @BeforeEach
    public void setup() {
        newCat = new Cat("Мурка", 3);
    }

    // Получим возраст кошки
    @Test
    public void shouldGetAge() {
        Assertions.assertEquals(4, newCat.getAge());

    }

    // Попросим кошку мяукнуть
    @Test
    public void shouldMeow() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        newCat.meow();
        Assertions.assertEquals(output.toString(), "Meow!\r\n");
    }

    // Поменяем имя кошки
    @Test
    public void shouldSetName() {
        newCat.name = "Васька";
        Assertions.assertEquals(newCat.name, "Васька"); // Выводим, что новое имя рано Васька
    }

    // Проверяем, что есть Мурка
    @Test
    public void shouldGetName() {
        Assertions.assertEquals(newCat.name, "Мурка"); // Выводим, что новое имя рано Васька
    }

    @AfterEach
    public void remove() {
        newCat = null;
    }
}
