package ca.kittle.pizza

import org.scalatest._
import ca.kittle.pizza.Size._
import ca.kittle.pizza.Base._
import ca.kittle.pizza.Topping._

/**
 * Created by don on 15-05-27.
 */
class PizzaSpec extends FlatSpec with Matchers{

  "A pizza" should "have no toppings by default" in {
    Pizza().toppings should have size 0
  }

  it should "default to size small" in {
    Pizza().size should be(Small)
  }

  it should "default to a base of tomato sauce" in {
    Pizza().base should be(TomatoSauce)
  }

  it should "have a pesto base if specified" in {
    val pizza = Pizza().withBase(Pesto)
    pizza.base should be(Pesto)
    pizza.size should be(Small)
    pizza.toppings should have size 0
  }

  it should "have be large with mushrooms and tomatoes if specified" in {
    val pizza = Pizza().ofSize(Large).withTopping(Tomatoes).withTopping(Mushrooms)
    pizza.base should be(TomatoSauce)
    pizza.size should be(Large)
    pizza.toppings should have size 2
    pizza.toppings should contain allOf (Mushrooms, Tomatoes)
  }

}
