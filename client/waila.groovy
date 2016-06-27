package client

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "waila"
    group "client"
    name  "Waila"
    file {
        id   = "waila_main"
        path = "Waila.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
//    options {
//
//    }
}