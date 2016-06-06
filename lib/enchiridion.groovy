package lib

config {
    mod   "enchiridion"
    group "lib"
    name  "Enchiridion"
    file {
        id   = "enchiridion_main"
        path = "enchiridion/enchiridion2.cfg"
        type  = FORGE_PROPS
    }
    file {
        id    = "enchiridion_books"
        path = /books\/enchiridion.cfg/
        type  = FORGE_PROPS
    }
    files {
        regex = /enchiridion\/books\/(.*)\.json/
        id    = "enchiridion_books_%1"
        type  = JSON
    }
    files {
        regex = /enchiridion\/wiki\/(.*)\.json/
        id    = "enchiridion_wiki_%1"
        type  = JSON
    }
    files {
        regex = /enchiridion\/wiki\/(.*)\.png/
        id    = "enchiridion_wiki_%1"
        type  = IMAGE
    }
    file {
        path = /enchiridion\/library_books.json/
        id    = "enchiridion_library_books"
        type  = JSON
    }
}