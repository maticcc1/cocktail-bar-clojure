(ns cocktail-bar.products)



;; All products in the bar

(def all-products
  [
   ;; ----- Cocktails (alcoholic) -----
   {:id          :mojito
    :name        "Mojito"
    :price       750
    :ingredients [:rum :lime :sugar :mint :soda]
    :description "Refreshing, minty, slightly sour cocktail."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :gin-tonic
    :name        "Gin & Tonic"
    :price       650
    :ingredients [:gin :tonic :lime]
    :description "Classic gin-based long drink with tonic."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :cuba-libre
    :name        "Cuba Libre"
    :price       700
    :ingredients [:rum :cola :lime]
    :description "Rum and cola with a splash of lime."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :margarita
    :name        "Margarita"
    :price       820
    :ingredients [:tequila :triple-sec :lime :salt]
    :description "Tequila-based sour cocktail with salted rim."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :pina-colada
    :name        "Piña Colada"
    :price       880
    :ingredients [:rum :coconut-cream :pineapple-juice]
    :description "Sweet tropical cocktail with rum and pineapple."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :aperol-spritz
    :name        "Aperol Spritz"
    :price       800
    :ingredients [:aperol :prosecco :soda :orange]
    :description "Light bitter-sweet Italian aperitif."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :negroni
    :name        "Negroni"
    :price       900
    :ingredients [:gin :campari :vermouth]
    :description "Strong, bitter-sweet classic cocktail."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :old-fashioned
    :name        "Old Fashioned"
    :price       950
    :ingredients [:whiskey :sugar :bitters :orange-peel]
    :description "Whiskey-based classic with bitters and sugar."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :whiskey-sour
    :name        "Whiskey Sour"
    :price       820
    :ingredients [:whiskey :lemon :sugar :egg-white]
    :description "Sour whiskey cocktail with lemon and foam."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :cosmopolitan
    :name        "Cosmopolitan"
    :price       840
    :ingredients [:vodka :triple-sec :cranberry-juice :lime]
    :description "Vodka cocktail with cranberry and lime."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :long-island
    :name        "Long Island Iced Tea"
    :price       980
    :ingredients [:vodka :rum :gin :tequila :triple-sec :lemon :cola]
    :description "Very strong mix of spirits with cola."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :tequila-sunrise
    :name        "Tequila Sunrise"
    :price       780
    :ingredients [:tequila :orange-juice :grenadine]
    :description "Colorful tequila cocktail with orange juice."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :daiquiri
    :name        "Daiquiri"
    :price       800
    :ingredients [:rum :lime :sugar]
    :description "Simple and sour rum cocktail."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :mai-tai
    :name        "Mai Tai"
    :price       880
    :ingredients [:rum :lime :orange-curacao :orgeat-syrup]
    :description "Tiki-style cocktail with rum and almond syrup."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :espresso-martini
    :name        "Espresso Martini"
    :price       920
    :ingredients [:vodka :coffee-liqueur :espresso]
    :description "Coffee-based vodka cocktail, sweet and strong."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :bloody-mary
    :name        "Bloody Mary"
    :price       830
    :ingredients [:vodka :tomato-juice :lemon :spices]
    :description "Savory cocktail with tomato juice and spice."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :sex-on-the-beach
    :name        "Sex on the Beach"
    :price       820
    :ingredients [:vodka :peach-schnapps :orange-juice :cranberry-juice]
    :description "Fruity vodka cocktail with peach and juices."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :blue-lagoon
    :name        "Blue Lagoon"
    :price       800
    :ingredients [:vodka :blue-curacao :lemonade]
    :description "Bright blue vodka cocktail with lemonade."
    :category    :cocktail
    :alcoholic?  true}

   {:id          :caipirinha
    :name        "Caipirinha"
    :price       790
    :ingredients [:cachaca :lime :sugar]
    :description "Brazilian lime and sugar cocktail with cachaça."
    :category    :cocktail
    :alcoholic?  true}

   ;; ----- Cocktails (non-alcoholic) -----
   {:id          :virgin-mojito
    :name        "Virgin Mojito"
    :price       620
    :ingredients [:lime :sugar :mint :soda]
    :description "Non-alcoholic version of Mojito."
    :category    :cocktail
    :alcoholic?  false}

   ;; ----- Coffee drinks -----
   {:id          :espresso
    :name        "Espresso"
    :price       250
    :ingredients [:coffee]
    :description "Single shot of espresso."
    :category    :coffee
    :alcoholic?  false}

   {:id          :double-espresso
    :name        "Double Espresso"
    :price       320
    :ingredients [:coffee]
    :description "Double shot of espresso."
    :category    :coffee
    :alcoholic?  false}

   {:id          :americano
    :name        "Americano"
    :price       280
    :ingredients [:coffee :water]
    :description "Espresso with extra hot water."
    :category    :coffee
    :alcoholic?  false}

   {:id          :cappuccino
    :name        "Cappuccino"
    :price       320
    :ingredients [:coffee :milk :milk-foam]
    :description "Espresso with steamed milk and foam."
    :category    :coffee
    :alcoholic?  false}

   {:id          :latte
    :name        "Latte"
    :price       340
    :ingredients [:coffee :milk]
    :description "More milk, softer coffee drink."
    :category    :coffee
    :alcoholic?  false}

   {:id          :flat-white
    :name        "Flat White"
    :price       360
    :ingredients [:coffee :milk]
    :description "Strong coffee with velvety milk."
    :category    :coffee
    :alcoholic?  false}

   {:id          :macchiato
    :name        "Macchiato"
    :price       290
    :ingredients [:coffee :milk-foam]
    :description "Espresso stained with a bit of foam."
    :category    :coffee
    :alcoholic?  false}

   {:id          :iced-coffee
    :name        "Iced Coffee"
    :price       350
    :ingredients [:coffee :milk :ice :sugar]
    :description "Cold coffee drink with ice and milk."
    :category    :coffee
    :alcoholic?  false}

   {:id          :turkish-coffee
    :name        "Turkish Coffee"
    :price       260
    :ingredients [:coffee :water :sugar]
    :description "Traditional coffee brewed in a pot."
    :category    :coffee
    :alcoholic?  false}

   {:id          :decaf-coffee
    :name        "Decaf Coffee"
    :price       280
    :ingredients [:decaf-coffee :water]
    :description "Coffee without caffeine."
    :category    :coffee
    :alcoholic?  false}

   ;; ----- Soft drinks & juices -----
   {:id          :orange-juice
    :name        "Orange Juice"
    :price       260
    :ingredients [:orange-juice]
    :description "Fresh or bottled orange juice."
    :category    :soft-drink
    :alcoholic?  false}

   {:id          :apple-juice
    :name        "Apple Juice"
    :price       260
    :ingredients [:apple-juice]
    :description "Sweet apple juice."
    :category    :soft-drink
    :alcoholic?  false}

   {:id          :pineapple-juice
    :name        "Pineapple Juice"
    :price       280
    :ingredients [:pineapple-juice]
    :description "Tropical pineapple juice."
    :category    :soft-drink
    :alcoholic?  false}

   {:id          :cola-033
    :name        "Cola 0.33L"
    :price       250
    :ingredients [:cola]
    :description "Carbonated cola drink, 0.33L bottle or can."
    :category    :soft-drink
    :alcoholic?  false}

   {:id          :cola-zero-033
    :name        "Cola Zero 0.33L"
    :price       250
    :ingredients [:cola-zero]
    :description "Sugar-free cola, 0.33L."
    :category    :soft-drink
    :alcoholic?  false}

   {:id          :tonic-water-025
    :name        "Tonic Water 0.25L"
    :price       240
    :ingredients [:tonic]
    :description "Tonic water, also used as mixer."
    :category    :soft-drink
    :alcoholic?  false}

   ;; ----- Water -----
   {:id          :still-water-033
    :name        "Still Water 0.33L"
    :price       200
    :ingredients [:water]
    :description "Small still water."
    :category    :water
    :alcoholic?  false}

   {:id          :still-water-075
    :name        "Still Water 0.75L"
    :price       280
    :ingredients [:water]
    :description "Large still water."
    :category    :water
    :alcoholic?  false}

   {:id          :sparkling-water-033
    :name        "Sparkling Water 0.33L"
    :price       210
    :ingredients [:sparkling-water]
    :description "Small sparkling water."
    :category    :water
    :alcoholic?  false}

   {:id          :sparkling-water-075
    :name        "Sparkling Water 0.75L"
    :price       290
    :ingredients [:sparkling-water]
    :description "Large sparkling water."
    :category    :water
    :alcoholic?  false}])


;; Basic helper functions


(defn all-cocktails
  "Return all products that are cocktails (alcoholic and non-alcoholic)."
  []
  (filter #(= (:category %) :cocktail) all-products))

(defn all-coffees
  "Return all coffee drinks."
  []
  (filter #(= (:category %) :coffee) all-products))

(defn all-soft-drinks
  "Return all soft drinks (juices, cola, tonic)."
  []
  (filter #(= (:category %) :soft-drink) all-products))

(defn all-water
  "Return all water products."
  []
  (filter #(= (:category %) :water) all-products))

(defn alcoholic?
  "Return true if product contains alcohol."
  [product]
  (:alcoholic? product))

(defn non-alcoholic?
  "Return true if product does not contain alcohol."
  [product]
  (not (:alcoholic? product)))

(defn alcoholic-products
  "Return all alcoholic products."
  []
  (filter alcoholic? all-products))

(defn non-alcoholic-products
  "Return all non-alcoholic products."
  []
  (filter non-alcoholic? all-products))

(defn product-by-id
  "Find a single product by id (e.g. :mojito)."
  [id]
  (first (filter #(= (:id %) id) all-products)))

(defn products-by-category
  "Return all products for a given category keyword, e.g. :cocktail, :coffee."
  [category]
  (filter #(= (:category %) category) all-products))

(defn has-ingredient?
  "Return true if product contains given ingredient keyword."
  [product ingredient]
  (some #(= % ingredient) (:ingredients product)))

(defn products-with-ingredient
  "Return all products that contain given ingredient keyword, e.g. :rum."
  [ingredient]
  (filter #(has-ingredient? % ingredient) all-products))

(defn find-by-name
  "Very simple name search: case-sensitive contains check."
  [substring]
  (filter #(clojure.string/includes? (:name %) substring) all-products))

