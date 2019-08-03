(ns todo.query
  (:require [todo.database]
            [korma.core :refer :all])
  )

(defentity items)

(defn get-todos []
  (select items)
  )