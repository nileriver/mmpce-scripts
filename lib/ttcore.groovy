package lib

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "ttcore"
    group "lib"
    name  "ttCore"
    file {
        id   = "ttcore_main"
        path = "ttCore.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "ttcore_ttcore_main"
        path = "ttCore/ttCore.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "ttcore_cropConfig"
        path = "ttCore/cropConfig.json"
        type  = ModFileFormat.JSON
    }
//    options {
//
//    }
}