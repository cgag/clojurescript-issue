(ns clojurescript-issue.core
  (:require [clojurescript-issue.existent :as existent]))

(non-existent-namespace/func "test")

(existent/existing-func)
(existent/non-existent-func)
