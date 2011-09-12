(ns matrix-hacks
  (import (com.cycling74.jitter JitterMatrix)))

; These parameters should match those in the Max patcher.
(def my-matrix (JitterMatrix. "matriseq.MAIN" 4 "char" (int-array [16 16])))

;;(.setall my-matrix 255)

(println "matrix-hacks done")
