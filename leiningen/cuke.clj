(ns leiningen.cuke
  "Run cucumber features."
  (:use [clojure.contrib.shell :only [sh]]))

(defn cuke
  [project]
  (println
   (sh "cuke4duke" "--color" "--jars" "lib" "--require" "src" "--require" "features/step_definitions")
   ))

