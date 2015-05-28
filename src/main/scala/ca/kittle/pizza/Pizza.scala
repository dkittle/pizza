package ca.kittle.pizza

/**
 * Created by don on 15-05-27.
 */
case class Pizza(size: String, base: String, toppings: List[String]) {

}

object Pizza {

  def pie(): PizzaOrder = PizzaOrder()

  case class PizzaOrder(size: String = "small", base: String = "tomato sauce", toppings: List[String] = List[String]()) {

    def ofSize(size: String) = {
      this.copy(size = size)
    }

    def withBase(base: String) = {
      this.copy(base = base)
    }

    def withTopping(ingredient: String) = {
      this.copy(toppings = ingredient :: toppings)
    }

    def placeOrder(): Pizza = {
      new Pizza(size = size, base = base, toppings = toppings)
    }

  }

}