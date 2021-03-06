package storage

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "bagginses"
    group "storage"
    name  "Bagginses"
    file {
        id   = "bagginses_main"
        path = "bagginses/bagginses.cfg"
        type = ModFileFormat.FORGE_PROPS
    }
}