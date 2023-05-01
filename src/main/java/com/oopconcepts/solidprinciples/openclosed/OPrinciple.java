package com.oopconcepts.solidprinciples.openclosed;
/*

According to ChatGPT, the term “not open for extension” refers to code that is not designed to accommodate changes or additions to its functionality.

In layman’s terms, this means that if you need to make a change to your code, you should abstract as much of it away as you can, so that you can add functionality without breaking or modifying existing code.

Let’s take a look at the Printer class. Its print() method is equipped to print a PDF or a CSV file. What happens if we want to add additional functionality to allow it to print another type of file?

We’d have to add an additional if statement. This could cause bugs where the print method is called in the code base.

To adhere to the open to extension and closed to modification principle, it would have been much better to have created a Printer interface and created different classes for each type of report generator. That way, we could have created a print method and overrode the logic for each of the classes. This would have adhered to both the “S” and “O” principles.
 */
public class OPrinciple {
}
