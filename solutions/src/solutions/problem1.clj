(ns solutions.problem1)
(use 'clojure.repl)

;; Find the sum of all the multiples of 3 or 5 below 1000.

(defn  sum-of-multiples [integer-list]
  (let [mult-of-3? (fn [n] (= 0 (rem n 3)))
        mult-of-5? (fn [n] (= 0 (rem n 5)))]
    (->> integer-list
         (filter (fn [n] (or (mult-of-3? n) (mult-of-5? n))))
         (reduce +))))
    
