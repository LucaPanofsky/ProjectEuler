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
  (->> (Fibonaccis)
       (filter even?)
       (take-while (fn [n] (< n 4000000)))
       (reduce +)))

;; Expanding the recursion:

;; (lazy-seq
;;  (cons 0 (lazy-seq
;;           (cons 1 (lazy-seq
;;                    (cons 1 (lazy-seq
;;                             (cons 2 (lazy-seq
;;                                      (cons 3 (lazy-seq
;;                                               (cons 5 (lazy-seq ...)))))))))))))

(defn Fibonacci [b a] 
  (lazy-seq (cons b (Fibonacci (+ a b) b))))
;; (take 10 (Fibonaccis 0 1N))

