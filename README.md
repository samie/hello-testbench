hello-testbench
===========

Simple Vaadin Hello World application for Vaadin TestBench. This project demonstrates:
 * Vaaidn TestBench Maven dependencies
 * Automatic testing with Firefox
 * Clicking buttons and validating Notification and Label values

### Usage:

Make sure you have installed [Maven](http://maven.apache.org/) and [Git](http://git-scm.com/). You also need to have the [Firefox browser](https://www.mozilla.org/en-US/firefox/new/) installed in your machine where you run the tests. 

    git clone https://github.com/vaadin/hello-testbench.git
    cd hello-testbench
    mvn verify
    
Vaadin TestBench test cases are automatically executed as part of integration test phase. During this phase an embedded 
Jetty server instance is started to run the application itself, and then test case in
[HelloWorldITCase.java](src/test/java/org/vaadin/samples/tests/HelloWorldITCase.java) is executed. This test 
starts Firefox browser and simulates the given user interactions for the application and asserts correct behavior.

You can find the code for the application in [HelloWorldUI.java](src/main/java/org/vaadin/samples/HelloWorldUI.java).


### License

This is free and unencumbered software released into the public domain.

Anyone is free to copy, modify, publish, use, compile, sell, or
distribute this software, either in source code form or as a compiled
binary, for any purpose, commercial or non-commercial, and by any
means.

In jurisdictions that recognize copyright laws, the author or authors
of this software dedicate any and all copyright interest in the
software to the public domain. We make this dedication for the benefit
of the public at large and to the detriment of our heirs and
successors. We intend this dedication to be an overt act of
relinquishment in perpetuity of all present and future rights to this
software under copyright law.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
OTHER DEALINGS IN THE SOFTWARE.

For more information, please refer to <[http://unlicense.org/](http://unlicense.org/)>
