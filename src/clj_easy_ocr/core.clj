(ns clj-easy-ocr.core
  (:import
   (java.io FileInputStream)
   (cn.easyproject.easyocr EasyOCR)))

;; (let [e (EasyOCR.)] (.discern e "demo_eurotext.png") )
;; => "The (quick) [br0Wn] {f0x} jumps! ... "
