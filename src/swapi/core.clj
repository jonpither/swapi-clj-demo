(ns swapi.core
  (:require [clj-http.client :as client]))

(count (:results (:body (client/get "https://swapi.dev/api/people/" {:as :json}))))

;; All people:
(first (:results (:body (client/get "https://swapi.dev/api/people/" {:as :json}))))

;; An individual person:
(:body (client/get "https://swapi.dev/api/people/1/" {:as :json}))



;; deftest, is
;; demo
;; frequencies

;; Get all the people
