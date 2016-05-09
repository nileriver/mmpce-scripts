package lib

config {
    mod   "cofh"
    group "lib"
    name  "CoFH"
    file {
        id   = "cofh_main"
        path = "cofh/CoFHCore.cfg"
    }
    file {
        id   = "cofh_client"
        path = "cofh/Client.cfg"
    }
    file {
        id   = "cofh_loot"
        path = "cofh/CoFHLoot.cfg"
    }
    file {
        id   = "cofh_social_friends"
        path = "cofh/CoFHSocial-Friends.cfg"
    }
    file {
        id   = "cofh_world_dirty_overworld"
        path = "cofh/world/DirtyOverworld.json"
    }
    file {
        id   = "cofh_world_vanilla"
        path = "cofh/world/Vanilla.json"
    }
}