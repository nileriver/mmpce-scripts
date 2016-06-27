package industrial

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "mekanism"
    group "industrial"
    name  "Mekanism"
    file {
        id   = "mekanism_main"
        path = "Mekanism.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "mekanism_box_blacklist"
        path = "mekanism/BoxBlacklist.txt"
        type = RAW
    }
}