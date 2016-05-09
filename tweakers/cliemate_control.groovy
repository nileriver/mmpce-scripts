package tweakers

import com.mmpce.storage.model.ModFileFormat


config {
    mod   "climate_control"
    group "tweakers"
    name  "Climate control"
    file {
        id   = "climate_control_main"
        path = "climatecontrol.cfg"
        type  = ModFileFormat.FORGE_PROPS
    }
    files {
        regex = /ClimateControl\/(.*)\.cfg/
        id    = "climate_control_extension_%1"
        type  = ModFileFormat.FORGE_PROPS
    }
}