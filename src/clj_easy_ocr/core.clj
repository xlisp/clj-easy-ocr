(ns clj-easy-ocr.core
  (:import
   (java.io FileInputStream)
   (cn.easyproject.easyocr EasyOCR ImageType)))

;; (get-img-string "demo_eurotext.png") ;;=> "The (quick) [br0Wn] ..."
(defn get-img-string
  [path]
  (let [ocr (EasyOCR.)]
    (.discern ocr path)))
