package stack.and.queue.animalShelter;

import stack.and.queue.queue;

public class AnimalShelter {
    public queue<Animal> dogStack;
    public queue <Animal> catStack;
    public int countDogs;
    public int countCats;
    int ShelterLength;

    public AnimalShelter()
    {
        this.dogStack = new queue<>();
        this.catStack = new queue<>();
        this.countDogs = 0;
        this.countCats = 0;
        this.ShelterLength = 0;
    }

    public void enqueue(Animal species)
    {
        if (species.getClass() == dog.class)
        {
            this.dogStack.enqueue(species);
            this.countDogs++;
        }
        else if (species.getClass() == cat.class)
        {
            this.catStack.enqueue(species);
            this.countCats++;
        }
    }

    public Animal dequeue(Animal preference)
    {
        Animal shelterdAnimal = null;

        if ((preference instanceof dog) && (countDogs != 0))
        {
            shelterdAnimal = dogStack.dequeue();
            this.countDogs--;
        }
        else if ((preference instanceof cat) && (countCats != 0))
        {
            shelterdAnimal = catStack.dequeue();
            this.countCats--;
        }
        return shelterdAnimal;
    }

    public String toString()
    {

        String result = "Dog " + dogStack.toString() +
                "Cat " + catStack.toString();

        return result;
    }

    public int AnimalShelterLength()
    {
        ShelterLength = this.countDogs + this.countCats;

        return ShelterLength;
    }

}
