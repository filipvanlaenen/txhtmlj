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
  head.addElement(new Title("Hello, world!"));
  Body body = new Body();
  html.addElement(body);
  body.addElement(new P("Hello, world!"));
  System.out.println(html.asString());
```

## Getting Started

First of all, you need to obtain a copy of the source code, complile it and
install it locally. Run the following commands to do this:

```
git clone git@github.com:filipvanlaenen/txhtmlj.git
cd txhtmlj
mvn clean install
```

*Note: If requested by enough people, this library can be deployed to a central
Maven repository ([Issue #1](https://github.com/filipvanlaenen/txhtmlj/issues/1)).*

If everything works well, you'll be able to use the TXHTMLJ library in another
Java project by adding the following dependency in the project's POM file:

```xml
  <dependency>
    <groupId>net.filipvanlaenen</groupId>
    <artifactId>txhtmlj</artifactId>
    <version>1.0-SNAPSHOT</version>
  </dependency>
```

Be sure to update to the appropriate version number.

Once the dependency is included, you can start to create XHTML documents as
shown in the example above.

## Elements Implemented

Not all XHTML elements and concepts have been implemented yet. Below is a list
with the elements that have been (partially) implemented. More elements and
attributes will be implemented as
[requested](https://github.com/filipvanlaenen/txhtmlj/issues) or needed by other
projects.

* Document element
  * [html](https://html.spec.whatwg.org/multipage/semantics.html#the-html-element)
* Document metadata
  * [head](https://html.spec.whatwg.org/multipage/semantics.html#the-head-element)
  * [style](https://html.spec.whatwg.org/multipage/semantics.html#the-style-element)
  * [title](https://html.spec.whatwg.org/multipage/semantics.html#the-title-element)
* Sections
  * [body](https://html.spec.whatwg.org/multipage/sections.html#the-body-element)
  * [footer](https://html.spec.whatwg.org/multipage/sections.html#the-footer-element)
  * [header](https://html.spec.whatwg.org/multipage/sections.html#the-header-element)
  * [section](https://html.spec.whatwg.org/multipage/sections.html#the-section-element)
* Grouping content
  * [div](https://html.spec.whatwg.org/multipage/grouping-content.html#the-div-element)
  * [p](https://html.spec.whatwg.org/multipage/grouping-content.html#the-p-element)
* Text-level semantics
  * [a](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-a-element)
* Embedded content
  * [svg](https://html.spec.whatwg.org/multipage/embedded-content-other.html#svg-0)

## Projects Using TXHTMLJ

The following projects use TXHTMLJ:
* [ASAPOP](https://github.com/filipvanlaenen/asapop)
