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
  * [link](https://html.spec.whatwg.org/multipage/semantics.html#the-link-element)
  * [meta](https://html.spec.whatwg.org/multipage/semantics.html#the-meta-element)
  * [style](https://html.spec.whatwg.org/multipage/semantics.html#the-style-element)
  * [title](https://html.spec.whatwg.org/multipage/semantics.html#the-title-element)
* Sections
  * [body](https://html.spec.whatwg.org/multipage/sections.html#the-body-element)
  * [footer](https://html.spec.whatwg.org/multipage/sections.html#the-footer-element)
  * [h1](https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements)
  * [h2](https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements)
  * [h3](https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements)
  * [h4](https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements)
  * [h5](https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements)
  * [h6](https://html.spec.whatwg.org/multipage/sections.html#the-h1,-h2,-h3,-h4,-h5,-and-h6-elements)
  * [header](https://html.spec.whatwg.org/multipage/sections.html#the-header-element)
  * [section](https://html.spec.whatwg.org/multipage/sections.html#the-section-element)
* Grouping content
  * [div](https://html.spec.whatwg.org/multipage/grouping-content.html#the-div-element)
  * [hr](https://html.spec.whatwg.org/multipage/grouping-content.html#the-hr-element)
  * [li](https://html.spec.whatwg.org/multipage/grouping-content.html#the-li-element)
  * [p](https://html.spec.whatwg.org/multipage/grouping-content.html#the-p-element)
  * [ul](https://html.spec.whatwg.org/multipage/grouping-content.html#the-ul-element)
* Text-level semantics
  * [a](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-a-element)
  * [b](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-b-element)
  * [br](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-br-element)
  * [code](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-code-element)
  * [em](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-em-element)
  * [i](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-i-element)
  * [kbd](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-kbd-element)
  * [mark](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-mark-element)
  * [s](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-s-element)
  * [samp](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-samp-element)
  * [small](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-small-element)
  * [span](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-span-element)
  * [strong](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-strong-element)
  * [sub](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-sub-and-sup-elements)
  * [sup](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-sub-and-sup-elements)
  * [u](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-u-element)
  * [var](https://html.spec.whatwg.org/multipage/text-level-semantics.html#the-var-element)
* Embedded content
  * [svg](https://html.spec.whatwg.org/multipage/embedded-content-other.html#svg-0)
* Tabular data
  * [table](https://html.spec.whatwg.org/multipage/tables.html#the-table-element)
  * [tbody](https://html.spec.whatwg.org/multipage/tables.html#the-tbody-element)
  * [td](https://html.spec.whatwg.org/multipage/tables.html#the-td-element)
  * [th](https://html.spec.whatwg.org/multipage/tables.html#the-th-element)
  * [thead](https://html.spec.whatwg.org/multipage/tables.html#the-thead-element)
  * [tr](https://html.spec.whatwg.org/multipage/tables.html#the-tr-element)
* Forms
  * [option](https://html.spec.whatwg.org/multipage/form-elements.html#the-option-element)
  * [select](https://html.spec.whatwg.org/multipage/form-elements.html#the-select-element)
* Scripting
  * [script](https://html.spec.whatwg.org/multipage/scripting.html#the-script-element)

## Projects Using TXHTMLJ

The following projects use TXHTMLJ:
* [ASAPOP](https://github.com/filipvanlaenen/asapop)
