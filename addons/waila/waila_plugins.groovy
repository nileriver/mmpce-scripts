package addons.waila

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "waila_plugins"
    group "addons_waila"
    name  "Waila Plugins"
    file {
        id   = "waila_plugins_main"
        path = "wailaplugins.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
//    options {
//
//    }
}