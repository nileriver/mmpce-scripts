package agriculture

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "agricraft"
    group "agriculture"
    name  "Agricraft"
    file {
        id   = "agricraft_main"
        path = "agricraft/Configuration.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    files {
        regex = /agricraft\/(.*)\.txt/
        id    = "agricraft_%1"
        type  = ModFileFormat.RAW
    }
}