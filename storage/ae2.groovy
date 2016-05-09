package storage

import com.mmpce.storage.model.ModFileFormat

config {
    mod   "applied_energistics_2"
    group "storage"
    name  "Applied Energistics 2"
    file {
        id   = "ae2_main"
        path = "AppliedEnergistics2/AppliedEnergistics2.cfg"
        type = ModFileFormat.FORGE_PROPS
    }
    file {
        id   = "ae2_facades"
        path = "AppliedEnergistics2/Facades.cfg"
        type = ModFileFormat.FORGE_PROPS
    }
}