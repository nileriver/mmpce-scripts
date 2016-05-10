package agriculture

config {
    mod   "forestry"
    group "agriculture"
    name  "Forestry"
    file {
        id   = "forestry_common"
        path = "forestry/common.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_debug"
        path = "forestry/debug.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_fluids"
        path = "forestry/fluids.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_modules"
        path = "forestry/modules.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "forestry_backpacks"
        path = "forestry/backpacks.cfg"
        type  = FORGE_PROPS
    }
    file {
        id   = "forestry_lepidopterology"
        path = "forestry/lepidopterology.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_apiculture"
        path = "forestry/apiculture.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_pipes"
        path = "forestry/pipes.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_gamemode_hard"
        path = "forestry/gamemodes/HARD.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_gamemode_normal"
        path = "forestry/gamemodes/NORMAL.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_gamemode_op"
        path = "forestry/gamemodes/OP.conf"
        type  = PROPERTY
    }
    file {
        id   = "forestry_gamemode_easy"
        path = "forestry/gamemodes/EASY.conf"
        type  = PROPERTY
    }
}