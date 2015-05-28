package ca.kittle.pizza

import org.scalatest._

/**
 * Created by don on 15-05-27.
 */
class PizzaSpec extends FlatSpec with Matchers{

  "A pizza" should "have no toppings by default" in {
    (Pizza pie() placeOrder()).toppings should have size 0
  }

  it should "default to size small" in {
    (Pizza pie() placeOrder()).size should be("small")
  }

  it should "default to a base of tomato sauce" in {
    (Pizza pie() placeOrder()).base should be("tomato sauce")
  }

  it should "have a pesto base if specified" in {
    val pizza = Pizza.pie().withBase("pesto").placeOrder()
    pizza.base should be("pesto")
    pizza.size should be("small")
    pizza.toppings should have size 0
  }

  it should "have be large with mushrooms and tomatoes if specified" in {
    val pizza = Pizza.pie().ofSize("large").withTopping("tomatoes").withTopping("mushrooms").placeOrder()
    pizza.base should be("tomato sauce")
    pizza.size should be("large")
    pizza.toppings should have size 2
    pizza.toppings should contain allOf ("mushrooms", "tomatoes")
  }

}
