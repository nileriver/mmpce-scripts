package client

config {
    mod   "inventory_tweaks"
    group "client"
    name  "Inventory Tweaks"
    file {
        id   = "inventory_tweaks_main"
        path = "InvTweaks.cfg"
        type  = PROPERTY
    }
    file {
        id   = "inventory_tweaks_rules"
        path = "InvTweaksRules.txt"
        type  = RAW
    }
    file {
        id   = "inventory_tweaks_tree"
        path = "InvTweaksTree.txt"
        type  = XML
    }
}