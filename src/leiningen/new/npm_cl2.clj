(ns leiningen.new.npm-cl2
  (:require [leiningen.new.templates :refer [renderer name-to-path ->files year]]
            [leiningen.core.main :as main]))

(def render (renderer "npm-cl2"))

(defn npm-cl2
  "Create new ChlorineJs node package project"
  [name]
  (let [data {:name name
              :year (year)
              :sanitized (name-to-path name)}]
    (main/info "Generating fresh 'lein new' npm-cl2 project.")
    (->files data
             ["src/core.cl2" (render "core.cl2" data)]
             ["test/core_test.cl2" (render "core_test.cl2" data)]
             ["test/test_runner.cl2" (render "test_runner.cl2" data)]
             ;;["test/test_runner.hic" (render "test_runner.hic" data)]
             ["README.md" (render "README.md" data)]
             ["project.clj" (render "project.clj" data)]
             [".gitignore" (render "gitignore" data)]
             [".travis.yml" (render "travis.yml" data)])))
