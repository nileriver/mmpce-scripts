package lib

config {
    mod   "endercore"
    group "lib"
    name  "EnderCore"
    file {
        id   = "endercore_main"
        path = "endercore/endercore.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "endercore_crop_config"
        path = "endercore/cropConfig.json"
        type  = JSON
    }
}