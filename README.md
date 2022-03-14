# Typed Extensible HyperText Markup Language (XHTML) in Java (TXHTMLJ)

This project aims to provide a domain-specific language (DSL) to create XHTML
(Extensible HyperText Markup Language) files in Java in an easy way, with all
the advantages of typing. Below is a short list of the features it intends to
implement:

* Make it almost as easy to read and write XHTML producing code in Java as it is
  to read and write an XHTML file in a text editor
* Use the advantages of typing, such that the Java compiler can validate much
  of the XHTML code
  * This brings also the advantages of code-completion on XHTML producing code
* Coverage of the basic elements and concepts of XHTML
  * It is not expected to it will be possible to cover all aspects of all
    elements and concepts of XHTML

## Example

To give a better idea of how TXHTMLJ works, consider the following simple XHTML
document:

```xhtml
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
    <title>Hello, world!</title>
  </head>
  <body>
    <p>Hello, world!</p>
  </body>
</html>
```

With TXHTMLJ, this code can be produced and printed to the console using the
following Java code:

```java
  import net.filipvanlaenen.txhtmlj.Body;
  import net.filipvanlaenen.txhtmlj.Head;
  import net.filipvanlaenen.txhtmlj.Html;
  import net.filipvanlaenen.txhtmlj.P;
  import net.filipvanlaenen.txhtmlj.Title;

  Html html = new Html();
  Head head = new Head();
  html.addElement(head);
  head.addElement(new Title("Hello, world!");
  Body body = new Body();
  html.addElement(body);
  body.addElement(new P("Hello, world!");
  System.out.println(html.asString());
```
