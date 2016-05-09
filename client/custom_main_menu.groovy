package client

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "custom_main_menu"
    group "client"
    name  "Custom Main Menu"
    file {
        id   = "custom_main_menu_main"
        path = "CustomMainMenu/menu.json"
        type  = ModFileFormat.JSON
    }
//    options {
//
//    }
}