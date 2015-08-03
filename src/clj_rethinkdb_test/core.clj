(ns clj-rethinkdb-test.core
  (:require [rethinkdb.query :as r]))

(defn recreate-bug []
  (let [db-name (-> (str "clj_rethinkdb_test"))
        table (-> (r/db db-name)
                  (r/table "example"))]
    (with-open [c (r/connect)]
      (println "Setting up test")
      (when-not (some #{"clj_rethinkdb_test"} (r/run (r/db-list) c))
        (r/run (r/db-create db-name) c)
        (r/run (-> (r/db db-name)
                   (r/table-create "example")) c)
        (-> (r/index-create table "by-race-id" (r/fn [row] (r/get-field row :race-id)))
            (r/run c))
        (-> (r/insert table {:test "document" :race-id "id"})
            (r/run c)))

      (println "\nRunning test")

      (doseq [_ (range 10)]
        (println
          (-> (r/get-all table ["id" "cake"] {:index "by-race-id"})
              (r/run c)
              type))))))

(defn -main []
  (recreate-bug))
