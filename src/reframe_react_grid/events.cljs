(ns reframe-react-grid.events
  (:require
   [re-frame.core :as re-frame]
   [reframe-react-grid.db :as db]
   ))

(re-frame/reg-event-db
 ::initialize-db
 (fn [_ _]
   db/default-db))
