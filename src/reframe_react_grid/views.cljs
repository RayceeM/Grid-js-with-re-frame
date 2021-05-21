(ns reframe-react-grid.views
  (:require
   [re-frame.core :as re-frame]
   [reframe-react-grid.subs :as subs]
   ["gridjs-react" :refer (Grid)]
   ))

(defn main-panel []
  [:> Grid 
   {:columns ["Name", "Age"]
            :data [["Jane Doe" 25] ["John Doe" 29]]
            :pagination {:enabled true
                         :limit 100}
            :search true}]
  )
