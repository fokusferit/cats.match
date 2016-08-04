(defproject org.clojars.danpersa/cats.match "0.1.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Apache License"
            :url  "http://www.apache.org/licenses/LICENSE-2.0"}
  :dependencies [[org.clojure/clojure       "1.8.0"]
                 [funcool/cats              "2.0.0"]
                 [org.clojure/core.match    "0.3.0-alpha4"]]
  :profiles {:uberjar {:aot       :all
                       :jvm-opts ^:replace ["-Dclojure.compiler.direct-linking=true"]}
             :dev     {:plugins      [[lein-midje                  "3.2"]]
                       :dependencies [[midje                       "1.9.0-alpha3"]]}})
