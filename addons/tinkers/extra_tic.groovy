package addons.tinkers

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "extra_tic"
    group "addons_tinkers"
    name  "ExtraTiC"
    file {
        id = "extra_tic_main"
        path = "ExtraTiC.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
}