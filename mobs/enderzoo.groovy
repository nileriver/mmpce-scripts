package mobs

config {
    mod   "enderzoo"
    group "mobs"
    name  "Ender Zoo"
    file {
        id   = "enderzoo_main"
        path = "enderzoo/EnderZoo.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "enderzoo_spawn_config_core"
        path = "enderzoo/SpawnConfig_Core.xml"
        type  = XML
    }
    file {
        id   = "enderzoo_spawn_config_user"
        path = "enderzoo/SpawnConfig_User.xml"
        type  = XML
    }
}