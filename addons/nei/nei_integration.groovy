package addons.nei

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "nei_integration"
    group "addons_nei"
    name  "NEI Integration"
    file {
        id   = "nei_integration_main"
        path = "neiintegration.cfg"
        type  = ModFileFormat.JSON
    }
//    options {
//
//    }
}