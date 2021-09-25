import kotlin.random.Random

fun main(){
/*
Example 1:
Cat 2 is 5 years old and meows
Dogs 1 and 2 are 3 years old so they stay quiet, while dogs 3, 4, and 5 are older than the cat so they bark

Example 2:
In this example, the cats are Lili, Meep, Patchy, Furball, and Snowball
Each dog that barks is older than the cat that is meowing
*/

    //Create an abstract class Animal with attributes name and age and abstract function talk
    abstract class Animal(name: String, age: Int) {
        //var name = ""
        //var age = 0
        abstract fun talk()
    }
    //Create a class Dog that inherits Animal and barks ('Name: Woof')
    class Dog(val name: String,  val age: Int) : Animal(name,age) {

        override fun talk() {
            println("$name: Woof")
        }
    }
    //Create a class Cat that inherits Animal and meows ('Name: Meow')
    class Cat( val name: String, val age: Int) : Animal(name,age){

        override fun talk() {
            println("$name: Meow")
        }
    }
    //Create a list of five dogs and a list of five cats with random ages

    val Animals_Ages = listOf<Int>(2,3,5,7,8,4,6,9)

    val Dogs_List = listOf<Dog>(
        Dog("Rufus", Animals_Ages[Random.nextInt(Animals_Ages.size)]),
        Dog("Fred", Animals_Ages[Random.nextInt(Animals_Ages.size)]),
        Dog("Spot", Animals_Ages[Random.nextInt(Animals_Ages.size)]),
        Dog("Cairo", Animals_Ages[Random.nextInt(Animals_Ages.size)]),
        Dog("almond", Animals_Ages[Random.nextInt(Animals_Ages.size)])
    )

    val Cats_List = listOf<Cat>(
        Cat("Lili", Animals_Ages[Random.nextInt(Animals_Ages.size)]) ,
        Cat("Meep", Animals_Ages[Random.nextInt(Animals_Ages.size)]),
        Cat("Patchy", Animals_Ages[Random.nextInt(Animals_Ages.size)]) ,
        Cat("Furball", Animals_Ages[Random.nextInt(Animals_Ages.size)]),
        Cat("Snowball", Animals_Ages[Random.nextInt(Animals_Ages.size)])
    )

//    Use a loop to iterate through the list of cats and make each cat meow,
//    also use a nested loop to make each dog bark if they are older than the meowing cat

    for(Cat in Cats_List){
        Cat.talk()
        for(Dog in Dogs_List){
            if(Cat.age < Dog.age){
                Dog.talk()
            }
        }
}
}