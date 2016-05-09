package lib

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "forge"
    group "lib"
    name  "Forge"
    file {
        id   = "forge_main"
        path = "forge.cfg"
    }
    file {
        id   = "forge_chunk_loading"
        path = "forgeChunkLoading.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}