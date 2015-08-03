# clj-rethinkdb-test

Test repo for reproducing a (possible?) bug in RethinkDB

## Usage

```
lein run
```

Example output:

```sh
$lein run
WARN ignoring checkouts directory .DS_Store as it does not contain a project.clj file.
Setting up test
...

Running test
Writing: [2 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [2 {"t":2,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
clojure.lang.PersistentVector
Writing: [3 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [3 {"t":3,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
rethinkdb.net.Cursor
Writing: [4 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [4 {"t":3,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
rethinkdb.net.Cursor
Writing: [5 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [5 {"t":3,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
rethinkdb.net.Cursor
Writing: [6 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [6 {"t":3,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
rethinkdb.net.Cursor
Writing: [7 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [7 {"t":2,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
clojure.lang.PersistentVector
Writing: [8 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [8 {"t":3,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
rethinkdb.net.Cursor
Writing: [9 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [9 {"t":3,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
rethinkdb.net.Cursor
Writing: [10 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [10 {"t":3,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
rethinkdb.net.Cursor
Writing: [11 [1,[78,[[15,[[14,["clj_rethinkdb_test"]],"example"]],"id","cake"],{"index":"by-race-id"}]]]
Reading: [11 {"t":2,"r":[{"id":"6ec8d72a-9d35-405d-92a8-fe10af537016","race-id":"id","test":"document"}],"n":[]}]
clojure.lang.PersistentVector
Writing: [4 [3]]
Reading: [4 {"t":2,"r":[],"n":[]}]
Writing: [6 [3]]
Reading: [6 {"t":2,"r":[],"n":[]}]
Writing: [3 [3]]
Reading: [3 {"t":2,"r":[],"n":[]}]
Writing: [9 [3]]
Reading: [9 {"t":2,"r":[],"n":[]}]
Writing: [5 [3]]
Reading: [5 {"t":2,"r":[],"n":[]}]
Writing: [10 [3]]
Reading: [10 {"t":2,"r":[],"n":[]}]
Writing: [8 [3]]
Reading: [8 {"t":2,"r":[],"n":[]}]
```

## License

Copyright © 2015 FIXME

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
