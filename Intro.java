public class Intro {

    public  static  void main(String[] args)
    {

//      example of the pet class
        pet dog = new pet();
        dog.breed="shiba";
        dog.name="cheems";
        dog.age=10;
        dog.weight=15.8f;

        System.out.println(dog.breed);
        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.weight);
    }

//    syntax for class
      static class pet {
        String breed;
        String name;
        int age;
        float weight;
    }
}