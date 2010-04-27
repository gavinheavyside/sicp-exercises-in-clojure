SICP Exercises in Clojure
=========================

I've finally got round to buying a paper copy of [Structure and
Interpretation of Computer
Programs](http://mitpress.mit.edu/sicp/). I'm intending to study the
book and do the exercises in [Clojure](http://clojure.org), with help
from [Programming
Clojure](http://pragprog.com/titles/shcloj/programming-clojure).


Set up
------

After checking out the project, run `lein deps` to have
[leiningen](http://github.com/technomancy/leiningen) install the
dependencies.

Running tests
-------------

`lein test` will run the unit tests.
`lein cuke` will run features using cuke4duke.  cuke4duke must be
present on the system, I am not using the lein-cuke plugin.

