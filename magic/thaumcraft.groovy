package magic

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "thaumcraft"
    group "magic"
    name  "Thaumcraft"
    file {
        id   = "thaumcraft_main"
        path = "Thaumcraft.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}