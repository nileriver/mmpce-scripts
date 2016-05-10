package storage

config {
    mod   "enhanced_inventories"
    group "storage"
    name  "Enhanced Inventories"
    file {
        id   = "enhanced_inventories_main"
        path = "EnhancedInventories/main.cfg"
        type = FORGE_PROPS
    }
    file {
        id   = "enhanced_inventories_main_main"
        path = "EnhancedInventories.cfg"
        type = FORGE_PROPS
    }
    files {
        regex = /EnhancedInventories\/recipes\/(.*)\.json/
        id    = "enchanced_inventories_recipes_%1"
        type  = JSON
    }
    files {
        regex = /EnhancedInventories\/frames\/(.*)\.json/
        id    = "enhanced_inventories_frames_%1"
        type  = JSON
    }
}