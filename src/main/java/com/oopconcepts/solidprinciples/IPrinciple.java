package com.oopconcepts.solidprinciples;

/*
* The “I” in SOLID stands for the interface segregation principle. This principle states that an object should not have to depend on an interface whose methods it doesn’t use.

Let’s take a look at the Insect interface. All insects eat and reproduce, but not all insects sting. The two concrete classes, butterfly and wasp both implement the insect interface.

The butterfly class inherits the sting() method, although butterflies don’t sting. This is a violation of the interface segregation principle. To eliminate this violation, it would be best to create a “Stinger” interface. This way, wasps could implement the stinger interface and butterflies would not have to.

*
*
*
* */
public class IPrinciple {
}
