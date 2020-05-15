(ns solutions.problem2)
(use 'clojure.repl)

;; By considering the terms in the Fibonacci sequence
;; whose values do not exceed four million, find the sum of
;; the even-valued terms.

;; Fibonacci: 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

(defn Fibonaccis []
  (letfn [(fib [b a]
            (lazy-seq
             (cons b (fib (+ a b) b))))]
    (fib 0 1N)))

(comment
<<<<<<< HEAD
  (->> (Fibonaccis)
       (filter even?)
       (take-while (fn [n] (< n 4000000)))
       (reduce +)))
=======
 (->> (Fibonaccis)
      (filter even?)
      (take-while (fn [n] (< n 4000000)))
      (reduce +)))
>>>>>>> b3a181ae653eb77cb1035b3b76488f92dd492db4

;; Expanding the recursion:

<<<<<<< HEAD
=======
;; Expanding the recursion:

>>>>>>> b3a181ae653eb77cb1035b3b76488f92dd492db4
;; (lazy-seq
;;  (cons 0 (lazy-seq
;;           (cons 1 (lazy-seq
;;                    (cons 1 (lazy-seq
;;                             (cons 2 (lazy-seq
;;                                      (cons 3 (lazy-seq
<<<<<<< HEAD
;;                                               (cons 5 (lazy-seq ...)))))))))))))


(defn Fibonaccis [b a]
  (lazy-seq
   (cons b (Fibonaccis  (+ a b) b))))
;; (take 10 (Fibonaccis 0 1N))
=======
;;                                                (cons 5 (lazy-seq ...)))))))))))))
>>>>>>> b3a181ae653eb77cb1035b3b76488f92dd492db4
