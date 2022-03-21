package stack.and.queue;
import org.junit.jupiter.api.Assertions;
import stack.and.queue.animalShelter.cat;
import stack.and.queue.animalShelter.dog;
import org.junit.jupiter.api.Test;
import stack.and.queue.animalShelter.AnimalShelter;
import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testAnimalShelterCat() {

        Assertions.assertNull(new AnimalShelter().catStack.front);

    }
    @Test
    public void testAnimalShelterCat2() {

        Assertions.assertEquals(0, new AnimalShelter().countCats);


    }

    @Test
    public void testAnimalShelterDog() {

        Assertions.assertNull(new AnimalShelter().dogStack.front);


    }
    @Test
    public void testAnimalShelterDog2() {

        Assertions.assertEquals(0, new AnimalShelter().countDogs);


    }
}
