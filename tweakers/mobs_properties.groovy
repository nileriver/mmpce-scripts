package tweakers

config {
    mod   "mob_properties"
    group "tweakers"
    name  "Mob Propeties"
    files {
        regex = /MobProperties\/(.*)\.json/
        id    = "mob_properties_%1"
        type  = JSON
    }
}
