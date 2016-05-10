package questing

config {
    mod   "hardcore_questing_mode"
    group "questing"
    name  "Hardcore Questing Mod"

    file {
        id   = "hqm_editmode"
        path = "hqm/editmode.cfg"
        type = FORGE_PROPS
    }
    file {
        id   = "hqm_front"
        path = "hqm/front.png"
        type = IMAGE
    }
    file {
        id   = "hqm_main"
        path = "hqm/hqmconfig.cfg"
        type = FORGE_PROPS
    }
    file {
        id   = "hqm_lore"
        path = "hqm/lore.ogg"
        type = SOUND
    }
    file {
        id   = "hqm_backup"
        path = "hqm/quests.hqm-backup"
        type = HQM
    }
}
