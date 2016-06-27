package magic

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "witchery"
    group "magic"
    name  "Witchery"
    file {
        id   = "witchery_main"
        path = "witchery.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "witchery_debug"
        path = "witchery_debug.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}