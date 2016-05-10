package tweakers

config {
    mod   "block_properties"
    group "tweakers"
    name  "Block Propeties"
    files {
        regex = /BlockProperties\/(.*)\/(.*)\.json/
        id    = "block_properties_%1_%2"
        type  = JSON
    }
}
