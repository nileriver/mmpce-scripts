package lib

config {
    mod   "forge"
    group "lib"
    name  "Forge"
    file {
        id   = "forge_main"
        path = "forge.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "forge_chunk_loading"
        path = "forgeChunkLoading.cfg"
        type  = FORGE_PROPS
    }
}