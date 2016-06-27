package storage

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "jabba"
    group "storage"
    name  "JABBA"
    file {
        id   = "jabba_main"
        path = "JABBA.cfg"
        type = ModFileFormat.FORGE_PROPS
    }

}