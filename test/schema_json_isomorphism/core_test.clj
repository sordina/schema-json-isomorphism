(ns schema-json-isomorphism.core-test
  (:use clojure.test
        schema-json-isomorphism.core)

  (:require  [schema.core :as s]))

(def test-schema {})
(def test-data   {})

(deftest a-test
  (testing "FIXME, I fail."
    ; One Way
    (is (= test-data   (schema-to-data test-schema)))
    (is (= test-schema (data-to-schema test-data)))
    ; ISO
    (is (= test-data   (-> test-data   (data-to-schema) (schema-to-data) )))
    (is (= test-schema (-> test-schema (schema-to-data) (data-to-schema) )))
    ))
