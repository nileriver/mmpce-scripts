package client

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "aqua_tweaks"
    group "client"
    name  "AquaTweaks"
    file {
        id   = "aqua_tweaks_main"
        path = "AquaTweaks.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}