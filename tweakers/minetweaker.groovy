package tweakers

config {
    mod   "minetweaker"
    group "tweakers"
    name  "MineTweaker"
    files {
        regex = /(.*)\.zs/
        id    = "minetweaker_script_%1"
        type  = ZSCRIPT
    }
}