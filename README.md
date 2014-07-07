arquillian-rest-testing-example
===============================

A basic starting point for me to test rest api:s

# Configuring Arquillian for Baic Rest API testing

## Background

I wanted to have a basic test case that I can use as a template for further real life work. This setup should solve the
following problems:

1. Satisfy all dependencies properly using maven
* Run in isolation
* The pom should show clearly all dependencies required (i.e not parent poms or outside magic).
* Download JBoss are test run time (i.e Not running servers, not outside installation).

The setup should leverage the following technologies:

* Arquillian
* Jboss 7+
* Maven
* JEE

I know there are a zillion other examples to start/use but for whatever reason they were just to combersome to start off
with. Therefore I hope this example-template solves this.
