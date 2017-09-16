# clj-easy-ocr

Clojure文字识别, 基于tesseract

## Usage

```clojure
clj-easy-ocr.core=> (get-img-string "demo_eurotext.png")

"The (quick) [brown] {fox} jumps!\nOver the $43,456.78 <lazy> #90 dog\n& duck/goose, as 12.5% of E-mail\nfrom aspammer@website.com is spam.\nDer ,,schnelle” braune Fuchs springt\nﬁber den faulen Hund. Le renard brun\n«rapide» saute par-dessus le chien\nparesseux. La volpe marrone rapida\nsalta sopra i] cane pigro. El zorro\nmarrén répido salta sobre el perro\nperezoso. A raposa marrom répida\nsalta sobre 0 C50 preguieoso."

clj-easy-ocr.core=>

```
## License

Copyright © 2017 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
