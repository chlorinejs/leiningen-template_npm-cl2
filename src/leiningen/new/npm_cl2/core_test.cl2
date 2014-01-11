(deftest awesome-macro-tests
  (is (= (macroexpand (awesome-macro 1 2 3))
         (macroexpand (awesome-function 1 2 3)))))

(deftest awesome-function-tests
  (is (= (awesome-function 4 5 6)
         [4 5 6])))
