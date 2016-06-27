package lib

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "cofh"
    group "lib"
    name  "CoFH"
    file {
        id   = "cofh_main"
        path = "cofh/CoFHCore.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "cofh_client"
        path = "cofh/Client.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "cofh_loot"
        path = "cofh/CoFHLoot.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "cofh_social_friends"
        path = "cofh/CoFHSocial-Friends.cfg"
    }
    file {
        id   = "cofh_world_dirty_overworld"
        path = "cofh/world/DirtyOverworld.json"
        type  = ModFileFormat.JSON
    }
    file {
        id   = "cofh_world_vanilla"
        path = "cofh/world/Vanilla.json"
        type  = ModFileFormat.JSON
    }
    files {
        regex = /cofh\/core\/(.*)\.cfg/
        id    = "cofh_core_%1"
        type  = ModFileFormat.FORGE_PROPS
    }
    files {
        regex = /cofh\/world\/(.*)\.json/
        id    = "cofh_world_%1"
        type  = ModFileFormat.JSON
    }
    files {
        regex = /cofh\/old\/(.*)\.json/
        id    = "cofh_old_%1"
        type  = ModFileFormat.JSON
    }
}