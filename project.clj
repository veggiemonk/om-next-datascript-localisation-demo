(defproject om-next-datascript-localisation-demo "0.2.0-SNAPSHOT"
  :description "Demo of Om Next and DataScript Localisation"
  :url "https://github.com/bnomis/om-next-datascript-localisation-demo"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}

  :dependencies [ [org.clojure/clojure "1.7.0"]
                  [org.clojure/clojurescript "1.7.228"]
                  [org.clojure/core.async "0.2.374"]
                  [org.omcljs/om "1.0.0-alpha30"]
                  [datascript "0.15.0"]
                  [sablono "0.6.0"]
                  [cljsjs/react "0.14.3-0"]
                  [cljsjs/react-dom "0.14.3-1"]
                  [doo "0.1.6"]]

  :plugins [[lein-cljsbuild "1.1.2"]
            [lein-figwheel "0.5.0-3"]
            [lein-doo "0.1.6"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["resources/public/compiled" "target"]

  :figwheel {:css-dirs ["resources/public/css"]}

  :cljsbuild {:builds
              [ { :id "dev"
                  :source-paths ["src"]
                  :compiler { :main om-next-datascript-localisation-demo.core
                              :output-to  "resources/public/compiled/dev/om_next_datascript_localisation_demo.js"
                              :output-dir "resources/public/compiled/dev"
                              :asset-path "/compiled/dev"
                              :source-map-timestamp true
                              :verbose true
                              :parallel-build true}
                  :figwheel {:on-jsload "om-next-datascript-localisation-demo.core/on-js-reload"}}

                { :id "prod"
                  :source-paths ["src"]
                  :compiler { :main om-next-datascript-localisation-demo.core
                              :output-to  "resources/public/compiled/prod/om_next_datascript_localisation_demo.js"
                              :output-dir "resources/public/compiled/prod"
                              :asset-path "/js"
                              :optimizations :advanced
                              :pretty-print false
                              :parallel-build true}}
                { :id "test"
                  :source-paths ["test"]
                  :compiler { :output-to  "resources/public/compiled/test/testable.js"
                              :output-dir "resources/public/compiled/test"
                              :main om-next-datascript-localisation-demo.runner
                              :optimizations :none
                              :parallel-build true
                              :target :nodejs}}]})
