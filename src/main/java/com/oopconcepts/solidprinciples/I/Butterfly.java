package com.oopconcepts.solidprinciples.I;

import com.oopconcepts.solidprinciples.I.Insect;

public class Butterfly implements Insect {
    @Override
    public void sting() {
        System.out.println("I'm a butterfly and I don't sting");
    }

    @Override
    public void eat() {

    }

    @Override
    public void reproduce() {

    }

    /*
        * The “S” in SOLID stands for Single Responsibility. The principle states that each class should only have one single responsibility. This serves a few purposes:

        1) To keep code loosely coupled
        2) It makes code easier to test. If a class has one single responsibility, it’s easier to write tests that cover one specific responsibility and can help identify bugs early on.
        3) Easier to maintain. When a class has multiple responsibilities, any changes that are made to the class can affect other parts of the class, leading to unexpected bugs
        4) Encourages code reuse. When you break the code up into different components, it allows it to be reused and not re-written over and over again

        Take a look at the product class within this package. Let’s say that we’re selling an online product, for example. For the class fields, each product has a name, price, and a weight. Each product has two methods:

        1)Calculate shipping costs
        2) calculate profit margin

        This example violates the single responsibility rule because the class has too many responsibilities. It holds the data of a product, calculates shipping, and the profit margin.

        It would be better to separate the two methods into separate classes, in keeping with SOLID principles. That way, if you need to make a change on how shipping is calculated, you would only need to go to the shipping calculator class and make those changes.

        *
        *
        *
        * */
    public static class SPrinciple {
    }
}
