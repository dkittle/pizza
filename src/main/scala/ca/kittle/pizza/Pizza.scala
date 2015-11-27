package ca.kittle.pizza

import ca.kittle.pizza.Size._
import ca.kittle.pizza.Base._
import ca.kittle.pizza.Topping._

/**
 * Created by don on 15-05-27.
 */
case class Pizza(size: Size, base: Base, toppings: List[Topping]) {

  def ofSize(size: Size) = {
    this.copy(size = size)
  }

  def withBase(base: Base) = {
    this.copy(base = base)
  }

  def withTopping(ingredient: Topping) = {
    this.copy(toppings = ingredient :: toppings)
  }

}

object Pizza {

  def apply(): Pizza = new Pizza(Small, TomatoSauce, List[Topping]())

//  case class PizzaOrder(size: Size = Small, base: Base = TomatoSauce, toppings: List[Topping] = List[Topping]()) {
//
//
//    def placeOrder(): Pizza = {
//      new Pizza(size = size, base = base, toppings = toppings)
//    }
//
//  }

}