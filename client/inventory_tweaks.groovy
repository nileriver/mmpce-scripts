package client

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "inventory_tweaks"
    group "client"
    name  "Inventory Tweaks"
    file {
        id   = "inventory_tweaks_main"
        path = "InvTweaks.cfg"
        type  = ModFileFormat.PROPERTY
    }
    file {
        id   = "inventory_tweaks_rules"
        path = "InvTweaksRules.txt"
    }
    file {
        id   = "inventory_tweaks_tree"
        path = "InvTweaksTree.txt"
        type  = ModFileFormat.XML
    }
}