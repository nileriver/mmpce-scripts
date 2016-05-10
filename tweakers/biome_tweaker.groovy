package tweakers


config {
    mod   "biome_tweaker"
    group "tweakers"
    name  "Biome Tweaker"
    files {
        regex = /BiomeTweaker\/(.*)\.cfg/
        id    = "biome_tweaker_%1"
    }
    files {
        regex = /BiomeTweaker\/(.*)\/(.*)\.json/
        id    = "biome_tweaker_%1_%2"
        type  = JSON
    }
}