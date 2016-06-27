package magic

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "auracascade"
    group "magic"
    name  "Aura Cascade"
    file {
        id   = "auracascade_main"
        path = "aura.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}