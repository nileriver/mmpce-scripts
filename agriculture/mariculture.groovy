package tweakers

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "mariculture"
    group "agriculture"
    name  "Mariculture"
    files {
        regex = /mariculture\/(.*)\.cfg/
        id    = "mariculture_%1"
        type  = ModFileFormat.FORGE_PROPS
    }
}