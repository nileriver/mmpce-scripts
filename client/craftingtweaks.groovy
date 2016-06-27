package client

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "craftingtweaks"
    group "client"
    name  "Crafting Tweaks"
    file {
        id   = "craftingtweaks_main"
        path = "craftingtweaks.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}