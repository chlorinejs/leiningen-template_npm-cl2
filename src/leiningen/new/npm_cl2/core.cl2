(defmacro awesome-macro
  "Docstrings are programmers' friends."
  [& xs]
  `(awesome-function ~@xs))

(defn awesome-function
  "An other programmers' friend."
  [& xs]
  xs)
