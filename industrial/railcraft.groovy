package industrial

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "railcraft"
    group "industrial"
    name  "Railcraft"
    file {
        id   = "railcraft_main"
        path = "railcraft/railcraft.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "railcraft_blocks"
        path = "railcraft/blocks.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "railcraft_items"
        path = "railcraft/items.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "railcraft_modules"
        path = "railcraft/modules.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "railcraft_version"
        path = "railcraft/version.prop"
        type  = ModFileFormat.PROPERTY
    }
}