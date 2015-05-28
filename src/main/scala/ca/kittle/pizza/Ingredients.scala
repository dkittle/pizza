package ca.kittle.pizza

/**
 * Created by don on 15-05-28.
 */
object Size extends Enumeration {
  type Size = Value
  val Small, Medium, Large, XL = Value
}

object Base extends Enumeration {
  type Base = Value
  val TomatoSauce, Pesto = Value
}

object Topping extends Enumeration {
  type Topping = Value
  val Mushrooms, Onions, Peppers, Jalapenos, Tomatoes = Value
}
