package agriculture

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "magical_crops"
    group "agriculture"
    name  "Magical Crops"
    file {
        id   = "magical_crops_main"
        path = "magicalcrops.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}