package storage

config {
    mod   "applied_energistics_2"
    group "storage"
    name  "Applied Energistics 2"
    file {
        id   = "ae2_main"
        path = "AppliedEnergistics2/AppliedEnergistics2.cfg"
        type = FORGE_PROPS
    }
    file {
        id   = "ae2_facades"
        path = "AppliedEnergistics2/Facades.cfg"
        type = FORGE_PROPS
    }

    file {
        id   = "ae2_version_checker"
        path = "AppliedEnergistics2/VersionChecker.cfg"
        type = FORGE_PROPS
    }

    files {
        regex = /AppliedEnergistics2\/(.*)\.recipe/
        id    = "ace_%1"
        type = RAW
    }
}