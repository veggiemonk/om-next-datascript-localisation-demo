(defproject om-next-datascript-localisation-demo "0.1.0-SNAPSHOT"
  :description "Demo of Om Next and DataScript Localisation"
  :url "https://github.com/bnomis/om-next-datascript-localisation-demo"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies [ [org.clojure/clojure "1.7.0"]
                  [org.clojure/clojurescript "1.7.170"]
                  [org.clojure/core.async "0.2.374"]
                  [org.omcljs/om "1.0.0-alpha28"]
                  [datascript "0.13.3"]
                  [sablono "0.5.3"]
                  [cljsjs/react "0.14.3-0"]
                  [cljsjs/react-dom "0.14.3-1"]
                  [cljsjs/react-dom-server "0.14.3-0"]]

  :plugins [[lein-cljsbuild "1.1.1"]
            [lein-figwheel "0.5.0-2"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources/public/js" "target"]

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src"]

                :figwheel {:on-jsload "om-next-datascript-localisation-demo.core/on-js-reload"}

                :compiler {:main om-next-datascript-localisation-demo.core
                           :asset-path "js"
                           :output-to "resources/public/js/om_next_datascript_localisation_demo.js"
                           :output-dir "resources/public/js"
                           :source-map-timestamp true
                           :verbose true}}

               {:id "min"
                :source-paths ["src"]
                :compiler {:output-to "resources/public/js/om_next_datascript_localisation_demo.js"
                           :main om-next-datascript-localisation-demo.core
                           :optimizations :advanced
                           :pretty-print false}}]}

  :figwheel {:css-dirs ["resources/public/css"]})