package tweakers


config {
    mod   "ace"
    group "tweakers"
    name  "Accidentally Circumstantial Events"
    files {
        regex = /AccidentallyCircumstantialEvents\/(.*)\.json/
        id    = "ace_%1"
        type  = JSON
    }
}