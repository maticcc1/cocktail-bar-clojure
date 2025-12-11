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
(defn return-alcoholic-cocktails
  "Return only alcoholic cocktails."
  []
  (filter
    (fn [cocktail]
      (= (:type cocktail) :alcoholic))
    cocktails))
(defn return-non-alcoholic-cocktails
  "Return only non-alcoholic cocktails."
  []
  (filter  (fn [cocktail]
             (= (:type cocktail) :non-alcoholic))
           cocktails))

(defn return-cocktail-by-name
  "Find first cocktail with given name, or nil if not found."
  [name]
  (first
    (filter
      (fn [cocktail]
        (= (:name cocktail) name))
      cocktails)))


(defn contains-ingredient?
  "Return true if ingredients collection contains given ingredient keyword."
  [ingredient ingredients]
  (reduce
    (fn [found current-ingredient]
      (if found
        true
        (= current-ingredient ingredient)))
    false
    ingredients))


(defn return-cocktails-with-ingredient
  "Return all cocktails that contain given ingredient."
  [ingredient]
  (filter
    (fn [cocktail]
      (contains-ingredient? ingredient (:ingredients cocktail)))
    cocktails))


(defn total-price-of-cocktails
  "Calculate sum of :price for given collection of cocktails."
  [cocktail-list]
  (reduce
    (fn [current-sum cocktail]
      (+ current-sum (:price cocktail)))
    0
    cocktail-list))

