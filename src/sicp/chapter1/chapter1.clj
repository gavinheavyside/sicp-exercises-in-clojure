(ns sicp.chapter1.chapter1)


;; exercise 1.3
(defn square-and-sum-two-largest-of
  [args]
  (reduce
   + (map
      (fn [x] (* x x))
      (take-last 2
                 (sort args)))))
