package src.lectures.part2OOP

/**
  * Created by LENOVO on 24-08-2021.
  */
object AbstractDataTypes extends App {

  //abstract
  abstract class Animal
  {
    val creatureType: String="Wild"
    def eat: Unit
  }
class Dog extends Animal{
  override val creatureType: String = "Canine"
  def eat: Unit = println("crunch crunch")
}
  // traits
  trait Carnivore{
    def eat(animal:Animal): Unit
    val preferredMeal:String ="fresh meat"
  }
  trait ColdBlooded
  class Crocodile extends Animal with Carnivore with ColdBlooded{
    override val creatureType: String = "croc"
    def eat:Unit = "nomnom"
    def eat(animal: Animal):Unit =println( s"I 'm a croc I'm eating${animal.creatureType}")
  }
  val dog = new Dog
  val croc= new Crocodile
  croc.eat(dog)

  // traits vs abstract classes
  // 1- traits do not have constructor parameters
  // 2- multiple traits may be inheritated by thr same class
  //3- traits= behaviour , abtract class = " thing"
}
