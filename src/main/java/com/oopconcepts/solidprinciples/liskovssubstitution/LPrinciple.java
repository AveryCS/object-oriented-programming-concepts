package com.oopconcepts.solidprinciples.liskovssubstitution;
/*
* The “L” in SOLID stands for Liskov’s substitution principle. This means that if we substitute a superclass with an object of its subclass, the program should not break.(https://reflectoring.io/lsp-explained/).

Let’s take a look at the Candle class that has getPrice() as an abstract method. Scented and unscented candles both extend candle. This adheres to the Liskov’s substitution principle because both types of candles can be used wherever a candle is expected, without causing any issues with functionality.

*
*
* */
public class LPrinciple {
}
