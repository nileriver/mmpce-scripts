package industrial

import com.mmpce.storage.model.mods.ModFileFormat

config {
    mod   "buildcraft"
    group "industrial"
    name  "Buildcraft"
    file {
        id   = "buildcraft_main"
        path = "buildcraft/main.conf"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "buildcraft_compat"
        path = "buildcraft/compat.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "buildcraft_objects"
        path = "buildcraft/objects.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}