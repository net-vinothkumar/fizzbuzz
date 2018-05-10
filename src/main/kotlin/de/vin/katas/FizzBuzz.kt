package de.vinoth.katas

import de.vinoth.katas.Constants.Companion.BUZZ
import de.vinoth.katas.Constants.Companion.FIZZ

class FizzBuzz {

    fun play(number: Int): String {
        println("Play() method has been called")
        return when {
            isDivisibleBy15(number) -> FIZZ + BUZZ
            isDivisibleBy3(number) -> FIZZ
            isDivisibleBy5(number) -> BUZZ
            else -> number.toString()
        }
    }

    private fun isDivisibleBy3(n: Int) = n % 3 == 0

    private fun isDivisibleBy5(n: Int) = n % 5 == 0

    private fun isDivisibleBy15(n: Int) = isDivisibleBy3(n) && isDivisibleBy5(n)

}