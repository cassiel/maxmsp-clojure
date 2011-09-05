(require 'grid-out :reload-all)

(doseq [x (range 4) y (range 4)]
  (grid-out/cell x y (/ x 3.0) (/ y 3.0) 0.0))
