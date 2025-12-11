(ns cocktail-bar.core)
(def cocktails
  [{:name "Mojito"
    :type :alcoholic
    :price 750
    :ingredients [:rum :lime :sugar :mint :soda]}
   {:name "Virgin Mojito"
    :type :non-alcoholic
    :price 550
    :ingredients [:lime :sugar :mint :soda]}
   {:name "Gin & Tonic"
    :type :alcoholic
    :price 650
    :ingredients [:gin :tonic]}
   {:name "Orange Juice"
    :type :non-alcoholic
    :price 400
    :ingredients [:orange-juice]}])
(defn return-cocktail-names
  "Return a sequence of all cocktail names."
  []
  (map :name cocktails))