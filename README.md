# Maybe [![Build Status](https://travis-ci.org/jmonad/maybe.svg?branch=master)](https://travis-ci.org/jmonad/maybe)

How to use?
-----------

```java

/**
 * This method will try to configure the Toolbar
 */
private void configToolbar() {

    setSupportActionBar(toolbar);

    maybe(getSupportActionBar()).bind(actionBar -> {
      actionBar.setHomeButtonEnabled(true);
      actionBar.setDisplayShowHomeEnabled(true);
      return actionBar;
    });

  }

```

Import dependency
--------------------------------

Into your build.gradle:

```groovy

repositories {
  maven {
    url "https://jitpack.io"
  }
}

dependencies {
  compile 'com.github.jmonad:maybe:0.2'
}
```

Contributors
------------

* [Haskell Camargo][10]
* [Pedro Paulo de Amorim][11]
* [Vitor Prado][12]

License
-------

```
The MIT License (MIT)

Copyright (c) 2016 jMonad

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```

[10]: https://github.com/haskellcamargo
[11]: https://github.com/ppamorim
[12]: https://github.com/vitorprado
